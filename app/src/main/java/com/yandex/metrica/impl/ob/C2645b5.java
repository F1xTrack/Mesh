package com.yandex.metrica.impl.ob;

import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2645b5 extends AbstractC2745f5<AbstractC2795h5> {
    private final O5 a;

    public C2645b5(Z3 z3) {
        this.a = new O5(z3);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2745f5
    public C2670c5 a(int i) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC2865k1.a(i).ordinal();
        if (iOrdinal == 16) {
            arrayList.add(this.a.a());
        } else if (iOrdinal == 24) {
            arrayList.add(this.a.b());
        } else if (iOrdinal == 46) {
            arrayList.add(this.a.c());
        }
        return new C2670c5(arrayList);
    }
}
