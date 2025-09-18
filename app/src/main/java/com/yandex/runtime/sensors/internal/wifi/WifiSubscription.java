package com.yandex.runtime.sensors.internal.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.sensors.internal.PermissionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class WifiSubscription extends BroadcastReceiver {
    private static final String ACCESS_WIFI_STATE = "android.permission.ACCESS_WIFI_STATE";
    private static final String CHANGE_WIFI_STATE = "android.permission.CHANGE_WIFI_STATE";
    private long nativePromise;
    private final String TAG = getClass().getCanonicalName();
    private boolean isRegistered = false;
    private WifiManager wifiManager = (WifiManager) Runtime.getApplicationContext().getSystemService("wifi");

    private static WifiPointInfo convert(ScanResult scanResult) {
        return new WifiPointInfo(scanResult.BSSID, scanResult.SSID, scanResult.level, eventMicrosToTimestampMilliseconds(scanResult.timestamp));
    }

    public static native void deleteNativePromise(long j);

    private static long eventMicrosToTimestampMilliseconds(long j) {
        return (j / 1000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    private void getScanResults() {
        try {
            List<ScanResult> scanResults = this.wifiManager.getScanResults();
            if (scanResults != null) {
                ArrayList arrayList = new ArrayList(scanResults.size());
                Iterator<ScanResult> it = scanResults.iterator();
                while (it.hasNext()) {
                    arrayList.add(convert(it.next()));
                }
                scanResultsAvailable(this.nativePromise, arrayList);
            }
        } catch (SecurityException e) {
            e.toString();
        }
    }

    public static boolean isWifiScanAvailable() {
        return PermissionHelper.checkPermissions(new String[]{ACCESS_WIFI_STATE, CHANGE_WIFI_STATE});
    }

    public static boolean isWifiThrottlingEnabled() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return false;
        }
        if (i == 28) {
            return true;
        }
        if (i == 29) {
            try {
                return Settings.Global.getInt(Runtime.getApplicationContext().getContentResolver(), "wifi_scan_throttle_enabled") == 1;
            } catch (Settings.SettingNotFoundException unused) {
                return true;
            }
        }
        if (i >= 30) {
            return ((WifiManager) Runtime.getApplicationContext().getSystemService("wifi")).isScanThrottleEnabled();
        }
        return true;
    }

    public static native void scanResultsAvailable(long j, List<WifiPointInfo> list);

    /* JADX INFO: Access modifiers changed from: private */
    public void startScanImpl(long j) {
        this.nativePromise = j;
        Context applicationContext = Runtime.getApplicationContext();
        applicationContext.registerReceiver(this, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
        this.isRegistered = true;
        if (this.wifiManager.isWifiEnabled() && this.wifiManager.startScan()) {
            return;
        }
        unregister(applicationContext);
        scanResultsAvailable(this.nativePromise, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregister(Context context) {
        if (this.isRegistered) {
            context.unregisterReceiver(this);
            this.isRegistered = false;
        }
    }

    public void cancel() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.wifi.WifiSubscription.1
            @Override // java.lang.Runnable
            public void run() {
                WifiSubscription.this.unregister(Runtime.getApplicationContext());
            }
        });
    }

    public void finalize() {
        deleteNativePromise(this.nativePromise);
    }

    public native void getScanResultsAsync();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        unregister(context);
        getScanResultsAsync();
    }

    public void startScan(long j) {
        new Handler(Looper.getMainLooper()).post(new Runnable(j) { // from class: com.yandex.runtime.sensors.internal.wifi.WifiSubscription.1StartTask
            long promise;

            {
                this.promise = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                WifiSubscription.this.startScanImpl(this.promise);
            }
        });
    }
}
