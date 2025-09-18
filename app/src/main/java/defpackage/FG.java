package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public final class FG implements InterfaceC1786Wr {
    public final InterfaceC6515pk0 a;
    public final int b;
    public final InterfaceC1396Rr[] c;
    public final ZC d;
    public final C22 e;
    public InterfaceC5311jR f;
    public J31 g;
    public int h;
    public C2562ch i;
    public long j = -9223372036854775807L;

    public FG(InterfaceC6515pk0 interfaceC6515pk0, J31 j31, int i, InterfaceC5311jR interfaceC5311jR, ZC zc, C22 c22, C0162Bv0 c0162Bv0, boolean z) {
        C1116Ob1[] c1116Ob1Arr;
        this.a = interfaceC6515pk0;
        this.g = j31;
        this.b = i;
        this.f = interfaceC5311jR;
        this.d = zc;
        this.e = c22;
        I31 i31 = j31.f[i];
        this.c = new InterfaceC1396Rr[interfaceC5311jR.length()];
        for (int i2 = 0; i2 < this.c.length; i2++) {
            int iJ = interfaceC5311jR.j(i2);
            C6666qX c6666qX = i31.j[iJ];
            if (c6666qX.q != null) {
                H31 h31 = j31.e;
                h31.getClass();
                c1116Ob1Arr = h31.c;
            } else {
                c1116Ob1Arr = null;
            }
            C1116Ob1[] c1116Ob1Arr2 = c1116Ob1Arr;
            int i3 = i31.a;
            this.c[i2] = new C4019gk(new KY(c0162Bv0, !z ? 35 : 3, null, new C1038Nb1(iJ, i3, i31.c, -9223372036854775807L, j31.g, c6666qX, 0, c1116Ob1Arr2, i3 == 2 ? 4 : 0, null, null), C3769fQ0.e, null), i31.a, c6666qX);
        }
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void a() throws C2562ch {
        C2562ch c2562ch = this.i;
        if (c2562ch != null) {
            throw c2562ch;
        }
        this.a.a();
    }

    @Override // defpackage.InterfaceC1786Wr
    public final long b(long j, DX0 dx0) {
        I31 i31 = this.g.f[this.b];
        int iF = AbstractC0277Dh1.f(i31.o, j, true);
        long[] jArr = i31.o;
        long j2 = jArr[iF];
        return dx0.a(j, j2, (j2 >= j || iF >= i31.k - 1) ? j2 : jArr[iF + 1]);
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void c(C7660vk0 c7660vk0, long j, List list, C1135Oi c1135Oi) {
        int iA;
        long jC;
        C1090Nt c1090Nt;
        if (this.i != null) {
            return;
        }
        I31[] i31Arr = this.g.f;
        int i = this.b;
        I31 i31 = i31Arr[i];
        if (i31.k == 0) {
            c1135Oi.b = !r5.d;
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        long[] jArr = i31.o;
        if (zIsEmpty) {
            iA = AbstractC0277Dh1.f(jArr, j, true);
        } else {
            iA = (int) (((AbstractC0297Do0) list.get(list.size() - 1)).a() - this.h);
            if (iA < 0) {
                this.i = new C2562ch();
                return;
            }
        }
        int i2 = i31.k;
        if (iA >= i2) {
            c1135Oi.b = !this.g.d;
            return;
        }
        long j2 = c7660vk0.a;
        long j3 = j - j2;
        J31 j31 = this.g;
        if (j31.d) {
            I31 i312 = j31.f[i];
            int i3 = i312.k - 1;
            jC = (i312.c(i3) + i312.o[i3]) - j2;
        } else {
            jC = -9223372036854775807L;
        }
        int length = this.f.length();
        InterfaceC0375Eo0[] interfaceC0375Eo0Arr = new InterfaceC0375Eo0[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.f.j(i4);
            interfaceC0375Eo0Arr[i4] = new C2097aF(i31, iA);
        }
        this.f.c(j2, j3, jC, list, interfaceC0375Eo0Arr);
        long j4 = jArr[iA];
        long jC2 = i31.c(iA) + j4;
        long j5 = list.isEmpty() ? j : -9223372036854775807L;
        int i5 = this.h + iA;
        int iE = this.f.e();
        InterfaceC1396Rr interfaceC1396Rr = this.c[iE];
        int iJ = this.f.j(iE);
        Uri uriA = i31.a(iJ, iA);
        if (this.e != null) {
            c1090Nt = new C1090Nt(this.e, this.f, Math.max(0L, j3), c7660vk0.b, UcumUtils.UCUM_SECONDS, this.g.d, c7660vk0.a(this.j), list.isEmpty());
            c1090Nt.c(jC2 - j4);
            c1090Nt.j = C1090Nt.b(this.f);
            int i6 = iA + 1;
            if (i6 < i2) {
                c1090Nt.k = AbstractC2051a02.d(uriA, i31.a(iJ, i6));
            }
        } else {
            c1090Nt = null;
        }
        this.j = SystemClock.elapsedRealtime();
        C6666qX c6666qXM = this.f.m();
        int iN = this.f.n();
        Object objQ = this.f.q();
        Map mapEmptyMap = Collections.emptyMap();
        YN1.i(uriA, "The uri must be set.");
        C3538eD c3538eD = new C3538eD(uriA, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0);
        if (c1090Nt != null) {
            c3538eD = c1090Nt.a().a(c3538eD);
        }
        c1135Oi.c = new C6747qy(this.d, c3538eD, c6666qXM, iN, objQ, j4, jC2, j5, -9223372036854775807L, i5, 1, j4, interfaceC1396Rr);
    }

    @Override // defpackage.InterfaceC1786Wr
    public final boolean e(long j, AbstractC1318Qr abstractC1318Qr, List list) {
        if (this.i != null) {
            return false;
        }
        return this.f.g(j, abstractC1318Qr, list);
    }

    @Override // defpackage.InterfaceC1786Wr
    public final boolean f(AbstractC1318Qr abstractC1318Qr, boolean z, C1204Pf c1204Pf, C3547eG c3547eG) {
        C3638ek0 c3638ek0A = RY1.a(this.f);
        c3547eG.getClass();
        C3829fk0 c3829fk0C = C3547eG.c(c3638ek0A, c1204Pf);
        if (z && c3829fk0C != null && c3829fk0C.a == 2) {
            InterfaceC5311jR interfaceC5311jR = this.f;
            if (interfaceC5311jR.o(interfaceC5311jR.f(abstractC1318Qr.d), c3829fk0C.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1786Wr
    public final int g(long j, List list) {
        return (this.i != null || this.f.length() < 2) ? list.size() : this.f.k(j, list);
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void release() {
        for (InterfaceC1396Rr interfaceC1396Rr : this.c) {
            ((C4019gk) interfaceC1396Rr).a.release();
        }
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void d(AbstractC1318Qr abstractC1318Qr) {
    }
}
