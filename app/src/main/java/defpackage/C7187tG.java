package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: tG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7187tG {
    public static final C2417bw h = new C2417bw(1);
    public static final Random i = new Random();
    public C8055xp0 d;
    public String f;
    public final C0100Ba1 a = new C0100Ba1();
    public final C0022Aa1 b = new C0022Aa1();
    public final HashMap c = new HashMap();
    public AbstractC0178Ca1 e = AbstractC0178Ca1.a;
    public long g = -1;

    public final void a(C6996sG c6996sG) {
        long j = c6996sG.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(Y3 y3) {
        C8055xp0 c8055xp0;
        try {
            String str = this.f;
            if (str != null) {
                C6996sG c6996sG = (C6996sG) this.c.get(str);
                c6996sG.getClass();
                a(c6996sG);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                C6996sG c6996sG2 = (C6996sG) it.next();
                it.remove();
                if (c6996sG2.e && (c8055xp0 = this.d) != null) {
                    c8055xp0.V(y3, c6996sG2.a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6996sG c(int r16, defpackage.C0456Fp0 r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            sG r8 = (defpackage.C6996sG) r8
            long r9 = r8.c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            tG r9 = r8.g
            java.util.HashMap r10 = r9.c
            java.lang.String r13 = r9.f
            java.lang.Object r10 = r10.get(r13)
            sG r10 = (defpackage.C6996sG) r10
            if (r10 == 0) goto L44
            long r13 = r10.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.c = r9
        L51:
            Fp0 r9 = r8.d
            if (r2 != 0) goto L5a
            int r10 = r8.b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.d
            if (r9 != 0) goto L6b
            boolean r10 = r17.b()
            if (r10 != 0) goto L15
            long r11 = r8.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.b
            int r11 = r9.b
            if (r10 != r11) goto L15
            int r10 = r2.c
            int r11 = r9.c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = defpackage.AbstractC0277Dh1.a
            Fp0 r10 = r5.d
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
            bw r4 = defpackage.C7187tG.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            sG r5 = new sG
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7187tG.c(int, Fp0):sG");
    }

    public final synchronized String d(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0) {
        return c(abstractC0178Ca1.g(c0456Fp0.a, this.b).c, c0456Fp0).a;
    }

    public final void e(Y3 y3) {
        C0456Fp0 c0456Fp0;
        boolean zP = y3.b.p();
        HashMap map = this.c;
        if (zP) {
            String str = this.f;
            if (str != null) {
                C6996sG c6996sG = (C6996sG) map.get(str);
                c6996sG.getClass();
                a(c6996sG);
                return;
            }
            return;
        }
        C6996sG c6996sG2 = (C6996sG) map.get(this.f);
        int i2 = y3.c;
        C0456Fp0 c0456Fp02 = y3.d;
        this.f = c(i2, c0456Fp02).a;
        f(y3);
        if (c0456Fp02 == null || !c0456Fp02.b()) {
            return;
        }
        long j = c0456Fp02.d;
        if (c6996sG2 != null && c6996sG2.c == j && (c0456Fp0 = c6996sG2.d) != null && c0456Fp0.b == c0456Fp02.b && c0456Fp0.c == c0456Fp02.c) {
            return;
        }
        c(i2, new C0456Fp0(j, c0456Fp02.a));
        this.d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(defpackage.Y3 r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7187tG.f(Y3):void");
    }

    public final synchronized void g(Y3 y3, int i2) {
        try {
            this.d.getClass();
            boolean z = i2 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                C6996sG c6996sG = (C6996sG) it.next();
                if (c6996sG.a(y3)) {
                    it.remove();
                    if (c6996sG.e) {
                        boolean zEquals = c6996sG.a.equals(this.f);
                        if (z && zEquals) {
                            boolean z2 = c6996sG.f;
                        }
                        if (zEquals) {
                            a(c6996sG);
                        }
                        this.d.V(y3, c6996sG.a);
                    }
                }
            }
            e(y3);
        } catch (Throwable th) {
            throw th;
        }
    }
}
