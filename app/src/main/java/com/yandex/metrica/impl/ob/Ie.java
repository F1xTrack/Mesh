package com.yandex.metrica.impl.ob;

import defpackage.O90;

/* loaded from: classes2.dex */
public final class Ie extends D0<Le> {
    @Override // com.yandex.metrica.impl.ob.D0
    public boolean a(Le le, Le le2) {
        Le le3 = le;
        Le le4 = le2;
        if (le3.c) {
            if (le4.c) {
                int iIntValue = a().a(le3.e).intValue();
                Integer numA = a().a(le4.e);
                O90.e(numA, "priorities[oldData.source]");
                if (O90.h(iIntValue, numA.intValue()) > 0) {
                }
            }
            return true;
        }
        return false;
    }
}
