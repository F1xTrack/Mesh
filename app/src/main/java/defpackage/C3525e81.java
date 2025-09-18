package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: e81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3525e81 extends BroadcastReceiver {
    public final /* synthetic */ SystemSetting a;

    public C3525e81(SystemSetting systemSetting) {
        this.a = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Settings.SettingNotFoundException {
        SystemSetting systemSetting = this.a;
        try {
            int i = Settings.System.getInt(systemSetting.mContext.getContentResolver(), "airplane_mode_on");
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) systemSetting.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            rCTDeviceEventEmitter.emit("EventAirplaneChange", Boolean.valueOf(z));
        } catch (Settings.SettingNotFoundException unused) {
            systemSetting.TAG;
        }
    }
}
