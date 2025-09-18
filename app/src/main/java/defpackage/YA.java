package defpackage;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class YA implements Thread.UncaughtExceptionHandler {
    public final C0481Fx1 a;
    public final C1666Vd b;
    public final Thread.UncaughtExceptionHandler c;
    public final C6978sA d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public YA(C0481Fx1 c0481Fx1, C1666Vd c1666Vd, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C6978sA c6978sA) {
        this.a = c0481Fx1;
        this.b = c1666Vd;
        this.c = uncaughtExceptionHandler;
        this.d = c6978sA;
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
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.e
            r1 = 1
            r0.set(r1)
            java.lang.Thread$UncaughtExceptionHandler r2 = r6.c
            r3 = 0
            if (r7 != 0) goto Lc
            goto L1f
        Lc:
            if (r8 != 0) goto Lf
            goto L1f
        Lf:
            sA r4 = r6.d     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            boolean r4 = r4.b()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            if (r4 == 0) goto L18
            goto L1f
        L18:
            Fx1 r4 = r6.a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            Vd r5 = r6.b     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
            r4.t(r5, r7, r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YA.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
