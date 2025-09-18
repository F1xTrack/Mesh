package p000;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: FG */
/* loaded from: classes.dex */
public final class C0332FG implements InterfaceC1438Wr {

    /* renamed from: a */
    public final InterfaceC10687pk0 f3124a;

    /* renamed from: b */
    public final int f3125b;

    /* renamed from: c */
    public final InterfaceC1123Rr[] f3126c;

    /* renamed from: d */
    public final InterfaceC1586ZC f3127d;

    /* renamed from: e */
    public final C22 f3128e;

    /* renamed from: f */
    public InterfaceC6237jR f3129f;

    /* renamed from: g */
    public J31 f3130g;

    /* renamed from: h */
    public int f3131h;

    /* renamed from: i */
    public C1863ch f3132i;

    /* renamed from: j */
    public long f3133j = -9223372036854775807L;

    public C0332FG(InterfaceC10687pk0 interfaceC10687pk0, J31 j31, int i, InterfaceC6237jR interfaceC6237jR, InterfaceC1586ZC interfaceC1586ZC, C22 c22, C7408Bv0 c7408Bv0, boolean z) {
        C8045Ob1[] c8045Ob1Arr;
        this.f3124a = interfaceC10687pk0;
        this.f3130g = j31;
        this.f3125b = i;
        this.f3129f = interfaceC6237jR;
        this.f3127d = interfaceC1586ZC;
        this.f3128e = c22;
        I31 i31 = j31.f5301f[i];
        this.f3126c = new InterfaceC1123Rr[interfaceC6237jR.length()];
        for (int i2 = 0; i2 < this.f3126c.length; i2++) {
            int iMo2729j = interfaceC6237jR.mo2729j(i2);
            C6686qX c6686qX = i31.f4683j[iMo2729j];
            if (c6686qX.f40978q != null) {
                H31 h31 = j31.f5300e;
                h31.getClass();
                c8045Ob1Arr = h31.f4034c;
            } else {
                c8045Ob1Arr = null;
            }
            C8045Ob1[] c8045Ob1Arr2 = c8045Ob1Arr;
            int i3 = i31.f4674a;
            this.f3126c[i2] = new C4135gk(new C0665KY(c7408Bv0, !z ? 35 : 3, null, new C7993Nb1(iMo2729j, i3, i31.f4676c, -9223372036854775807L, j31.f5302g, c6686qX, 0, c8045Ob1Arr2, i3 == 2 ? 4 : 0, null, null), C9367fQ0.f27184e, null), i31.f4674a, c6686qX);
        }
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: a */
    public final void mo2563a() throws C1863ch {
        C1863ch c1863ch = this.f3132i;
        if (c1863ch != null) {
            throw c1863ch;
        }
        this.f3124a.mo858a();
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: b */
    public final long mo2564b(long j, DX0 dx0) {
        I31 i31 = this.f3130g.f5301f[this.f3125b];
        int iM1821f = AbstractC7485Dh1.m1821f(i31.f4688o, j, true);
        long[] jArr = i31.f4688o;
        long j2 = jArr[iM1821f];
        return dx0.m1724a(j, j2, (j2 >= j || iM1821f >= i31.f4684k - 1) ? j2 : jArr[iM1821f + 1]);
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: c */
    public final void mo2565c(C11455vk0 c11455vk0, long j, List list, C0926Oi c0926Oi) {
        int iMo1898a;
        long jM3741c;
        C0874Nt c0874Nt;
        if (this.f3132i != null) {
            return;
        }
        I31[] i31Arr = this.f3130g.f5301f;
        int i = this.f3125b;
        I31 i31 = i31Arr[i];
        if (i31.f4684k == 0) {
            c0926Oi.f8575b = !r5.f5299d;
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        long[] jArr = i31.f4688o;
        if (zIsEmpty) {
            iMo1898a = AbstractC7485Dh1.m1821f(jArr, j, true);
        } else {
            iMo1898a = (int) (((AbstractC7498Do0) list.get(list.size() - 1)).mo1898a() - this.f3131h);
            if (iMo1898a < 0) {
                this.f3132i = new C1863ch();
                return;
            }
        }
        int i2 = i31.f4684k;
        if (iMo1898a >= i2) {
            c0926Oi.f8575b = !this.f3130g.f5299d;
            return;
        }
        long j2 = c11455vk0.f44511a;
        long j3 = j - j2;
        J31 j31 = this.f3130g;
        if (j31.f5299d) {
            I31 i312 = j31.f5301f[i];
            int i3 = i312.f4684k - 1;
            jM3741c = (i312.m3741c(i3) + i312.f4688o[i3]) - j2;
        } else {
            jM3741c = -9223372036854775807L;
        }
        int length = this.f3129f.length();
        InterfaceC7550Eo0[] interfaceC7550Eo0Arr = new InterfaceC7550Eo0[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.f3129f.mo2729j(i4);
            interfaceC7550Eo0Arr[i4] = new C1652aF(i31, iMo1898a);
        }
        this.f3129f.mo6373c(j2, j3, jM3741c, list, interfaceC7550Eo0Arr);
        long j4 = jArr[iMo1898a];
        long jM3741c2 = i31.m3741c(iMo1898a) + j4;
        long j5 = list.isEmpty() ? j : -9223372036854775807L;
        int i5 = this.f3131h + iMo1898a;
        int iMo6374e = this.f3129f.mo6374e();
        InterfaceC1123Rr interfaceC1123Rr = this.f3126c[iMo6374e];
        int iMo2729j = this.f3129f.mo2729j(iMo6374e);
        Uri uriM3739a = i31.m3739a(iMo2729j, iMo1898a);
        if (this.f3128e != null) {
            c0874Nt = new C0874Nt(this.f3128e, this.f3129f, Math.max(0L, j3), c11455vk0.f44512b, UcumUtils.UCUM_SECONDS, this.f3130g.f5299d, c11455vk0.m25482a(this.f3133j), list.isEmpty());
            c0874Nt.m5897c(jM3741c2 - j4);
            c0874Nt.f8112j = C0874Nt.m5895b(this.f3129f);
            int i6 = iMo1898a + 1;
            if (i6 < i2) {
                c0874Nt.f8113k = AbstractC8668a02.m9655d(uriM3739a, i31.m3739a(iMo2729j, i6));
            }
        } else {
            c0874Nt = null;
        }
        this.f3133j = SystemClock.elapsedRealtime();
        C6686qX c6686qXMo2732m = this.f3129f.mo2732m();
        int iMo6375n = this.f3129f.mo6375n();
        Object objMo6376q = this.f3129f.mo6376q();
        Map mapEmptyMap = Collections.emptyMap();
        YN1.m9284i(uriM3739a, "The uri must be set.");
        C3976eD c3976eD = new C3976eD(uriM3739a, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 0);
        if (c0874Nt != null) {
            c3976eD = c0874Nt.m5896a().m6179a(c3976eD);
        }
        c0926Oi.f8576c = new C6713qy(this.f3127d, c3976eD, c6686qXMo2732m, iMo6375n, objMo6376q, j4, jM3741c2, j5, -9223372036854775807L, i5, 1, j4, interfaceC1123Rr);
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: e */
    public final boolean mo2567e(long j, AbstractC1061Qr abstractC1061Qr, List list) {
        if (this.f3132i != null) {
            return false;
        }
        return this.f3129f.mo2726g(j, abstractC1061Qr, list);
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: f */
    public final boolean mo2568f(AbstractC1061Qr abstractC1061Qr, boolean z, C0986Pf c0986Pf, C3979eG c3979eG) {
        C9279ek0 c9279ek0M7033a = RY1.m7033a(this.f3129f);
        c3979eG.getClass();
        C9407fk0 c9407fk0M17890c = C3979eG.m17890c(c9279ek0M7033a, c0986Pf);
        if (z && c9407fk0M17890c != null && c9407fk0M17890c.f27363a == 2) {
            InterfaceC6237jR interfaceC6237jR = this.f3129f;
            if (interfaceC6237jR.mo2733o(interfaceC6237jR.mo2725f(abstractC1061Qr.f9814d), c9407fk0M17890c.f27364b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: g */
    public final int mo2569g(long j, List list) {
        return (this.f3132i != null || this.f3129f.length() < 2) ? list.size() : this.f3129f.mo2730k(j, list);
    }

    @Override // p000.InterfaceC1438Wr
    public final void release() {
        for (InterfaceC1123Rr interfaceC1123Rr : this.f3126c) {
            ((C4135gk) interfaceC1123Rr).f27966a.release();
        }
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: d */
    public final void mo2566d(AbstractC1061Qr abstractC1061Qr) {
    }
}
