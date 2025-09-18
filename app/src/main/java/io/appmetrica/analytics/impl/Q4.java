package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Q4 extends Se {
    public final P4 a;

    public Q4(L4 l4) {
        this.a = new P4(l4);
    }

    @Override // io.appmetrica.analytics.impl.Se
    public final U8 a(int i) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = Wa.a(i).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.a.a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.a.b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.a.c);
        }
        return new T8(arrayList);
    }
}
