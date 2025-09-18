package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: c81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8943c81 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ SystemSetting f17332a;

    public C8943c81(SystemSetting systemSetting) {
        this.f17332a = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.location.PROVIDERS_CHANGED")) {
            SystemSetting systemSetting = this.f17332a;
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) systemSetting.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("EventLocationChange", Boolean.valueOf(systemSetting.isLocationEnable()));
        }
    }
}
