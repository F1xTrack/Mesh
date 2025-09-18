package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: tG */
/* loaded from: classes.dex */
public final class C6875tG {

    /* renamed from: h */
    public static final C1816bw f42973h = new C1816bw(1);

    /* renamed from: i */
    public static final Random f42974i = new Random();

    /* renamed from: d */
    public C11719xp0 f42978d;

    /* renamed from: f */
    public String f42980f;

    /* renamed from: a */
    public final C7367Ba1 f42975a = new C7367Ba1();

    /* renamed from: b */
    public final C7315Aa1 f42976b = new C7315Aa1();

    /* renamed from: c */
    public final HashMap f42977c = new HashMap();

    /* renamed from: e */
    public AbstractC7419Ca1 f42979e = AbstractC7419Ca1.f1466a;

    /* renamed from: g */
    public long f42981g = -1;

    /* renamed from: a */
    public final void m24857a(C6812sG c6812sG) {
        long j = c6812sG.f42344c;
        if (j != -1) {
            this.f42981g = j;
        }
        this.f42980f = null;
    }

    /* renamed from: b */
    public final synchronized void m24858b(C1514Y3 c1514y3) {
        C11719xp0 c11719xp0;
        try {
            String str = this.f42980f;
            if (str != null) {
                C6812sG c6812sG = (C6812sG) this.f42977c.get(str);
                c6812sG.getClass();
                m24857a(c6812sG);
            }
            Iterator it = this.f42977c.values().iterator();
            while (it.hasNext()) {
                C6812sG c6812sG2 = (C6812sG) it.next();
                it.remove();
                if (c6812sG2.f42346e && (c11719xp0 = this.f42978d) != null) {
                    c11719xp0.m25949V(c1514y3, c6812sG2.f42342a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C6812sG m24859c(int r16, p000.C7604Fp0 r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.f42977c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            sG r8 = (p000.C6812sG) r8
            long r9 = r8.f42344c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.f42343b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            tG r9 = r8.f42348g
            java.util.HashMap r10 = r9.f42977c
            java.lang.String r13 = r9.f42980f
            java.lang.Object r10 = r10.get(r13)
            sG r10 = (p000.C6812sG) r10
            if (r10 == 0) goto L44
            long r13 = r10.f42344c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.f42981g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.f3433d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.f42344c = r9
        L51:
            Fp0 r9 = r8.f42345d
            if (r2 != 0) goto L5a
            int r10 = r8.f42343b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.f3433d
            if (r9 != 0) goto L6b
            boolean r10 = r17.m2791b()
            if (r10 != 0) goto L15
            long r11 = r8.f42344c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.f3433d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.f3431b
            int r11 = r9.f3431b
            if (r10 != r11) goto L15
            int r10 = r2.f3432c
            int r11 = r9.f3432c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.f42344c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = p000.AbstractC7485Dh1.f2166a
            Fp0 r10 = r5.f42345d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L97:
            r5 = r8
            r6 = r10
            goto L15
        L9b:
            if (r5 != 0) goto Lad
            bw r4 = p000.C6875tG.f42973h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            sG r5 = new sG
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6875tG.m24859c(int, Fp0):sG");
    }

    /* renamed from: d */
    public final synchronized String m24860d(AbstractC7419Ca1 abstractC7419Ca1, C7604Fp0 c7604Fp0) {
        return m24859c(abstractC7419Ca1.mo1250g(c7604Fp0.f3430a, this.f42976b).f258c, c7604Fp0).f42342a;
    }

    /* renamed from: e */
    public final void m24861e(C1514Y3 c1514y3) {
        C7604Fp0 c7604Fp0;
        boolean zM1259p = c1514y3.f14127b.m1259p();
        HashMap map = this.f42977c;
        if (zM1259p) {
            String str = this.f42980f;
            if (str != null) {
                C6812sG c6812sG = (C6812sG) map.get(str);
                c6812sG.getClass();
                m24857a(c6812sG);
                return;
            }
            return;
        }
        C6812sG c6812sG2 = (C6812sG) map.get(this.f42980f);
        int i = c1514y3.f14128c;
        C7604Fp0 c7604Fp02 = c1514y3.f14129d;
        this.f42980f = m24859c(i, c7604Fp02).f42342a;
        m24862f(c1514y3);
        if (c7604Fp02 == null || !c7604Fp02.m2791b()) {
            return;
        }
        long j = c7604Fp02.f3433d;
        if (c6812sG2 != null && c6812sG2.f42344c == j && (c7604Fp0 = c6812sG2.f42345d) != null && c7604Fp0.f3431b == c7604Fp02.f3431b && c7604Fp0.f3432c == c7604Fp02.f3432c) {
            return;
        }
        m24859c(i, new C7604Fp0(j, c7604Fp02.f3430a));
        this.f42978d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m24862f(p000.C1514Y3 r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6875tG.m24862f(Y3):void");
    }

    /* renamed from: g */
    public final synchronized void m24863g(C1514Y3 c1514y3, int i) {
        try {
            this.f42978d.getClass();
            boolean z = i == 0;
            Iterator it = this.f42977c.values().iterator();
            while (it.hasNext()) {
                C6812sG c6812sG = (C6812sG) it.next();
                if (c6812sG.m24685a(c1514y3)) {
                    it.remove();
                    if (c6812sG.f42346e) {
                        boolean zEquals = c6812sG.f42342a.equals(this.f42980f);
                        if (z && zEquals) {
                            boolean z2 = c6812sG.f42347f;
                        }
                        if (zEquals) {
                            m24857a(c6812sG);
                        }
                        this.f42978d.m25949V(c1514y3, c6812sG.f42342a);
                    }
                }
            }
            m24861e(c1514y3);
        } catch (Throwable th) {
            throw th;
        }
    }
}
