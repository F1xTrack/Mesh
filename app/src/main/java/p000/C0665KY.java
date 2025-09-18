package p000;

import android.util.SparseArray;
import com.p019vk.push.core.base.AidlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: KY */
/* loaded from: classes.dex */
public final class C0665KY implements InterfaceC1412WR {

    /* renamed from: K */
    public static final byte[] f6150K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: L */
    public static final C6686qX f6151L;

    /* renamed from: A */
    public long f6152A;

    /* renamed from: B */
    public C0602JY f6153B;

    /* renamed from: C */
    public int f6154C;

    /* renamed from: D */
    public int f6155D;

    /* renamed from: E */
    public int f6156E;

    /* renamed from: F */
    public boolean f6157F;

    /* renamed from: G */
    public InterfaceC1538YR f6158G;

    /* renamed from: H */
    public InterfaceC8357Ub1[] f6159H;

    /* renamed from: I */
    public InterfaceC8357Ub1[] f6160I;

    /* renamed from: J */
    public boolean f6161J;

    /* renamed from: a */
    public final InterfaceC8939c61 f6162a;

    /* renamed from: b */
    public final int f6163b;

    /* renamed from: c */
    public final C7993Nb1 f6164c;

    /* renamed from: d */
    public final List f6165d;

    /* renamed from: i */
    public final byte[] f6170i;

    /* renamed from: j */
    public final C9591hA0 f6171j;

    /* renamed from: k */
    public final C7783Ja1 f6172k;

    /* renamed from: p */
    public final KB0 f6177p;

    /* renamed from: q */
    public C9367fQ0 f6178q;

    /* renamed from: r */
    public int f6179r;

    /* renamed from: s */
    public int f6180s;

    /* renamed from: t */
    public long f6181t;

    /* renamed from: u */
    public int f6182u;

    /* renamed from: v */
    public C9591hA0 f6183v;

    /* renamed from: w */
    public long f6184w;

    /* renamed from: x */
    public int f6185x;

    /* renamed from: y */
    public long f6186y;

    /* renamed from: z */
    public long f6187z;

    /* renamed from: l */
    public final C9108dO1 f6173l = new C9108dO1(11);

    /* renamed from: m */
    public final C9591hA0 f6174m = new C9591hA0(16);

    /* renamed from: f */
    public final C9591hA0 f6167f = new C9591hA0(TA1.f11190a);

    /* renamed from: g */
    public final C9591hA0 f6168g = new C9591hA0(5);

    /* renamed from: h */
    public final C9591hA0 f6169h = new C9591hA0();

    /* renamed from: n */
    public final ArrayDeque f6175n = new ArrayDeque();

    /* renamed from: o */
    public final ArrayDeque f6176o = new ArrayDeque();

    /* renamed from: e */
    public final SparseArray f6166e = new SparseArray();

    static {
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("application/x-emsg");
        f6151L = new C6686qX(c6623pX);
    }

    public C0665KY(InterfaceC8939c61 interfaceC8939c61, int i, C7783Ja1 c7783Ja1, C7993Nb1 c7993Nb1, List list, KB0 kb0) {
        this.f6162a = interfaceC8939c61;
        this.f6163b = i;
        this.f6172k = c7783Ja1;
        this.f6164c = c7993Nb1;
        this.f6165d = Collections.unmodifiableList(list);
        this.f6177p = kb0;
        byte[] bArr = new byte[16];
        this.f6170i = bArr;
        this.f6171j = new C9591hA0(bArr);
        N70 n70 = P70.f8867b;
        this.f6178q = C9367fQ0.f27184e;
        this.f6187z = -9223372036854775807L;
        this.f6186y = -9223372036854775807L;
        this.f6152A = -9223372036854775807L;
        this.f6158G = InterfaceC1538YR.f14298u0;
        this.f6159H = new InterfaceC8357Ub1[0];
        this.f6160I = new InterfaceC8357Ub1[0];
    }

