package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.learnium.RNDeviceInfo.RNDeviceModule;

/* renamed from: wH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7763wH0 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ RNDeviceModule b;

    public /* synthetic */ C7763wH0(RNDeviceModule rNDeviceModule, int i) {
        this.a = i;
        this.b = rNDeviceModule;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                RNDeviceModule rNDeviceModule = this.b;
                WritableMap powerStateFromIntent = rNDeviceModule.getPowerStateFromIntent(intent);
                if (powerStateFromIntent != null) {
                    String string = powerStateFromIntent.getString(RNDeviceModule.BATTERY_STATE);
                    double d = powerStateFromIntent.getDouble(RNDeviceModule.BATTERY_LEVEL);
                    Double dValueOf = Double.valueOf(d);
                    boolean z = powerStateFromIntent.getBoolean(RNDeviceModule.LOW_POWER_MODE);
                    if (!rNDeviceModule.mLastBatteryState.equalsIgnoreCase(string) || rNDeviceModule.mLastPowerSaveState != z) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString(RNDeviceModule.BATTERY_STATE, string);
                        writableMapCreateMap.putDouble(RNDeviceModule.BATTERY_LEVEL, d);
                        writableMapCreateMap.putBoolean(RNDeviceModule.LOW_POWER_MODE, z);
                        rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_powerStateDidChange", writableMapCreateMap);
                        rNDeviceModule.mLastBatteryState = string;
                        rNDeviceModule.mLastPowerSaveState = z;
                    }
                    if (rNDeviceModule.mLastBatteryLevel != d) {
                        rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_batteryLevelDidChange", dValueOf);
                        if (d <= 0.15d) {
                            rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_batteryLevelIsLow", dValueOf);
                        }
                        rNDeviceModule.mLastBatteryLevel = d;
                        break;
                    }
                }
                break;
            case 1:
                RNDeviceModule rNDeviceModule2 = this.b;
                rNDeviceModule2.sendEvent(rNDeviceModule2.getReactApplicationContext(), "RNDeviceInfo_headphoneConnectionDidChange", Boolean.valueOf(rNDeviceModule2.isHeadphonesConnectedSync()));
                break;
            case 2:
                RNDeviceModule rNDeviceModule3 = this.b;
                rNDeviceModule3.sendEvent(rNDeviceModule3.getReactApplicationContext(), "RNDeviceInfo_headphoneWiredConnectionDidChange", Boolean.valueOf(rNDeviceModule3.isWiredHeadphonesConnectedSync()));
                break;
            default:
                RNDeviceModule rNDeviceModule4 = this.b;
                rNDeviceModule4.sendEvent(rNDeviceModule4.getReactApplicationContext(), "RNDeviceInfo_headphoneBluetoothConnectionDidChange", Boolean.valueOf(rNDeviceModule4.isBluetoothHeadphonesConnectedSync()));
                break;
        }
    }
}
