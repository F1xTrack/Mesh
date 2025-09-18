package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ninty.system.setting.SystemSetting;

/* renamed from: f81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9332f81 extends BroadcastReceiver {

    /* renamed from: a */
    public boolean f27086a = false;

    /* renamed from: b */
    public final /* synthetic */ SystemSetting f27087b;

    public C9332f81(SystemSetting systemSetting) {
        this.f27087b = systemSetting;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            SystemSetting systemSetting = this.f27087b;
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
