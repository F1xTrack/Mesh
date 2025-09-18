package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.X3;

/* loaded from: classes2.dex */
class K4 implements F4, I4<C2968o4> {
    @Override // com.yandex.metrica.impl.ob.F4
    public E4 a(Context context, J4 j4, C4 c4, X3 x3) {
        return new L4(context, j4.b(new C3018q4(c4.b(), c4.a()), x3, new C3067s4(this)));
    }

    @Override // com.yandex.metrica.impl.ob.I4
    public InterfaceC2868k4 b(Context context, C2669c4 c2669c4, X3.a aVar, Si si) {
        return new T4(context, c2669c4, aVar, si.c(), new Xi(si), com.yandex.metrica.c.MAIN);
    }

    @Override // com.yandex.metrica.impl.ob.I4
    public InterfaceC2918m4 a(Context context, C2669c4 c2669c4, X3.a aVar, Si si) {
        return new C2968o4(context, si.c(), c2669c4, aVar, P0.i().o(), P0.i().v(), new Xi(si));
    }
}
