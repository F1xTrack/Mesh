package p000;

import android.os.Bundle;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.p015rn.push.constants.Core;
import org.json.JSONException;

/* renamed from: aI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8706aI0 implements LK0 {

    /* renamed from: a */
    public final /* synthetic */ int f15459a;

    /* renamed from: b */
    public final /* synthetic */ QK0 f15460b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f15461c;

    public /* synthetic */ C8706aI0(Runnable runnable, QK0 qk0, int i) {
        this.f15459a = i;
        this.f15461c = runnable;
        this.f15460b = qk0;
    }

    @Override // p000.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        String string;
        switch (this.f15459a) {
            case 0:
                try {
                    string = C9223eI0.m17897a((Bundle) ((RunnableC1420WZ) this.f15461c).f13261c).toString();
                } catch (JSONException unused) {
                    string = null;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, string);
                if (reactContext.hasActiveCatalystInstance()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("notificationActionReceived", writableMapCreateMap);
                }
                this.f15460b.m6644o(this);
                break;
            case 1:
                RunnableC1192Sx runnableC1192Sx = (RunnableC1192Sx) this.f15461c;
                RNPushNotificationListenerService.m10895h((RNPushNotificationListenerService) runnableC1192Sx.f11081d, (ReactApplicationContext) reactContext, (String) runnableC1192Sx.f11080c);
                this.f15460b.m6644o(this);
                break;
            default:
                RunnableC1483XZ runnableC1483XZ = (RunnableC1483XZ) this.f15461c;
                G10.m2882w((G10) runnableC1483XZ.f13851c, (ReactApplicationContext) reactContext, (Bundle) runnableC1483XZ.f13850b);
                this.f15460b.m6644o(this);
                break;
        }
    }
}
