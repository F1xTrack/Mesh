package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes2.dex */
public final class Yc {
    public final Context a;
    public final Ha b;
    public final C4881t9 c;
    public final Sd d;
    public final ln e;
    public volatile IdentifiersResult f;

    public Yc(Context context, Ha ha) {
        this(context, ha, Zc.a(context), new Sd(context), new ln());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult a() {
        /*
            r5 = this;
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f
            if (r0 == 0) goto L18
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = r0.status
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK
            if (r1 != r2) goto L18
            io.appmetrica.analytics.impl.ln r1 = r5.e
            java.lang.String r2 = r0.id
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.ln.a(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            r1 = 0
            io.appmetrica.analytics.impl.t9 r2 = r5.c     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r3 = r2.a     // Catch: java.lang.Throwable -> L79
            r3.lock()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.V9 r2 = r2.b     // Catch: java.lang.Throwable -> L79
            r2.a()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3d
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = r0.status     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            if (r2 != r3) goto L3d
            io.appmetrica.analytics.impl.ln r2 = r5.e     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.id     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r2 = io.appmetrica.analytics.impl.ln.a(r3)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L3d
            goto L79
        L3d:
            io.appmetrica.analytics.impl.Sd r2 = r5.d     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = r2.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "uuid.dat"
            java.io.File r2 = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(r2, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = io.appmetrica.analytics.impl.Ga.a(r2)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.ln r3 = r5.e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.ln.a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L64
            io.appmetrica.analytics.impl.Ha r2 = r5.b     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = r5.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.Sd r3 = r5.d     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r3.a(r2)     // Catch: java.lang.Throwable -> L79
        L64:
            io.appmetrica.analytics.impl.ln r3 = r5.e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.ln.a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L79
            io.appmetrica.analytics.internal.IdentifiersResult r3 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r4 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L79
            r5.f = r3     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = r3
        L79:
            io.appmetrica.analytics.impl.t9 r2 = r5.c
            io.appmetrica.analytics.impl.V9 r3 = r2.b
            r3.b()
            java.util.concurrent.locks.ReentrantLock r2 = r2.a
            r2.unlock()
            if (r0 == 0) goto L88
            goto L91
        L88:
            io.appmetrica.analytics.internal.IdentifiersResult r0 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r3 = "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)"
            r0.<init>(r1, r2, r3)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Yc.a():io.appmetrica.analytics.internal.IdentifiersResult");
    }

    public Yc(Context context, Ha ha, C4881t9 c4881t9, Sd sd, ln lnVar) {
        this.a = context;
        this.b = ha;
        this.c = c4881t9;
        this.d = sd;
        this.e = lnVar;
        try {
            c4881t9.a();
            sd.a();
            c4881t9.b();
        } catch (Throwable unused) {
            this.c.b();
        }
    }
}
