package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Fj */
/* loaded from: classes2.dex */
public class C2611Fj {

    /* renamed from: b */
    private static volatile C2611Fj f21231b;

    /* renamed from: a */
    private final C3139an f21232a;

    public C2611Fj(C3139an c3139an) {
        this.f21232a = c3139an;
    }

    /* renamed from: a */
    public static C2611Fj m14141a(Context context) {
        if (f21231b == null) {
            synchronized (C2611Fj.class) {
                try {
                    if (f21231b == null) {
                        f21231b = new C2611Fj(new C3139an(context, "uuid.dat"));
                    }
                } finally {
                }
            }
        }
        return f21231b;
    }

    /* renamed from: b */
    public C2586Ej m14143b(Context context, InterfaceC2536Cj interfaceC2536Cj) {
        return new C2586Ej(interfaceC2536Cj, new C2511Bj(), this.f21232a, new C2636Gj(context, new C2742L0(), new C2913Rm()));
    }

    /* renamed from: a */
    public C2586Ej m14142a(Context context, InterfaceC2536Cj interfaceC2536Cj) {
        return new C2586Ej(interfaceC2536Cj, new C2661Hj(context, new C2742L0()), this.f21232a, new C2636Gj(context, new C2742L0(), new C2913Rm()));
    }
}
