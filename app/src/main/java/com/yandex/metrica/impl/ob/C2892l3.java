package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.AppMetricaDeviceIDListener;
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
public class C2892l3 implements Y0 {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2892l3 f = null;
    private static volatile boolean g = false;
    private final Context a;
    private final C2867k3 b;
    private final FutureTask<InterfaceC2691d1> c;
    private final InterfaceC2666c1 d;
    private final C3037qn e;

    /* renamed from: com.yandex.metrica.impl.ob.l3$a */
    public class a implements Callable<InterfaceC2691d1> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public InterfaceC2691d1 call() throws Exception {
            return C2892l3.a(C2892l3.this);
        }
    }

    private C2892l3(Context context, C2867k3 c2867k3, C3037qn c3037qn) {
        this(context, c2867k3, c2867k3.a(context, c3037qn), c3037qn);
    }

    public static C2892l3 a(Context context) {
        if (f == null) {
            synchronized (C2892l3.class) {
                try {
                    if (f == null) {
                        f = new C2892l3(context.getApplicationContext(), new C2867k3(), Y.g().d());
                        C2892l3 c2892l3 = f;
                        c2892l3.e.b().execute(new RunnableC2917m3(c2892l3));
                    }
                } finally {
                }
            }
        }
        return f;
    }

    private static InterfaceC3169w1 f() {
        return i() ? f.g() : Y.g().f();
    }

    private InterfaceC2691d1 g() {
        try {
            return this.c.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized boolean h() {
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean i() {
        /*
            java.lang.Class<com.yandex.metrica.impl.ob.l3> r0 = com.yandex.metrica.impl.ob.C2892l3.class
            monitor-enter(r0)
            com.yandex.metrica.impl.ob.l3 r1 = com.yandex.metrica.impl.ob.C2892l3.f     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            com.yandex.metrica.impl.ob.l3 r1 = com.yandex.metrica.impl.ob.C2892l3.f     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.FutureTask<com.yandex.metrica.impl.ob.d1> r1 = r1.c     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            com.yandex.metrica.impl.ob.l3 r1 = com.yandex.metrica.impl.ob.C2892l3.f     // Catch: java.lang.Throwable -> L1f
            com.yandex.metrica.impl.ob.d1 r1 = r1.g()     // Catch: java.lang.Throwable -> L1f
            com.yandex.metrica.impl.ob.t1 r1 = r1.d()     // Catch: java.lang.Throwable -> L1f
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C2892l3.i():boolean");
    }

    public static synchronized void j() {
        g = true;
    }

    public static C2892l3 k() {
        return f;
    }

    public C3089t1 d() {
        return g().d();
    }

    public InterfaceC2901lc e() {
        return this.d.d();
    }

    public static void b(boolean z) {
        f().a(z);
    }

    public static void c(boolean z) {
        f().setStatisticsSending(z);
    }

    public C2892l3(Context context, C2867k3 c2867k3, InterfaceC2666c1 interfaceC2666c1, C3037qn c3037qn) {
        this.a = context;
        this.b = c2867k3;
        this.d = interfaceC2666c1;
        this.e = c3037qn;
        FutureTask<InterfaceC2691d1> futureTask = new FutureTask<>(new a());
        this.c = futureTask;
        c3037qn.b().execute(futureTask);
    }

    public void b(com.yandex.metrica.y yVar) {
        this.d.a(yVar, this);
    }

    public void c(com.yandex.metrica.u uVar) {
        g().c(uVar);
    }

    public void b(YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.y yVar) {
        g().a(yandexMetricaConfig, yVar);
    }

    public String c() {
        return g().c();
    }

    public void b(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        g().a(appMetricaDeviceIDListener);
    }

    @Override // com.yandex.metrica.impl.ob.Y0
    public X0 b() {
        return g().b();
    }

    public static void a(Location location) {
        f().a(location);
    }

    public static void a(boolean z) {
        f().b(z);
    }

    public static void a(String str, String str2) {
        f().c(str, str2);
    }

    public static void a(String str) {
        f().setUserProfileID(str);
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        g().a(deferredDeeplinkParametersListener);
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        g().a(deferredDeeplinkListener);
    }

    public W0 a(com.yandex.metrica.u uVar) {
        return g().a(uVar);
    }

    public String a() {
        return g().a();
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        g().a(iIdentifierCallback, list);
    }

    public void a(Map<String, Object> map) {
        this.d.a(map);
    }

    public static InterfaceC2691d1 a(C2892l3 c2892l3) {
        return c2892l3.b.a(c2892l3.a, c2892l3.d);
    }
}
