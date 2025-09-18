package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: b81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2269b81 extends BroadcastReceiver {
    public final /* synthetic */ SystemSetting a;

    public C2269b81(SystemSetting systemSetting) {
        this.a = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
            if (intExtra == 12 || intExtra == 10) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.a.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("EventBluetoothChange", Boolean.valueOf(intExtra == 12));
            }
        }
    }
}
