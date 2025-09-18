package p000;

import android.util.SparseArray;
import java.io.EOFException;

/* renamed from: cV0 */
/* loaded from: classes.dex */
public class C8988cV0 implements InterfaceC8357Ub1 {

    /* renamed from: A */
    public C6686qX f17540A;

    /* renamed from: B */
    public C6686qX f17541B;

    /* renamed from: C */
    public long f17542C;

    /* renamed from: E */
    public boolean f17544E;

    /* renamed from: F */
    public long f17545F;

    /* renamed from: G */
    public boolean f17546G;

    /* renamed from: a */
    public final ZU0 f17547a;

    /* renamed from: d */
    public final InterfaceC1091RL f17550d;

    /* renamed from: e */
    public final C0903OL f17551e;

    /* renamed from: f */
    public Object f17552f;

    /* renamed from: g */
    public C6686qX f17553g;

    /* renamed from: h */
    public InterfaceC0715LL f17554h;

    /* renamed from: p */
    public int f17562p;

    /* renamed from: q */
    public int f17563q;

    /* renamed from: r */
    public int f17564r;

    /* renamed from: s */
    public int f17565s;

    /* renamed from: w */
    public boolean f17569w;

    /* renamed from: z */
    public boolean f17572z;

    /* renamed from: b */
    public final C0303Eo f17548b = new C0303Eo();

    /* renamed from: i */
    public int f17555i = 1000;

    /* renamed from: j */
    public long[] f17556j = new long[1000];

    /* renamed from: k */
    public long[] f17557k = new long[1000];

    /* renamed from: n */
    public long[] f17560n = new long[1000];

    /* renamed from: m */
    public int[] f17559m = new int[1000];

    /* renamed from: l */
    public int[] f17558l = new int[1000];

    /* renamed from: o */
    public C8305Tb1[] f17561o = new C8305Tb1[1000];

    /* renamed from: c */
    public final C1356VY f17549c = new C1356VY(new C7754Im0(20));

    /* renamed from: t */
    public long f17566t = Long.MIN_VALUE;

    /* renamed from: u */
    public long f17567u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f17568v = Long.MIN_VALUE;

    /* renamed from: y */
    public boolean f17571y = true;

    /* renamed from: x */
    public boolean f17570x = true;

    /* renamed from: D */
    public boolean f17543D = true;

    public C8988cV0(C6224jE c6224jE, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol) {
        this.f17550d = interfaceC1091RL;
        this.f17551e = c0903ol;
        this.f17547a = new ZU0(c6224jE);
    }

