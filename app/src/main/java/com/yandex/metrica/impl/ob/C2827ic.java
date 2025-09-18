package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.EnumC1323Qs1;
import defpackage.InterfaceC2213ar1;
import defpackage.InterfaceC7497ut1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ic, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2827ic {
    private volatile C2802hc a;
    private CountDownLatch b = new CountDownLatch(1);
    private final long c = 20;
    private final InterfaceC2213ar1 d = new a();
    private final Context e;
    private final InterfaceC7497ut1 f;

    public C2827ic(Context context, InterfaceC7497ut1 interfaceC7497ut1) {
        this.e = context;
        this.f = interfaceC7497ut1;
    }

    /* renamed from: com.yandex.metrica.impl.ob.ic$a */
    public static final class a implements InterfaceC2213ar1 {
        public a() {
        }

        @Override // defpackage.InterfaceC2213ar1
        public void a(String str, EnumC1323Qs1 enumC1323Qs1) {
            C2827ic.this.a = new C2802hc(str, enumC1323Qs1);
            C2827ic.this.b.countDown();
        }

        @Override // defpackage.InterfaceC2213ar1
        public void a(Throwable th) {
            C2827ic.this.b.countDown();
        }
    }

    public final synchronized C2802hc a() {
        C2802hc c2802hc;
        if (this.a == null) {
            try {
                this.b = new CountDownLatch(1);
                this.f.a(this.e, this.d);
                this.b.await(this.c, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        c2802hc = this.a;
        if (c2802hc == null) {
            c2802hc = new C2802hc(null, EnumC1323Qs1.UNKNOWN);
            this.a = c2802hc;
        }
        return c2802hc;
    }
}
