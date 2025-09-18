package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: dc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3424dc0 implements WR {
    public YR b;
    public int c;
    public int d;
    public int e;
    public C1634Us0 g;
    public C7566vF h;
    public C0617Hr i;
    public C2024Zs0 j;
    public final C4103hA0 a = new C4103hA0(6);
    public long f = -1;

    public final void a() {
        YR yr = this.b;
        yr.getClass();
        yr.p();
        this.b.x(new C4004gf(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r26, defpackage.SV r27) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3424dc0.d(XR, SV):int");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        C7566vF c7566vF = (C7566vF) xr;
        C4103hA0 c4103hA0 = this.a;
        c4103hA0.D(2);
        c7566vF.f(c4103hA0.a, 0, 2, false);
        if (c4103hA0.A() != 65496) {
            return false;
        }
        c4103hA0.D(2);
        c7566vF.f(c4103hA0.a, 0, 2, false);
        int iA = c4103hA0.A();
        this.d = iA;
        if (iA == 65504) {
            c4103hA0.D(2);
            c7566vF.f(c4103hA0.a, 0, 2, false);
            c7566vF.a(c4103hA0.A() - 2, false);
            c4103hA0.D(2);
            c7566vF.f(c4103hA0.a, 0, 2, false);
            this.d = c4103hA0.A();
        }
        if (this.d != 65505) {
            return false;
        }
        c7566vF.a(2, false);
        c4103hA0.D(6);
        c7566vF.f(c4103hA0.a, 0, 6, false);
        return c4103hA0.w() == 1165519206 && c4103hA0.A() == 0;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            C2024Zs0 c2024Zs0 = this.j;
            c2024Zs0.getClass();
            c2024Zs0.g(j, j2);
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.b = yr;
    }

    @Override // defpackage.WR
    public final void release() {
        C2024Zs0 c2024Zs0 = this.j;
        if (c2024Zs0 != null) {
            c2024Zs0.getClass();
        }
    }
}
