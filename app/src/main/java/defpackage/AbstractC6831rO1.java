package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: rO1 */
/* loaded from: classes.dex */
public abstract class AbstractC6831rO1 {
    public static final void a(ReactApplicationContext reactApplicationContext, AbstractC6260oP abstractC6260oP) {
        O90.f(abstractC6260oP, "event");
        try {
            NativeModule nativeModule = reactApplicationContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
            O90.c(nativeModule);
            ((UIManagerModule) nativeModule).getEventDispatcher().g(abstractC6260oP);
        } catch (NullPointerException e) {
            throw new Exception("Couldn't get an instance of UIManagerModule. Gesture Handler is unable to send an event.", e);
        }
    }
}
