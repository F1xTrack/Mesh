package defpackage;

/* renamed from: fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3828fk implements InterfaceC1584Ub1 {
    public final int a;
    public final C6666qX b;
    public final WJ c = new WJ();
    public C6666qX d;
    public InterfaceC1584Ub1 e;
    public long f;

    public C3828fk(int i, int i2, C6666qX c6666qX) {
        this.a = i2;
        this.b = c6666qX;
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void a(long j, int i, int i2, int i3, C1506Tb1 c1506Tb1) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.e;
        int i4 = AbstractC0277Dh1.a;
        interfaceC1584Ub1.a(j, i, i2, i3, c1506Tb1);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void b(C4103hA0 c4103hA0, int i, int i2) {
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.e;
        int i3 = AbstractC0277Dh1.a;
        interfaceC1584Ub1.d(i, c4103hA0);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int c(RC rc, int i, boolean z) {
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.e;
        int i2 = AbstractC0277Dh1.a;
        return interfaceC1584Ub1.e(rc, i, z);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final /* synthetic */ void d(int i, C4103hA0 c4103hA0) {
        F91.n(this, c4103hA0, i);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int e(RC rc, int i, boolean z) {
        return c(rc, i, z);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void f(C6666qX c6666qX) {
        C6666qX c6666qX2 = this.b;
        if (c6666qX2 != null) {
            c6666qX = c6666qX.e(c6666qX2);
        }
        this.d = c6666qX;
        InterfaceC1584Ub1 interfaceC1584Ub1 = this.e;
        int i = AbstractC0277Dh1.a;
        interfaceC1584Ub1.f(c6666qX);
    }
}
