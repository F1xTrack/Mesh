package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class H5 extends AbstractC3068s5 {
    public H5(C2744f4 c2744f4) {
        super(c2744f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        if (TextUtils.isEmpty(c2864k0.o()) || !TextUtils.isEmpty(a().h())) {
            return false;
        }
        a().a(c2864k0.o());
        return false;
    }
}
