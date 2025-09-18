package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class L4 extends A4 {
    public L4(Context context, C3042r4 c3042r4) {
        super(context, c3042r4);
    }

    @Override // com.yandex.metrica.impl.ob.A4
    public void b(C2864k0 c2864k0, X3 x3) {
        Boolean bool = x3.b.e;
        Boolean bool2 = Boolean.FALSE;
        if (bool == null) {
            bool = bool2;
        }
        c().a(bool.booleanValue());
        b().a(c2864k0, x3);
    }
}
