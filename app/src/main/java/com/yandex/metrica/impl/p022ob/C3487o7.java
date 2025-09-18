package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.o7 */
/* loaded from: classes2.dex */
public final class C3487o7 {

    /* renamed from: a */
    public static final C3487o7 f24368a = new C3487o7();

    private C3487o7() {
    }

    /* renamed from: a */
    public static final C3461n7 m16533a(Throwable th) {
        return f24368a.m16534a(th, 1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.yandex.metrica.impl.p022ob.C3461n7 m16534a(java.lang.Throwable r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getClass()
            java.lang.String r2 = r0.getName()
            java.lang.String r3 = r10.getMessage()
            r0 = 0
            java.lang.StackTraceElement[] r1 = r10.getStackTrace()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r0]
        L14:
            java.lang.String r4 = "Utils.getStackTraceSafely(throwable)"
            p000.O90.m5967e(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r1.length
            r4.<init>(r5)
            int r5 = r1.length
            r6 = r0
        L21:
            if (r6 >= r5) goto L30
            r7 = r1[r6]
            com.yandex.metrica.impl.ob.l7 r8 = new com.yandex.metrica.impl.ob.l7
            r8.<init>(r7)
            r4.add(r8)
            int r6 = r6 + 1
            goto L21
        L30:
            java.lang.Throwable r1 = r10.getCause()
            r5 = 0
            if (r1 == 0) goto L49
            if (r12 >= r11) goto L3a
            goto L3b
        L3a:
            r1 = r5
        L3b:
            if (r1 == 0) goto L49
            com.yandex.metrica.impl.ob.o7 r6 = com.yandex.metrica.impl.p022ob.C3487o7.f24368a
            int r7 = r12 + 1
            r8 = 30
            com.yandex.metrica.impl.ob.n7 r1 = r6.m16534a(r1, r8, r7)
            r6 = r1
            goto L4a
        L49:
            r6 = r5
        L4a:
            r1 = 19
            boolean r1 = com.yandex.metrica.impl.p022ob.C2968U2.m15243a(r1)
            if (r1 == 0) goto L7a
            if (r12 >= r11) goto L7a
            java.lang.Throwable[] r10 = r10.getSuppressed()
            java.lang.String r11 = "throwable.suppressed"
            p000.O90.m5967e(r10, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.length
            r11.<init>(r1)
            int r1 = r10.length
        L64:
            if (r0 >= r1) goto L7b
            r5 = r10[r0]
            com.yandex.metrica.impl.ob.o7 r7 = com.yandex.metrica.impl.p022ob.C3487o7.f24368a
            java.lang.String r8 = "it"
            p000.O90.m5967e(r5, r8)
            r8 = 1
            com.yandex.metrica.impl.ob.n7 r5 = r7.m16534a(r5, r8, r12)
            r11.add(r5)
            int r0 = r0 + 1
            goto L64
        L7a:
            r11 = r5
        L7b:
            com.yandex.metrica.impl.ob.n7 r10 = new com.yandex.metrica.impl.ob.n7
            r1 = r10
            r5 = r6
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3487o7.m16534a(java.lang.Throwable, int, int):com.yandex.metrica.impl.ob.n7");
    }
}
