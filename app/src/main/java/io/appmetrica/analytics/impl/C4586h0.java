package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4586h0 implements InterfaceC5002ya {
    public final Context a;
    public final IHandlerExecutor b;
    public final C4852s4 c = new C4852s4();
    public final Handler d = f().getHandler();
    public final T1 e = new T1();
    public final C4549fb f = new C4549fb();
    public boolean g;

    public C4586h0(Context context, C4566g4 c4566g4) {
        this.a = context;
        this.b = c4566g4.a();
        BaseReleaseLogger.init(context);
        f().execute(new defpackage.A3(16));
        a().a();
        W3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.2.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 11.09.2024.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final C4852s4 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final Handler b() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final T1 c() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final C4549fb d() {
        return this.f;
    }

    public final IHandlerExecutor f() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC5002ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(io.appmetrica.analytics.AppMetricaConfig r3, io.appmetrica.analytics.impl.Qa r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.g     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L4f
            if (r3 == 0) goto L1d
            java.lang.Boolean r0 = r3.crashReporting     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L51
        L10:
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L17
            goto L1d
        L17:
            io.appmetrica.analytics.impl.fb r4 = r2.f     // Catch: java.lang.Throwable -> Le
            r4.a()     // Catch: java.lang.Throwable -> Le
            goto L30
        L1d:
            io.appmetrica.analytics.impl.fb r0 = r2.f     // Catch: java.lang.Throwable -> Le
            r0.c()     // Catch: java.lang.Throwable -> Le
            io.appmetrica.analytics.impl.fb r0 = r2.f     // Catch: java.lang.Throwable -> Le
            r0.b()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L30
            io.appmetrica.analytics.impl.fb r0 = r2.f     // Catch: java.lang.Throwable -> Le
            android.content.Context r1 = r2.a     // Catch: java.lang.Throwable -> Le
            r0.a(r1, r3, r4)     // Catch: java.lang.Throwable -> Le
        L30:
            if (r3 == 0) goto L45
            java.lang.Boolean r4 = r3.appOpenTrackingEnabled     // Catch: java.lang.Throwable -> Le
            if (r4 != 0) goto L38
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le
        L38:
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> Le
            if (r4 == 0) goto L3f
            goto L45
        L3f:
            io.appmetrica.analytics.impl.T1 r4 = r2.e     // Catch: java.lang.Throwable -> Le
            r4.c()     // Catch: java.lang.Throwable -> Le
            goto L4a
        L45:
            io.appmetrica.analytics.impl.T1 r4 = r2.e     // Catch: java.lang.Throwable -> Le
            r4.b()     // Catch: java.lang.Throwable -> Le
        L4a:
            if (r3 == 0) goto L4f
            r3 = 1
            r2.g = r3     // Catch: java.lang.Throwable -> Le
        L4f:
            monitor-exit(r2)
            return
        L51:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4586h0.a(io.appmetrica.analytics.AppMetricaConfig, io.appmetrica.analytics.impl.Qa):void");
    }
}
