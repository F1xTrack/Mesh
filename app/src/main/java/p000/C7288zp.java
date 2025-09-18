package p000;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: zp */
/* loaded from: classes.dex */
public final class C7288zp implements C81 {

    /* renamed from: b */
    public static final C0480Hc f47013b = new C0480Hc("camerax.core.appConfig.cameraFactoryProvider", C1686an.class, null);

    /* renamed from: c */
    public static final C0480Hc f47014c = new C0480Hc("camerax.core.appConfig.deviceSurfaceManagerProvider", C1807bn.class, null);

    /* renamed from: d */
    public static final C0480Hc f47015d = new C0480Hc("camerax.core.appConfig.useCaseConfigFactoryProvider", C1686an.class, null);

    /* renamed from: e */
    public static final C0480Hc f47016e = new C0480Hc("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* renamed from: f */
    public static final C0480Hc f47017f = new C0480Hc("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* renamed from: g */
    public static final C0480Hc f47018g = new C0480Hc("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* renamed from: h */
    public static final C0480Hc f47019h = new C0480Hc("camerax.core.appConfig.availableCamerasLimiter", C0555Io.class, null);

    /* renamed from: i */
    public static final C0480Hc f47020i = new C0480Hc("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* renamed from: j */
    public static final C0480Hc f47021j = new C0480Hc("camerax.core.appConfig.cameraProviderInitRetryPolicy", WS0.class, null);

    /* renamed from: k */
    public static final C0480Hc f47022k = new C0480Hc("camerax.core.appConfig.quirksSettings", DG0.class, null);

    /* renamed from: a */
    public final C7882Ky0 f47023a;

    public C7288zp(C7882Ky0 c7882Ky0) {
        this.f47023a = c7882Ky0;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: A */
    public final /* synthetic */ Set mo4787A(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24892d(this, c0480Hc);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: F */
    public final /* synthetic */ Object mo4788F(C0480Hc c0480Hc, EnumC6791rw enumC6791rw) {
        return AbstractC11153tN0.m24899k(this, c0480Hc, enumC6791rw);
    }

    @Override // p000.C81
    /* renamed from: K */
    public final /* synthetic */ String mo997K(String str) {
        throw null;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: L */
    public final /* synthetic */ void mo4789L(InterfaceC6711qw interfaceC6711qw) {
        AbstractC11153tN0.m24890b(this, interfaceC6711qw);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: Q */
    public final /* synthetic */ boolean mo4790Q(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24889a(this, c0480Hc);
    }

    /* renamed from: a */
    public final C0555Io m26552a() {
        Object objMo4794w;
        try {
            objMo4794w = this.f47023a.mo4794w(f47019h);
        } catch (IllegalArgumentException unused) {
            objMo4794w = null;
        }
        return (C0555Io) objMo4794w;
    }

    /* renamed from: b */
    public final C1686an m26553b() {
        Object objMo4794w;
        try {
            objMo4794w = this.f47023a.mo4794w(f47013b);
        } catch (IllegalArgumentException unused) {
            objMo4794w = null;
        }
        return (C1686an) objMo4794w;
    }

    @Override // p000.C81
    /* renamed from: b0 */
    public final /* synthetic */ String mo998b0() {
        throw null;
    }

    /* renamed from: c */
    public final long m26554c() {
        C0480Hc c0480Hc = f47020i;
        Object objMo4794w = -1L;
        C7882Ky0 c7882Ky0 = this.f47023a;
        c7882Ky0.getClass();
        try {
            objMo4794w = c7882Ky0.mo4794w(c0480Hc);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objMo4794w).longValue();
    }

    /* renamed from: d */
    public final C1807bn m26555d() {
        Object objMo4794w;
        try {
            objMo4794w = this.f47023a.mo4794w(f47014c);
        } catch (IllegalArgumentException unused) {
            objMo4794w = null;
        }
        return (C1807bn) objMo4794w;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: d0 */
    public final /* synthetic */ EnumC6791rw mo4791d0(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24891c(this, c0480Hc);
    }

    /* renamed from: e */
    public final C1686an m26556e() {
        Object objMo4794w;
        try {
            objMo4794w = this.f47023a.mo4794w(f47015d);
        } catch (IllegalArgumentException unused) {
            objMo4794w = null;
        }
        return (C1686an) objMo4794w;
    }

    @Override // p000.InterfaceC11281uN0
    public final InterfaceC6854sw getConfig() {
        return this.f47023a;
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: q */
    public final /* synthetic */ Object mo4792q(C0480Hc c0480Hc, Object obj) {
        return AbstractC11153tN0.m24898j(this, c0480Hc, obj);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: u */
    public final /* synthetic */ Set mo4793u() {
        return AbstractC11153tN0.m24895g(this);
    }

    @Override // p000.InterfaceC6854sw
    /* renamed from: w */
    public final /* synthetic */ Object mo4794w(C0480Hc c0480Hc) {
        return AbstractC11153tN0.m24897i(this, c0480Hc);
    }
}