    /* renamed from: a */
    public static C0589JL m4668a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            C0262E9 c0262e9 = (C0262E9) arrayList.get(i);
            if (c0262e9.f3082b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c0262e9.f2511c.f28293a;
                C1356VY c1356vyM24917c = AbstractC11154tN1.m24917c(bArr);
                UUID uuid = c1356vyM24917c == null ? null : (UUID) c1356vyM24917c.f12612c;
                if (uuid == null) {
                    AbstractC10872rA1.m24175h("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0526IL(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0589JL(null, false, (C0526IL[]) arrayList2.toArray(new C0526IL[0]));
    }

    /* renamed from: c */
    public static void m4669c(C9591hA0 c9591hA0, int i, C8097Pb1 c8097Pb1) throws C10103lA0 {
        c9591hA0.m18741G(i + 8);
        int iM18749g = c9591hA0.m18749g();
        if ((iM18749g & 1) != 0) {
            throw C10103lA0.m22368c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM18749g & 2) != 0;
        int iM18767y = c9591hA0.m18767y();
        if (iM18767y == 0) {
            Arrays.fill(c8097Pb1.f9173l, 0, c8097Pb1.f9166e, false);
            return;
        }
        if (iM18767y != c8097Pb1.f9166e) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(iM18767y, "Senc sample count ", " is different from fragment sample count");
            sbM26237n.append(c8097Pb1.f9166e);
            throw C10103lA0.m22366a(null, sbM26237n.toString());
        }
        Arrays.fill(c8097Pb1.f9173l, 0, iM18767y, z);
        int iM18743a = c9591hA0.m18743a();
        C9591hA0 c9591hA02 = c8097Pb1.f9175n;
        c9591hA02.m18738D(iM18743a);
        c8097Pb1.f9172k = true;
        c8097Pb1.f9176o = true;
        c9591hA0.m18747e(c9591hA02.f28293a, 0, c9591hA02.f28295c);
        c9591hA02.m18741G(0);
        c8097Pb1.f9176o = false;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:439:0x00b5, code lost:
    
        r4 = r29.f6179r;
        r7 = r3.f5588b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x00bb, code lost:
    
        if (r4 != 3) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x00bf, code lost:
    
        if (r3.f5598l != false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x00c1, code lost:
    
        r4 = r3.f5590d.f12634d[r3.f5592f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x00ca, code lost:
    
        r4 = r7.f9169h[r3.f5592f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x00d0, code lost:
    
        r29.f6154C = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x00d6, code lost:
    
        if (r3.f5592f >= r3.f5595i) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x00d8, code lost:
    
        ((p000.C7000vF) r30).mo3627n(r4);
        r1 = r3.m4346a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x00e1, code lost:
    
        if (r1 != null) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x00e4, code lost:
    
        r2 = r7.f9175n;
        r1 = r1.f8515d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x00e8, code lost:
    
        if (r1 == 0) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x00ea, code lost:
    
        r2.m18742H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x00ed, code lost:
    
        r1 = r3.f5592f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x00f1, code lost:
    
        if (r7.f9172k == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x00f7, code lost:
    
        if (r7.f9173l[r1] == false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x00f9, code lost:
    
        r2.m18742H(r2.m18735A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0105, code lost:
    
        if (r3.m4347b() != false) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0107, code lost:
    
        r29.f6153B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x010a, code lost:
    
        r29.f6179r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0116, code lost:
    
        if (r3.f5590d.f12631a.f7903g != r2) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0118, code lost:
    
        r29.f6154C = r4 - 8;
        ((p000.C7000vF) r30).mo3627n(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0131, code lost:
    
        if ("audio/ac4".equals(r3.f5590d.f12631a.f7902f.f40974m) == false) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0133, code lost:
    
        r29.f6155D = r3.m4348c(r29.f6154C, 7);
        r4 = r29.f6154C;
        r9 = r29.f6171j;
        p000.AbstractC7187yD.m26096b(r4, r9);
        r3.f5587a.mo963d(7, r9);
        r29.f6155D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x014e, code lost:
    
        r29.f6155D = r3.m4348c(r29.f6154C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0156, code lost:
    
        r29.f6154C += r29.f6155D;
        r29.f6179r = 4;
        r29.f6156E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0162, code lost:
    
        r4 = r3.f5590d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0166, code lost:
    
        if (r3.f5598l != false) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0168, code lost:
    
        r9 = r4.f12636f[r3.f5592f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x016f, code lost:
    
        r9 = r7.f9170i[r3.f5592f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0176, code lost:
    
        if (r13 == null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0178, code lost:
    
        r9 = r13.m4350a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x017c, code lost:
    
        r4 = r4.f12631a;
        r8 = r4.f7906j;
        r11 = r3.f5587a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0182, code lost:
    
        if (r8 == 0) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0184, code lost:
    
        r14 = r29.f6168g;
        r15 = r14.f28293a;
        r15[0] = 0;
        r15[r2] = 0;
        r15[2] = 0;
        r5 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x019a, code lost:
    
        if (r29.f6155D >= r29.f6154C) goto L775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x019c, code lost:
    
        r2 = r29.f6156E;
        r28 = r13;
        r13 = r4.f7902f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x01a4, code lost:
    
        if (r2 != 0) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x01a6, code lost:
    
        r18 = r4;
        ((p000.C7000vF) r30).mo3618b(r15, r8, r5, false);
        r14.m18741G(0);
        r2 = r14.m18749g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x01b7, code lost:
    
        if (r2 < 1) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x01b9, code lost:
    
        r29.f6156E = r2 - 1;
        r2 = r29.f6167f;
        r2.m18741G(0);
        r11.mo963d(4, r2);
        r11.mo963d(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x01cd, code lost:
    
        if (r29.f6160I.length <= 0) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x01cf, code lost:
    
        r2 = r13.f40974m;
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
    
        r29.f6157F = r2;
        r29.f6155D += 5;
        r29.f6154C += r8;
        r4 = r18;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x020b, code lost:
    
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0216, code lost:
    
        throw p000.C10103lA0.m22366a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0217, code lost:
    
        r18 = r4;
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x021e, code lost:
    
        if (r29.f6157F == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0220, code lost:
    
        r4 = r29.f6169h;
        r4.m18738D(r2);
        r22 = r8;
        r23 = r14;
        ((p000.C7000vF) r30).mo3618b(r4.f28293a, 0, r29.f6156E, false);
        r11.mo963d(r29.f6156E, r4);
        r2 = r29.f6156E;
        r5 = p000.TA1.m7620j(r4.f28295c, r4.f28293a);
        r4.m18741G("video/hevc".equals(r13.f40974m) ? 1 : 0);
        r4.m18740F(r5);
        p000.AbstractC10780qS1.m24002a(r9, r4, r29.f6160I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0255, code lost:
    
        r22 = r8;
        r23 = r14;
        r2 = r11.mo964e(r30, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x025e, code lost:
    
        r29.f6155D += r2;
        r29.f6156E -= r2;
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
    
        r2 = r29.f6155D;
        r4 = r29.f6154C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x027a, code lost:
    
        if (r2 >= r4) goto L781;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x027c, code lost:
    
        r29.f6155D += r11.mo964e(r30, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x028a, code lost:
    
        if (r3.f5598l != false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x028c, code lost:
    
        r1 = r3.f5590d.f12637g[r3.f5592f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x029b, code lost:
    
        if (r7.f9171j[r3.f5592f] == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x029d, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x029f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x02a4, code lost:
    
        if (r3.m4346a() == null) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x02a6, code lost:
    
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x02a9, code lost:
    
        r24 = r1;
        r1 = r3.m4346a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x02af, code lost:
    
        if (r1 == null) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x02b1, code lost:
    
        r27 = r1.f8514c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x02b6, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x02b8, code lost:
    
        r11.mo960a(r9, r24, r29.f6154C, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x02c9, code lost:
    
        if (r12.isEmpty() != false) goto L779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x02cb, code lost:
    
        r1 = (p000.C0539IY) r12.removeFirst();
        r29.f6185x -= r1.f4980c;
        r2 = r1.f4979b;
        r4 = r1.f4978a;
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
    
        r4 = r2.m4350a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x02e7, code lost:
    
        r6 = r29.f6159H;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x02eb, code lost:
    
        if (r8 >= r7) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x02ed, code lost:
    
        r6[r8].mo960a(r4, 1, r1.f4980c, r29.f6185x, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0303, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x030a, code lost:
    
        if (r3.m4347b() != false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x030c, code lost:
    
        r29.f6153B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x030f, code lost:
    
        r29.f6179r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0313, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:?, code lost:
    
        return 0;
     */
    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo738d(p000.InterfaceC1475XR r30, p000.C1164SV r31) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0665KY.mo738d(XR, SV):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x03df  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4670e(long r56) throws p000.C10103lA0 {
        /*
            Method dump skipped, instructions count: 2059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0665KY.m4670e(long):void");
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        C9367fQ0 c9367fQ0M6229B;
        C21 c21M2120c = EI1.m2120c(interfaceC1475XR, true, false);
        if (c21M2120c != null) {
            c9367fQ0M6229B = P70.m6229B(c21M2120c);
        } else {
            N70 n70 = P70.f8867b;
            c9367fQ0M6229B = C9367fQ0.f27184e;
        }
        this.f6178q = c9367fQ0M6229B;
        return c21M2120c == null;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        SparseArray sparseArray = this.f6166e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C0602JY) sparseArray.valueAt(i)).m4349d();
        }
        this.f6176o.clear();
        this.f6185x = 0;
        this.f6186y = j2;
        this.f6175n.clear();
        this.f6179r = 0;
        this.f6182u = 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        return this.f6178q;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        int i;
        int i2 = this.f6163b;
        InterfaceC1538YR c10189lr0 = (i2 & 32) == 0 ? new C10189lr0(interfaceC1538YR, this.f6162a) : interfaceC1538YR;
        this.f6158G = c10189lr0;
        this.f6179r = 0;
        this.f6182u = 0;
        InterfaceC8357Ub1[] interfaceC8357Ub1Arr = new InterfaceC8357Ub1[2];
        this.f6159H = interfaceC8357Ub1Arr;
        KB0 kb0 = this.f6177p;
        if (kb0 != null) {
            interfaceC8357Ub1Arr[0] = kb0;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((i2 & 4) != 0) {
            interfaceC8357Ub1Arr[i] = c10189lr0.mo2005w(100, 5);
            i3 = AidlException.ILLEGAL_ARGUMENT_EXCEPTION;
            i++;
        }
        InterfaceC8357Ub1[] interfaceC8357Ub1Arr2 = (InterfaceC8357Ub1[]) AbstractC7485Dh1.m1804S(i, this.f6159H);
        this.f6159H = interfaceC8357Ub1Arr2;
        for (InterfaceC8357Ub1 interfaceC8357Ub1 : interfaceC8357Ub1Arr2) {
            interfaceC8357Ub1.mo965f(f6151L);
        }
        List list = this.f6165d;
        this.f6160I = new InterfaceC8357Ub1[list.size()];
        int i4 = 0;
        while (i4 < this.f6160I.length) {
            InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = this.f6158G.mo2005w(i3, 3);
            interfaceC8357Ub1Mo2005w.mo965f((C6686qX) list.get(i4));
            this.f6160I[i4] = interfaceC8357Ub1Mo2005w;
            i4++;
            i3++;
        }
        C7993Nb1 c7993Nb1 = this.f6164c;
        if (c7993Nb1 != null) {
            this.f6166e.put(0, new C0602JY(interfaceC1538YR.mo2005w(0, c7993Nb1.f7898b), new C8409Vb1(this.f6164c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C7001vG(0, 0, 0, 0)));
            this.f6158G.mo2003p();
        }
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
