package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class Q3 extends D0<P3.a> {
    @Override // com.yandex.metrica.impl.ob.D0
    public boolean a(P3.a aVar, P3.a aVar2) {
        if (!U2.b(aVar2.b())) {
            if (U2.b(aVar.b())) {
                return false;
            }
            if (aVar.a() == E0.APP) {
                int iIntValue = a().a(aVar.a()).intValue();
                Integer numA = a().a(aVar2.a());
                O90.e(numA, "priorities[oldData.source]");
                if (O90.h(iIntValue, numA.intValue()) < 0) {
                    return false;
                }
            } else {
                int iIntValue2 = a().a(aVar.a()).intValue();
                Integer numA2 = a().a(aVar2.a());
                O90.e(numA2, "priorities[oldData.source]");
                if (O90.h(iIntValue2, numA2.intValue()) <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