    /* renamed from: A */
    public final synchronized long m10715A() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return m10736v() ? this.f17556j[m10733s(this.f17565s)] : this.f17542C;
    }

    /* renamed from: B */
    public final int m10716B(C0827N8 c0827n8, C1587ZD c1587zd, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C0303Eo c0303Eo = this.f17548b;
        synchronized (this) {
            try {
                c1587zd.f14799f = false;
                i2 = -3;
                if (m10736v()) {
                    C6686qX c6686qX = ((C8732aV0) this.f17549c.m8464B(m10732r())).f15536a;
                    if (!z2 && c6686qX == this.f17553g) {
                        int iM10733s = m10733s(this.f17565s);
                        if (m10738x(iM10733s)) {
                            c1587zd.f3082b = this.f17559m[iM10733s];
                            if (this.f17565s == this.f17562p - 1 && (z || this.f17569w)) {
                                c1587zd.m2498a(536870912);
                            }
                            c1587zd.f14800g = this.f17560n[iM10733s];
                            c0303Eo.f2907a = this.f17558l[iM10733s];
                            c0303Eo.f2908b = this.f17557k[iM10733s];
                            c0303Eo.f2909c = this.f17561o[iM10733s];
                            i2 = -4;
                        } else {
                            c1587zd.f14799f = true;
                        }
                    }
                    m10740z(c6686qX, c0827n8);
                    i2 = -5;
                } else {
                    if (!z && !this.f17569w) {
                        C6686qX c6686qX2 = this.f17541B;
                        if (c6686qX2 == null || (!z2 && c6686qX2 == this.f17553g)) {
                        }
                        m10740z(c6686qX2, c0827n8);
                        i2 = -5;
                    }
                    c1587zd.f3082b = 4;
                    c1587zd.f14800g = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !c1587zd.m2501g(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    ZU0 zu0 = this.f17547a;
                    ZU0.m9533f(zu0.f14907e, c1587zd, this.f17548b, zu0.f14905c);
                } else {
                    ZU0 zu02 = this.f17547a;
                    zu02.f14907e = ZU0.m9533f(zu02.f14907e, c1587zd, this.f17548b, zu02.f14905c);
                }
            }
            if (!z3) {
                this.f17565s++;
            }
        }
        return i2;
    }

    /* renamed from: C */
    public final void m10717C(boolean z) {
        C1356VY c1356vy;
        SparseArray sparseArray;
        ZU0 zu0 = this.f17547a;
        zu0.m9534a(zu0.f14906d);
        C0451H9 c0451h9 = zu0.f14906d;
        int i = 0;
        YN1.m9281f(((C0822N3) c0451h9.f4148c) == null);
        c0451h9.f4146a = 0L;
        c0451h9.f4147b = zu0.f14904b;
        C0451H9 c0451h92 = zu0.f14906d;
        zu0.f14907e = c0451h92;
        zu0.f14908f = c0451h92;
        zu0.f14909g = 0L;
        zu0.f14903a.m22008c();
        this.f17562p = 0;
        this.f17563q = 0;
        this.f17564r = 0;
        this.f17565s = 0;
        this.f17570x = true;
        this.f17566t = Long.MIN_VALUE;
        this.f17567u = Long.MIN_VALUE;
        this.f17568v = Long.MIN_VALUE;
        this.f17569w = false;
        while (true) {
            c1356vy = this.f17549c;
            sparseArray = (SparseArray) c1356vy.f12612c;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C7754Im0) c1356vy.f12613d).mo4000b(sparseArray.valueAt(i));
            i++;
        }
        c1356vy.f12611b = -1;
        sparseArray.clear();
        if (z) {
            this.f17540A = null;
            this.f17541B = null;
            this.f17571y = true;
            this.f17543D = true;
        }
    }

    /* renamed from: D */
    public final synchronized void m10718D() {
        this.f17565s = 0;
        ZU0 zu0 = this.f17547a;
        zu0.f14907e = zu0.f14906d;
    }

    /* renamed from: E */
    public final synchronized boolean m10719E(int i) {
        m10718D();
        int i2 = this.f17563q;
        if (i >= i2 && i <= this.f17562p + i2) {
            this.f17566t = Long.MIN_VALUE;
            this.f17565s = i - i2;
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final synchronized boolean m10720F(long j, boolean z) {
        int iM10728m;
        try {
            m10718D();
            int iM10733s = m10733s(this.f17565s);
            if (m10736v() && j >= this.f17560n[iM10733s] && (j <= this.f17568v || z)) {
                if (this.f17543D) {
                    int i = this.f17562p - this.f17565s;
                    iM10728m = 0;
                    while (true) {
                        if (iM10728m >= i) {
                            if (!z) {
                                i = -1;
                            }
                            iM10728m = i;
                        } else if (this.f17560n[iM10733s] < j) {
                            iM10733s++;
                            if (iM10733s == this.f17555i) {
                                iM10733s = 0;
                            }
                            iM10728m++;
                        }
                    }
                } else {
                    iM10728m = m10728m(j, iM10733s, this.f17562p - this.f17565s, true);
                }
                if (iM10728m == -1) {
                    return false;
                }
                this.f17566t = j;
                this.f17565s += iM10728m;
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x000e  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m10721G(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f17565s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f17562p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            p000.YN1.m9278c(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f17565s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f17565s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8988cV0.m10721G(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x004b  */
    @Override // p000.InterfaceC8357Ub1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo960a(long r13, int r15, int r16, int r17, p000.C8305Tb1 r18) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8988cV0.mo960a(long, int, int, int, Tb1):void");
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: b */
    public final void mo961b(C9591hA0 c9591hA0, int i, int i2) {
        while (true) {
            ZU0 zu0 = this.f17547a;
            if (i <= 0) {
                zu0.getClass();
                return;
            }
            int iM9536c = zu0.m9536c(i);
            C0451H9 c0451h9 = zu0.f14908f;
            C0822N3 c0822n3 = (C0822N3) c0451h9.f4148c;
            c9591hA0.m18747e(c0822n3.f7477a, ((int) (zu0.f14909g - c0451h9.f4146a)) + c0822n3.f7478b, iM9536c);
            i -= iM9536c;
            long j = zu0.f14909g + iM9536c;
            zu0.f14909g = j;
            C0451H9 c0451h92 = zu0.f14908f;
            if (j == c0451h92.f4147b) {
                zu0.f14908f = (C0451H9) c0451h92.f4149d;
            }
        }
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: c */
    public final int mo962c(InterfaceC1082RC interfaceC1082RC, int i, boolean z) throws EOFException {
        ZU0 zu0 = this.f17547a;
        int iM9536c = zu0.m9536c(i);
        C0451H9 c0451h9 = zu0.f14908f;
        C0822N3 c0822n3 = (C0822N3) c0451h9.f4148c;
        int iMo2367r = interfaceC1082RC.mo2367r(c0822n3.f7477a, ((int) (zu0.f14909g - c0451h9.f4146a)) + c0822n3.f7478b, iM9536c);
        if (iMo2367r == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = zu0.f14909g + iMo2367r;
        zu0.f14909g = j;
        C0451H9 c0451h92 = zu0.f14908f;
        if (j != c0451h92.f4147b) {
            return iMo2367r;
        }
        zu0.f14908f = (C0451H9) c0451h92.f4149d;
        return iMo2367r;
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: d */
    public final /* synthetic */ void mo963d(int i, C9591hA0 c9591hA0) {
        F91.m2531n(this, c9591hA0, i);
    }

    @Override // p000.InterfaceC8357Ub1
    /* renamed from: e */
    public final int mo964e(InterfaceC1082RC interfaceC1082RC, int i, boolean z) {
        return mo962c(interfaceC1082RC, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x005c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:98:0x000b, B:102:0x0019, B:107:0x002a, B:109:0x0043, B:113:0x005e, B:175:0x0114, B:167:0x0101, B:170:0x0109, B:112:0x005c), top: B:184:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0113  */
    /* JADX WARN: Type inference failed for: r7v26, types: [bV0, java.lang.Object] */
    @Override // p000.InterfaceC8357Ub1
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo965f(p000.C6686qX r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8988cV0.mo965f(qX):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:56:0x0001, B:58:0x0007, B:62:0x001d, B:65:0x0024, B:69:0x002c, B:74:0x0067, B:97:0x00e3, B:99:0x00ec, B:76:0x0082, B:78:0x008b, B:80:0x0094, B:82:0x00a9, B:86:0x00b2, B:87:0x00b7, B:89:0x00bd, B:93:0x00cb, B:95:0x00d0, B:96:0x00e0, B:79:0x0092), top: B:104:0x0001 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m10722g(long r9, int r11, long r12, int r14, p000.C8305Tb1 r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8988cV0.m10722g(long, int, long, int, Tb1):void");
    }

    /* renamed from: h */
    public final long m10723h(int i) {
        this.f17567u = Math.max(this.f17567u, m10731q(i));
        this.f17562p -= i;
        int i2 = this.f17563q + i;
        this.f17563q = i2;
        int i3 = this.f17564r + i;
        this.f17564r = i3;
        int i4 = this.f17555i;
        if (i3 >= i4) {
            this.f17564r = i3 - i4;
        }
        int i5 = this.f17565s - i;
        this.f17565s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f17565s = 0;
        }
        while (true) {
            C1356VY c1356vy = this.f17549c;
            SparseArray sparseArray = (SparseArray) c1356vy.f12612c;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((C7754Im0) c1356vy.f12613d).mo4000b(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = c1356vy.f12611b;
            if (i8 > 0) {
                c1356vy.f12611b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f17562p != 0) {
            return this.f17557k[this.f17564r];
        }
        int i9 = this.f17564r;
        if (i9 == 0) {
            i9 = this.f17555i;
        }
        return this.f17557k[i9 - 1] + this.f17558l[r7];
    }

    /* renamed from: i */
    public final void m10724i(long j, boolean z) {
        long jM10723h;
        int i;
        ZU0 zu0 = this.f17547a;
        synchronized (this) {
            try {
                int i2 = this.f17562p;
                jM10723h = -1;
                if (i2 != 0) {
                    long[] jArr = this.f17560n;
                    int i3 = this.f17564r;
                    if (j >= jArr[i3]) {
                        if (z && (i = this.f17565s) != i2) {
                            i2 = i + 1;
                        }
                        int iM10728m = m10728m(j, i3, i2, false);
                        if (iM10728m != -1) {
                            jM10723h = m10723h(iM10728m);
                        }
                    }
                }
            } finally {
            }
        }
        zu0.m9535b(jM10723h);
    }

    /* renamed from: j */
    public final void m10725j() {
        long jM10723h;
        ZU0 zu0 = this.f17547a;
        synchronized (this) {
            int i = this.f17562p;
            jM10723h = i == 0 ? -1L : m10723h(i);
        }
        zu0.m9535b(jM10723h);
    }

    /* renamed from: k */
    public final long m10726k(int i) {
        int i2 = this.f17563q;
        int i3 = this.f17562p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        YN1.m9278c(i4 >= 0 && i4 <= i3 - this.f17565s);
        int i5 = this.f17562p - i4;
        this.f17562p = i5;
        this.f17568v = Math.max(this.f17567u, m10731q(i5));
        if (i4 == 0 && this.f17569w) {
            z = true;
        }
        this.f17569w = z;
        C1356VY c1356vy = this.f17549c;
        SparseArray sparseArray = (SparseArray) c1356vy.f12612c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((C7754Im0) c1356vy.f12613d).mo4000b(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c1356vy.f12611b = sparseArray.size() > 0 ? Math.min(c1356vy.f12611b, sparseArray.size() - 1) : -1;
        int i6 = this.f17562p;
        if (i6 == 0) {
            return 0L;
        }
        return this.f17557k[m10733s(i6 - 1)] + this.f17558l[r9];
    }

    /* renamed from: l */
    public final void m10727l(int i) {
        long jM10726k = m10726k(i);
        ZU0 zu0 = this.f17547a;
        YN1.m9278c(jM10726k <= zu0.f14909g);
        zu0.f14909g = jM10726k;
        int i2 = zu0.f14904b;
        if (jM10726k != 0) {
            C0451H9 c0451h9 = zu0.f14906d;
            if (jM10726k != c0451h9.f4146a) {
                while (zu0.f14909g > c0451h9.f4147b) {
                    c0451h9 = (C0451H9) c0451h9.f4149d;
                }
                C0451H9 c0451h92 = (C0451H9) c0451h9.f4149d;
                c0451h92.getClass();
                zu0.m9534a(c0451h92);
                C0451H9 c0451h93 = new C0451H9(c0451h9.f4147b, i2);
                c0451h9.f4149d = c0451h93;
                if (zu0.f14909g == c0451h9.f4147b) {
                    c0451h9 = c0451h93;
                }
                zu0.f14908f = c0451h9;
                if (zu0.f14907e == c0451h92) {
                    zu0.f14907e = c0451h93;
                    return;
                }
                return;
            }
        }
        zu0.m9534a(zu0.f14906d);
        C0451H9 c0451h94 = new C0451H9(zu0.f14909g, i2);
        zu0.f14906d = c0451h94;
        zu0.f14907e = c0451h94;
        zu0.f14908f = c0451h94;
    }

    /* renamed from: m */
    public final int m10728m(long j, int i, int i2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f17560n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f17559m[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.f17555i) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: n */
    public C6686qX mo1523n(C6686qX c6686qX) {
        if (this.f17545F == 0 || c6686qX.f40979r == Long.MAX_VALUE) {
            return c6686qX;
        }
        C6623pX c6623pXM24020a = c6686qX.m24020a();
        c6623pXM24020a.f40166q = c6686qX.f40979r + this.f17545F;
        return new C6686qX(c6623pXM24020a);
    }

    /* renamed from: o */
    public final synchronized long m10729o() {
        return this.f17568v;
    }

    /* renamed from: p */
    public final synchronized long m10730p() {
        return Math.max(this.f17567u, m10731q(this.f17565s));
    }

    /* renamed from: q */
    public final long m10731q(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM10733s = m10733s(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f17560n[iM10733s]);
            if ((this.f17559m[iM10733s] & 1) != 0) {
                break;
            }
            iM10733s--;
            if (iM10733s == -1) {
                iM10733s = this.f17555i - 1;
            }
        }
        return jMax;
    }

    /* renamed from: r */
    public final int m10732r() {
        return this.f17563q + this.f17565s;
    }

    /* renamed from: s */
    public final int m10733s(int i) {
        int i2 = this.f17564r + i;
        int i3 = this.f17555i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: t */
    public final synchronized int m10734t(long j, boolean z) {
        int iM10733s = m10733s(this.f17565s);
        if (m10736v() && j >= this.f17560n[iM10733s]) {
            if (j > this.f17568v && z) {
                return this.f17562p - this.f17565s;
            }
            int iM10728m = m10728m(j, iM10733s, this.f17562p - this.f17565s, true);
            if (iM10728m == -1) {
                return 0;
            }
            return iM10728m;
        }
        return 0;
    }

    /* renamed from: u */
    public final synchronized C6686qX m10735u() {
        return this.f17571y ? null : this.f17541B;
    }

    /* renamed from: v */
    public final boolean m10736v() {
        return this.f17565s != this.f17562p;
    }

    /* renamed from: w */
    public final synchronized boolean m10737w(boolean z) {
        C6686qX c6686qX;
        boolean z2 = true;
        if (m10736v()) {
            if (((C8732aV0) this.f17549c.m8464B(m10732r())).f15536a != this.f17553g) {
                return true;
            }
            return m10738x(m10733s(this.f17565s));
        }
        if (!z && !this.f17569w && ((c6686qX = this.f17541B) == null || c6686qX == this.f17553g)) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: x */
    public final boolean m10738x(int i) {
        InterfaceC0715LL interfaceC0715LL = this.f17554h;
        return interfaceC0715LL == null || interfaceC0715LL.getState() == 4 || ((this.f17559m[i] & 1073741824) == 0 && this.f17554h.mo4949b());
    }

    /* renamed from: y */
    public final void m10739y() {
        InterfaceC0715LL interfaceC0715LL = this.f17554h;
        if (interfaceC0715LL == null || interfaceC0715LL.getState() != 1) {
            return;
        }
        C0652KL c0652klMo4950c = this.f17554h.mo4950c();
        c0652klMo4950c.getClass();
        throw c0652klMo4950c;
    }

    /* renamed from: z */
    public final void m10740z(C6686qX c6686qX, C0827N8 c0827n8) {
        C6686qX c6686qX2;
        C6686qX c6686qX3 = this.f17553g;
        boolean z = c6686qX3 == null;
        C0589JL c0589jl = c6686qX3 == null ? null : c6686qX3.f40978q;
        this.f17553g = c6686qX;
        C0589JL c0589jl2 = c6686qX.f40978q;
        InterfaceC1091RL interfaceC1091RL = this.f17550d;
        if (interfaceC1091RL != null) {
            int iMo6999j = interfaceC1091RL.mo6999j(c6686qX);
            C6623pX c6623pXM24020a = c6686qX.m24020a();
            c6623pXM24020a.f40149I = iMo6999j;
            c6686qX2 = new C6686qX(c6623pXM24020a);
        } else {
            c6686qX2 = c6686qX;
        }
        c0827n8.f7524c = c6686qX2;
        c0827n8.f7523b = this.f17554h;
        if (interfaceC1091RL == null) {
            return;
        }
        if (z || !AbstractC7485Dh1.m1812a(c0589jl, c0589jl2)) {
            InterfaceC0715LL interfaceC0715LL = this.f17554h;
            C0903OL c0903ol = this.f17551e;
            InterfaceC0715LL interfaceC0715LLMo6995a = interfaceC1091RL.mo6995a(c0903ol, c6686qX);
            this.f17554h = interfaceC0715LLMo6995a;
            c0827n8.f7523b = interfaceC0715LLMo6995a;
            if (interfaceC0715LL != null) {
                interfaceC0715LL.mo4951d(c0903ol);
            }
        }
    }
}
