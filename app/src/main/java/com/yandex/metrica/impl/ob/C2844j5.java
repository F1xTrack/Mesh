package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2844j5 extends AbstractC2795h5 {
    public C2844j5(Z3 z3) {
        super(z3);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2795h5
    public boolean a(C2864k0 c2864k0, H4 h4) {
        Bundle bundleK = c2864k0.k();
        a().a(bundleK != null ? (C2741f1) bundleK.getParcelable("com.yandex.metrica.impl.IdentifiersData") : null);
        return false;
    }
}
