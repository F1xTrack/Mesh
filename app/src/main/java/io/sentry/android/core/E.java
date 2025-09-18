package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import defpackage.CallableC7695vw;
import io.sentry.C5185y;
import io.sentry.EnumC5148n1;
import io.sentry.F1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5173u;
import io.sentry.V0;
import io.sentry.protocol.C5155a;
import io.sentry.protocol.C5157c;
import io.sentry.protocol.C5160f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class E implements InterfaceC5173u {
    public final Context a;
    public final D b;
    public final SentryAndroidOptions c;
    public final Future d;

    public E(Context context, D d, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = d;
        io.sentry.config.a.D(sentryAndroidOptions, "The options object is required.");
        this.c = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = executorServiceNewSingleThreadExecutor.submit(new CallableC7695vw(this, 13, sentryAndroidOptions));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // io.sentry.InterfaceC5173u
    public final F1 a(F1 f1, C5185y c5185y) {
        boolean zF = f(f1, c5185y);
        if (zF) {
            b(f1, c5185y);
        }
        d(f1, false, zF);
        return f1;
    }

    public final void b(V0 v0, C5185y c5185y) {
        Boolean bool;
        C5155a c5155a = (C5155a) v0.b.d(C5155a.class, "app");
        if (c5155a == null) {
            c5155a = new C5155a();
        }
        SentryAndroidOptions sentryAndroidOptions = this.c;
        ILogger logger = sentryAndroidOptions.getLogger();
        Context context = this.a;
        c5155a.e = AbstractC5102t.e(context, logger);
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.e.c().b(sentryAndroidOptions);
        if (fVarB.c()) {
            c5155a.b = fVarB.b() == null ? null : io.sentry.config.a.l(Double.valueOf(r2.a / 1000000.0d).longValue());
        }
        if (!io.sentry.config.a.w(c5185y) && c5155a.k == null && (bool = A.b.a) != null) {
            c5155a.k = Boolean.valueOf(!bool.booleanValue());
        }
        ILogger logger2 = sentryAndroidOptions.getLogger();
        D d = this.b;
        PackageInfo packageInfoJ = AbstractC5102t.j(context, 4096, logger2, d);
        if (packageInfoJ != null) {
            String strK = AbstractC5102t.k(packageInfoJ, d);
            if (v0.l == null) {
                v0.l = strK;
            }
            AbstractC5102t.u(packageInfoJ, d, c5155a);
        }
        v0.b.b(c5155a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // io.sentry.InterfaceC5173u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.C5133i1 c(io.sentry.C5133i1 r10, io.sentry.C5185y r11) {
        /*
            r9 = this;
            boolean r0 = r9.f(r10, r11)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L63
            r9.b(r10, r11)
            io.sentry.j0 r3 = r10.s
            if (r3 == 0) goto L12
            java.util.ArrayList r3 = r3.a
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L63
            boolean r11 = io.sentry.config.a.w(r11)
            io.sentry.j0 r3 = r10.s
            if (r3 == 0) goto L20
            java.util.ArrayList r3 = r3.a
            goto L21
        L20:
            r3 = r1
        L21:
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r3.next()
            io.sentry.protocol.z r4 = (io.sentry.protocol.z) r4
            java.lang.Long r5 = r4.a
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
            java.lang.Boolean r6 = r4.f
            if (r6 != 0) goto L56
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r4.f = r6
        L56:
            if (r11 != 0) goto L25
            java.lang.Boolean r6 = r4.h
            if (r6 != 0) goto L25
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.h = r5
            goto L25
        L63:
            r9.d(r10, r2, r0)
            io.sentry.j0 r11 = r10.t
            if (r11 != 0) goto L6b
            goto L6d
        L6b:
            java.util.ArrayList r1 = r11.a
        L6d:
            if (r1 == 0) goto Laf
            int r11 = r1.size()
            if (r11 <= r2) goto Laf
            int r11 = r1.size()
            int r11 = r11 - r2
            java.lang.Object r11 = r1.get(r11)
            io.sentry.protocol.s r11 = (io.sentry.protocol.s) r11
            java.lang.String r0 = r11.c
            java.lang.String r2 = "java.lang"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Laf
            io.sentry.protocol.y r11 = r11.e
            if (r11 == 0) goto Laf
            java.util.List r11 = r11.a
            if (r11 == 0) goto Laf
            java.util.Iterator r11 = r11.iterator()
        L96:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.x r0 = (io.sentry.protocol.x) r0
            java.lang.String r0 = r0.c
            java.lang.String r2 = "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L96
            java.util.Collections.reverse(r1)
        Laf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.E.c(io.sentry.i1, io.sentry.y):io.sentry.i1");
    }

    public final void d(V0 v0, boolean z, boolean z2) {
        io.sentry.protocol.E e = v0.i;
        if (e == null) {
            e = new io.sentry.protocol.E();
            v0.i = e;
        }
        if (e.b == null) {
            e.b = L.a(this.a);
        }
        String str = e.e;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            e.e = "{{auto}}";
        }
        C5157c c5157c = v0.b;
        C5160f c5160f = (C5160f) c5157c.d(C5160f.class, "device");
        Future future = this.d;
        if (c5160f == null) {
            try {
                c5157c.put("device", ((G) future.get()).a(z, z2));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(EnumC5148n1.ERROR, "Failed to retrieve device info", th);
            }
            io.sentry.protocol.m mVar = (io.sentry.protocol.m) c5157c.d(io.sentry.protocol.m.class, "os");
            try {
                c5157c.put("os", ((G) future.get()).f);
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().d(EnumC5148n1.ERROR, "Failed to retrieve os system", th2);
            }
            if (mVar != null) {
                String str2 = mVar.a;
                c5157c.put((str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT), mVar);
            }
        }
        try {
            C c = ((G) future.get()).e;
            if (c != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(c.a));
                String str3 = c.b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    v0.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(EnumC5148n1.ERROR, "Error getting side loaded info.", th3);
        }
    }

    @Override // io.sentry.InterfaceC5173u
    public final io.sentry.protocol.A e(io.sentry.protocol.A a, C5185y c5185y) {
        boolean zF = f(a, c5185y);
        if (zF) {
            b(a, c5185y);
        }
        d(a, false, zF);
        return a;
    }

    public final boolean f(V0 v0, C5185y c5185y) {
        if (io.sentry.config.a.F(c5185y)) {
            return true;
        }
        this.c.getLogger().k(EnumC5148n1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", v0.a);
        return false;
    }
}
