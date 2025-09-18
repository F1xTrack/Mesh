package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: d81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9076d81 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ SystemSetting f25841a;

    public C9076d81(SystemSetting systemSetting) {
        this.f25841a = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.location.MODE_CHANGED")) {
            SystemSetting systemSetting = this.f25841a;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) systemSetting.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("EventLocationModeChange", Integer.valueOf(systemSetting.getLocationMode()));
        }
    }
}
