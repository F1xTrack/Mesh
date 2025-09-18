package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import p000.ES1;
import p000.InterfaceC9036cq1;
import p000.InterfaceC9296es1;

/* renamed from: com.yandex.metrica.impl.ob.fl */
/* loaded from: classes2.dex */
class C3267fl {

    /* renamed from: com.yandex.metrica.impl.ob.fl$a */
    public class a implements InterfaceC9036cq1 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2988Um f23447a;

        public a(C3267fl c3267fl, InterfaceC2988Um interfaceC2988Um) {
            this.f23447a = interfaceC2988Um;
        }

        @Override // p000.InterfaceC9036cq1
        public void fragmentAttached(Activity activity) {
            this.f23447a.mo13904b(activity);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.fl$b */
    public class b implements InterfaceC9296es1 {
        public b(C3267fl c3267fl) {
        }

        @Override // p000.InterfaceC9296es1
        public void subscribe(Activity activity) throws Throwable {
        }

        @Override // p000.InterfaceC9296es1
        public void unsubscribe(Activity activity) throws Throwable {
        }
    }

    /* renamed from: a */
    public InterfaceC9296es1 m15948a(InterfaceC2988Um<Activity> interfaceC2988Um) {
        ES1 es1;
        try {
            es1 = new ES1(new a(this, interfaceC2988Um));
        } catch (Throwable unused) {
            es1 = null;
        }
        return es1 == null ? new b(this) : es1;
    }
}
