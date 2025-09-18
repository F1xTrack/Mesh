package defpackage;

import java.util.List;

/* renamed from: hf */
/* loaded from: classes.dex */
public final class C4195hf implements WR {
    public final C4103hA0 a;
    public final C7902x1 b;
    public final boolean c;
    public final C0162Bv0 d;
    public int e;
    public YR f;
    public Cif g;
    public long h;
    public C1552Tr[] i;
    public long j;
    public C1552Tr k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public C4195hf(int i, C0162Bv0 c0162Bv0) {
        this.d = c0162Bv0;
        this.c = (i & 1) == 0;
        this.a = new C4103hA0(12);
        this.b = new C7902x1();
        this.f = new C7532v32(17);
        this.i = new C1552Tr[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0379  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r29, defpackage.SV r30) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4195hf.d(XR, SV):int");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        C4103hA0 c4103hA0 = this.a;
        ((C7566vF) xr).f(c4103hA0.a, 0, 12, false);
        c4103hA0.G(0);
        if (c4103hA0.i() != 1179011410) {
            return false;
        }
        c4103hA0.H(4);
        return c4103hA0.i() == 541677121;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (C1552Tr c1552Tr : this.i) {
            if (c1552Tr.j == 0) {
                c1552Tr.h = 0;
            } else {
                c1552Tr.h = c1552Tr.l[AbstractC0277Dh1.f(c1552Tr.k, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.e = 0;
        if (this.c) {
            yr = new C5772lr0(yr, this.d);
        }
        this.f = yr;
        this.j = -1L;
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
