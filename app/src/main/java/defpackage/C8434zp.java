package defpackage;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: zp */
/* loaded from: classes.dex */
public final class C8434zp implements C81 {
    public static final C0572Hc b = new C0572Hc("camerax.core.appConfig.cameraFactoryProvider", C2199an.class, null);
    public static final C0572Hc c = new C0572Hc("camerax.core.appConfig.deviceSurfaceManagerProvider", C2390bn.class, null);
    public static final C0572Hc d = new C0572Hc("camerax.core.appConfig.useCaseConfigFactoryProvider", C2199an.class, null);
    public static final C0572Hc e = new C0572Hc("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final C0572Hc f = new C0572Hc("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final C0572Hc g = new C0572Hc("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final C0572Hc h = new C0572Hc("camerax.core.appConfig.availableCamerasLimiter", C0686Io.class, null);
    public static final C0572Hc i = new C0572Hc("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final C0572Hc j = new C0572Hc("camerax.core.appConfig.cameraProviderInitRetryPolicy", WS0.class, null);
    public static final C0572Hc k = new C0572Hc("camerax.core.appConfig.quirksSettings", DG0.class, null);
    public final C0873Ky0 a;

    public C8434zp(C0873Ky0 c0873Ky0) {
        this.a = c0873Ky0;
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Set A(C0572Hc c0572Hc) {
        return AbstractC7209tN0.d(this, c0572Hc);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Object F(C0572Hc c0572Hc, EnumC6931rw enumC6931rw) {
        return AbstractC7209tN0.k(this, c0572Hc, enumC6931rw);
    }

    @Override // defpackage.C81
    public final /* synthetic */ String K(String str) {
        throw null;
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ void L(InterfaceC6741qw interfaceC6741qw) {
        AbstractC7209tN0.b(this, interfaceC6741qw);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ boolean Q(C0572Hc c0572Hc) {
        return AbstractC7209tN0.a(this, c0572Hc);
    }

    public final C0686Io a() {
        Object objW;
        try {
            objW = this.a.w(h);
        } catch (IllegalArgumentException unused) {
            objW = null;
        }
        return (C0686Io) objW;
    }

    public final C2199an b() {
        Object objW;
        try {
            objW = this.a.w(b);
        } catch (IllegalArgumentException unused) {
            objW = null;
        }
        return (C2199an) objW;
    }

    @Override // defpackage.C81
    public final /* synthetic */ String b0() {
        throw null;
    }

    public final long c() {
        C0572Hc c0572Hc = i;
        Object objW = -1L;
        C0873Ky0 c0873Ky0 = this.a;
        c0873Ky0.getClass();
        try {
            objW = c0873Ky0.w(c0572Hc);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objW).longValue();
    }

    public final C2390bn d() {
        Object objW;
        try {
            objW = this.a.w(c);
        } catch (IllegalArgumentException unused) {
            objW = null;
        }
        return (C2390bn) objW;
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ EnumC6931rw d0(C0572Hc c0572Hc) {
        return AbstractC7209tN0.c(this, c0572Hc);
    }

    public final C2199an e() {
        Object objW;
        try {
            objW = this.a.w(d);
        } catch (IllegalArgumentException unused) {
            objW = null;
        }
        return (C2199an) objW;
    }

    @Override // defpackage.InterfaceC7400uN0
    public final InterfaceC7122sw getConfig() {
        return this.a;
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Object q(C0572Hc c0572Hc, Object obj) {
        return AbstractC7209tN0.j(this, c0572Hc, obj);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Set u() {
        return AbstractC7209tN0.g(this);
    }

    @Override // defpackage.InterfaceC7122sw
    public final /* synthetic */ Object w(C0572Hc c0572Hc) {
        return AbstractC7209tN0.i(this, c0572Hc);
    }
}
