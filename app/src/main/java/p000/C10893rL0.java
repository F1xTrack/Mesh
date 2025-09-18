package p000;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;

/* renamed from: rL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10893rL0 implements LifecycleEventListener {

    /* renamed from: a */
    public final /* synthetic */ int f41604a;

    /* renamed from: b */
    public final /* synthetic */ Object f41605b;

    public /* synthetic */ C10893rL0(int i, Object obj) {
        this.f41604a = i;
        this.f41605b = obj;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        switch (this.f41604a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
        switch (this.f41604a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        switch (this.f41604a) {
            case 0:
                if (C11277uL0.f43675e) {
                    ((Promise) this.f41605b).resolve(null);
                }
                C11277uL0.f43672b.removeLifecycleEventListener(this);
                break;
            default:
                break;
        }
    }

    /* renamed from: a */
    private final void m24318a() {
    }

    /* renamed from: b */
    private final void m24319b() {
    }
}
