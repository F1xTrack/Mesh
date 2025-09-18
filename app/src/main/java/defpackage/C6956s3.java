package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6956s3 implements WR {
    public final C4103hA0 d;
    public final C0848Kq e;
    public YR f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int a = 0;
    public final C7147t3 b = new C7147t3(0, null, true);
    public final C4103hA0 c = new C4103hA0(2048);
    public int i = -1;
    public long h = -1;

    public C6956s3() {
        C4103hA0 c4103hA0 = new C4103hA0(10);
        this.d = c4103hA0;
        byte[] bArr = c4103hA0.a;
        this.e = new C0848Kq(bArr, bArr.length);
    }

    public final int a(C7566vF c7566vF) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            C4103hA0 c4103hA0 = this.d;
            c7566vF.f(c4103hA0.a, 0, 10, false);
            c4103hA0.G(0);
            if (c4103hA0.x() != 4801587) {
                break;
            }
            c4103hA0.H(3);
            int iT = c4103hA0.t();
            i += iT + 10;
            c7566vF.a(iT, false);
        }
        c7566vF.f = 0;
        c7566vF.a(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r19, defpackage.SV r20) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6956s3.d(XR, SV):int");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) throws EOFException, InterruptedIOException {
        C7566vF c7566vF = (C7566vF) xr;
        int iA = a(c7566vF);
        int i = iA;
        int i2 = 0;
        int i3 = 0;
        do {
            C4103hA0 c4103hA0 = this.d;
            c7566vF.f(c4103hA0.a, 0, 2, false);
            c4103hA0.G(0);
            if ((c4103hA0.A() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                c7566vF.f(c4103hA0.a, 0, 4, false);
                C0848Kq c0848Kq = this.e;
                c0848Kq.t(14);
                int iL = c0848Kq.l(13);
                if (iL <= 6) {
                    i++;
                    c7566vF.f = 0;
                    c7566vF.a(i, false);
                } else {
                    c7566vF.a(iL - 6, false);
                    i3 += iL;
                }
            } else {
                i++;
                c7566vF.f = 0;
                c7566vF.a(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iA < 8192);
        return false;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        this.k = false;
        this.b.c();
        this.g = j2;
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.f = yr;
        this.b.d(yr, new YM0(0, 1));
        yr.p();
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
