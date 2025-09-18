package com.yandex.runtime.sensors.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import java.util.List;

/* loaded from: classes2.dex */
public class BleSubscription {
    private static final String PERMISSION_BLUETOOTH = "android.permission.BLUETOOTH";
    private static final String PERMISSION_BLUETOOTH_ADMIN = "android.permission.BLUETOOTH_ADMIN";
    private static final String PERMISSION_BLUETOOTH_SCAN = "android.permission.BLUETOOTH_SCAN";
    private static final int SCAN_RETRY_TIMEOUT = 1000;
    private static final String TAG = "com.yandex.runtime.sensors.internal.BleSubscription";
    private NativeObject nativeObject_;
    private Object scanCallback_;
    private BluetoothAdapter adapter_ = getBluetoothAdapter();
    private BroadcastReceiver receiver_ = getBluetoothStateReceiver();

    public BleSubscription(NativeObject nativeObject) {
        this.nativeObject_ = nativeObject;
        start();
    }

    private static boolean areBleScanPermissionsGranted() {
        return Build.VERSION.SDK_INT > 30 ? PermissionHelper.checkPermissions(new String[]{PERMISSION_BLUETOOTH_SCAN}) : PermissionHelper.checkPermissions(new String[]{PERMISSION_BLUETOOTH, PERMISSION_BLUETOOTH_ADMIN});
    }

    private static BluetoothAdapter getBluetoothAdapter() {
        try {
            return BluetoothAdapter.getDefaultAdapter();
        } catch (SecurityException unused) {
            return null;
        }
    }

    private BroadcastReceiver getBluetoothStateReceiver() {
        return new BroadcastReceiver() { // from class: com.yandex.runtime.sensors.internal.BleSubscription.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (BleSubscription.this.adapter_ == null || !BleSubscription.this.adapter_.isEnabled()) {
                    BleSubscription.this.stopScan();
                } else {
                    BleSubscription.this.startScan();
                }
            }
        };
    }

    public static boolean isBleScanAvailable() {
        return getBluetoothAdapter() != null && areBleScanPermissionsGranted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void retryScan() {
        this.scanCallback_ = null;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.yandex.runtime.sensors.internal.BleSubscription.6
            @Override // java.lang.Runnable
            public void run() {
                if (!BleSubscription.this.adapter_.isEnabled()) {
                    String unused = BleSubscription.TAG;
                } else {
                    BleSubscription.this.stopScan();
                    BleSubscription.this.startScan();
                }
            }
        }, 1000L);
    }

    private static native void scanFailed(NativeObject nativeObject, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void scanResultAvailable(NativeObject nativeObject, String str, int i, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public void setScanFailed(String str) {
        this.adapter_ = null;
        this.scanCallback_ = null;
        scanFailed(this.nativeObject_, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScan() {
        if (this.adapter_ != null && this.scanCallback_ == null) {
            boolean zUseNewScanApi = useNewScanApi();
            if (zUseNewScanApi) {
                this.scanCallback_ = new ScanCallback() { // from class: com.yandex.runtime.sensors.internal.BleSubscription.4
                    @Override // android.bluetooth.le.ScanCallback
                    public void onBatchScanResults(List<ScanResult> list) {
                        for (ScanResult scanResult : list) {
                            BleSubscription.scanResultAvailable(BleSubscription.this.nativeObject_, scanResult.getDevice().getAddress(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
                        }
                    }

                    @Override // android.bluetooth.le.ScanCallback
                    public void onScanFailed(int i) {
                        if (i != 1) {
                            if (i == 2) {
                                BleSubscription.this.setScanFailed("SCAN_FAILED_APPLICATION_REGISTRATION_FAILED");
                                return;
                            } else if (i != 3) {
                                if (i != 4) {
                                    BleSubscription.this.setScanFailed("Unknown scan failed error");
                                    return;
                                } else {
                                    BleSubscription.this.setScanFailed("SCAN_FAILED_FEATURE_UNSUPPORTED");
                                    return;
                                }
                            }
                        }
                        BleSubscription.this.retryScan();
                    }

                    @Override // android.bluetooth.le.ScanCallback
                    public void onScanResult(int i, ScanResult scanResult) {
                        BleSubscription.scanResultAvailable(BleSubscription.this.nativeObject_, scanResult.getDevice().getAddress(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
                    }
                };
            } else {
                this.scanCallback_ = new BluetoothAdapter.LeScanCallback() { // from class: com.yandex.runtime.sensors.internal.BleSubscription.5
                    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
                    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                        BleSubscription.scanResultAvailable(BleSubscription.this.nativeObject_, bluetoothDevice.getAddress(), i, bArr);
                    }
                };
            }
            try {
                if (zUseNewScanApi) {
                    BluetoothLeScanner bluetoothLeScanner = this.adapter_.getBluetoothLeScanner();
                    if (bluetoothLeScanner != null) {
                        bluetoothLeScanner.startScan((ScanCallback) this.scanCallback_);
                    } else {
                        this.scanCallback_ = null;
                    }
                } else if (!this.adapter_.startLeScan((BluetoothAdapter.LeScanCallback) this.scanCallback_)) {
                    this.scanCallback_ = null;
                }
            } catch (SecurityException e) {
                if (e.getMessage() == null) {
                    setScanFailed("Scan SecurityException");
                    return;
                }
                setScanFailed("Scan SecurityException: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopScan() {
        BluetoothAdapter bluetoothAdapter = this.adapter_;
        if (bluetoothAdapter == null || this.scanCallback_ == null || bluetoothAdapter.getState() != 12) {
            return;
        }
        if (useNewScanApi()) {
            BluetoothLeScanner bluetoothLeScanner = this.adapter_.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan((ScanCallback) this.scanCallback_);
            }
        } else {
            this.adapter_.stopLeScan((BluetoothAdapter.LeScanCallback) this.scanCallback_);
        }
        this.scanCallback_ = null;
    }

    private static boolean useNewScanApi() {
        return false;
    }

    public void start() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.BleSubscription.2
            @Override // java.lang.Runnable
            public void run() {
                Runtime.getApplicationContext().registerReceiver(BleSubscription.this.receiver_, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                if (BleSubscription.this.adapter_ == null) {
                    BleSubscription.this.setScanFailed("No BLE adapter");
                } else if (BleSubscription.this.adapter_.isEnabled()) {
                    BleSubscription.this.startScan();
                } else {
                    String unused = BleSubscription.TAG;
                }
            }
        });
    }

    public void stop() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.BleSubscription.3
            @Override // java.lang.Runnable
            public void run() {
                Runtime.getApplicationContext().unregisterReceiver(BleSubscription.this.receiver_);
                BleSubscription.this.stopScan();
            }
        });
    }
}
