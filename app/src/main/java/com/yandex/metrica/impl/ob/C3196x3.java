package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.C0593Hj;
import defpackage.EnumC3282cs1;
import defpackage.HT;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.x3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3196x3 {
    public final r a(Context context, Executor executor, Executor executor2, EnumC3282cs1 enumC3282cs1, InterfaceC3112u interfaceC3112u, InterfaceC3087t interfaceC3087t) {
        r c0593Hj;
        int iOrdinal = enumC3282cs1.ordinal();
        if (iOrdinal == 0) {
            C2838j c2838j = new C2838j(interfaceC3112u);
            C2863k c2863k = new C2863k();
            HT ht = new HT();
            ht.a = context;
            ht.b = executor;
            ht.c = executor2;
            ht.d = c2838j;
            ht.e = c2863k;
            ht.f = interfaceC3087t;
            c0593Hj = ht;
        } else {
            if (iOrdinal != 1) {
                return new A3();
            }
            c0593Hj = new C0593Hj(context, executor, executor2, interfaceC3112u, interfaceC3087t, new C2913m(interfaceC3112u), new C2963o(null, 1));
        }
        return c0593Hj;
    }
}
