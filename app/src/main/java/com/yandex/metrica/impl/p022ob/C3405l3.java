package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.l3 */
/* loaded from: classes2.dex */
public class C3405l3 implements InterfaceC3066Y0 {

    /* renamed from: f */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3405l3 f24162f = null;

    /* renamed from: g */
    private static volatile boolean f24163g = false;

    /* renamed from: a */
    private final Context f24164a;

    /* renamed from: b */
    private final C3379k3 f24165b;

    /* renamed from: c */
    private final FutureTask<InterfaceC3195d1> f24166c;

    /* renamed from: d */
    private final InterfaceC3169c1 f24167d;

    /* renamed from: e */
    private final C3555qn f24168e;

    /* renamed from: com.yandex.metrica.impl.ob.l3$a */
    public class a implements Callable<InterfaceC3195d1> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public InterfaceC3195d1 call() throws Exception {
            return C3405l3.m16348a(C3405l3.this);
        }
    }

    private C3405l3(Context context, C3379k3 c3379k3, C3555qn c3555qn) {
        this(context, c3379k3, c3379k3.m16260a(context, c3555qn), c3555qn);
    }

    /* renamed from: a */
    public static C3405l3 m16349a(Context context) {
        if (f24162f == null) {
            synchronized (C3405l3.class) {
                try {
                    if (f24162f == null) {
                        f24162f = new C3405l3(context.getApplicationContext(), new C3379k3(), C3065Y.m15442g().m15446d());
                        C3405l3 c3405l3 = f24162f;
                        c3405l3.f24168e.m16638b().execute(new RunnableC3431m3(c3405l3));
                    }
                } finally {
                }
            }
        }
        return f24162f;
    }

    /* renamed from: f */
    private static InterfaceC3689w1 m16358f() {
        return m16361i() ? f24162f.m16359g() : C3065Y.m15442g().m15448f();
    }

    /* renamed from: g */
    private InterfaceC3195d1 m16359g() {
        try {
            return this.f24166c.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public static synchronized boolean m16360h() {
        return f24163g;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m16361i() {
        /*
            java.lang.Class<com.yandex.metrica.impl.ob.l3> r0 = com.yandex.metrica.impl.p022ob.C3405l3.class
            monitor-enter(r0)
            com.yandex.metrica.impl.ob.l3 r1 = com.yandex.metrica.impl.p022ob.C3405l3.f24162f     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            com.yandex.metrica.impl.ob.l3 r1 = com.yandex.metrica.impl.p022ob.C3405l3.f24162f     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.FutureTask<com.yandex.metrica.impl.ob.d1> r1 = r1.f24166c     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            com.yandex.metrica.impl.ob.l3 r1 = com.yandex.metrica.impl.p022ob.C3405l3.f24162f     // Catch: java.lang.Throwable -> L1f
            com.yandex.metrica.impl.ob.d1 r1 = r1.m16359g()     // Catch: java.lang.Throwable -> L1f
            com.yandex.metrica.impl.ob.t1 r1 = r1.mo14800d()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            r1 = 1
            goto L22
        L1f:
            r1 = move-exception
            goto L24
        L21:
            r1 = 0
        L22:
            monitor-exit(r0)
            return r1
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C3405l3.m16361i():boolean");
    }

    /* renamed from: j */
    public static synchronized void m16362j() {
        f24163g = true;
    }

    /* renamed from: k */
    public static C3405l3 m16363k() {
        return f24162f;
    }

    /* renamed from: d */
    public C3611t1 m16375d() {
        return m16359g().mo14800d();
    }

    /* renamed from: e */
    public InterfaceC3414lc m16376e() {
        return this.f24167d.mo14724d();
    }

    /* renamed from: b */
    public static void m16355b(boolean z) {
        m16358f().mo14490a(z);
    }

    /* renamed from: c */
    public static void m16357c(boolean z) {
        m16358f().setStatisticsSending(z);
    }

    public C3405l3(Context context, C3379k3 c3379k3, InterfaceC3169c1 interfaceC3169c1, C3555qn c3555qn) {
        this.f24164a = context;
        this.f24165b = c3379k3;
        this.f24167d = interfaceC3169c1;
        this.f24168e = c3555qn;
        FutureTask<InterfaceC3195d1> futureTask = new FutureTask<>(new a());
        this.f24166c = futureTask;
        c3555qn.m16638b().execute(futureTask);
    }

    /* renamed from: b */
    public void m16372b(C3806y c3806y) {
        this.f24167d.mo14720a(c3806y, this);
    }

    /* renamed from: c */
    public void m16374c(C3802u c3802u) {
        m16359g().mo14799c(c3802u);
    }

    /* renamed from: b */
    public void m16371b(YandexMetricaConfig yandexMetricaConfig, C3806y c3806y) {
        m16359g().mo14797a(yandexMetricaConfig, c3806y);
    }

    /* renamed from: c */
    public String m16373c() {
        return m16359g().mo14798c();
    }

    /* renamed from: b */
    public void m16370b(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        m16359g().mo14793a(appMetricaDeviceIDListener);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3066Y0
    /* renamed from: b */
    public InterfaceC3041X0 mo14670b() {
        return m16359g().mo14670b();
    }

    /* renamed from: a */
    public static void m16350a(Location location) {
        m16358f().mo14483a(location);
    }

    /* renamed from: a */
    public static void m16353a(boolean z) {
        m16358f().mo14493b(z);
    }

    /* renamed from: a */
    public static void m16352a(String str, String str2) {
        m16358f().mo14385c(str, str2);
    }

    /* renamed from: a */
    public static void m16351a(String str) {
        m16358f().setUserProfileID(str);
    }

    /* renamed from: a */
    public void m16367a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        m16359g().mo14795a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void m16366a(DeferredDeeplinkListener deferredDeeplinkListener) {
        m16359g().mo14794a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public InterfaceC3016W0 m16364a(C3802u c3802u) {
        return m16359g().mo14791a(c3802u);
    }

    /* renamed from: a */
    public String m16365a() {
        return m16359g().mo14792a();
    }

    /* renamed from: a */
    public void m16368a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        m16359g().mo14796a(iIdentifierCallback, list);
    }

    /* renamed from: a */
    public void m16369a(Map<String, Object> map) {
        this.f24167d.mo14721a(map);
    }

    /* renamed from: a */
    public static InterfaceC3195d1 m16348a(C3405l3 c3405l3) {
        return c3405l3.f24165b.m16261a(c3405l3.f24164a, c3405l3.f24167d);
    }
}
