package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.Callback;

/* renamed from: eu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9299eu0 extends AbstractC9811iu0 {

    /* renamed from: b */
    public final /* synthetic */ int f26936b;

    /* renamed from: c */
    public final /* synthetic */ int f26937c;

    /* renamed from: d */
    public final /* synthetic */ Object f26938d;

    public /* synthetic */ C9299eu0(int i, Object obj, int i2) {
        this.f26936b = i2;
        this.f26937c = i;
        this.f26938d = obj;
    }

    @Override // p000.AbstractC9811iu0
    /* renamed from: a */
    public final void mo9180a(C1881a c1881a) {
        switch (this.f26936b) {
            case 0:
                c1881a.m10933j(this.f26937c, (Callback) this.f26938d);
                break;
            default:
                c1881a.m10940q(this.f26937c, (C0986Pf) this.f26938d);
                break;
        }
    }
}
