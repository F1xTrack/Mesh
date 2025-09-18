package defpackage;

/* renamed from: kt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5586kt implements InterfaceC3403dV0 {
    public final InterfaceC3403dV0 a;
    public boolean b;
    public final /* synthetic */ C5777lt c;

    public C5586kt(C5777lt c5777lt, InterfaceC3403dV0 interfaceC3403dV0) {
        this.c = c5777lt;
        this.a = interfaceC3403dV0;
    }

    @Override // defpackage.InterfaceC3403dV0
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.InterfaceC3403dV0
    public final boolean f() {
        return !this.c.c() && this.a.f();
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int j(long j) {
        if (this.c.c()) {
            return -3;
        }
        return this.a.j(j);
    }

    @Override // defpackage.InterfaceC3403dV0
    public final int k(N8 n8, ZD zd, int i) {
        C5777lt c5777lt = this.c;
        if (c5777lt.c()) {
            return -3;
        }
        if (this.b) {
            zd.b = 4;
            return -4;
        }
        long jS = c5777lt.s();
        int iK = this.a.k(n8, zd, i);
        if (iK != -5) {
            long j = c5777lt.f;
            if (j == Long.MIN_VALUE || ((iK != -4 || zd.g < j) && !(iK == -3 && jS == Long.MIN_VALUE && !zd.f))) {
                return iK;
            }
            zd.t();
            zd.b = 4;
            this.b = true;
            return -4;
        }
        C6666qX c6666qX = (C6666qX) n8.c;
        c6666qX.getClass();
        int i2 = c6666qX.E;
        int i3 = c6666qX.D;
        if (i3 != 0 || i2 != 0) {
            if (c5777lt.e != 0) {
                i3 = 0;
            }
            if (c5777lt.f != Long.MIN_VALUE) {
                i2 = 0;
            }
            C6475pX c6475pXA = c6666qX.a();
            c6475pXA.C = i3;
            c6475pXA.D = i2;
            n8.c = new C6666qX(c6475pXA);
        }
        return -5;
    }
}
