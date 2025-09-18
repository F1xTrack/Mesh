package io.sentry;

import io.sentry.android.core.C5091h;
import io.sentry.android.core.SentryAndroidOptions;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public abstract class S0 {
    public static final ThreadLocal a = new ThreadLocal();
    public static volatile J b = C5171t0.b;
    public static volatile boolean c = false;
    public static final Charset d = Charset.forName("UTF-8");
    public static final long e = System.currentTimeMillis();

    public static synchronized void a() {
        J jC = c();
        b = C5171t0.b;
        a.remove();
        jC.b(false);
    }

    public static void b(M0 m0) {
        c().w(m0);
    }

    public static J c() {
        if (c) {
            return b;
        }
        ThreadLocal threadLocal = a;
        J j = (J) threadLocal.get();
        if (j != null && !(j instanceof C5171t0)) {
            return j;
        }
        J jM93clone = b.m93clone();
        threadLocal.set(jM93clone);
        return jM93clone;
    }

    public static void d(C5177v0 c5177v0, C5091h c5091h) {
        D1 d1 = (D1) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            c5091h.a(d1);
        } catch (Throwable th) {
            d1.getLogger().d(EnumC5148n1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        synchronized (S0.class) {
            try {
                if (c().isEnabled()) {
                    d1.getLogger().k(EnumC5148n1.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                if (e(d1)) {
                    try {
                        d1.getExecutorService().submit(new P0(d1, 0));
                    } catch (RejectedExecutionException e2) {
                        d1.getLogger().d(EnumC5148n1.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                    }
                    d1.getLogger().k(EnumC5148n1.INFO, "GlobalHubMode: '%s'", String.valueOf(true));
                    c = true;
                    J jC = c();
                    if (d1.getDsn() == null || d1.getDsn().isEmpty()) {
                        throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
                    }
                    b = new D(d1, new C5142l1(d1.getLogger(), new V1(d1, new Y0(d1), new L0(d1))));
                    a.set(b);
                    jC.b(true);
                    if (d1.getExecutorService().isClosed()) {
                        d1.setExecutorService(new com.yandex.metrica.e(4, false));
                    }
                    Iterator<Y> it = d1.getIntegrations().iterator();
                    while (it.hasNext()) {
                        it.next().e(d1);
                    }
                    try {
                        d1.getExecutorService().submit(new P0(d1, 2));
                    } catch (Throwable th2) {
                        d1.getLogger().d(EnumC5148n1.DEBUG, "Failed to notify options observers.", th2);
                    }
                    try {
                        d1.getExecutorService().submit(new D0(d1));
                    } catch (Throwable th3) {
                        d1.getLogger().d(EnumC5148n1.DEBUG, "Failed to finalize previous session.", th3);
                    }
                    try {
                        d1.getExecutorService().submit(new P0(d1, 1));
                    } catch (Throwable th4) {
                        d1.getLogger().d(EnumC5148n1.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th4);
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:328:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x017b A[LOOP:0: B:346:0x0175->B:348:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01d1 A[LOOP:1: B:356:0x01cb->B:358:0x01d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01ed A[LOOP:2: B:360:0x01e7->B:362:0x01ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x024e A[LOOP:4: B:382:0x0248->B:384:0x024e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0272 A[LOOP:5: B:386:0x026c->B:388:0x0272, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(io.sentry.D1 r13) throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.S0.e(io.sentry.D1):boolean");
    }
}
