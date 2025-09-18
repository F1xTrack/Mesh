package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class I5 extends AbstractC3068s5 {
    public I5(C2744f4 c2744f4) {
        super(c2744f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        String strL = c2864k0.l();
        if (TextUtils.isEmpty(strL)) {
            return false;
        }
        a().b(strL);
        return false;
    }
}
