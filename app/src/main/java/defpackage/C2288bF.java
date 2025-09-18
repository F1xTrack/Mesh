package defpackage;

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
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: bF */
/* loaded from: classes.dex */
public final class C2288bF implements InterfaceC1786Wr {
    public final InterfaceC6515pk0 a;
    public final T71 b;
    public final int[] c;
    public final int d;
    public final ZC e;
    public final long f;
    public final int g;
    public final KB0 h;
    public final C22 i;
    public final ZE[] j;
    public InterfaceC5311jR k;
    public C6412pC l;
    public int m;
    public C2562ch n;
    public boolean o;
    public long p = -9223372036854775807L;

    public C2288bF(CF cf, InterfaceC6515pk0 interfaceC6515pk0, C6412pC c6412pC, T71 t71, int i, int[] iArr, InterfaceC5311jR interfaceC5311jR, int i2, ZC zc, long j, int i3, boolean z, ArrayList arrayList, KB0 kb0, C22 c22) {
        WR ky;
        String str;
        C6666qX c6666qX;
        ZE[] zeArr;
        AbstractC6458pR0 abstractC6458pR0;
        C4019gk c4019gk;
        this.a = interfaceC6515pk0;
        this.l = c6412pC;
        this.b = t71;
        this.c = iArr;
        this.k = interfaceC5311jR;
        this.d = i2;
        this.e = zc;
        this.m = i;
        this.f = j;
        this.g = i3;
        this.h = kb0;
        this.i = c22;
        long jD = c6412pC.d(i);
        ArrayList arrayListI = i();
        this.j = new ZE[interfaceC5311jR.length()];
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.j.length) {
            AbstractC6458pR0 abstractC6458pR02 = (AbstractC6458pR0) arrayListI.get(interfaceC5311jR.j(i5));
            C0896Lg c0896LgS = t71.S(abstractC6458pR02.b);
            ZE[] zeArr2 = this.j;
            C0896Lg c0896Lg = c0896LgS == null ? (C0896Lg) abstractC6458pR02.b.get(i4) : c0896LgS;
            C6666qX c6666qX2 = abstractC6458pR02.a;
            cf.getClass();
            String str2 = c6666qX2.l;
            if (!AbstractC1865Xr0.l(str2)) {
                if (str2 != null && (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm") || str2.startsWith("video/x-matroska") || str2.startsWith("audio/x-matroska") || str2.startsWith("application/x-matroska"))) {
                    str = str2;
                    c6666qX = c6666qX2;
                    zeArr = zeArr2;
                    abstractC6458pR0 = abstractC6458pR02;
                    ky = new C7481uo0(cf.b, cf.c ? 1 : 3);
                } else if (Objects.equals(str2, ClipboardModule.MIMETYPE_JPEG)) {
                    ky = new C5660lG(1);
                } else if (Objects.equals(str2, ClipboardModule.MIMETYPE_PNG)) {
                    ky = new C0434Fi(1);
                } else {
                    int i6 = z ? 4 : 0;
                    str = str2;
                    c6666qX = c6666qX2;
                    zeArr = zeArr2;
                    abstractC6458pR0 = abstractC6458pR02;
                    ky = new KY(cf.b, cf.c ? i6 : i6 | 32, null, null, arrayList, kb0);
                }
                if (cf.c && !AbstractC1865Xr0.l(str) && !(ky.b() instanceof KY) && !(ky.b() instanceof C7481uo0)) {
                    ky = new C3901g61(ky, cf.b);
                }
                c4019gk = new C4019gk(ky, i2, c6666qX);
                int i7 = i5;
                zeArr[i7] = new ZE(jD, abstractC6458pR0, c0896Lg, c4019gk, 0L, abstractC6458pR0.c());
                i5 = i7 + 1;
                i4 = 0;
            } else if (cf.c) {
                ky = new Z51(cf.b.f(c6666qX2), c6666qX2);
            } else {
                c4019gk = null;
                zeArr = zeArr2;
                abstractC6458pR0 = abstractC6458pR02;
                int i72 = i5;
                zeArr[i72] = new ZE(jD, abstractC6458pR0, c0896Lg, c4019gk, 0L, abstractC6458pR0.c());
                i5 = i72 + 1;
                i4 = 0;
            }
            str = str2;
            c6666qX = c6666qX2;
            zeArr = zeArr2;
            abstractC6458pR0 = abstractC6458pR02;
            if (cf.c) {
                ky = new C3901g61(ky, cf.b);
            }
            c4019gk = new C4019gk(ky, i2, c6666qX);
            int i722 = i5;
            zeArr[i722] = new ZE(jD, abstractC6458pR0, c0896Lg, c4019gk, 0L, abstractC6458pR0.c());
            i5 = i722 + 1;
            i4 = 0;
        }
    }

