package p000;

import java.util.List;

/* renamed from: e30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9192e30 extends AbstractC6695qg {

    /* renamed from: d */
    public final List f26517d;

    /* renamed from: e */
    public final long f26518e;

    public C9192e30(long j, List list) {
        super(0L, list.size() - 1);
        this.f26518e = j;
        this.f26517d = list;
    }

    @Override // p000.InterfaceC7550Eo0
    /* renamed from: e */
    public final long mo2423e() {
        m24041a();
        return this.f26518e + ((AbstractC10472o30) this.f26517d.get((int) this.f41099c)).f38739e;
    }

    @Override // p000.InterfaceC7550Eo0
    /* renamed from: h */
    public final long mo2424h() {
        m24041a();
        AbstractC10472o30 abstractC10472o30 = (AbstractC10472o30) this.f26517d.get((int) this.f41099c);
        return this.f26518e + abstractC10472o30.f38739e + abstractC10472o30.f38737c;
    }
}
