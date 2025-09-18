package p000;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: YA */
/* loaded from: classes.dex */
public final class C1521YA implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C7621Fx1 f14181a;

    /* renamed from: b */
    public final C1361Vd f14182b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f14183c;

    /* renamed from: d */
    public final C6806sA f14184d;

    /* renamed from: e */
    public final AtomicBoolean f14185e = new AtomicBoolean(false);

    public C1521YA(C7621Fx1 c7621Fx1, C1361Vd c1361Vd, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C6806sA c6806sA) {
        this.f14181a = c7621Fx1;
        this.f14182b = c1361Vd;
        this.f14183c = uncaughtExceptionHandler;
        this.f14184d = c6806sA;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f14185e
            r1 = 1
            r0.set(r1)
            java.lang.Thread$UncaughtExceptionHandler r2 = r6.f14183c
            r3 = 0
            if (r7 != 0) goto Lc
            goto L1f
        Lc:
            if (r8 != 0) goto Lf
            goto L1f
        Lf:
            sA r4 = r6.f14184d     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            boolean r4 = r4.mo7023b()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            if (r4 == 0) goto L18
            goto L1f
        L18:
            Fx1 r4 = r6.f14181a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            Vd r5 = r6.f14182b     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            r4.m2857t(r5, r7, r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
        L1f:
            if (r2 == 0) goto L25
        L21:
            r2.uncaughtException(r7, r8)
            goto L28
        L25:
            java.lang.System.exit(r1)
        L28:
            r0.set(r3)
            goto L3d
        L2c:
            r4 = move-exception
            if (r2 == 0) goto L33
            r2.uncaughtException(r7, r8)
            goto L36
        L33:
            java.lang.System.exit(r1)
        L36:
            r0.set(r3)
            throw r4
        L3a:
            if (r2 == 0) goto L25
            goto L21
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1521YA.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
