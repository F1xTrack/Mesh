package p000;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class EU0 {

    /* renamed from: a */
    public static final C7190yG f2719a = new C7190yG("UNDEFINED");

    /* renamed from: b */
    public static final C7190yG f2720b = new C7190yG("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static int m2314a(int i) {
        if (i < 3) {
            AbstractC9246eT1.m17997b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static boolean m2315b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0099 A[Catch: all -> 0x0078, DONT_GENERATE, TryCatch #2 {all -> 0x0078, blocks: (B:80:0x0056, B:82:0x0064, B:84:0x006a, B:97:0x009c, B:87:0x007a, B:89:0x0088, B:94:0x0093, B:96:0x0099, B:102:0x00a9, B:105:0x00b2, B:104:0x00af, B:92:0x008e), top: B:117:0x0056, inners: #0 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2316c(p000.InterfaceC1382Vy r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof p000.C7131xK
            if (r0 == 0) goto Lbc
            xK r9 = (p000.C7131xK) r9
            java.lang.Throwable r0 = p000.PS0.m6365a(r10)
            if (r0 != 0) goto Le
            r1 = r10
            goto L14
        Le:
            nv r1 = new nv
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            Fz r0 = r9.f45547d
            Yy r2 = r9.f45548e
            Bz r3 = r2.getContext()
            boolean r3 = r0.mo2868n(r3)
            r4 = 1
            if (r3 == 0) goto L30
            r9.f45549f = r1
            r9.f46791c = r4
            Bz r10 = r2.getContext()
            r0.mo732l(r10, r9)
            goto Lbf
        L30:
            KP r0 = p000.X91.m8938a()
            long r5 = r0.f6063c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L53
            r9.f45549f = r1
            r9.f46791c = r4
            n8 r10 = r0.f6065e
            if (r10 != 0) goto L4e
            n8 r10 = new n8
            r10.<init>()
            r0.f6065e = r10
        L4e:
            r10.m23084i(r9)
            goto Lbf
        L53:
            r0.m4629x(r4)
            Bz r1 = r2.getContext()     // Catch: java.lang.Throwable -> L78
            Ev0 r3 = p000.C7564Ev0.f2962e     // Catch: java.lang.Throwable -> L78
            zz r1 = r1.mo937g(r3)     // Catch: java.lang.Throwable -> L78
            Ob0 r1 = (p000.InterfaceC8044Ob0) r1     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L7a
            boolean r3 = r1.isActive()     // Catch: java.lang.Throwable -> L78
            if (r3 != 0) goto L7a
            cc0 r1 = (p000.C9002cc0) r1     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.CancellationException r10 = r1.m10818u()     // Catch: java.lang.Throwable -> L78
            OS0 r10 = p000.RQ1.m7015b(r10)     // Catch: java.lang.Throwable -> L78
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L78
            goto L9c
        L78:
            r10 = move-exception
            goto Lb3
        L7a:
            java.lang.Object r1 = r9.f45550g     // Catch: java.lang.Throwable -> L78
            Bz r3 = r2.getContext()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = p000.IJ1.m3817d(r3, r1)     // Catch: java.lang.Throwable -> L78
            yG r5 = p000.IJ1.f4892a     // Catch: java.lang.Throwable -> L78
            if (r1 == r5) goto L8d
            Pf1 r5 = p000.AbstractC11805yU1.m26159g(r2, r3, r1)     // Catch: java.lang.Throwable -> L78
            goto L8e
        L8d:
            r5 = 0
        L8e:
            r2.resumeWith(r10)     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L99
            boolean r10 = r5.m6409U()     // Catch: java.lang.Throwable -> L78
            if (r10 == 0) goto L9c
        L99:
            p000.IJ1.m3816c(r3, r1)     // Catch: java.lang.Throwable -> L78
        L9c:
            boolean r10 = r0.m4626D()     // Catch: java.lang.Throwable -> L78
            if (r10 != 0) goto L9c
        La2:
            r0.m4628p(r4)
            goto Lbf
        La6:
            r10 = move-exception
            if (r5 == 0) goto Laf
            boolean r2 = r5.m6409U()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto Lb2
        Laf:
            p000.IJ1.m3816c(r3, r1)     // Catch: java.lang.Throwable -> L78
        Lb2:
            throw r10     // Catch: java.lang.Throwable -> L78
        Lb3:
            r9.m26374h(r10)     // Catch: java.lang.Throwable -> Lb7
            goto La2
        Lb7:
            r9 = move-exception
            r0.m4628p(r4)
            throw r9
        Lbc:
            r9.resumeWith(r10)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.EU0.m2316c(Vy, java.lang.Object):void");
    }
}
