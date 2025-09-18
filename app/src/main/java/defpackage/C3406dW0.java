package defpackage;

import java.util.List;

/* renamed from: dW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3406dW0 extends AbstractC0061An1 {
    public final /* synthetic */ C3596eW0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3406dW0(C3596eW0 c3596eW0) {
        super(0);
        this.a = c3596eW0;
    }

    @Override // defpackage.AbstractC0061An1
    public final void onEnd(C0607Hn1 c0607Hn1) {
        this.a.c = false;
    }

    @Override // defpackage.AbstractC0061An1
    public final C1698Vn1 onProgress(C1698Vn1 c1698Vn1, List list) {
        O90.f(c1698Vn1, "insets");
        O90.f(list, "runningAnimations");
        C1464Sn1 c1464Sn1 = c1698Vn1.a;
        int i = c1464Sn1.f(8).d - c1464Sn1.f(2).d;
        C3596eW0 c3596eW0 = this.a;
        c3596eW0.e = i;
        c3596eW0.n(c3596eW0.b, c3596eW0.getReactHeight(), C3596eW0.m(c3596eW0, c3596eW0.d), c3596eW0.e);
        return c1698Vn1;
    }

    @Override // defpackage.AbstractC0061An1
    public final C8430zn1 onStart(C0607Hn1 c0607Hn1, C8430zn1 c8430zn1) {
        this.a.c = true;
        return c8430zn1;
    }
}
