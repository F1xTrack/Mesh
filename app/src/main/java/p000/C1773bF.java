package p000;

import android.os.SystemClock;
import android.util.Pair;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: bF */
/* loaded from: classes.dex */
public final class C1773bF implements InterfaceC1438Wr {

    /* renamed from: a */
    public final InterfaceC10687pk0 f16881a;

    /* renamed from: b */
    public final T71 f16882b;

    /* renamed from: c */
    public final int[] f16883c;

    /* renamed from: d */
    public final int f16884d;

    /* renamed from: e */
    public final InterfaceC1586ZC f16885e;

    /* renamed from: f */
    public final long f16886f;

    /* renamed from: g */
    public final int f16887g;

    /* renamed from: h */
    public final KB0 f16888h;

    /* renamed from: i */
    public final C22 f16889i;

    /* renamed from: j */
    public final C1588ZE[] f16890j;

    /* renamed from: k */
    public InterfaceC6237jR f16891k;

    /* renamed from: l */
    public C6602pC f16892l;

    /* renamed from: m */
    public int f16893m;

    /* renamed from: n */
    public C1863ch f16894n;

    /* renamed from: o */
    public boolean f16895o;

    /* renamed from: p */
    public long f16896p = -9223372036854775807L;

    public C1773bF(C0142CF c0142cf, InterfaceC10687pk0 interfaceC10687pk0, C6602pC c6602pC, T71 t71, int i, int[] iArr, InterfaceC6237jR interfaceC6237jR, int i2, InterfaceC1586ZC interfaceC1586ZC, long j, int i3, boolean z, ArrayList arrayList, KB0 kb0, C22 c22) {
        InterfaceC1412WR c0665ky;
        String str;
        C6686qX c6686qX;
        C1588ZE[] c1588zeArr;
        AbstractC10649pR0 abstractC10649pR0;
        C4135gk c4135gk;
        this.f16881a = interfaceC10687pk0;
        this.f16892l = c6602pC;
        this.f16882b = t71;
        this.f16883c = iArr;
        this.f16891k = interfaceC6237jR;
        this.f16884d = i2;
        this.f16885e = interfaceC1586ZC;
        this.f16893m = i;
        this.f16886f = j;
        this.f16887g = i3;
        this.f16888h = kb0;
        this.f16889i = c22;
        long jM23642d = c6602pC.m23642d(i);
        ArrayList arrayListM10438i = m10438i();
        this.f16890j = new C1588ZE[interfaceC6237jR.length()];
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f16890j.length) {
            AbstractC10649pR0 abstractC10649pR02 = (AbstractC10649pR0) arrayListM10438i.get(interfaceC6237jR.mo2729j(i5));
            C0735Lg c0735LgM7567S = t71.m7567S(abstractC10649pR02.f40077b);
            C1588ZE[] c1588zeArr2 = this.f16890j;
            C0735Lg c0735Lg = c0735LgM7567S == null ? (C0735Lg) abstractC10649pR02.f40077b.get(i4) : c0735LgM7567S;
            C6686qX c6686qX2 = abstractC10649pR02.f40076a;
            c0142cf.getClass();
            String str2 = c6686qX2.f40973l;
            if (!AbstractC8544Xr0.m9169l(str2)) {
                if (str2 != null && (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm") || str2.startsWith("video/x-matroska") || str2.startsWith("audio/x-matroska") || str2.startsWith("application/x-matroska"))) {
                    str = str2;
                    c6686qX = c6686qX2;
                    c1588zeArr = c1588zeArr2;
                    abstractC10649pR0 = abstractC10649pR02;
                    c0665ky = new C11335uo0(c0142cf.f1266b, c0142cf.f1267c ? 1 : 3);
                } else if (Objects.equals(str2, ClipboardModule.MIMETYPE_JPEG)) {
                    c0665ky = new C6352lG(1);
                } else if (Objects.equals(str2, ClipboardModule.MIMETYPE_PNG)) {
                    c0665ky = new C0360Fi(1);
                } else {
                    int i6 = z ? 4 : 0;
                    str = str2;
                    c6686qX = c6686qX2;
                    c1588zeArr = c1588zeArr2;
                    abstractC10649pR0 = abstractC10649pR02;
                    c0665ky = new C0665KY(c0142cf.f1266b, c0142cf.f1267c ? i6 : i6 | 32, null, null, arrayList, kb0);
                }
                if (c0142cf.f1267c && !AbstractC8544Xr0.m9169l(str) && !(c0665ky.mo737b() instanceof C0665KY) && !(c0665ky.mo737b() instanceof C11335uo0)) {
                    c0665ky = new C9456g61(c0665ky, c0142cf.f1266b);
                }
                c4135gk = new C4135gk(c0665ky, i2, c6686qX);
                int i7 = i5;
                c1588zeArr[i7] = new C1588ZE(jM23642d, abstractC10649pR0, c0735Lg, c4135gk, 0L, abstractC10649pR0.mo23139c());
                i5 = i7 + 1;
                i4 = 0;
            } else if (c0142cf.f1267c) {
                c0665ky = new Z51(c0142cf.f1266b.mo916f(c6686qX2), c6686qX2);
            } else {
                c4135gk = null;
                c1588zeArr = c1588zeArr2;
                abstractC10649pR0 = abstractC10649pR02;
                int i72 = i5;
                c1588zeArr[i72] = new C1588ZE(jM23642d, abstractC10649pR0, c0735Lg, c4135gk, 0L, abstractC10649pR0.mo23139c());
                i5 = i72 + 1;
                i4 = 0;
            }
            str = str2;
            c6686qX = c6686qX2;
            c1588zeArr = c1588zeArr2;
            abstractC10649pR0 = abstractC10649pR02;
            if (c0142cf.f1267c) {
                c0665ky = new C9456g61(c0665ky, c0142cf.f1266b);
            }
            c4135gk = new C4135gk(c0665ky, i2, c6686qX);
            int i722 = i5;
            c1588zeArr[i722] = new C1588ZE(jM23642d, abstractC10649pR0, c0735Lg, c4135gk, 0L, abstractC10649pR0.mo23139c());
            i5 = i722 + 1;
            i4 = 0;
        }
    }

