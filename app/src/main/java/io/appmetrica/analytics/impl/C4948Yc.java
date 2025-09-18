package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.Yc */
/* loaded from: classes2.dex */
public final class C4948Yc {

    /* renamed from: a */
    public final Context f31106a;

    /* renamed from: b */
    public final InterfaceC4539Ha f31107b;

    /* renamed from: c */
    public final C5468t9 f31108c;

    /* renamed from: d */
    public final C4805Sd f31109d;

    /* renamed from: e */
    public final C5282ln f31110e;

    /* renamed from: f */
    public volatile IdentifiersResult f31111f;

    public C4948Yc(Context context, InterfaceC4539Ha interfaceC4539Ha) {
        this(context, interfaceC4539Ha, AbstractC4972Zc.m20081a(context), new C4805Sd(context), new C5282ln());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:10:0x0019, B:12:0x0029, B:14:0x002f, B:17:0x003d, B:19:0x0056, B:20:0x0064, B:22:0x006f), top: B:34:0x0019 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult m20034a() {
        /*
            r5 = this;
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f31111f
            if (r0 == 0) goto L18
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = r0.status
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK
            if (r1 != r2) goto L18
            io.appmetrica.analytics.impl.ln r1 = r5.f31110e
            java.lang.String r2 = r0.f32948id
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.C5282ln.m20694a(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            r1 = 0
            io.appmetrica.analytics.impl.t9 r2 = r5.f31108c     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r3 = r2.f32625a     // Catch: java.lang.Throwable -> L79
            r3.lock()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.V9 r2 = r2.f32626b     // Catch: java.lang.Throwable -> L79
            r2.m19915a()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f31111f     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3d
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = r0.status     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            if (r2 != r3) goto L3d
            io.appmetrica.analytics.impl.ln r2 = r5.f31110e     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.f32948id     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r2 = io.appmetrica.analytics.impl.C5282ln.m20694a(r3)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L3d
            goto L79
        L3d:
            io.appmetrica.analytics.impl.Sd r2 = r5.f31109d     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = r2.f30734a     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "uuid.dat"
            java.io.File r2 = io.appmetrica.analytics.coreutils.internal.p028io.FileUtils.getFileFromSdkStorage(r2, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = io.appmetrica.analytics.impl.AbstractC4515Ga.m19437a(r2)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.ln r3 = r5.f31110e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C5282ln.m20694a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L64
            io.appmetrica.analytics.impl.Ha r2 = r5.f31107b     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = r5.f31106a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.mo19466a(r3)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.Sd r3 = r5.f31109d     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r3.m19810a(r2)     // Catch: java.lang.Throwable -> L79
        L64:
            io.appmetrica.analytics.impl.ln r3 = r5.f31110e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C5282ln.m20694a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L79
            io.appmetrica.analytics.internal.IdentifiersResult r3 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r4 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L79
            r5.f31111f = r3     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = r3
        L79:
            io.appmetrica.analytics.impl.t9 r2 = r5.f31108c
            io.appmetrica.analytics.impl.V9 r3 = r2.f32626b
            r3.m19916b()
            java.util.concurrent.locks.ReentrantLock r2 = r2.f32625a
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
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4948Yc.m20034a():io.appmetrica.analytics.internal.IdentifiersResult");
    }

    public C4948Yc(Context context, InterfaceC4539Ha interfaceC4539Ha, C5468t9 c5468t9, C4805Sd c4805Sd, C5282ln c5282ln) {
        this.f31106a = context;
        this.f31107b = interfaceC4539Ha;
        this.f31108c = c5468t9;
        this.f31109d = c4805Sd;
        this.f31110e = c5282ln;
        try {
            c5468t9.m21075a();
            c4805Sd.m19811a();
            c5468t9.m21076b();
        } catch (Throwable unused) {
            this.f31108c.m21076b();
        }
    }
}
