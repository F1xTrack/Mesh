package p000;

import java.util.List;

/* renamed from: Nq */
/* loaded from: classes.dex */
public final class C0871Nq extends AbstractC1651aE implements U51 {

    /* renamed from: e */
    public U51 f8024e;

    /* renamed from: f */
    public long f8025f;

    /* renamed from: g */
    public final /* synthetic */ int f8026g = 0;

    /* renamed from: h */
    public Object f8027h;

    public /* synthetic */ C0871Nq() {
    }

    @Override // p000.U51
    /* renamed from: c */
    public final int mo5855c(long j) {
        U51 u51 = this.f8024e;
        u51.getClass();
        return u51.mo5855c(j - this.f8025f);
    }

    @Override // p000.U51
    /* renamed from: f */
    public final long mo5856f(int i) {
        U51 u51 = this.f8024e;
        u51.getClass();
        return u51.mo5856f(i) + this.f8025f;
    }

    @Override // p000.U51
    /* renamed from: h */
    public final List mo5857h(long j) {
        U51 u51 = this.f8024e;
        u51.getClass();
        return u51.mo5857h(j - this.f8025f);
    }

    @Override // p000.U51
    /* renamed from: j */
    public final int mo5858j() {
        U51 u51 = this.f8024e;
        u51.getClass();
        return u51.mo5858j();
    }

    @Override // p000.AbstractC1651aE
    /* renamed from: t */
    public final void mo5859t() {
        super.mo5859t();
        this.f8024e = null;
    }

    @Override // p000.AbstractC1651aE
    /* renamed from: u */
    public final void mo5860u() {
        switch (this.f8026g) {
            case 0:
                C0071B7 c0071b7 = (C0071B7) this.f8027h;
                c0071b7.getClass();
                AbstractC0934Oq abstractC0934Oq = (AbstractC0934Oq) c0071b7.f579b;
                abstractC0934Oq.getClass();
                mo5859t();
                abstractC0934Oq.f8635b.add(this);
                break;
            default:
                ((C1681ai) this.f8027h).m9784l(this);
                break;
        }
    }

    public C0871Nq(C1681ai c1681ai) {
        this.f8027h = c1681ai;
    }
}
