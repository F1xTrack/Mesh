package defpackage;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: n90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6022n90 implements LifecycleEventListener {
    public final /* synthetic */ Promise a;
    public final /* synthetic */ IntentModule b;

    public C6022n90(IntentModule intentModule, Promise promise) {
        this.b = intentModule;
        this.a = promise;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        IntentModule intentModule = this.b;
        intentModule.getInitialURL(this.a);
        intentModule.getReactApplicationContext().removeLifecycleEventListener(this);
        intentModule.mInitialURLListener = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }
}
