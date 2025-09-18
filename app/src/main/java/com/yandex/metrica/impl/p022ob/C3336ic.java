package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.EnumC8183Qs1;
import p000.InterfaceC11346ut1;
import p000.InterfaceC8777ar1;

/* renamed from: com.yandex.metrica.impl.ob.ic */
/* loaded from: classes2.dex */
public final class C3336ic {

    /* renamed from: a */
    private volatile C3310hc f23638a;

    /* renamed from: b */
    private CountDownLatch f23639b = new CountDownLatch(1);

    /* renamed from: c */
    private final long f23640c = 20;

    /* renamed from: d */
    private final InterfaceC8777ar1 f23641d = new a();

    /* renamed from: e */
    private final Context f23642e;

    /* renamed from: f */
    private final InterfaceC11346ut1 f23643f;

    public C3336ic(Context context, InterfaceC11346ut1 interfaceC11346ut1) {
        this.f23642e = context;
        this.f23643f = interfaceC11346ut1;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ic$a */
    public static final class a implements InterfaceC8777ar1 {
        public a() {
        }

        @Override // p000.InterfaceC8777ar1
        /* renamed from: a */
        public void mo10346a(String str, EnumC8183Qs1 enumC8183Qs1) {
            C3336ic.this.f23638a = new C3310hc(str, enumC8183Qs1);
            C3336ic.this.f23639b.countDown();
        }

        @Override // p000.InterfaceC8777ar1
        /* renamed from: a */
        public void mo10347a(Throwable th) {
            C3336ic.this.f23639b.countDown();
        }
    }

    /* renamed from: a */
    public final synchronized C3310hc m16087a() {
        C3310hc c3310hc;
        if (this.f23638a == null) {
            try {
                this.f23639b = new CountDownLatch(1);
                this.f23643f.mo6749a(this.f23642e, this.f23641d);
                this.f23639b.await(this.f23640c, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        c3310hc = this.f23638a;
        if (c3310hc == null) {
            c3310hc = new C3310hc(null, EnumC8183Qs1.UNKNOWN);
            this.f23638a = c3310hc;
        }
        return c3310hc;
    }
}
