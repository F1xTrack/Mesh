package defpackage;

import android.os.Bundle;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.huawei.hms.rn.push.constants.Core;
import org.json.JSONException;

/* renamed from: aI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2107aI0 implements LK0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ QK0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ C2107aI0(Runnable runnable, QK0 qk0, int i) {
        this.a = i;
        this.c = runnable;
        this.b = qk0;
    }

    @Override // defpackage.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        String string;
        switch (this.a) {
            case 0:
                try {
                    string = C3554eI0.a((Bundle) ((WZ) this.c).c).toString();
                } catch (JSONException unused) {
                    string = null;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(Core.Event.Result.DATA_JSON, string);
                if (reactContext.hasActiveCatalystInstance()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("notificationActionReceived", writableMapCreateMap);
                }
                this.b.o(this);
                break;
            case 1:
                RunnableC1492Sx runnableC1492Sx = (RunnableC1492Sx) this.c;
                RNPushNotificationListenerService.h((RNPushNotificationListenerService) runnableC1492Sx.d, (ReactApplicationContext) reactContext, (String) runnableC1492Sx.c);
                this.b.o(this);
                break;
            default:
                XZ xz = (XZ) this.c;
                G10.w((G10) xz.c, (ReactApplicationContext) reactContext, (Bundle) xz.b);
                this.b.o(this);
                break;
        }
    }
}
