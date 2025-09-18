package defpackage;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;

/* renamed from: rL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6821rL0 implements LifecycleEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C6821rL0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        switch (this.a) {
            case 0:
                if (C7394uL0.e) {
                    ((Promise) this.b).resolve(null);
                }
                C7394uL0.b.removeLifecycleEventListener(this);
                break;
            default:
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
