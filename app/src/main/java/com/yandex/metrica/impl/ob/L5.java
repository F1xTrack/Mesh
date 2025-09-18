package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class L5 extends AbstractC3068s5 {
    public L5(C2744f4 c2744f4) {
        super(c2744f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        String strP = a().p();
        String strL = c2864k0.l();
        a().b(strL);
        if (TextUtils.equals(strP, strL)) {
            return false;
        }
        a().a(S.r());
        return false;
    }
}
