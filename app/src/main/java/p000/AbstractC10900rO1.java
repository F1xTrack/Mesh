package p000;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: rO1 */
/* loaded from: classes.dex */
public abstract class AbstractC10900rO1 {
    /* renamed from: a */
    public static final void m24325a(ReactApplicationContext reactApplicationContext, AbstractC6550oP abstractC6550oP) {
        O90.m5968f(abstractC6550oP, "event");
        try {
            NativeModule nativeModule = reactApplicationContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
            O90.m5965c(nativeModule);
            ((UIManagerModule) nativeModule).getEventDispatcher().mo11046g(abstractC6550oP);
        } catch (NullPointerException e) {
            throw new Exception("Couldn't get an instance of UIManagerModule. Gesture Handler is unable to send an event.", e);
        }
    }
}
