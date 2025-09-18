package com.yandex.metrica.impl.ob;

import android.app.Activity;
import defpackage.ES1;
import defpackage.InterfaceC3276cq1;
import defpackage.InterfaceC3663es1;

/* renamed from: com.yandex.metrica.impl.ob.fl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2761fl {

    /* renamed from: com.yandex.metrica.impl.ob.fl$a */
    public class a implements InterfaceC3276cq1 {
        final /* synthetic */ Um a;

        public a(C2761fl c2761fl, Um um) {
            this.a = um;
        }

        @Override // defpackage.InterfaceC3276cq1
        public void fragmentAttached(Activity activity) {
            this.a.b(activity);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.fl$b */
    public class b implements InterfaceC3663es1 {
        public b(C2761fl c2761fl) {
        }

        @Override // defpackage.InterfaceC3663es1
        public void subscribe(Activity activity) throws Throwable {
        }

        @Override // defpackage.InterfaceC3663es1
        public void unsubscribe(Activity activity) throws Throwable {
        }
    }

    public InterfaceC3663es1 a(Um<Activity> um) {
        ES1 es1;
        try {
            es1 = new ES1(new a(this, um));
        } catch (Throwable unused) {
            es1 = null;
        }
        return es1 == null ? new b(this) : es1;
    }
}
