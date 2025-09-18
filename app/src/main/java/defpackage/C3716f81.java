package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: f81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3716f81 extends BroadcastReceiver {
    public boolean a = false;
    public final /* synthetic */ SystemSetting b;

    public C3716f81(SystemSetting systemSetting) {
        this.b = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            SystemSetting systemSetting = this.b;
            writableMapCreateMap.putDouble("value", systemSetting.getNormalizationVolume("music"));
            writableMapCreateMap.putDouble("call", systemSetting.getNormalizationVolume("call"));
            writableMapCreateMap.putDouble("system", systemSetting.getNormalizationVolume("system"));
            writableMapCreateMap.putDouble("ring", systemSetting.getNormalizationVolume("ring"));
            writableMapCreateMap.putDouble("music", systemSetting.getNormalizationVolume("music"));
            writableMapCreateMap.putDouble("alarm", systemSetting.getNormalizationVolume("alarm"));
            writableMapCreateMap.putDouble("notification", systemSetting.getNormalizationVolume("notification"));
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) systemSetting.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("EventVolume", writableMapCreateMap);
            } catch (RuntimeException unused) {
            }
        }
    }
}
