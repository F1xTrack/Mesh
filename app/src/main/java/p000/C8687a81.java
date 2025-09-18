package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: a81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8687a81 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ SystemSetting f15330a;

    public C8687a81(SystemSetting systemSetting) {
        this.f15330a = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("wifi_state", 0);
            if (intExtra == 3 || intExtra == 1) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f15330a.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("EventWifiChange", Boolean.valueOf(intExtra == 3));
            }
        }
    }
}
