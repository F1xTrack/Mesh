package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Zs0 */
/* loaded from: classes.dex */
public final class C2024Zs0 implements WR, CX0 {
    public C1634Us0 A;
    public final InterfaceC2453c61 a;
    public final int b;
    public final C4103hA0 c;
    public final C4103hA0 d;
    public final C4103hA0 e;
    public final C4103hA0 f;
    public final ArrayDeque g;
    public final IX0 h;
    public final ArrayList i;
    public C3769fQ0 j;
    public int k;
    public int l;
    public long m;
    public int n;
    public C4103hA0 o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public YR u;
    public C1946Ys0[] v;
    public long[][] w;
    public int x;
    public long y;
    public int z;

    public C2024Zs0(InterfaceC2453c61 interfaceC2453c61, int i) {
        this.a = interfaceC2453c61;
        this.b = i;
        N70 n70 = P70.b;
        this.j = C3769fQ0.e;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new IX0();
        this.i = new ArrayList();
        this.f = new C4103hA0(16);
        this.g = new ArrayDeque();
        this.c = new C4103hA0(TA1.a);
        this.d = new C4103hA0(4);
        this.e = new C4103hA0();
        this.p = -1;
        this.u = YR.u0;
        this.v = new C1946Ys0[0];
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x047f, code lost:
    
        r3 = r10;
        r5 = r38.n;
        r6 = r38.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0487, code lost:
    
        if (r5 != 0) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0492, code lost:
    
        if (r39.b(r6.a, 0, 8, r3) != false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0497, code lost:
    
        if (r38.z != 2) goto L778;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x049c, code lost:
    
        if ((r38.b & 2) == 0) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x049e, code lost:
    
        r0 = r38.u.w(0, 4);
        r2 = r38.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x04a7, code lost:
    
        if (r2 != null) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x04a9, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x04ab, code lost:
    
        r13 = new defpackage.C0540Gr0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x04b5, code lost:
    
        r2 = new defpackage.C6475pX();
        r2.j = r13;
        defpackage.F91.B(r2, r0);
        r38.u.p();
        r38.u.x(new defpackage.C4004gf(-9223372036854775807L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x04d3, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x04d5, code lost:
    
        r38.n = 8;
        r6.G(0);
        r38.m = r6.w();
        r38.l = r6.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x04ee, code lost:
    
        r9 = r38.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x04f4, code lost:
    
        if (r9 != 1) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x04f6, code lost:
    
        r39.readFully(r6.a, 8, 8);
        r38.n += 8;
        r38.m = r6.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x050d, code lost:
    
        if (r9 != 0) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x050f, code lost:
    
        r9 = r39.getLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0515, code lost:
    
        if (r9 != (-1)) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0517, code lost:
    
        r11 = (defpackage.D9) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x051d, code lost:
    
        if (r11 == null) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x051f, code lost:
    
        r9 = r11.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0523, code lost:
    
        if (r9 == (-1)) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0525, code lost:
    
        r38.m = (r9 - r39.getPosition()) + r38.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0530, code lost:
    
        r9 = r38.m;
        r11 = r38.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0537, code lost:
    
        if (r9 < r11) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0539, code lost:
    
        r9 = r38.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0544, code lost:
    
        if (r9 == 1836019574) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0549, code lost:
    
        if (r9 == 1953653099) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x054e, code lost:
    
        if (r9 == 1835297121) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0553, code lost:
    
        if (r9 == 1835626086) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0558, code lost:
    
        if (r9 == 1937007212) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x055d, code lost:
    
        if (r9 == 1701082227) goto L676;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x055f, code lost:
    
        if (r9 != 1835365473) goto L677;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0567, code lost:
    
        if (r9 == 1835296868) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x056c, code lost:
    
        if (r9 == 1836476516) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x056e, code lost:
    
        if (r9 == 1751411826) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0573, code lost:
    
        if (r9 == 1937011556) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0578, code lost:
    
        if (r9 == 1937011827) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x057d, code lost:
    
        if (r9 == 1937011571) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0582, code lost:
    
        if (r9 == 1668576371) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0587, code lost:
    
        if (r9 == 1701606260) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x058c, code lost:
    
        if (r9 == 1937011555) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0591, code lost:
    
        if (r9 == 1937011578) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x0596, code lost:
    
        if (r9 == 1937013298) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x059b, code lost:
    
        if (r9 == 1937007471) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x05a0, code lost:
    
        if (r9 == 1668232756) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x05a5, code lost:
    
        if (r9 == 1953196132) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x05aa, code lost:
    
        if (r9 == 1718909296) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x05af, code lost:
    
        if (r9 == 1969517665) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x05b4, code lost:
    
        if (r9 == 1801812339) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x05b9, code lost:
    
        if (r9 != 1768715124) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x05be, code lost:
    
        r6 = r39.getPosition();
        r9 = r38.n;
        r30 = r6 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x05cc, code lost:
    
        if (r38.l != 1836086884) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x05ce, code lost:
    
        r38.A = new defpackage.C1634Us0(0, r30, -9223372036854775807L, r30 + r9, r38.m - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x05e4, code lost:
    
        r38.o = null;
        r38.k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x05ea, code lost:
    
        r3 = 8;
        r4 = 0;
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x05f0, code lost:
    
        if (r11 != 8) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x05f2, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x05f4, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x05f5, code lost:
    
        defpackage.YN1.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x05ff, code lost:
    
        if (r38.m > 2147483647L) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0601, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0603, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0604, code lost:
    
        defpackage.YN1.f(r7);
        r7 = new defpackage.C4103hA0((int) r38.m);
        java.lang.System.arraycopy(r6.a, 0, r7.a, 0, 8);
        r38.o = r7;
        r38.k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x061f, code lost:
    
        r15 = r39.getPosition();
        r3 = r38.m;
        r5 = r38.n;
        r8 = (r15 + r3) - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x062d, code lost:
    
        if (r3 == r5) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0631, code lost:
    
        if (r38.l != 1835365473) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x0633, code lost:
    
        r3 = 8;
        r14.D(8);
        r39.q(r14.a, 0, 8);
        r4 = defpackage.L9.a;
        r4 = r14.b;
        r5 = 4;
        r14.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x064a, code lost:
    
        if (r14.g() == 1751411826) goto L733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x064c, code lost:
    
        r4 = r4 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x064d, code lost:
    
        r14.G(r4);
        r39.n(r14.b);
        r39.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x0659, code lost:
    
        r3 = 8;
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x065c, code lost:
    
        r12.push(new defpackage.D9(r38.l, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x066d, code lost:
    
        if (r38.m != r38.n) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x066f, code lost:
    
        m(r8);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x0674, code lost:
    
        r4 = 0;
        r38.k = 0;
        r38.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x0686, code lost:
    
        throw defpackage.C5643lA0.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0081  */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r39, defpackage.SV r40) throws defpackage.C5643lA0 {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2024Zs0.d(XR, SV):int");
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        C3769fQ0 c3769fQ0B;
        C21 c21C = EI1.c(xr, false, (this.b & 2) != 0);
        if (c21C != null) {
            c3769fQ0B = P70.B(c21C);
        } else {
            N70 n70 = P70.b;
            c3769fQ0B = C3769fQ0.e;
        }
        this.j = c3769fQ0B;
        return c21C == null;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        if (j == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.n = 0;
                return;
            } else {
                IX0 ix0 = this.h;
                ix0.a.clear();
                ix0.b = 0;
                this.i.clear();
                return;
            }
        }
        for (C1946Ys0 c1946Ys0 : this.v) {
            C1662Vb1 c1662Vb1 = c1946Ys0.b;
            int iF = AbstractC0277Dh1.f(c1662Vb1.f, j2, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                } else if ((c1662Vb1.g[iF] & 1) != 0) {
                    break;
                } else {
                    iF--;
                }
            }
            if (iF == -1) {
                iF = c1662Vb1.a(j2);
            }
            c1946Ys0.e = iF;
            C4000gd1 c4000gd1 = c1946Ys0.d;
            if (c4000gd1 != null) {
                c4000gd1.b = false;
                c4000gd1.c = 0;
            }
        }
    }

    @Override // defpackage.WR
    public final List h() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00df A[EDGE_INSN: B:155:0x00df->B:147:0x00df BREAK  A[LOOP:1: B:112:0x006c->B:146:0x00d7], SYNTHETIC] */
    @Override // defpackage.CX0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.BX0 i(long r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2024Zs0.i(long):BX0");
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.y;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        if ((this.b & 16) == 0) {
            yr = new C5772lr0(yr, this.a);
        }
        this.u = yr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:473:0x0093, code lost:
    
        r10.G(r0);
        r0 = r0 + r5;
        r10.H(r3);
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x009f, code lost:
    
        r7 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x00a1, code lost:
    
        if (r7 >= r0) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x00a3, code lost:
    
        r7 = r10.g() + r7;
        r9 = r10.g();
        r3 = (r9 >> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x00b7, code lost:
    
        if (r3 == 169) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x00bb, code lost:
    
        if (r3 != 253) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x00bd, code lost:
    
        r22 = r0;
        r25 = r13;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x00ca, code lost:
    
        if (r9 != 1735291493) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x00cc, code lost:
    
        r3 = defpackage.W50.a(defpackage.XA1.b(r10) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x00d6, code lost:
    
        if (r3 == null) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x00d8, code lost:
    
        r8 = new defpackage.C6596q91("TCON", null, defpackage.P70.B(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x00e3, code lost:
    
        defpackage.AbstractC6789rA1.h("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x00e8, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x00e9, code lost:
    
        r10.G(r7);
        r22 = r0;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x00ef, code lost:
    
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x00fa, code lost:
    
        if (r9 != 1684632427) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x00fc, code lost:
    
        r9 = defpackage.XA1.a(r9, r10, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0102, code lost:
    
        r10.G(r7);
        r22 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x010e, code lost:
    
        if (r9 != 1953655662) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0110, code lost:
    
        r9 = defpackage.XA1.a(r9, r10, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x011a, code lost:
    
        if (r9 != 1953329263) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x011c, code lost:
    
        r9 = defpackage.XA1.c(r9, "TBPM", r10, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0128, code lost:
    
        if (r9 != 1668311404) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x012a, code lost:
    
        r9 = defpackage.XA1.c(r9, "TCMP", r10, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0135, code lost:
    
        if (r9 != 1668249202) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0137, code lost:
    
        r3 = r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0142, code lost:
    
        if (r10.g() != 1684108385) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0144, code lost:
    
        r8 = r10.g() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x014e, code lost:
    
        if (r8 != 13) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0150, code lost:
    
        r9 = com.reactnativecommunity.clipboard.ClipboardModule.MIMETYPE_JPEG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0155, code lost:
    
        if (r8 != 14) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0157, code lost:
    
        r9 = com.reactnativecommunity.clipboard.ClipboardModule.MIMETYPE_PNG;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x015a, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x015b, code lost:
    
        if (r9 != null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x015d, code lost:
    
        defpackage.NX.p("Unrecognized cover art flags: ", r8);
        r9 = null;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0165, code lost:
    
        r10.H(4);
        r3 = r3 - 16;
        r8 = new byte[r3];
        r10.e(r8, 0, r3);
        r12 = null;
        r9 = new defpackage.X5(r9, null, 3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x017b, code lost:
    
        r12 = null;
        defpackage.AbstractC6789rA1.h("Failed to parse cover art attribute");
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0181, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0182, code lost:
    
        r10.G(r7);
        r22 = r0;
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x018c, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0190, code lost:
    
        if (r9 != 1631670868) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0192, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x019c, code lost:
    
        if (r9 != 1936682605) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x019e, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x01a8, code lost:
    
        if (r9 != 1936679276) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x01aa, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x01b4, code lost:
    
        if (r9 != 1936679282) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x01b6, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x01c0, code lost:
    
        if (r9 != 1936679265) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x01c2, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x01cc, code lost:
    
        if (r9 != 1936679791) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x01ce, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x01d8, code lost:
    
        if (r9 != 1920233063) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x01da, code lost:
    
        r9 = defpackage.XA1.c(r9, "ITUNESADVISORY", r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x01e5, code lost:
    
        if (r9 != 1885823344) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x01e7, code lost:
    
        r9 = defpackage.XA1.c(r9, "ITUNESGAPLESS", r10, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x01f3, code lost:
    
        if (r9 != 1936683886) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x01f5, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x01ff, code lost:
    
        if (r9 != 1953919848) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0201, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x020c, code lost:
    
        if (r9 != 757935405) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x020e, code lost:
    
        r3 = null;
        r9 = null;
        r8 = -1;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0212, code lost:
    
        r12 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0214, code lost:
    
        if (r12 >= r7) goto L854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0216, code lost:
    
        r20 = r10.g();
        r22 = r0;
        r0 = r10.g();
        r10.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0229, code lost:
    
        if (r0 != 1835360622) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x022b, code lost:
    
        r9 = r10.q(r20 - 12);
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0237, code lost:
    
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x023e, code lost:
    
        if (r0 != 1851878757) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0240, code lost:
    
        r3 = r10.q(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x024b, code lost:
    
        if (r0 != 1684108385) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x024d, code lost:
    
        r11 = r20;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0251, code lost:
    
        r10.H(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0256, code lost:
    
        r0 = r22;
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x025b, code lost:
    
        r22 = r0;
        r25 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x025f, code lost:
    
        if (r9 == null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0261, code lost:
    
        if (r3 == null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0264, code lost:
    
        if (r8 != (-1)) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0267, code lost:
    
        r10.G(r8);
        r10.H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0279, code lost:
    
        r9 = new defpackage.B90(r9, r3, r10.q(r11 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x027b, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x027c, code lost:
    
        r10.G(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0281, code lost:
    
        r22 = r0;
        r25 = r13;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x028b, code lost:
    
        r0 = r9 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0290, code lost:
    
        if (r0 != 6516084) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0292, code lost:
    
        r0 = r10.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x029d, code lost:
    
        if (r10.g() != 1684108385) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x029f, code lost:
    
        r10.H(8);
        r0 = r10.q(r0 - 16);
        r9 = new defpackage.C1171Ou("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x02b3, code lost:
    
        defpackage.AbstractC6789rA1.h("Failed to parse comment attribute: " + defpackage.F9.e(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x02c8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x02c9, code lost:
    
        r10.G(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x02d1, code lost:
    
        if (r0 == 7233901) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x02d6, code lost:
    
        if (r0 != 7631467) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x02dd, code lost:
    
        if (r0 == 6516589) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x02e2, code lost:
    
        if (r0 != 7828084) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x02e9, code lost:
    
        if (r0 != 6578553) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x02eb, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x02f5, code lost:
    
        if (r0 != 4280916) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x02f7, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0301, code lost:
    
        if (r0 != 7630703) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0303, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x030d, code lost:
    
        if (r0 != 6384738) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x030f, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0319, code lost:
    
        if (r0 != 7108978) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x031b, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0325, code lost:
    
        if (r0 != 6776174) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0327, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x032f, code lost:
    
        if (r0 != 6779504) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0331, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0338, code lost:
    
        defpackage.AbstractC6789rA1.c("Skipped unknown metadata entry: " + defpackage.F9.e(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x034b, code lost:
    
        r10.G(r7);
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0350, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0358, code lost:
    
        r9 = defpackage.XA1.d(r9, r10, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0360, code lost:
    
        if (r9 == null) goto L853;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0362, code lost:
    
        r5.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0365, code lost:
    
        r0 = r22;
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0372, code lost:
    
        r10.G(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0375, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0376, code lost:
    
        r25 = r13;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0380, code lost:
    
        if (r5.isEmpty() == false) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0383, code lost:
    
        r9 = new defpackage.C0540Gr0(r5);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x0782 A[LOOP:13: B:808:0x077f->B:810:0x0782, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:814:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x0760 A[EDGE_INSN: B:871:0x0760->B:807:0x0760 BREAK  A[LOOP:10: B:735:0x060c->B:806:0x0753], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r29) {
        /*
            Method dump skipped, instructions count: 2069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2024Zs0.m(long):void");
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
