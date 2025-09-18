package defpackage;

import java.util.List;

/* renamed from: Nq */
/* loaded from: classes.dex */
public final class C1081Nq extends AbstractC2094aE implements U51 {
    public U51 e;
    public long f;
    public final /* synthetic */ int g = 0;
    public Object h;

    public /* synthetic */ C1081Nq() {
    }

    @Override // defpackage.U51
    public final int c(long j) {
        U51 u51 = this.e;
        u51.getClass();
        return u51.c(j - this.f);
    }

    @Override // defpackage.U51
    public final long f(int i) {
        U51 u51 = this.e;
        u51.getClass();
        return u51.f(i) + this.f;
    }

    @Override // defpackage.U51
    public final List h(long j) {
        U51 u51 = this.e;
        u51.getClass();
        return u51.h(j - this.f);
    }

    @Override // defpackage.U51
    public final int j() {
        U51 u51 = this.e;
        u51.getClass();
        return u51.j();
    }

    @Override // defpackage.AbstractC2094aE
    public final void t() {
        super.t();
        this.e = null;
    }

    @Override // defpackage.AbstractC2094aE
    public final void u() {
        switch (this.g) {
            case 0:
                B7 b7 = (B7) this.h;
                b7.getClass();
                AbstractC1159Oq abstractC1159Oq = (AbstractC1159Oq) b7.b;
                abstractC1159Oq.getClass();
                t();
                abstractC1159Oq.b.add(this);
                break;
            default:
                ((C2184ai) this.h).l(this);
                break;
        }
    }

    public C1081Nq(C2184ai c2184ai) {
        this.h = c2184ai;
    }
}
