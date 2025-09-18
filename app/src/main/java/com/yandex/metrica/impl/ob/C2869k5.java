package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2869k5 extends AbstractC2795h5 {
    public C2869k5(Z3 z3) {
        super(z3);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2795h5
    public boolean a(C2864k0 c2864k0, H4 h4) {
        Bundle bundleK = c2864k0.k();
        a().a(bundleK != null ? (ResultReceiver) bundleK.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
