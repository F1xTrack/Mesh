package defpackage;

import android.util.SparseArray;

/* renamed from: gk */
/* loaded from: classes.dex */
public final class C4019gk implements YR, InterfaceC1396Rr {
    public static final CF j;
    public static final SV k;
    public final WR a;
    public final int b;
    public final C6666qX c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public VH f;
    public long g;
    public CX0 h;
    public C6666qX[] i;

    static {
        CF cf = new CF();
        cf.b = new C0162Bv0(12);
        j = cf;
        k = new SV();
    }

    public C4019gk(WR wr, int i, C6666qX c6666qX) {
        this.a = wr;
        this.b = i;
        this.c = c6666qX;
    }

    public final void a(VH vh, long j2, long j3) {
        this.f = vh;
        this.g = j3;
        boolean z = this.e;
        WR wr = this.a;
        if (!z) {
            wr.l(this);
            if (j2 != -9223372036854775807L) {
                wr.g(0L, j2);
            }
            this.e = true;
            return;
        }
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        wr.g(0L, j2);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            C3828fk c3828fk = (C3828fk) sparseArray.valueAt(i);
            if (vh == null) {
                c3828fk.e = c3828fk.c;
            } else {
                c3828fk.f = j3;
                InterfaceC1584Ub1 interfaceC1584Ub1E = vh.E(c3828fk.a);
                c3828fk.e = interfaceC1584Ub1E;
                C6666qX c6666qX = c3828fk.d;
                if (c6666qX != null) {
                    interfaceC1584Ub1E.f(c6666qX);
                }
            }
            i++;
        }
    }

    @Override // defpackage.YR
    public final void p() {
        SparseArray sparseArray = this.d;
        C6666qX[] c6666qXArr = new C6666qX[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C6666qX c6666qX = ((C3828fk) sparseArray.valueAt(i)).d;
            YN1.h(c6666qX);
            c6666qXArr[i] = c6666qX;
        }
        this.i = c6666qXArr;
    }

    @Override // defpackage.YR
    public final InterfaceC1584Ub1 w(int i, int i2) {
        SparseArray sparseArray = this.d;
        C3828fk c3828fk = (C3828fk) sparseArray.get(i);
        if (c3828fk == null) {
            YN1.f(this.i == null);
            c3828fk = new C3828fk(i, i2, i2 == this.b ? this.c : null);
            VH vh = this.f;
            long j2 = this.g;
            if (vh == null) {
                c3828fk.e = c3828fk.c;
            } else {
                c3828fk.f = j2;
                InterfaceC1584Ub1 interfaceC1584Ub1E = vh.E(i2);
                c3828fk.e = interfaceC1584Ub1E;
                C6666qX c6666qX = c3828fk.d;
                if (c6666qX != null) {
                    interfaceC1584Ub1E.f(c6666qX);
                }
            }
            sparseArray.put(i, c3828fk);
        }
        return c3828fk;
    }

    @Override // defpackage.YR
    public final void x(CX0 cx0) {
        this.h = cx0;
    }
}