    /* renamed from: h */
    public static Pair m10437h(long j, C9481gJ0 c9481gJ0, C1588ZE c1588ze) {
        long j2 = j + 1;
        if (j2 >= c1588ze.m9512d()) {
            return null;
        }
        InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) c1588ze.f14810g;
        YN1.m9283h(interfaceC7186yC);
        C9481gJ0 c9481gJ0Mo3623i = interfaceC7186yC.mo3623i(j2 - c1588ze.f14806c);
        C0735Lg c0735Lg = (C0735Lg) c1588ze.f14809f;
        String strM9655d = AbstractC8668a02.m9655d(AbstractC8668a02.m9660i(c0735Lg.f6792a, c9481gJ0.f27670c), AbstractC8668a02.m9660i(c0735Lg.f6792a, c9481gJ0Mo3623i.f27670c));
        StringBuilder sb = new StringBuilder();
        long j3 = c9481gJ0Mo3623i.f27668a;
        String strM5760i = AbstractC0852NX.m5760i(sb, j3, "-");
        long j4 = c9481gJ0Mo3623i.f27669b;
        if (j4 != -1) {
            StringBuilder sbM26238o = AbstractC7222ym.m26238o(strM5760i);
            sbM26238o.append(j3 + j4);
            strM5760i = sbM26238o.toString();
        }
        return new Pair(strM9655d, strM5760i);
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: a */
    public final void mo2563a() throws C1863ch {
        C1863ch c1863ch = this.f16894n;
        if (c1863ch != null) {
            throw c1863ch;
        }
        this.f16881a.mo858a();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    @Override // p000.InterfaceC1438Wr
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo2564b(long r19, p000.DX0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            ZE[] r0 = r7.f16890j
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L63
            r5 = r0[r4]
            java.lang.Object r6 = r5.f14810g
            yC r6 = (p000.InterfaceC7186yC) r6
            if (r6 == 0) goto L60
            long r8 = r5.m9512d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L60
        L1d:
            java.lang.Object r0 = r5.f14810g
            yC r0 = (p000.InterfaceC7186yC) r0
            p000.YN1.m9283h(r0)
            long r3 = r5.f14805b
            long r3 = r0.mo3612I(r1, r3)
            long r10 = r5.f14806c
            long r3 = r3 + r10
            long r12 = r5.m9514f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L55
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4e
            p000.YN1.m9283h(r0)
            long r16 = r0.mo3614R()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L55
        L4e:
            long r3 = r3 + r14
            long r3 = r5.m9514f(r3)
            r5 = r3
            goto L56
        L55:
            r5 = r12
        L56:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.m1724a(r1, r3, r5)
            return r0
        L60:
            int r4 = r4 + 1
            goto L8
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1773bF.mo2564b(long, DX0):long");
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: c */
    public final void mo2565c(C11455vk0 c11455vk0, long j, List list, C0926Oi c0926Oi) {
        long j2;
        C1588ZE[] c1588zeArr;
        InterfaceC7550Eo0[] interfaceC7550Eo0Arr;
        long jMax;
        C0874Nt c0874Nt;
        C0735Lg c0735Lg;
        long jM1826k;
        int i;
        Object c6713qy;
        C0926Oi c0926Oi2;
        C0735Lg c0735Lg2;
        int i2;
        C3976eD c3976eDM6179a;
        long jM1802Q;
        long j3;
        long jM1826k2;
        boolean z;
        if (this.f16894n != null) {
            return;
        }
        long j4 = c11455vk0.f44511a;
        long j5 = j - j4;
        long jM1802Q2 = AbstractC7485Dh1.m1802Q(this.f16892l.m23640b(this.f16893m).f7014b) + AbstractC7485Dh1.m1802Q(this.f16892l.f39897a) + j;
        KB0 kb0 = this.f16888h;
        if (kb0 != null) {
            LB0 lb0 = kb0.f5935e;
            C6602pC c6602pC = lb0.f6540f;
            if (!c6602pC.f39900d) {
                z = false;
                j2 = j5;
            } else if (lb0.f6542h) {
                j2 = j5;
                z = true;
            } else {
                j2 = j5;
                Map.Entry entryCeilingEntry = lb0.f6539e.ceilingEntry(Long.valueOf(c6602pC.f39904h));
                QQ0 qq0 = lb0.f6536b;
                if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jM1802Q2) {
                    z = false;
                } else {
                    long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                    C7123xC c7123xC = (C7123xC) qq0.f9619a;
                    long j6 = c7123xC.f45452O;
                    if (j6 == -9223372036854775807L || j6 < jLongValue) {
                        c7123xC.f45452O = jLongValue;
                    }
                    z = true;
                }
                if (z && lb0.f6541g) {
                    lb0.f6542h = true;
                    lb0.f6541g = false;
                    C7123xC c7123xC2 = (C7123xC) qq0.f9619a;
                    c7123xC2.f45442E.removeCallbacks(c7123xC2.f45471x);
                    c7123xC2.m25809A();
                }
            }
            if (z) {
                return;
            }
        } else {
            j2 = j5;
        }
        long jM1802Q3 = AbstractC7485Dh1.m1802Q(AbstractC7485Dh1.m1841z(this.f16886f));
        C6602pC c6602pC2 = this.f16892l;
        long j7 = c6602pC2.f39897a;
        long jM1802Q4 = j7 == -9223372036854775807L ? -9223372036854775807L : jM1802Q3 - AbstractC7485Dh1.m1802Q(j7 + c6602pC2.m23640b(this.f16893m).f7014b);
        AbstractC7498Do0 abstractC7498Do0 = list.isEmpty() ? null : (AbstractC7498Do0) list.get(list.size() - 1);
        int length = this.f16891k.length();
        InterfaceC7550Eo0[] interfaceC7550Eo0Arr2 = new InterfaceC7550Eo0[length];
        int i3 = 0;
        while (true) {
            c1588zeArr = this.f16890j;
            if (i3 >= length) {
                break;
            }
            C1588ZE c1588ze = c1588zeArr[i3];
            int i4 = length;
            InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) c1588ze.f14810g;
            C9937jt0 c9937jt0 = InterfaceC7550Eo0.f2910M0;
            if (interfaceC7186yC == null) {
                interfaceC7550Eo0Arr2[i3] = c9937jt0;
                j3 = jM1802Q4;
            } else {
                long jM9510b = c1588ze.m9510b(jM1802Q3);
                long jM9511c = c1588ze.m9511c(jM1802Q3);
                if (abstractC7498Do0 != null) {
                    jM1826k2 = abstractC7498Do0.mo1898a();
                    j3 = jM1802Q4;
                } else {
                    InterfaceC7186yC interfaceC7186yC2 = (InterfaceC7186yC) c1588ze.f14810g;
                    YN1.m9283h(interfaceC7186yC2);
                    j3 = jM1802Q4;
                    jM1826k2 = AbstractC7485Dh1.m1826k(interfaceC7186yC2.mo3612I(j, c1588ze.f14805b) + c1588ze.f14806c, jM9510b, jM9511c);
                }
                if (jM1826k2 < jM9510b) {
                    interfaceC7550Eo0Arr2[i3] = c9937jt0;
                } else {
                    interfaceC7550Eo0Arr2[i3] = new C1652aF(m10439j(i3), jM1826k2, jM9511c);
                }
            }
            i3++;
            length = i4;
            jM1802Q4 = j3;
        }
        long j8 = jM1802Q4;
        long j9 = 0;
        if (!this.f16892l.f39900d || c1588zeArr[0].m9512d() == 0) {
            interfaceC7550Eo0Arr = interfaceC7550Eo0Arr2;
            jMax = -9223372036854775807L;
        } else {
            long jM9513e = c1588zeArr[0].m9513e(c1588zeArr[0].m9511c(jM1802Q3));
            C6602pC c6602pC3 = this.f16892l;
            long j10 = c6602pC3.f39897a;
            if (j10 == -9223372036854775807L) {
                interfaceC7550Eo0Arr = interfaceC7550Eo0Arr2;
                jM1802Q = -9223372036854775807L;
            } else {
                interfaceC7550Eo0Arr = interfaceC7550Eo0Arr2;
                jM1802Q = jM1802Q3 - AbstractC7485Dh1.m1802Q(j10 + c6602pC3.m23640b(this.f16893m).f7014b);
            }
            j9 = 0;
            jMax = Math.max(0L, Math.min(jM1802Q, jM9513e) - j4);
        }
        long j11 = j9;
        long j12 = j2;
        this.f16891k.mo6373c(j4, j2, jMax, list, interfaceC7550Eo0Arr);
        int iMo6374e = this.f16891k.mo6374e();
        C0874Nt c0874Nt2 = this.f16889i == null ? null : new C0874Nt(this.f16889i, this.f16891k, Math.max(j11, j12), c11455vk0.f44512b, UcumUtils.UCUM_DAYS, this.f16892l.f39900d, c11455vk0.m25482a(this.f16896p), list.isEmpty());
        this.f16896p = SystemClock.elapsedRealtime();
        C1588ZE c1588zeM10439j = m10439j(iMo6374e);
        InterfaceC7186yC interfaceC7186yC3 = (InterfaceC7186yC) c1588zeM10439j.f14810g;
        C0735Lg c0735Lg3 = (C0735Lg) c1588zeM10439j.f14809f;
        C4135gk c4135gk = (C4135gk) c1588zeM10439j.f14807d;
        AbstractC10649pR0 abstractC10649pR0 = (AbstractC10649pR0) c1588zeM10439j.f14808e;
        if (c4135gk != null) {
            C9481gJ0 c9481gJ0 = c4135gk.f27974i == null ? abstractC10649pR0.f40080e : null;
            C9481gJ0 c9481gJ0Mo23140d = interfaceC7186yC3 == null ? abstractC10649pR0.mo23140d() : null;
            if (c9481gJ0 != null || c9481gJ0Mo23140d != null) {
                C6686qX c6686qXMo2732m = this.f16891k.mo2732m();
                int iMo6375n = this.f16891k.mo6375n();
                Object objMo6376q = this.f16891k.mo6376q();
                if (c9481gJ0 != null) {
                    C9481gJ0 c9481gJ0M18425a = c9481gJ0.m18425a(c9481gJ0Mo23140d, c0735Lg3.f6792a);
                    if (c9481gJ0M18425a != null) {
                        c9481gJ0 = c9481gJ0M18425a;
                    }
                } else {
                    c9481gJ0Mo23140d.getClass();
                    c9481gJ0 = c9481gJ0Mo23140d;
                }
                C3976eD c3976eDM9308a = YY1.m9308a(abstractC10649pR0, c0735Lg3.f6792a, c9481gJ0, 0);
                if (c0874Nt2 != null) {
                    c0874Nt2.f8112j = "i";
                    c3976eDM9308a = c0874Nt2.m5896a().m6179a(c3976eDM9308a);
                }
                c0926Oi.f8576c = new C10611p80(this.f16885e, c3976eDM9308a, c6686qXMo2732m, iMo6375n, objMo6376q, (C4135gk) c1588zeM10439j.f14807d);
                return;
            }
        }
        C6602pC c6602pC4 = this.f16892l;
        boolean z2 = c6602pC4.f39900d && this.f16893m == c6602pC4.f39909m.size() - 1;
        long j13 = c1588zeM10439j.f14805b;
        boolean z3 = (z2 && j13 == -9223372036854775807L) ? false : true;
        if (c1588zeM10439j.m9512d() == j11) {
            c0926Oi.f8575b = z3;
            return;
        }
        long jM9510b2 = c1588zeM10439j.m9510b(jM1802Q3);
        long jM9511c2 = c1588zeM10439j.m9511c(jM1802Q3);
        if (z2) {
            long jM9513e2 = c1588zeM10439j.m9513e(jM9511c2);
            z3 &= (jM9513e2 - c1588zeM10439j.m9514f(jM9511c2)) + jM9513e2 >= j13;
        }
        long j14 = c1588zeM10439j.f14806c;
        if (abstractC7498Do0 != null) {
            c0735Lg = c0735Lg3;
            c0874Nt = c0874Nt2;
            jM1826k = abstractC7498Do0.mo1898a();
        } else {
            YN1.m9283h(interfaceC7186yC3);
            c0874Nt = c0874Nt2;
            c0735Lg = c0735Lg3;
            jM1826k = AbstractC7485Dh1.m1826k(interfaceC7186yC3.mo3612I(j, j13) + j14, jM9510b2, jM9511c2);
        }
        if (jM1826k < jM9510b2) {
            this.f16894n = new C1863ch();
            return;
        }
        if (jM1826k > jM9511c2 || (this.f16895o && jM1826k >= jM9511c2)) {
            c0926Oi.f8575b = z3;
            return;
        }
        if (z3 && c1588zeM10439j.m9514f(jM1826k) >= j13) {
            c0926Oi.f8575b = true;
            return;
        }
        int iMin = (int) Math.min(this.f16887g, (jM9511c2 - jM1826k) + 1);
        int i5 = (j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1));
        if (i5 != 0) {
            while (iMin > 1 && c1588zeM10439j.m9514f((iMin + jM1826k) - 1) >= j13) {
                iMin--;
            }
        }
        long j15 = list.isEmpty() ? j : -9223372036854775807L;
        C6686qX c6686qXMo2732m2 = this.f16891k.mo2732m();
        int iMo6375n2 = this.f16891k.mo6375n();
        Object objMo6376q2 = this.f16891k.mo6376q();
        long jM9514f = c1588zeM10439j.m9514f(jM1826k);
        YN1.m9283h(interfaceC7186yC3);
        C9481gJ0 c9481gJ0Mo3623i = interfaceC7186yC3.mo3623i(jM1826k - j14);
        InterfaceC1586ZC interfaceC1586ZC = this.f16885e;
        if (c4135gk == null) {
            long jM9513e3 = c1588zeM10439j.m9513e(jM1826k);
            if (c1588zeM10439j.m9515g(jM1826k, j8)) {
                c0735Lg2 = c0735Lg;
                i2 = 0;
            } else {
                c0735Lg2 = c0735Lg;
                i2 = 8;
            }
            C3976eD c3976eDM9308a2 = YY1.m9308a(abstractC10649pR0, c0735Lg2.f6792a, c9481gJ0Mo3623i, i2);
            if (c0874Nt != null) {
                C0874Nt c0874Nt3 = c0874Nt;
                c0874Nt3.m5897c(jM9513e3 - jM9514f);
                c0874Nt3.f8112j = C0874Nt.m5895b(this.f16891k);
                Pair pairM10437h = m10437h(jM1826k, c9481gJ0Mo3623i, c1588zeM10439j);
                if (pairM10437h != null) {
                    c0874Nt3.f8113k = (String) pairM10437h.first;
                    c0874Nt3.f8114l = (String) pairM10437h.second;
                }
                c3976eDM6179a = c0874Nt3.m5896a().m6179a(c3976eDM9308a2);
            } else {
                c3976eDM6179a = c3976eDM9308a2;
            }
            c6713qy = new L11(interfaceC1586ZC, c3976eDM6179a, c6686qXMo2732m2, iMo6375n2, objMo6376q2, jM9514f, jM9513e3, jM1826k, this.f16884d, c6686qXMo2732m2);
            c0926Oi2 = c0926Oi;
        } else {
            C0735Lg c0735Lg4 = c0735Lg;
            C0874Nt c0874Nt4 = c0874Nt;
            int i6 = 1;
            int i7 = 1;
            while (true) {
                if (i6 >= iMin) {
                    i = i5;
                    break;
                }
                int i8 = iMin;
                i = i5;
                YN1.m9283h(interfaceC7186yC3);
                C9481gJ0 c9481gJ0M18425a2 = c9481gJ0Mo3623i.m18425a(interfaceC7186yC3.mo3623i((i6 + jM1826k) - j14), c0735Lg4.f6792a);
                if (c9481gJ0M18425a2 == null) {
                    break;
                }
                i7++;
                i6++;
                c9481gJ0Mo3623i = c9481gJ0M18425a2;
                i5 = i;
                iMin = i8;
            }
            long j16 = (i7 + jM1826k) - 1;
            long jM9513e4 = c1588zeM10439j.m9513e(j16);
            long j17 = (i == 0 || j13 > jM9513e4) ? -9223372036854775807L : j13;
            C3976eD c3976eDM9308a3 = YY1.m9308a(abstractC10649pR0, c0735Lg4.f6792a, c9481gJ0Mo3623i, c1588zeM10439j.m9515g(j16, j8) ? 0 : 8);
            if (c0874Nt4 != null) {
                c0874Nt4.m5897c(jM9513e4 - jM9514f);
                c0874Nt4.f8112j = C0874Nt.m5895b(this.f16891k);
                Pair pairM10437h2 = m10437h(jM1826k, c9481gJ0Mo3623i, c1588zeM10439j);
                if (pairM10437h2 != null) {
                    c0874Nt4.f8113k = (String) pairM10437h2.first;
                    c0874Nt4.f8114l = (String) pairM10437h2.second;
                }
                c3976eDM9308a3 = c0874Nt4.m5896a().m6179a(c3976eDM9308a3);
            }
            C3976eD c3976eD = c3976eDM9308a3;
            long j18 = -abstractC10649pR0.f40078c;
            if (AbstractC8544Xr0.m9168k(c6686qXMo2732m2.f40974m)) {
                j18 += jM9514f;
            }
            c6713qy = new C6713qy(interfaceC1586ZC, c3976eD, c6686qXMo2732m2, iMo6375n2, objMo6376q2, jM9514f, jM9513e4, j15, j17, jM1826k, i7, j18, (C4135gk) c1588zeM10439j.f14807d);
            c0926Oi2 = c0926Oi;
        }
        c0926Oi2.f8576c = c6713qy;
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: d */
    public final void mo2566d(AbstractC1061Qr abstractC1061Qr) {
        if (abstractC1061Qr instanceof C10611p80) {
            int iMo2725f = this.f16891k.mo2725f(((C10611p80) abstractC1061Qr).f9814d);
            C1588ZE[] c1588zeArr = this.f16890j;
            C1588ZE c1588ze = c1588zeArr[iMo2725f];
            if (((InterfaceC7186yC) c1588ze.f14810g) == null) {
                C4135gk c4135gk = (C4135gk) c1588ze.f14807d;
                YN1.m9283h(c4135gk);
                CX0 cx0 = c4135gk.f27973h;
                C1186Sr c1186Sr = cx0 instanceof C1186Sr ? (C1186Sr) cx0 : null;
                if (c1186Sr != null) {
                    AbstractC10649pR0 abstractC10649pR0 = (AbstractC10649pR0) c1588ze.f14808e;
                    c1588zeArr[iMo2725f] = new C1588ZE(c1588ze.f14805b, abstractC10649pR0, (C0735Lg) c1588ze.f14809f, (C4135gk) c1588ze.f14807d, c1588ze.f14806c, new C0495Hr(c1186Sr, abstractC10649pR0.f40078c, 1));
                }
            }
        }
        KB0 kb0 = this.f16888h;
        if (kb0 != null) {
            long j = kb0.f5934d;
            if (j == -9223372036854775807L || abstractC1061Qr.f9818h > j) {
                kb0.f5934d = abstractC1061Qr.f9818h;
            }
            kb0.f5935e.f6541g = true;
        }
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: e */
    public final boolean mo2567e(long j, AbstractC1061Qr abstractC1061Qr, List list) {
        if (this.f16894n != null) {
            return false;
        }
        return this.f16891k.mo2726g(j, abstractC1061Qr, list);
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: f */
    public final boolean mo2568f(AbstractC1061Qr abstractC1061Qr, boolean z, C0986Pf c0986Pf, C3979eG c3979eG) {
        long jMax;
        if (!z) {
            return false;
        }
        KB0 kb0 = this.f16888h;
        if (kb0 != null) {
            long j = kb0.f5934d;
            boolean z2 = j != -9223372036854775807L && j < abstractC1061Qr.f9817g;
            LB0 lb0 = kb0.f5935e;
            if (lb0.f6540f.f39900d) {
                if (!lb0.f6542h) {
                    if (z2) {
                        if (lb0.f6541g) {
                            lb0.f6542h = true;
                            lb0.f6541g = false;
                            C7123xC c7123xC = (C7123xC) lb0.f6536b.f9619a;
                            c7123xC.f45442E.removeCallbacks(c7123xC.f45471x);
                            c7123xC.m25809A();
                        }
                    }
                }
                return true;
            }
        }
        boolean z3 = this.f16892l.f39900d;
        C1588ZE[] c1588zeArr = this.f16890j;
        if (!z3 && (abstractC1061Qr instanceof AbstractC7498Do0)) {
            IOException iOException = (IOException) c0986Pf.f9217c;
            if ((iOException instanceof C11243u40) && ((C11243u40) iOException).f43483d == 404) {
                C1588ZE c1588ze = c1588zeArr[this.f16891k.mo2725f(abstractC1061Qr.f9814d)];
                long jM9512d = c1588ze.m9512d();
                if (jM9512d != -1 && jM9512d != 0) {
                    InterfaceC7186yC interfaceC7186yC = (InterfaceC7186yC) c1588ze.f14810g;
                    YN1.m9283h(interfaceC7186yC);
                    if (((AbstractC7498Do0) abstractC1061Qr).mo1898a() > ((interfaceC7186yC.mo3614R() + c1588ze.f14806c) + jM9512d) - 1) {
                        this.f16895o = true;
                        return true;
                    }
                }
            }
        }
        C1588ZE c1588ze2 = c1588zeArr[this.f16891k.mo2725f(abstractC1061Qr.f9814d)];
        P70 p70 = ((AbstractC10649pR0) c1588ze2.f14808e).f40077b;
        T71 t71 = this.f16882b;
        C0735Lg c0735LgM7567S = t71.m7567S(p70);
        C0735Lg c0735Lg = (C0735Lg) c1588ze2.f14809f;
        if (c0735LgM7567S != null && !c0735Lg.equals(c0735LgM7567S)) {
            return true;
        }
        InterfaceC6237jR interfaceC6237jR = this.f16891k;
        P70 p702 = ((AbstractC10649pR0) c1588ze2.f14808e).f40077b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC6237jR.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC6237jR.mo2723b(i2, jElapsedRealtime)) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < p702.size(); i3++) {
            hashSet.add(Integer.valueOf(((C0735Lg) p702.get(i3)).f6794c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayListM7573x = t71.m7573x(p702);
        for (int i4 = 0; i4 < arrayListM7573x.size(); i4++) {
            hashSet2.add(Integer.valueOf(((C0735Lg) arrayListM7573x.get(i4)).f6794c));
        }
        C9279ek0 c9279ek0 = new C9279ek0(size, size - hashSet2.size(), length, i);
        if (!c9279ek0.m18026a(2) && !c9279ek0.m18026a(1)) {
            return false;
        }
        c3979eG.getClass();
        C9407fk0 c9407fk0M17890c = C3979eG.m17890c(c9279ek0, c0986Pf);
        if (c9407fk0M17890c != null) {
            int i5 = c9407fk0M17890c.f27363a;
            if (c9279ek0.m18026a(i5)) {
                long j2 = c9407fk0M17890c.f27364b;
                if (i5 == 2) {
                    InterfaceC6237jR interfaceC6237jR2 = this.f16891k;
                    return interfaceC6237jR2.mo2733o(interfaceC6237jR2.mo2725f(abstractC1061Qr.f9814d), j2);
                }
                if (i5 != 1) {
                    return false;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                String str = c0735Lg.f6793b;
                HashMap map = (HashMap) t71.f11173a;
                if (map.containsKey(str)) {
                    Long l = (Long) map.get(str);
                    int i6 = AbstractC7485Dh1.f2166a;
                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                } else {
                    jMax = jElapsedRealtime2;
                }
                map.put(str, Long.valueOf(jMax));
                int i7 = c0735Lg.f6794c;
                if (i7 == Integer.MIN_VALUE) {
                    return true;
                }
                Integer numValueOf = Integer.valueOf(i7);
                HashMap map2 = (HashMap) t71.f11174b;
                if (map2.containsKey(numValueOf)) {
                    Long l2 = (Long) map2.get(numValueOf);
                    int i8 = AbstractC7485Dh1.f2166a;
                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                }
                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1438Wr
    /* renamed from: g */
    public final int mo2569g(long j, List list) {
        return (this.f16894n != null || this.f16891k.length() < 2) ? list.size() : this.f16891k.mo2730k(j, list);
    }

    /* renamed from: i */
    public final ArrayList m10438i() {
        List list = this.f16892l.m23640b(this.f16893m).f7015c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f16883c) {
            arrayList.addAll(((C4092g3) list.get(i)).f27535c);
        }
        return arrayList;
    }

    /* renamed from: j */
    public final C1588ZE m10439j(int i) {
        C1588ZE[] c1588zeArr = this.f16890j;
        C1588ZE c1588ze = c1588zeArr[i];
        C0735Lg c0735LgM7567S = this.f16882b.m7567S(((AbstractC10649pR0) c1588ze.f14808e).f40077b);
        if (c0735LgM7567S == null || c0735LgM7567S.equals((C0735Lg) c1588ze.f14809f)) {
            return c1588ze;
        }
        C1588ZE c1588ze2 = new C1588ZE(c1588ze.f14805b, (AbstractC10649pR0) c1588ze.f14808e, c0735LgM7567S, (C4135gk) c1588ze.f14807d, c1588ze.f14806c, (InterfaceC7186yC) c1588ze.f14810g);
        c1588zeArr[i] = c1588ze2;
        return c1588ze2;
    }

    @Override // p000.InterfaceC1438Wr
    public final void release() {
        for (C1588ZE c1588ze : this.f16890j) {
            C4135gk c4135gk = (C4135gk) c1588ze.f14807d;
            if (c4135gk != null) {
                c4135gk.f27966a.release();
            }
        }
    }
}
