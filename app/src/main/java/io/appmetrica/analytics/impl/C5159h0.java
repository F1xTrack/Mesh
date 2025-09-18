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
import p000.RunnableC0004A3;

/* renamed from: io.appmetrica.analytics.impl.h0 */
/* loaded from: classes2.dex */
public final class C5159h0 implements InterfaceC5594ya {

    /* renamed from: a */
    public final Context f31812a;

    /* renamed from: b */
    public final IHandlerExecutor f31813b;

    /* renamed from: c */
    public final C5438s4 f31814c = new C5438s4();

    /* renamed from: d */
    public final Handler f31815d = m20476f().getHandler();

    /* renamed from: e */
    public final C4817T1 f31816e = new C4817T1();

    /* renamed from: f */
    public final C5120fb f31817f = new C5120fb();

    /* renamed from: g */
    public boolean f31818g;

    public C5159h0(Context context, C5138g4 c5138g4) {
        this.f31812a = context;
        this.f31813b = c5138g4.m20407a();
        BaseReleaseLogger.init(context);
        m20476f().execute(new RunnableC0004A3(16));
        mo20471a().m21039a();
        AbstractC4891W3.m19931a().onCreate();
    }

    /* renamed from: e */
    public static final void m20470e() {
        ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.2.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 11.09.2024.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: a */
    public final C5438s4 mo20471a() {
        return this.f31814c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: b */
    public final Handler mo20473b() {
        return this.f31815d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: c */
    public final C4817T1 mo20474c() {
        return this.f31816e;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: d */
    public final C5120fb mo20475d() {
        return this.f31817f;
    }

    /* renamed from: f */
    public final IHandlerExecutor m20476f() {
        return this.f31813b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    public final ICommonExecutor getDefaultExecutor() {
        return this.f31813b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:11:0x0010, B:14:0x0017, B:19:0x0032, B:21:0x0036, B:22:0x0038, B:25:0x003f, B:28:0x004c, B:26:0x0045, B:15:0x001d, B:17:0x0029), top: B:33:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC5594ya
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo20472a(io.appmetrica.analytics.AppMetricaConfig r3, io.appmetrica.analytics.impl.InterfaceC4755Qa r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f31818g     // Catch: java.lang.Throwable -> Le
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
            io.appmetrica.analytics.impl.fb r4 = r2.f31817f     // Catch: java.lang.Throwable -> Le
            r4.m20382a()     // Catch: java.lang.Throwable -> Le
            goto L30
        L1d:
            io.appmetrica.analytics.impl.fb r0 = r2.f31817f     // Catch: java.lang.Throwable -> Le
            r0.m20385c()     // Catch: java.lang.Throwable -> Le
            io.appmetrica.analytics.impl.fb r0 = r2.f31817f     // Catch: java.lang.Throwable -> Le
            r0.m20384b()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L30
            io.appmetrica.analytics.impl.fb r0 = r2.f31817f     // Catch: java.lang.Throwable -> Le
            android.content.Context r1 = r2.f31812a     // Catch: java.lang.Throwable -> Le
            r0.m20383a(r1, r3, r4)     // Catch: java.lang.Throwable -> Le
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
            io.appmetrica.analytics.impl.T1 r4 = r2.f31816e     // Catch: java.lang.Throwable -> Le
            r4.m19828c()     // Catch: java.lang.Throwable -> Le
            goto L4a
        L45:
            io.appmetrica.analytics.impl.T1 r4 = r2.f31816e     // Catch: java.lang.Throwable -> Le
            r4.m19827b()     // Catch: java.lang.Throwable -> Le
        L4a:
            if (r3 == 0) goto L4f
            r3 = 1
            r2.f31818g = r3     // Catch: java.lang.Throwable -> Le
        L4f:
            monitor-exit(r2)
            return
        L51:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5159h0.mo20472a(io.appmetrica.analytics.AppMetricaConfig, io.appmetrica.analytics.impl.Qa):void");
    }
}
