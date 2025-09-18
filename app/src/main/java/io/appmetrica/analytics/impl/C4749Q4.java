package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Q4 */
/* loaded from: classes2.dex */
public final class C4749Q4 extends AbstractC4806Se {

    /* renamed from: a */
    public final C4725P4 f30655a;

    public C4749Q4(C4629L4 c4629l4) {
        this.f30655a = new C4725P4(c4629l4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4806Se
    /* renamed from: a */
    public final AbstractC4848U8 mo19740a(int i) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC4898Wa.m19946a(i).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f30655a.f30599a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f30655a.f30600b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f30655a.f30601c);
        }
        return new C4824T8(arrayList);
    }
}