    public static Pair h(long j, C3939gJ0 c3939gJ0, ZE ze) {
        long j2 = j + 1;
        if (j2 >= ze.d()) {
            return null;
        }
        InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) ze.g;
        YN1.h(interfaceC8127yC);
        C3939gJ0 c3939gJ0I = interfaceC8127yC.i(j2 - ze.c);
        C0896Lg c0896Lg = (C0896Lg) ze.f;
        String strD = AbstractC2051a02.d(AbstractC2051a02.i(c0896Lg.a, c3939gJ0.c), AbstractC2051a02.i(c0896Lg.a, c3939gJ0I.c));
        StringBuilder sb = new StringBuilder();
        long j3 = c3939gJ0I.a;
        String strI = NX.i(sb, j3, "-");
        long j4 = c3939gJ0I.b;
        if (j4 != -1) {
            StringBuilder sbO = AbstractC8235ym.o(strI);
            sbO.append(j3 + j4);
            strI = sbO.toString();
        }
        return new Pair(strD, strI);
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void a() throws C2562ch {
        C2562ch c2562ch = this.n;
        if (c2562ch != null) {
            throw c2562ch;
        }
        this.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    @Override // defpackage.InterfaceC1786Wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r19, defpackage.DX0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            ZE[] r0 = r7.j
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L63
            r5 = r0[r4]
            java.lang.Object r6 = r5.g
            yC r6 = (defpackage.InterfaceC8127yC) r6
            if (r6 == 0) goto L60
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L60
        L1d:
            java.lang.Object r0 = r5.g
            yC r0 = (defpackage.InterfaceC8127yC) r0
            defpackage.YN1.h(r0)
            long r3 = r5.b
            long r3 = r0.I(r1, r3)
            long r10 = r5.c
            long r3 = r3 + r10
            long r12 = r5.f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L55
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4e
            defpackage.YN1.h(r0)
            long r16 = r0.R()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L55
        L4e:
            long r3 = r3 + r14
            long r3 = r5.f(r3)
            r5 = r3
            goto L56
        L55:
            r5 = r12
        L56:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            return r0
        L60:
            int r4 = r4 + 1
            goto L8
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2288bF.b(long, DX0):long");
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void c(C7660vk0 c7660vk0, long j, List list, C1135Oi c1135Oi) {
        long j2;
        ZE[] zeArr;
        InterfaceC0375Eo0[] interfaceC0375Eo0Arr;
        long jMax;
        C1090Nt c1090Nt;
        C0896Lg c0896Lg;
        long jK;
        int i;
        Object c6747qy;
        C1135Oi c1135Oi2;
        C0896Lg c0896Lg2;
        int i2;
        C3538eD c3538eDA;
        long jQ;
        long j3;
        long jK2;
        boolean z;
        if (this.n != null) {
            return;
        }
        long j4 = c7660vk0.a;
        long j5 = j - j4;
        long jQ2 = AbstractC0277Dh1.Q(this.l.b(this.m).b) + AbstractC0277Dh1.Q(this.l.a) + j;
        KB0 kb0 = this.h;
        if (kb0 != null) {
            LB0 lb0 = kb0.e;
            C6412pC c6412pC = lb0.f;
            if (!c6412pC.d) {
                z = false;
                j2 = j5;
            } else if (lb0.h) {
                j2 = j5;
                z = true;
            } else {
                j2 = j5;
                Map.Entry entryCeilingEntry = lb0.e.ceilingEntry(Long.valueOf(c6412pC.h));
                QQ0 qq0 = lb0.b;
                if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jQ2) {
                    z = false;
                } else {
                    long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                    C7937xC c7937xC = (C7937xC) qq0.a;
                    long j6 = c7937xC.O;
                    if (j6 == -9223372036854775807L || j6 < jLongValue) {
                        c7937xC.O = jLongValue;
                    }
                    z = true;
                }
                if (z && lb0.g) {
                    lb0.h = true;
                    lb0.g = false;
                    C7937xC c7937xC2 = (C7937xC) qq0.a;
                    c7937xC2.E.removeCallbacks(c7937xC2.x);
                    c7937xC2.A();
                }
            }
            if (z) {
                return;
            }
        } else {
            j2 = j5;
        }
        long jQ3 = AbstractC0277Dh1.Q(AbstractC0277Dh1.z(this.f));
        C6412pC c6412pC2 = this.l;
        long j7 = c6412pC2.a;
        long jQ4 = j7 == -9223372036854775807L ? -9223372036854775807L : jQ3 - AbstractC0277Dh1.Q(j7 + c6412pC2.b(this.m).b);
        AbstractC0297Do0 abstractC0297Do0 = list.isEmpty() ? null : (AbstractC0297Do0) list.get(list.size() - 1);
        int length = this.k.length();
        InterfaceC0375Eo0[] interfaceC0375Eo0Arr2 = new InterfaceC0375Eo0[length];
        int i3 = 0;
        while (true) {
            zeArr = this.j;
            if (i3 >= length) {
                break;
            }
            ZE ze = zeArr[i3];
            int i4 = length;
            InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) ze.g;
            C5396jt0 c5396jt0 = InterfaceC0375Eo0.M0;
            if (interfaceC8127yC == null) {
                interfaceC0375Eo0Arr2[i3] = c5396jt0;
                j3 = jQ4;
            } else {
                long jB = ze.b(jQ3);
                long jC = ze.c(jQ3);
                if (abstractC0297Do0 != null) {
                    jK2 = abstractC0297Do0.a();
                    j3 = jQ4;
                } else {
                    InterfaceC8127yC interfaceC8127yC2 = (InterfaceC8127yC) ze.g;
                    YN1.h(interfaceC8127yC2);
                    j3 = jQ4;
                    jK2 = AbstractC0277Dh1.k(interfaceC8127yC2.I(j, ze.b) + ze.c, jB, jC);
                }
                if (jK2 < jB) {
                    interfaceC0375Eo0Arr2[i3] = c5396jt0;
                } else {
                    interfaceC0375Eo0Arr2[i3] = new C2097aF(j(i3), jK2, jC);
                }
            }
            i3++;
            length = i4;
            jQ4 = j3;
        }
        long j8 = jQ4;
        long j9 = 0;
        if (!this.l.d || zeArr[0].d() == 0) {
            interfaceC0375Eo0Arr = interfaceC0375Eo0Arr2;
            jMax = -9223372036854775807L;
        } else {
            long jE = zeArr[0].e(zeArr[0].c(jQ3));
            C6412pC c6412pC3 = this.l;
            long j10 = c6412pC3.a;
            if (j10 == -9223372036854775807L) {
                interfaceC0375Eo0Arr = interfaceC0375Eo0Arr2;
                jQ = -9223372036854775807L;
            } else {
                interfaceC0375Eo0Arr = interfaceC0375Eo0Arr2;
                jQ = jQ3 - AbstractC0277Dh1.Q(j10 + c6412pC3.b(this.m).b);
            }
            j9 = 0;
            jMax = Math.max(0L, Math.min(jQ, jE) - j4);
        }
        long j11 = j9;
        long j12 = j2;
        this.k.c(j4, j2, jMax, list, interfaceC0375Eo0Arr);
        int iE = this.k.e();
        C1090Nt c1090Nt2 = this.i == null ? null : new C1090Nt(this.i, this.k, Math.max(j11, j12), c7660vk0.b, UcumUtils.UCUM_DAYS, this.l.d, c7660vk0.a(this.p), list.isEmpty());
        this.p = SystemClock.elapsedRealtime();
        ZE zeJ = j(iE);
        InterfaceC8127yC interfaceC8127yC3 = (InterfaceC8127yC) zeJ.g;
        C0896Lg c0896Lg3 = (C0896Lg) zeJ.f;
        C4019gk c4019gk = (C4019gk) zeJ.d;
        AbstractC6458pR0 abstractC6458pR0 = (AbstractC6458pR0) zeJ.e;
        if (c4019gk != null) {
            C3939gJ0 c3939gJ0 = c4019gk.i == null ? abstractC6458pR0.e : null;
            C3939gJ0 c3939gJ0D = interfaceC8127yC3 == null ? abstractC6458pR0.d() : null;
            if (c3939gJ0 != null || c3939gJ0D != null) {
                C6666qX c6666qXM = this.k.m();
                int iN = this.k.n();
                Object objQ = this.k.q();
                if (c3939gJ0 != null) {
                    C3939gJ0 c3939gJ0A = c3939gJ0.a(c3939gJ0D, c0896Lg3.a);
                    if (c3939gJ0A != null) {
                        c3939gJ0 = c3939gJ0A;
                    }
                } else {
                    c3939gJ0D.getClass();
                    c3939gJ0 = c3939gJ0D;
                }
                C3538eD c3538eDA2 = YY1.a(abstractC6458pR0, c0896Lg3.a, c3939gJ0, 0);
                if (c1090Nt2 != null) {
                    c1090Nt2.j = "i";
                    c3538eDA2 = c1090Nt2.a().a(c3538eDA2);
                }
                c1135Oi.c = new C6401p80(this.e, c3538eDA2, c6666qXM, iN, objQ, (C4019gk) zeJ.d);
                return;
            }
        }
        C6412pC c6412pC4 = this.l;
        boolean z2 = c6412pC4.d && this.m == c6412pC4.m.size() - 1;
        long j13 = zeJ.b;
        boolean z3 = (z2 && j13 == -9223372036854775807L) ? false : true;
        if (zeJ.d() == j11) {
            c1135Oi.b = z3;
            return;
        }
        long jB2 = zeJ.b(jQ3);
        long jC2 = zeJ.c(jQ3);
        if (z2) {
            long jE2 = zeJ.e(jC2);
            z3 &= (jE2 - zeJ.f(jC2)) + jE2 >= j13;
        }
        long j14 = zeJ.c;
        if (abstractC0297Do0 != null) {
            c0896Lg = c0896Lg3;
            c1090Nt = c1090Nt2;
            jK = abstractC0297Do0.a();
        } else {
            YN1.h(interfaceC8127yC3);
            c1090Nt = c1090Nt2;
            c0896Lg = c0896Lg3;
            jK = AbstractC0277Dh1.k(interfaceC8127yC3.I(j, j13) + j14, jB2, jC2);
        }
        if (jK < jB2) {
            this.n = new C2562ch();
            return;
        }
        if (jK > jC2 || (this.o && jK >= jC2)) {
            c1135Oi.b = z3;
            return;
        }
        if (z3 && zeJ.f(jK) >= j13) {
            c1135Oi.b = true;
            return;
        }
        int iMin = (int) Math.min(this.g, (jC2 - jK) + 1);
        int i5 = (j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1));
        if (i5 != 0) {
            while (iMin > 1 && zeJ.f((iMin + jK) - 1) >= j13) {
                iMin--;
            }
        }
        long j15 = list.isEmpty() ? j : -9223372036854775807L;
        C6666qX c6666qXM2 = this.k.m();
        int iN2 = this.k.n();
        Object objQ2 = this.k.q();
        long jF = zeJ.f(jK);
        YN1.h(interfaceC8127yC3);
        C3939gJ0 c3939gJ0I = interfaceC8127yC3.i(jK - j14);
        ZC zc = this.e;
        if (c4019gk == null) {
            long jE3 = zeJ.e(jK);
            if (zeJ.g(jK, j8)) {
                c0896Lg2 = c0896Lg;
                i2 = 0;
            } else {
                c0896Lg2 = c0896Lg;
                i2 = 8;
            }
            C3538eD c3538eDA3 = YY1.a(abstractC6458pR0, c0896Lg2.a, c3939gJ0I, i2);
            if (c1090Nt != null) {
                C1090Nt c1090Nt3 = c1090Nt;
                c1090Nt3.c(jE3 - jF);
                c1090Nt3.j = C1090Nt.b(this.k);
                Pair pairH = h(jK, c3939gJ0I, zeJ);
                if (pairH != null) {
                    c1090Nt3.k = (String) pairH.first;
                    c1090Nt3.l = (String) pairH.second;
                }
                c3538eDA = c1090Nt3.a().a(c3538eDA3);
            } else {
                c3538eDA = c3538eDA3;
            }
            c6747qy = new L11(zc, c3538eDA, c6666qXM2, iN2, objQ2, jF, jE3, jK, this.d, c6666qXM2);
            c1135Oi2 = c1135Oi;
        } else {
            C0896Lg c0896Lg4 = c0896Lg;
            C1090Nt c1090Nt4 = c1090Nt;
            int i6 = 1;
            int i7 = 1;
            while (true) {
                if (i6 >= iMin) {
                    i = i5;
                    break;
                }
                int i8 = iMin;
                i = i5;
                YN1.h(interfaceC8127yC3);
                C3939gJ0 c3939gJ0A2 = c3939gJ0I.a(interfaceC8127yC3.i((i6 + jK) - j14), c0896Lg4.a);
                if (c3939gJ0A2 == null) {
                    break;
                }
                i7++;
                i6++;
                c3939gJ0I = c3939gJ0A2;
                i5 = i;
                iMin = i8;
            }
            long j16 = (i7 + jK) - 1;
            long jE4 = zeJ.e(j16);
            long j17 = (i == 0 || j13 > jE4) ? -9223372036854775807L : j13;
            C3538eD c3538eDA4 = YY1.a(abstractC6458pR0, c0896Lg4.a, c3939gJ0I, zeJ.g(j16, j8) ? 0 : 8);
            if (c1090Nt4 != null) {
                c1090Nt4.c(jE4 - jF);
                c1090Nt4.j = C1090Nt.b(this.k);
                Pair pairH2 = h(jK, c3939gJ0I, zeJ);
                if (pairH2 != null) {
                    c1090Nt4.k = (String) pairH2.first;
                    c1090Nt4.l = (String) pairH2.second;
                }
                c3538eDA4 = c1090Nt4.a().a(c3538eDA4);
            }
            C3538eD c3538eD = c3538eDA4;
            long j18 = -abstractC6458pR0.c;
            if (AbstractC1865Xr0.k(c6666qXM2.m)) {
                j18 += jF;
            }
            c6747qy = new C6747qy(zc, c3538eD, c6666qXM2, iN2, objQ2, jF, jE4, j15, j17, jK, i7, j18, (C4019gk) zeJ.d);
            c1135Oi2 = c1135Oi;
        }
        c1135Oi2.c = c6747qy;
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void d(AbstractC1318Qr abstractC1318Qr) {
        if (abstractC1318Qr instanceof C6401p80) {
            int iF = this.k.f(((C6401p80) abstractC1318Qr).d);
            ZE[] zeArr = this.j;
            ZE ze = zeArr[iF];
            if (((InterfaceC8127yC) ze.g) == null) {
                C4019gk c4019gk = (C4019gk) ze.d;
                YN1.h(c4019gk);
                CX0 cx0 = c4019gk.h;
                C1474Sr c1474Sr = cx0 instanceof C1474Sr ? (C1474Sr) cx0 : null;
                if (c1474Sr != null) {
                    AbstractC6458pR0 abstractC6458pR0 = (AbstractC6458pR0) ze.e;
                    zeArr[iF] = new ZE(ze.b, abstractC6458pR0, (C0896Lg) ze.f, (C4019gk) ze.d, ze.c, new C0617Hr(c1474Sr, abstractC6458pR0.c, 1));
                }
            }
        }
        KB0 kb0 = this.h;
        if (kb0 != null) {
            long j = kb0.d;
            if (j == -9223372036854775807L || abstractC1318Qr.h > j) {
                kb0.d = abstractC1318Qr.h;
            }
            kb0.e.g = true;
        }
    }

    @Override // defpackage.InterfaceC1786Wr
    public final boolean e(long j, AbstractC1318Qr abstractC1318Qr, List list) {
        if (this.n != null) {
            return false;
        }
        return this.k.g(j, abstractC1318Qr, list);
    }

    @Override // defpackage.InterfaceC1786Wr
    public final boolean f(AbstractC1318Qr abstractC1318Qr, boolean z, C1204Pf c1204Pf, C3547eG c3547eG) {
        long jMax;
        if (!z) {
            return false;
        }
        KB0 kb0 = this.h;
        if (kb0 != null) {
            long j = kb0.d;
            boolean z2 = j != -9223372036854775807L && j < abstractC1318Qr.g;
            LB0 lb0 = kb0.e;
            if (lb0.f.d) {
                if (!lb0.h) {
                    if (z2) {
                        if (lb0.g) {
                            lb0.h = true;
                            lb0.g = false;
                            C7937xC c7937xC = (C7937xC) lb0.b.a;
                            c7937xC.E.removeCallbacks(c7937xC.x);
                            c7937xC.A();
                        }
                    }
                }
                return true;
            }
        }
        boolean z3 = this.l.d;
        ZE[] zeArr = this.j;
        if (!z3 && (abstractC1318Qr instanceof AbstractC0297Do0)) {
            IOException iOException = (IOException) c1204Pf.c;
            if ((iOException instanceof C7343u40) && ((C7343u40) iOException).d == 404) {
                ZE ze = zeArr[this.k.f(abstractC1318Qr.d)];
                long jD = ze.d();
                if (jD != -1 && jD != 0) {
                    InterfaceC8127yC interfaceC8127yC = (InterfaceC8127yC) ze.g;
                    YN1.h(interfaceC8127yC);
                    if (((AbstractC0297Do0) abstractC1318Qr).a() > ((interfaceC8127yC.R() + ze.c) + jD) - 1) {
                        this.o = true;
                        return true;
                    }
                }
            }
        }
        ZE ze2 = zeArr[this.k.f(abstractC1318Qr.d)];
        P70 p70 = ((AbstractC6458pR0) ze2.e).b;
        T71 t71 = this.b;
        C0896Lg c0896LgS = t71.S(p70);
        C0896Lg c0896Lg = (C0896Lg) ze2.f;
        if (c0896LgS != null && !c0896Lg.equals(c0896LgS)) {
            return true;
        }
        InterfaceC5311jR interfaceC5311jR = this.k;
        P70 p702 = ((AbstractC6458pR0) ze2.e).b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC5311jR.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC5311jR.b(i2, jElapsedRealtime)) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < p702.size(); i3++) {
            hashSet.add(Integer.valueOf(((C0896Lg) p702.get(i3)).c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayListX = t71.x(p702);
        for (int i4 = 0; i4 < arrayListX.size(); i4++) {
            hashSet2.add(Integer.valueOf(((C0896Lg) arrayListX.get(i4)).c));
        }
        C3638ek0 c3638ek0 = new C3638ek0(size, size - hashSet2.size(), length, i);
        if (!c3638ek0.a(2) && !c3638ek0.a(1)) {
            return false;
        }
        c3547eG.getClass();
        C3829fk0 c3829fk0C = C3547eG.c(c3638ek0, c1204Pf);
        if (c3829fk0C != null) {
            int i5 = c3829fk0C.a;
            if (c3638ek0.a(i5)) {
                long j2 = c3829fk0C.b;
                if (i5 == 2) {
                    InterfaceC5311jR interfaceC5311jR2 = this.k;
                    return interfaceC5311jR2.o(interfaceC5311jR2.f(abstractC1318Qr.d), j2);
                }
                if (i5 != 1) {
                    return false;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                String str = c0896Lg.b;
                HashMap map = (HashMap) t71.a;
                if (map.containsKey(str)) {
                    Long l = (Long) map.get(str);
                    int i6 = AbstractC0277Dh1.a;
                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                } else {
                    jMax = jElapsedRealtime2;
                }
                map.put(str, Long.valueOf(jMax));
                int i7 = c0896Lg.c;
                if (i7 == Integer.MIN_VALUE) {
                    return true;
                }
                Integer numValueOf = Integer.valueOf(i7);
                HashMap map2 = (HashMap) t71.b;
                if (map2.containsKey(numValueOf)) {
                    Long l2 = (Long) map2.get(numValueOf);
                    int i8 = AbstractC0277Dh1.a;
                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                }
                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC1786Wr
    public final int g(long j, List list) {
        return (this.n != null || this.k.length() < 2) ? list.size() : this.k.k(j, list);
    }

    public final ArrayList i() {
        List list = this.l.b(this.m).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((C3889g3) list.get(i)).c);
        }
        return arrayList;
    }

    public final ZE j(int i) {
        ZE[] zeArr = this.j;
        ZE ze = zeArr[i];
        C0896Lg c0896LgS = this.b.S(((AbstractC6458pR0) ze.e).b);
        if (c0896LgS == null || c0896LgS.equals((C0896Lg) ze.f)) {
            return ze;
        }
        ZE ze2 = new ZE(ze.b, (AbstractC6458pR0) ze.e, c0896LgS, (C4019gk) ze.d, ze.c, (InterfaceC8127yC) ze.g);
        zeArr[i] = ze2;
        return ze2;
    }

    @Override // defpackage.InterfaceC1786Wr
    public final void release() {
        for (ZE ze : this.j) {
            C4019gk c4019gk = (C4019gk) ze.d;
            if (c4019gk != null) {
                c4019gk.a.release();
            }
        }
    }
}
