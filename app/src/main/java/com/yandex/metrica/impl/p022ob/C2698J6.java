package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.J6 */
/* loaded from: classes2.dex */
public class C2698J6 {

    /* renamed from: a */
    private final InterfaceExecutorC3607sn f21495a;

    /* renamed from: com.yandex.metrica.impl.ob.J6$a */
    public static class a implements Runnable {

        /* renamed from: a */
        private final AbstractC2848P6 f21496a;

        /* renamed from: b */
        private final Bundle f21497b;

        /* renamed from: c */
        private final InterfaceC2823O6 f21498c;

        public a(AbstractC2848P6 abstractC2848P6, Bundle bundle, InterfaceC2823O6 interfaceC2823O6) {
            this.f21496a = abstractC2848P6;
            this.f21497b = bundle;
            this.f21498c = interfaceC2823O6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f21496a.mo14762a(this.f21497b, this.f21498c);
            } catch (Throwable unused) {
                InterfaceC2823O6 interfaceC2823O6 = this.f21498c;
                if (interfaceC2823O6 != null) {
                    interfaceC2823O6.mo14694a();
                }
            }
        }
    }

    public C2698J6() {
        this(C2842P0.m14728i().m14748s().m17347a());
    }

    /* renamed from: a */
    public void m14419a(AbstractC2848P6 abstractC2848P6, Bundle bundle) {
        ((C3581rn) this.f21495a).execute(new a(abstractC2848P6, bundle, null));
    }

    public C2698J6(InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f21495a = interfaceExecutorC3607sn;
    }

    /* renamed from: a */
    public void m14420a(AbstractC2848P6 abstractC2848P6, Bundle bundle, InterfaceC2823O6 interfaceC2823O6) {
        ((C3581rn) this.f21495a).execute(new a(abstractC2848P6, bundle, interfaceC2823O6));
    }

    /* renamed from: a */
    public InterfaceExecutorC3607sn m14418a() {
        return this.f21495a;
    }
}
