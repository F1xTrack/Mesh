package p000;

import android.util.SparseArray;

/* renamed from: gk */
/* loaded from: classes.dex */
public final class C4135gk implements InterfaceC1538YR, InterfaceC1123Rr {

    /* renamed from: j */
    public static final C0142CF f27964j;

    /* renamed from: k */
    public static final C1164SV f27965k;

    /* renamed from: a */
    public final InterfaceC1412WR f27966a;

    /* renamed from: b */
    public final int f27967b;

    /* renamed from: c */
    public final C6686qX f27968c;

    /* renamed from: d */
    public final SparseArray f27969d = new SparseArray();

    /* renamed from: e */
    public boolean f27970e;

    /* renamed from: f */
    public C1339VH f27971f;

    /* renamed from: g */
    public long f27972g;

    /* renamed from: h */
    public CX0 f27973h;

    /* renamed from: i */
    public C6686qX[] f27974i;

    static {
        C0142CF c0142cf = new C0142CF();
        c0142cf.f1266b = new C7408Bv0(12);
        f27964j = c0142cf;
        f27965k = new C1164SV();
    }

    public C4135gk(InterfaceC1412WR interfaceC1412WR, int i, C6686qX c6686qX) {
        this.f27966a = interfaceC1412WR;
        this.f27967b = i;
        this.f27968c = c6686qX;
    }

    /* renamed from: a */
    public final void m18605a(C1339VH c1339vh, long j, long j2) {
        this.f27971f = c1339vh;
        this.f27972g = j2;
        boolean z = this.f27970e;
        InterfaceC1412WR interfaceC1412WR = this.f27966a;
        if (!z) {
            interfaceC1412WR.mo742l(this);
            if (j != -9223372036854775807L) {
                interfaceC1412WR.mo740g(0L, j);
            }
            this.f27970e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC1412WR.mo740g(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f27969d;
            if (i >= sparseArray.size()) {
                return;
            }
            C4072fk c4072fk = (C4072fk) sparseArray.valueAt(i);
            if (c1339vh == null) {
                c4072fk.f27361e = c4072fk.f27359c;
            } else {
                c4072fk.f27362f = j2;
                InterfaceC8357Ub1 interfaceC8357Ub1M8361E = c1339vh.m8361E(c4072fk.f27357a);
                c4072fk.f27361e = interfaceC8357Ub1M8361E;
                C6686qX c6686qX = c4072fk.f27360d;
                if (c6686qX != null) {
                    interfaceC8357Ub1M8361E.mo965f(c6686qX);
                }
            }
            i++;
        }
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: p */
    public final void mo2003p() {
        SparseArray sparseArray = this.f27969d;
        C6686qX[] c6686qXArr = new C6686qX[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C6686qX c6686qX = ((C4072fk) sparseArray.valueAt(i)).f27360d;
            YN1.m9283h(c6686qX);
            c6686qXArr[i] = c6686qX;
        }
        this.f27974i = c6686qXArr;
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: w */
    public final InterfaceC8357Ub1 mo2005w(int i, int i2) {
        SparseArray sparseArray = this.f27969d;
        C4072fk c4072fk = (C4072fk) sparseArray.get(i);
        if (c4072fk == null) {
            YN1.m9281f(this.f27974i == null);
            c4072fk = new C4072fk(i, i2, i2 == this.f27967b ? this.f27968c : null);
            C1339VH c1339vh = this.f27971f;
            long j = this.f27972g;
            if (c1339vh == null) {
                c4072fk.f27361e = c4072fk.f27359c;
            } else {
                c4072fk.f27362f = j;
                InterfaceC8357Ub1 interfaceC8357Ub1M8361E = c1339vh.m8361E(i2);
                c4072fk.f27361e = interfaceC8357Ub1M8361E;
                C6686qX c6686qX = c4072fk.f27360d;
                if (c6686qX != null) {
                    interfaceC8357Ub1M8361E.mo965f(c6686qX);
                }
            }
            sparseArray.put(i, c4072fk);
        }
        return c4072fk;
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: x */
    public final void mo2006x(CX0 cx0) {
        this.f27973h = cx0;
    }
}
