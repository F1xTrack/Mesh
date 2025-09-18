package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: d81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3335d81 extends BroadcastReceiver {
    public final /* synthetic */ SystemSetting a;

    public C3335d81(SystemSetting systemSetting) {
        this.a = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.location.MODE_CHANGED")) {
            SystemSetting systemSetting = this.a;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) systemSetting.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("EventLocationModeChange", Integer.valueOf(systemSetting.getLocationMode()));
        }
    }
}
