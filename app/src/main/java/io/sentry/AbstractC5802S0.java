package io.sentry;

import com.yandex.metrica.C2460e;
import io.sentry.android.core.C5869h;
import io.sentry.android.core.SentryAndroidOptions;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: io.sentry.S0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5802S0 {

    /* renamed from: a */
    public static final ThreadLocal f33389a = new ThreadLocal();

    /* renamed from: b */
    public static volatile InterfaceC5775J f33390b = C6147t0.f34617b;

    /* renamed from: c */
    public static volatile boolean f33391c = false;

    /* renamed from: d */
    public static final Charset f33392d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final long f33393e = System.currentTimeMillis();

    /* renamed from: a */
    public static synchronized void m21463a() {
        InterfaceC5775J interfaceC5775JM21465c = m21465c();
        f33390b = C6147t0.f34617b;
        f33389a.remove();
        interfaceC5775JM21465c.mo21371b(false);
    }

    /* renamed from: b */
    public static void m21464b(InterfaceC5785M0 interfaceC5785M0) {
        m21465c().mo21377w(interfaceC5785M0);
    }

    /* renamed from: c */
    public static InterfaceC5775J m21465c() {
        if (f33391c) {
            return f33390b;
        }
        ThreadLocal threadLocal = f33389a;
        InterfaceC5775J interfaceC5775J = (InterfaceC5775J) threadLocal.get();
        if (interfaceC5775J != null && !(interfaceC5775J instanceof C6147t0)) {
            return interfaceC5775J;
        }
        InterfaceC5775J interfaceC5775JM26687clone = f33390b.m26687clone();
        threadLocal.set(interfaceC5775JM26687clone);
        return interfaceC5775JM26687clone;
    }

    /* renamed from: d */
    public static void m21466d(C6180v0 c6180v0, C5869h c5869h) {
        C5759D1 c5759d1 = (C5759D1) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            c5869h.mo3251a(c5759d1);
        } catch (Throwable th) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        synchronized (AbstractC5802S0.class) {
            try {
                if (m21465c().isEnabled()) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                if (m21467e(c5759d1)) {
                    try {
                        c5759d1.getExecutorService().submit(new RunnableC5794P0(c5759d1, 0));
                    } catch (RejectedExecutionException e) {
                        c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e);
                    }
                    c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "GlobalHubMode: '%s'", String.valueOf(true));
                    f33391c = true;
                    InterfaceC5775J interfaceC5775JM21465c = m21465c();
                    if (c5759d1.getDsn() == null || c5759d1.getDsn().isEmpty()) {
                        throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
                    }
                    f33390b = new C5757D(c5759d1, new C6059l1(c5759d1.getLogger(), new C5812V1(c5759d1, new C5820Y0(c5759d1), new C5782L0(c5759d1))));
                    f33389a.set(f33390b);
                    interfaceC5775JM21465c.mo21371b(true);
                    if (c5759d1.getExecutorService().isClosed()) {
                        c5759d1.setExecutorService(new C2460e(4, false));
                    }
                    Iterator<InterfaceC5819Y> it = c5759d1.getIntegrations().iterator();
                    while (it.hasNext()) {
                        it.next().mo21468e(c5759d1);
                    }
                    try {
                        c5759d1.getExecutorService().submit(new RunnableC5794P0(c5759d1, 2));
                    } catch (Throwable th2) {
                        c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to notify options observers.", th2);
                    }
                    try {
                        c5759d1.getExecutorService().submit(new RunnableC5758D0(c5759d1));
                    } catch (Throwable th3) {
                        c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to finalize previous session.", th3);
                    }
                    try {
                        c5759d1.getExecutorService().submit(new RunnableC5794P0(c5759d1, 1));
                    } catch (Throwable th4) {
                        c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th4);
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
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m21467e(io.sentry.C5759D1 r13) throws java.io.IOException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.AbstractC5802S0.m21467e(io.sentry.D1):boolean");
    }
}
