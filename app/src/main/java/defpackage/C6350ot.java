package defpackage;

import java.util.ArrayList;

/* renamed from: ot, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6350ot extends AbstractC5195ip1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final ArrayList o;
    public final C0100Ba1 p;
    public C5968mt q;
    public C6159nt r;
    public long s;
    public long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6350ot(AbstractC6883rg abstractC6883rg, long j, long j2, boolean z) {
        super(abstractC6883rg);
        abstractC6883rg.getClass();
        YN1.c(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = new ArrayList();
        this.p = new C0100Ba1();
    }

    @Override // defpackage.AbstractC5195ip1
    public final void B(AbstractC0178Ca1 abstractC0178Ca1) {
        if (this.r != null) {
            return;
        }
        E(abstractC0178Ca1);
    }

    public final void E(AbstractC0178Ca1 abstractC0178Ca1) {
        long j;
        C0100Ba1 c0100Ba1 = this.p;
        abstractC0178Ca1.n(0, c0100Ba1);
        long j2 = c0100Ba1.p;
        C5968mt c5968mt = this.q;
        ArrayList arrayList = this.o;
        long j3 = this.m;
        if (c5968mt == null || arrayList.isEmpty()) {
            j = this.l;
            this.s = j2 + j;
            this.t = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C5777lt c5777lt = (C5777lt) arrayList.get(i);
                long j4 = this.s;
                long j5 = this.t;
                c5777lt.e = j4;
                c5777lt.f = j5;
            }
        } else {
            j = this.s - j2;
            j3 = j3 != Long.MIN_VALUE ? this.t - j2 : Long.MIN_VALUE;
        }
        try {
            C5968mt c5968mt2 = new C5968mt(abstractC0178Ca1, j, j3);
            this.q = c5968mt2;
            n(c5968mt2);
        } catch (C6159nt e) {
            this.r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C5777lt) arrayList.get(i2)).g = this.r;
            }
        }
    }

    @Override // defpackage.AbstractC6883rg
    public final InterfaceC8435zp0 b(C0456Fp0 c0456Fp0, C5272jE c5272jE, long j) {
        C5777lt c5777lt = new C5777lt(this.k.b(c0456Fp0, c5272jE, j), this.n, this.s, this.t);
        this.o.add(c5777lt);
        return c5777lt;
    }

    @Override // defpackage.AbstractC1720Vv, defpackage.AbstractC6883rg
    public final void j() throws C6159nt {
        C6159nt c6159nt = this.r;
        if (c6159nt != null) {
            throw c6159nt;
        }
        super.j();
    }

    @Override // defpackage.AbstractC6883rg
    public final void o(InterfaceC8435zp0 interfaceC8435zp0) {
        ArrayList arrayList = this.o;
        YN1.f(arrayList.remove(interfaceC8435zp0));
        this.k.o(((C5777lt) interfaceC8435zp0).a);
        if (arrayList.isEmpty()) {
            C5968mt c5968mt = this.q;
            c5968mt.getClass();
            E(c5968mt.b);
        }
    }

    @Override // defpackage.AbstractC1720Vv, defpackage.AbstractC6883rg
    public final void q() {
        super.q();
        this.r = null;
        this.q = null;
    }
}
