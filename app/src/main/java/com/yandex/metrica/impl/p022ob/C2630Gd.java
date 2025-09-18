package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Gd */
/* loaded from: classes2.dex */
public class C2630Gd implements InterfaceC2941T0 {

    /* renamed from: a */
    private final C2676I9 f21305a;

    /* renamed from: b */
    private final C2893R2 f21306b;

    /* renamed from: c */
    private C2579Ec f21307c;

    /* renamed from: d */
    private final C3145b3 f21308d;

    /* renamed from: e */
    private final InterfaceC2839Om f21309e;

    /* renamed from: f */
    private final a f21310f;

    /* renamed from: g */
    private final C2605Fd f21311g;

    /* renamed from: com.yandex.metrica.impl.ob.Gd$a */
    public static class a {
    }

    public C2630Gd(Context context, C2579Ec c2579Ec) {
        this(c2579Ec, C3145b3.m15668a(context));
    }

    /* renamed from: a */
    public void m14193a(C2579Ec c2579Ec) {
        if (C2968U2.m15245a(this.f21307c, c2579Ec)) {
            return;
        }
        this.f21307c = c2579Ec;
        if (c2579Ec == null || !c2579Ec.f21111a.f25306a) {
            return;
        }
        this.f21311g.m15722a(this.f21308d.m15676b());
    }

    /* renamed from: b */
    public void m14194b() {
        C2579Ec c2579Ec = this.f21307c;
        if (c2579Ec == null || c2579Ec.f21112b == null || !this.f21306b.m14970b(this.f21305a.m14325f(0L), this.f21307c.f21112b.f21018b, "last wifi scan attempt time")) {
            return;
        }
        this.f21310f.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f21308d.m15675a(countDownLatch, this.f21311g)) {
            this.f21305a.m14335k(this.f21309e.mo14675b());
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
    }

    private C2630Gd(C2579Ec c2579Ec, C3145b3 c3145b3) {
        this(c3145b3, C2842P0.m14728i().m14750u(), new C2893R2(), new C2814Nm(), new a(), c2579Ec, new C2605Fd(null, c3145b3.m15672a()));
    }

    public C2630Gd(C3145b3 c3145b3, C2676I9 c2676i9, C2893R2 c2893r2, InterfaceC2839Om interfaceC2839Om, a aVar, C2579Ec c2579Ec, C2605Fd c2605Fd) {
        this.f21308d = c3145b3;
        this.f21305a = c2676i9;
        this.f21306b = c2893r2;
        this.f21310f = aVar;
        this.f21307c = c2579Ec;
        this.f21309e = interfaceC2839Om;
        this.f21311g = c2605Fd;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2941T0
    /* renamed from: a */
    public void mo14192a() {
        C2579Ec c2579Ec = this.f21307c;
        if (c2579Ec == null || !c2579Ec.f21111a.f25306a) {
            return;
        }
        this.f21311g.m15722a(this.f21308d.m15676b());
    }
}
