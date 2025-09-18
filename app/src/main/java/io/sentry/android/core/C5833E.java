package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.AbstractC5811V0;
import io.sentry.C5765F1;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC6165u;
import io.sentry.android.core.performance.C5905e;
import io.sentry.android.core.performance.C5906f;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6085a;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6090f;
import io.sentry.protocol.C6097m;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p000.CallableC7043vw;

/* renamed from: io.sentry.android.core.E */
/* loaded from: classes2.dex */
public final class C5833E implements InterfaceC6165u {

    /* renamed from: a */
    public final Context f33523a;

    /* renamed from: b */
    public final C5832D f33524b;

    /* renamed from: c */
    public final SentryAndroidOptions f33525c;

    /* renamed from: d */
    public final Future f33526d;

    public C5833E(Context context, C5832D c5832d, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.f33523a = applicationContext != null ? applicationContext : context;
        this.f33524b = c5832d;
        AbstractC6003a.m21735D(sentryAndroidOptions, "The options object is required.");
        this.f33525c = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f33526d = executorServiceNewSingleThreadExecutor.submit(new CallableC7043vw(this, 13, sentryAndroidOptions));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: a */
    public final C5765F1 mo21517a(C5765F1 c5765f1, C6193y c6193y) {
        boolean zM21522f = m21522f(c5765f1, c6193y);
        if (zM21522f) {
            m21518b(c5765f1, c6193y);
        }
        m21520d(c5765f1, false, zM21522f);
        return c5765f1;
    }

    /* renamed from: b */
    public final void m21518b(AbstractC5811V0 abstractC5811V0, C6193y c6193y) {
        Boolean bool;
        C6085a c6085a = (C6085a) abstractC5811V0.f33417b.m21852d(C6085a.class, "app");
        if (c6085a == null) {
            c6085a = new C6085a();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f33525c;
        ILogger logger = sentryAndroidOptions.getLogger();
        Context context = this.f33523a;
        c6085a.f34316e = AbstractC5911t.m21624e(context, logger);
        C5906f c5906fM21606b = C5905e.m21604c().m21606b(sentryAndroidOptions);
        if (c5906fM21606b.m21611c()) {
            c6085a.f34313b = c5906fM21606b.m21610b() == null ? null : AbstractC6003a.m21753l(Double.valueOf(r2.f34270a / 1000000.0d).longValue());
        }
        if (!AbstractC6003a.m21763w(c6193y) && c6085a.f34322k == null && (bool = C5829A.f33478b.f33479a) != null) {
            c6085a.f34322k = Boolean.valueOf(!bool.booleanValue());
        }
        ILogger logger2 = sentryAndroidOptions.getLogger();
        C5832D c5832d = this.f33524b;
        PackageInfo packageInfoM21629j = AbstractC5911t.m21629j(context, 4096, logger2, c5832d);
        if (packageInfoM21629j != null) {
            String strM21630k = AbstractC5911t.m21630k(packageInfoM21629j, c5832d);
            if (abstractC5811V0.f33427l == null) {
                abstractC5811V0.f33427l = strM21630k;
            }
            AbstractC5911t.m21640u(packageInfoM21629j, c5832d, c6085a);
        }
        abstractC5811V0.f33417b.m21850b(c6085a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // io.sentry.InterfaceC6165u
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.C6039i1 mo21519c(io.sentry.C6039i1 r10, io.sentry.C6193y r11) {
        /*
            r9 = this;
            boolean r0 = r9.m21522f(r10, r11)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L63
            r9.m21518b(r10, r11)
            io.sentry.j0 r3 = r10.f34189s
            if (r3 == 0) goto L12
            java.util.ArrayList r3 = r3.f34215a
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L63
            boolean r11 = io.sentry.config.AbstractC6003a.m21763w(r11)
            io.sentry.j0 r3 = r10.f34189s
            if (r3 == 0) goto L20
            java.util.ArrayList r3 = r3.f34215a
            goto L21
        L20:
            r3 = r1
        L21:
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r3.next()
            io.sentry.protocol.z r4 = (io.sentry.protocol.C6110z) r4
            java.lang.Long r5 = r4.f34487a
            if (r5 == 0) goto L4b
            long r5 = r5.longValue()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            java.lang.Thread r7 = r7.getThread()
            long r7 = r7.getId()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L4b
            r5 = r2
            goto L4c
        L4b:
            r5 = 0
        L4c:
            java.lang.Boolean r6 = r4.f34492f
            if (r6 != 0) goto L56
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r4.f34492f = r6
        L56:
            if (r11 != 0) goto L25
            java.lang.Boolean r6 = r4.f34494h
            if (r6 != 0) goto L25
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.f34494h = r5
            goto L25
        L63:
            r9.m21520d(r10, r2, r0)
            io.sentry.j0 r11 = r10.f34190t
            if (r11 != 0) goto L6b
            goto L6d
        L6b:
            java.util.ArrayList r1 = r11.f34215a
        L6d:
            if (r1 == 0) goto Laf
            int r11 = r1.size()
            if (r11 <= r2) goto Laf
            int r11 = r1.size()
            int r11 = r11 - r2
            java.lang.Object r11 = r1.get(r11)
            io.sentry.protocol.s r11 = (io.sentry.protocol.C6103s) r11
            java.lang.String r0 = r11.f34437c
            java.lang.String r2 = "java.lang"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Laf
            io.sentry.protocol.y r11 = r11.f34439e
            if (r11 == 0) goto Laf
            java.util.List r11 = r11.f34483a
            if (r11 == 0) goto Laf
            java.util.Iterator r11 = r11.iterator()
        L96:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.x r0 = (io.sentry.protocol.C6108x) r0
            java.lang.String r0 = r0.f34467c
            java.lang.String r2 = "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L96
            java.util.Collections.reverse(r1)
        Laf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5833E.mo21519c(io.sentry.i1, io.sentry.y):io.sentry.i1");
    }

    /* renamed from: d */
    public final void m21520d(AbstractC5811V0 abstractC5811V0, boolean z, boolean z2) {
        C6082E c6082e = abstractC5811V0.f33424i;
        if (c6082e == null) {
            c6082e = new C6082E();
            abstractC5811V0.f33424i = c6082e;
        }
        if (c6082e.f34289b == null) {
            c6082e.f34289b = AbstractC5840L.m21534a(this.f33523a);
        }
        String str = c6082e.f34292e;
        SentryAndroidOptions sentryAndroidOptions = this.f33525c;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            c6082e.f34292e = "{{auto}}";
        }
        C6087c c6087c = abstractC5811V0.f33417b;
        C6090f c6090f = (C6090f) c6087c.m21852d(C6090f.class, "device");
        Future future = this.f33526d;
        if (c6090f == null) {
            try {
                c6087c.put("device", ((C5835G) future.get()).m21528a(z, z2));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to retrieve device info", th);
            }
            C6097m c6097m = (C6097m) c6087c.m21852d(C6097m.class, "os");
            try {
                c6087c.put("os", ((C5835G) future.get()).f33538f);
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to retrieve os system", th2);
            }
            if (c6097m != null) {
                String str2 = c6097m.f34400a;
                c6087c.put((str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT), c6097m);
            }
        }
        try {
            C5831C c5831c = ((C5835G) future.get()).f33537e;
            if (c5831c != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(c5831c.f33518a));
                String str3 = c5831c.f33519b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    abstractC5811V0.m21473a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Error getting side loaded info.", th3);
        }
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: e */
    public final C6078A mo21521e(C6078A c6078a, C6193y c6193y) {
        boolean zM21522f = m21522f(c6078a, c6193y);
        if (zM21522f) {
            m21518b(c6078a, c6193y);
        }
        m21520d(c6078a, false, zM21522f);
        return c6078a;
    }

    /* renamed from: f */
    public final boolean m21522f(AbstractC5811V0 abstractC5811V0, C6193y c6193y) {
        if (AbstractC6003a.m21737F(c6193y)) {
            return true;
        }
        this.f33525c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC5811V0.f33416a);
        return false;
    }
}
