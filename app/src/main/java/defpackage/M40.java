package defpackage;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class M40 implements InterfaceC6646qQ0 {
    public final InterfaceC6646qQ0 a;
    public final F71 b = LB.b(TT.q);

    public M40(InterfaceC6646qQ0 interfaceC6646qQ0) {
        this.a = interfaceC6646qQ0;
    }

    @Override // defpackage.InterfaceC6646qQ0
    public final void a(C7600vQ0 c7600vQ0) {
        ((Handler) this.b.getValue()).post(new RQ(this, 8, c7600vQ0));
    }

    @Override // defpackage.InterfaceC6646qQ0
    public final void b() {
        ((Handler) this.b.getValue()).post(new L40(this, 1));
    }

    @Override // defpackage.InterfaceC6646qQ0
    public final void c() {
        ((Handler) this.b.getValue()).post(new L40(this, 2));
    }

    @Override // defpackage.InterfaceC6646qQ0
    public final void d() {
        ((Handler) this.b.getValue()).post(new L40(this, 0));
    }
}
