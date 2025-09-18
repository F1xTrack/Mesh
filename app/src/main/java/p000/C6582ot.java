package p000;

import java.util.ArrayList;

/* renamed from: ot */
/* loaded from: classes.dex */
public final class C6582ot extends AbstractC9802ip1 {

    /* renamed from: l */
    public final long f39330l;

    /* renamed from: m */
    public final long f39331m;

    /* renamed from: n */
    public final boolean f39332n;

    /* renamed from: o */
    public final ArrayList f39333o;

    /* renamed from: p */
    public final C7367Ba1 f39334p;

    /* renamed from: q */
    public C6454mt f39335q;

    /* renamed from: r */
    public C6517nt f39336r;

    /* renamed from: s */
    public long f39337s;

    /* renamed from: t */
    public long f39338t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6582ot(AbstractC6758rg abstractC6758rg, long j, long j2, boolean z) {
        super(abstractC6758rg);
        abstractC6758rg.getClass();
        YN1.m9278c(j >= 0);
        this.f39330l = j;
        this.f39331m = j2;
        this.f39332n = z;
        this.f39333o = new ArrayList();
        this.f39334p = new C7367Ba1();
    }

    @Override // p000.AbstractC9802ip1
    /* renamed from: B */
    public final void mo3158B(AbstractC7419Ca1 abstractC7419Ca1) {
        if (this.f39336r != null) {
            return;
        }
        m23575E(abstractC7419Ca1);
    }

    /* renamed from: E */
    public final void m23575E(AbstractC7419Ca1 abstractC7419Ca1) {
        long j;
        C7367Ba1 c7367Ba1 = this.f39334p;
        abstractC7419Ca1.m1257n(0, c7367Ba1);
        long j2 = c7367Ba1.f929p;
        C6454mt c6454mt = this.f39335q;
        ArrayList arrayList = this.f39333o;
        long j3 = this.f39331m;
        if (c6454mt == null || arrayList.isEmpty()) {
            j = this.f39330l;
            this.f39337s = j2 + j;
            this.f39338t = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C6391lt c6391lt = (C6391lt) arrayList.get(i);
                long j4 = this.f39337s;
                long j5 = this.f39338t;
                c6391lt.f37336e = j4;
                c6391lt.f37337f = j5;
            }
        } else {
            j = this.f39337s - j2;
            j3 = j3 != Long.MIN_VALUE ? this.f39338t - j2 : Long.MIN_VALUE;
        }
        try {
            C6454mt c6454mt2 = new C6454mt(abstractC7419Ca1, j, j3);
            this.f39335q = c6454mt2;
            m24442n(c6454mt2);
        } catch (C6517nt e) {
            this.f39336r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C6391lt) arrayList.get(i2)).f37338g = this.f39336r;
            }
        }
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: b */
    public final InterfaceC11973zp0 mo3162b(C7604Fp0 c7604Fp0, C6224jE c6224jE, long j) {
        C6391lt c6391lt = new C6391lt(this.f34756k.mo3162b(c7604Fp0, c6224jE, j), this.f39332n, this.f39337s, this.f39338t);
        this.f39333o.add(c6391lt);
        return c6391lt;
    }

    @Override // p000.AbstractC1379Vv, p000.AbstractC6758rg
    /* renamed from: j */
    public final void mo3163j() throws C6517nt {
        C6517nt c6517nt = this.f39336r;
        if (c6517nt != null) {
            throw c6517nt;
        }
        super.mo3163j();
    }

    @Override // p000.AbstractC6758rg
    /* renamed from: o */
    public final void mo3164o(InterfaceC11973zp0 interfaceC11973zp0) {
        ArrayList arrayList = this.f39333o;
        YN1.m9281f(arrayList.remove(interfaceC11973zp0));
        this.f34756k.mo3164o(((C6391lt) interfaceC11973zp0).f37332a);
        if (arrayList.isEmpty()) {
            C6454mt c6454mt = this.f39335q;
            c6454mt.getClass();
            m23575E(c6454mt.f3796b);
        }
    }

    @Override // p000.AbstractC1379Vv, p000.AbstractC6758rg
    /* renamed from: q */
    public final void mo3165q() {
        super.mo3165q();
        this.f39336r = null;
        this.f39335q = null;
    }
}
