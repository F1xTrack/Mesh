package p000;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: n90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10357n90 implements LifecycleEventListener {

    /* renamed from: a */
    public final /* synthetic */ Promise f38147a;

    /* renamed from: b */
    public final /* synthetic */ IntentModule f38148b;

    public C10357n90(IntentModule intentModule, Promise promise) {
        this.f38148b = intentModule;
        this.f38147a = promise;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        IntentModule intentModule = this.f38148b;
        intentModule.getInitialURL(this.f38147a);
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
