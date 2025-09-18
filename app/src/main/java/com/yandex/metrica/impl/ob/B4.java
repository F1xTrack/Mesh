package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.X3;

/* loaded from: classes2.dex */
class B4 extends O4 {
    @Override // com.yandex.metrica.impl.ob.O4, com.yandex.metrica.impl.ob.I4
    public InterfaceC2918m4 a(Context context, C2669c4 c2669c4, X3.a aVar, Si si) {
        return new W3(context, si.c(), c2669c4, aVar, new C3222y4(P0.i().v()), new C2634aj());
    }

    @Override // com.yandex.metrica.impl.ob.O4, com.yandex.metrica.impl.ob.I4
    public InterfaceC2868k4 b(Context context, C2669c4 c2669c4, X3.a aVar, Si si) {
        return new T4(context, c2669c4, aVar, si.c(), new C2634aj(), com.yandex.metrica.c.APPMETRICA);
    }

    @Override // com.yandex.metrica.impl.ob.O4
    /* renamed from: c */
    public C2744f4 a(Context context, C2669c4 c2669c4, X3.a aVar, Si si) {
        return new W3(context, si.c(), c2669c4, aVar, new C3222y4(P0.i().v()), new C2634aj());
    }

    @Override // com.yandex.metrica.impl.ob.O4
    /* renamed from: d */
    public T4 b(Context context, C2669c4 c2669c4, X3.a aVar, Si si) {
        return new T4(context, c2669c4, aVar, si.c(), new C2634aj(), com.yandex.metrica.c.APPMETRICA);
    }
}
