package defpackage;

import android.util.SparseArray;
import com.vk.push.core.base.AidlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class KY implements WR {
    public static final byte[] K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C6666qX L;
    public long A;
    public JY B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public YR G;
    public InterfaceC1584Ub1[] H;
    public InterfaceC1584Ub1[] I;
    public boolean J;
    public final InterfaceC2453c61 a;
    public final int b;
    public final C1038Nb1 c;
    public final List d;
    public final byte[] i;
    public final C4103hA0 j;
    public final C0724Ja1 k;
    public final KB0 p;
    public C3769fQ0 q;
    public int r;
    public int s;
    public long t;
    public int u;
    public C4103hA0 v;
    public long w;
    public int x;
    public long y;
    public long z;
    public final C3383dO1 l = new C3383dO1(11);
    public final C4103hA0 m = new C4103hA0(16);
    public final C4103hA0 f = new C4103hA0(TA1.a);
    public final C4103hA0 g = new C4103hA0(5);
    public final C4103hA0 h = new C4103hA0();
    public final ArrayDeque n = new ArrayDeque();
    public final ArrayDeque o = new ArrayDeque();
    public final SparseArray e = new SparseArray();

    static {
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("application/x-emsg");
        L = new C6666qX(c6475pX);
    }

    public KY(InterfaceC2453c61 interfaceC2453c61, int i, C0724Ja1 c0724Ja1, C1038Nb1 c1038Nb1, List list, KB0 kb0) {
        this.a = interfaceC2453c61;
        this.b = i;
        this.k = c0724Ja1;
        this.c = c1038Nb1;
        this.d = Collections.unmodifiableList(list);
        this.p = kb0;
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.j = new C4103hA0(bArr);
        N70 n70 = P70.b;
        this.q = C3769fQ0.e;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.G = YR.u0;
        this.H = new InterfaceC1584Ub1[0];
        this.I = new InterfaceC1584Ub1[0];
    }

    public static JL a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            E9 e9 = (E9) arrayList.get(i);
            if (e9.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = e9.c.a;
                VY vyC = AbstractC7210tN1.c(bArr);
                UUID uuid = vyC == null ? null : (UUID) vyC.c;
                if (uuid == null) {
                    AbstractC6789rA1.h("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new IL(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new JL(null, false, (IL[]) arrayList2.toArray(new IL[0]));
    }

    public static void c(C4103hA0 c4103hA0, int i, C1194Pb1 c1194Pb1) throws C5643lA0 {
        c4103hA0.G(i + 8);
        int iG = c4103hA0.g();
        if ((iG & 1) != 0) {
            throw C5643lA0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iG & 2) != 0;
        int iY = c4103hA0.y();
        if (iY == 0) {
            Arrays.fill(c1194Pb1.l, 0, c1194Pb1.e, false);
            return;
        }
        if (iY != c1194Pb1.e) {
            StringBuilder sbN = AbstractC8235ym.n(iY, "Senc sample count ", " is different from fragment sample count");
            sbN.append(c1194Pb1.e);
            throw C5643lA0.a(null, sbN.toString());
        }
        Arrays.fill(c1194Pb1.l, 0, iY, z);
        int iA = c4103hA0.a();
        C4103hA0 c4103hA02 = c1194Pb1.n;
        c4103hA02.D(iA);
        c1194Pb1.k = true;
        c1194Pb1.o = true;
        c4103hA0.e(c4103hA02.a, 0, c4103hA02.c);
        c4103hA02.G(0);
        c1194Pb1.o = false;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:439:0x00b5, code lost:
    
        r4 = r29.r;
        r7 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x00bb, code lost:
    
        if (r4 != 3) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x00bf, code lost:
    
        if (r3.l != false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x00c1, code lost:
    
        r4 = r3.d.d[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x00ca, code lost:
    
        r4 = r7.h[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x00d0, code lost:
    
        r29.C = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x00d6, code lost:
    
        if (r3.f >= r3.i) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x00d8, code lost:
    
        ((defpackage.C7566vF) r30).n(r4);
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x00e1, code lost:
    
        if (r1 != null) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x00e4, code lost:
    
        r2 = r7.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x00e8, code lost:
    
        if (r1 == 0) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x00ea, code lost:
    
        r2.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x00ed, code lost:
    
        r1 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x00f1, code lost:
    
        if (r7.k == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x00f7, code lost:
    
        if (r7.l[r1] == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x00f9, code lost:
    
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0105, code lost:
    
        if (r3.b() != false) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0107, code lost:
    
        r29.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x010a, code lost:
    
        r29.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0116, code lost:
    
        if (r3.d.a.g != r2) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0118, code lost:
    
        r29.C = r4 - 8;
        ((defpackage.C7566vF) r30).n(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0131, code lost:
    
        if ("audio/ac4".equals(r3.d.a.f.m) == false) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0133, code lost:
    
        r29.D = r3.c(r29.C, 7);
        r4 = r29.C;
        r9 = r29.j;
        defpackage.AbstractC8130yD.b(r4, r9);
        r3.a.d(7, r9);
        r29.D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x014e, code lost:
    
        r29.D = r3.c(r29.C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0156, code lost:
    
        r29.C += r29.D;
        r29.r = 4;
        r29.E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0162, code lost:
    
        r4 = r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0166, code lost:
    
        if (r3.l != false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0168, code lost:
    
        r9 = r4.f[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x016f, code lost:
    
        r9 = r7.i[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0176, code lost:
    
        if (r13 == null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0178, code lost:
    
        r9 = r13.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x017c, code lost:
    
        r4 = r4.a;
        r8 = r4.j;
        r11 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0182, code lost:
    
        if (r8 == 0) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0184, code lost:
    
        r14 = r29.g;
        r15 = r14.a;
        r15[0] = 0;
        r15[r2] = 0;
        r15[2] = 0;
        r5 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x019a, code lost:
    
        if (r29.D >= r29.C) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x019c, code lost:
    
        r2 = r29.E;
        r28 = r13;
        r13 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x01a4, code lost:
    
        if (r2 != 0) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x01a6, code lost:
    
        r18 = r4;
        ((defpackage.C7566vF) r30).b(r15, r8, r5, false);
        r14.G(0);
        r2 = r14.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x01b7, code lost:
    
        if (r2 < 1) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x01b9, code lost:
    
        r29.E = r2 - 1;
        r2 = r29.f;
        r2.G(0);
        r11.d(4, r2);
        r11.d(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x01cd, code lost:
    
        if (r29.I.length <= 0) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x01cf, code lost:
    
        r2 = r13.m;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x01d9, code lost:
    
        if ("video/avc".equals(r2) == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x01db, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x01e0, code lost:
    
        if ((r13 & 31) == 6) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x01e3, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x01ea, code lost:
    
        if ("video/hevc".equals(r2) == false) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x01f2, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x01f4, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x01f6, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x01f9, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x01fa, code lost:
    
        r29.F = r2;
        r29.D += 5;
        r29.C += r8;
        r4 = r18;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x020b, code lost:
    
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0216, code lost:
    
        throw defpackage.C5643lA0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0217, code lost:
    
        r18 = r4;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x021e, code lost:
    
        if (r29.F == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0220, code lost:
    
        r4 = r29.h;
        r4.D(r2);
        r22 = r8;
        r23 = r14;
        ((defpackage.C7566vF) r30).b(r4.a, 0, r29.E, false);
        r11.d(r29.E, r4);
        r2 = r29.E;
        r5 = defpackage.TA1.j(r4.c, r4.a);
        r4.G("video/hevc".equals(r13.m) ? 1 : 0);
        r4.F(r5);
        defpackage.AbstractC6653qS1.a(r9, r4, r29.I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0255, code lost:
    
        r22 = r8;
        r23 = r14;
        r2 = r11.e(r30, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x025e, code lost:
    
        r29.D += r2;
        r29.E -= r2;
        r4 = r18;
        r5 = r21;
        r8 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0271, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0274, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0276, code lost:
    
        r2 = r29.D;
        r4 = r29.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x027a, code lost:
    
        if (r2 >= r4) goto L781;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x027c, code lost:
    
        r29.D += r11.e(r30, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x028a, code lost:
    
        if (r3.l != false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x028c, code lost:
    
        r1 = r3.d.g[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x029b, code lost:
    
        if (r7.j[r3.f] == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x029d, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x029f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x02a4, code lost:
    
        if (r3.a() == null) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x02a6, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x02a9, code lost:
    
        r24 = r1;
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x02af, code lost:
    
        if (r1 == null) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x02b1, code lost:
    
        r27 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x02b6, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x02b8, code lost:
    
        r11.a(r9, r24, r29.C, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x02c9, code lost:
    
        if (r12.isEmpty() != false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x02cb, code lost:
    
        r1 = (defpackage.IY) r12.removeFirst();
        r29.x -= r1.c;
        r2 = r1.b;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x02dc, code lost:
    
        if (r2 == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x02de, code lost:
    
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x02df, code lost:
    
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x02e1, code lost:
    
        if (r28 == null) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x02e3, code lost:
    
        r4 = r2.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x02e7, code lost:
    
        r6 = r29.H;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x02eb, code lost:
    
        if (r8 >= r7) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x02ed, code lost:
    
        r6[r8].a(r4, 1, r1.c, r29.x, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0303, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x030a, code lost:
    
        if (r3.b() != false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x030c, code lost:
    
        r29.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x030f, code lost:
    
        r29.r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0313, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:?, code lost:
    
        return 0;
     */
    @Override // defpackage.WR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.XR r30, defpackage.SV r31) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KY.d(XR, SV):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x03df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r56) throws defpackage.C5643lA0 {
        /*
            Method dump skipped, instructions count: 2059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KY.e(long):void");
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        C3769fQ0 c3769fQ0B;
        C21 c21C = EI1.c(xr, true, false);
        if (c21C != null) {
            c3769fQ0B = P70.B(c21C);
        } else {
            N70 n70 = P70.b;
            c3769fQ0B = C3769fQ0.e;
        }
        this.q = c3769fQ0B;
        return c21C == null;
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        SparseArray sparseArray = this.e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((JY) sparseArray.valueAt(i)).d();
        }
        this.o.clear();
        this.x = 0;
        this.y = j2;
        this.n.clear();
        this.r = 0;
        this.u = 0;
    }

    @Override // defpackage.WR
    public final List h() {
        return this.q;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        int i;
        int i2 = this.b;
        YR c5772lr0 = (i2 & 32) == 0 ? new C5772lr0(yr, this.a) : yr;
        this.G = c5772lr0;
        this.r = 0;
        this.u = 0;
        InterfaceC1584Ub1[] interfaceC1584Ub1Arr = new InterfaceC1584Ub1[2];
        this.H = interfaceC1584Ub1Arr;
        KB0 kb0 = this.p;
        if (kb0 != null) {
            interfaceC1584Ub1Arr[0] = kb0;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((i2 & 4) != 0) {
            interfaceC1584Ub1Arr[i] = c5772lr0.w(100, 5);
            i3 = AidlException.ILLEGAL_ARGUMENT_EXCEPTION;
            i++;
        }
        InterfaceC1584Ub1[] interfaceC1584Ub1Arr2 = (InterfaceC1584Ub1[]) AbstractC0277Dh1.S(i, this.H);
        this.H = interfaceC1584Ub1Arr2;
        for (InterfaceC1584Ub1 interfaceC1584Ub1 : interfaceC1584Ub1Arr2) {
            interfaceC1584Ub1.f(L);
        }
        List list = this.d;
        this.I = new InterfaceC1584Ub1[list.size()];
        int i4 = 0;
        while (i4 < this.I.length) {
            InterfaceC1584Ub1 interfaceC1584Ub1W = this.G.w(i3, 3);
            interfaceC1584Ub1W.f((C6666qX) list.get(i4));
            this.I[i4] = interfaceC1584Ub1W;
            i4++;
            i3++;
        }
        C1038Nb1 c1038Nb1 = this.c;
        if (c1038Nb1 != null) {
            this.e.put(0, new JY(yr.w(0, c1038Nb1.b), new C1662Vb1(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C7569vG(0, 0, 0, 0)));
            this.G.p();
        }
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
