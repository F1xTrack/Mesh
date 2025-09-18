package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Handler;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.InterfaceC3799r;
import com.yandex.metrica.impl.p022ob.C3232ec;
import com.yandex.metrica.impl.p022ob.C3351j1;
import java.util.Arrays;
import java.util.Map;
import p000.InterfaceC7769It1;

/* renamed from: com.yandex.metrica.impl.ob.j3 */
/* loaded from: classes2.dex */
public class C3353j3 implements InterfaceC3169c1 {

    /* renamed from: a */
    private final Context f23694a;

    /* renamed from: b */
    private final Handler f23695b;

    /* renamed from: c */
    private final C3090Z f23696c;

    /* renamed from: d */
    private final C3232ec f23697d;

    /* renamed from: e */
    private final InterfaceExecutorC3607sn f23698e;

    /* renamed from: f */
    private final C2516C f23699f;

    /* renamed from: g */
    private volatile C2843P1 f23700g;

    /* renamed from: h */
    private AbstractC3279g7 f23701h;

    /* renamed from: i */
    private final InterfaceC7769It1 f23702i;

    /* renamed from: j */
    private final C3533q1 f23703j;

    /* renamed from: k */
    private boolean f23704k;

    public C3353j3(Context context, C3555qn c3555qn) {
        this(context.getApplicationContext(), c3555qn.m16638b(), c3555qn.m16637a());
    }

    /* renamed from: e */
    private void m16113e() {
        if (!C3351j1.m16109a("com.yandex.metrica.CounterConfiguration")) {
            throw new C3351j1.a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
        }
        ((C3581rn) this.f23698e).execute(new RunnableC2589Em(this.f23694a));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: a */
    public synchronized void mo14720a(C3806y c3806y, InterfaceC3066Y0 interfaceC3066Y0) {
        try {
            if (!this.f23704k) {
                Boolean bool = c3806y.crashReporting;
                Boolean bool2 = Boolean.TRUE;
                if (bool == null) {
                    bool = bool2;
                }
                if (bool.booleanValue() && this.f23700g == null) {
                    C3679vh c3679vh = new C3679vh(this.f23702i);
                    C3383k7 c3383k7 = new C3383k7(this.f23694a, new C2918S2(interfaceC3066Y0, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C3275g3(this), (InterfaceC3799r) null);
                    C3383k7 c3383k72 = new C3383k7(this.f23694a, new C2918S2(interfaceC3066Y0, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), new C3301h3(this), (InterfaceC3799r) null);
                    if (this.f23701h == null) {
                        this.f23701h = new C3383k7(this.f23694a, new C3559r1(interfaceC3066Y0, c3806y), new C3327i3(this), (InterfaceC3799r) null);
                    }
                    this.f23700g = new C2843P1(Thread.getDefaultUncaughtExceptionHandler(), Arrays.asList(c3679vh, c3383k7, c3383k72, this.f23701h), C3065Y.m15442g().m15451j(), new C2520C3(), new C2570E3());
                    Thread.setDefaultUncaughtExceptionHandler(this.f23700g);
                }
                Boolean bool3 = c3806y.appOpenTrackingEnabled;
                if (bool3 != null) {
                    bool2 = bool3;
                }
                if (bool2.booleanValue()) {
                    this.f23699f.m13942a();
                }
                this.f23704k = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: b */
    public InterfaceExecutorC3607sn mo14722b() {
        return this.f23698e;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: c */
    public Handler mo14723c() {
        return this.f23695b;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: d */
    public InterfaceC3414lc mo14724d() {
        return this.f23697d;
    }

    private C3353j3(Context context, C3581rn c3581rn, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(context, new C3232ec(new C3232ec.c(), new C3232ec.e(), new C3232ec.e(), c3581rn, "Client"), c3581rn, new C3090Z(), new C2516C(interfaceExecutorC3607sn), new C3731xh(), new C3533q1());
    }

    public C3353j3(Context context, C3232ec c3232ec, C3581rn c3581rn, C3090Z c3090z, C2516C c2516c, C3731xh c3731xh, C3533q1 c3533q1) {
        this.f23704k = false;
        this.f23694a = context;
        this.f23698e = c3581rn;
        this.f23699f = c2516c;
        this.f23703j = c3533q1;
        AbstractC2489Am.m13871a(context);
        C2494B2.m13911b();
        this.f23697d = c3232ec;
        c3232ec.m15844c(context);
        this.f23695b = c3581rn.m16701a();
        this.f23696c = c3090z;
        c3090z.m15522a();
        this.f23702i = c3731xh.m17186a(context);
        m16113e();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: a */
    public void mo14721a(Map<String, Object> map) {
        this.f23703j.m16598a(map);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3169c1
    /* renamed from: a */
    public C2516C mo14719a() {
        return this.f23699f;
    }
}
