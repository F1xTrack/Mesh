package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.b5 */
/* loaded from: classes2.dex */
public class C3147b5 extends AbstractC3251f5<AbstractC3303h5> {

    /* renamed from: a */
    private final C2822O5 f23111a;

    public C3147b5(C3094Z3 c3094z3) {
        this.f23111a = new C2822O5(c3094z3);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3251f5
    /* renamed from: a */
    public C3173c5 mo15679a(int i) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC3377k1.m16248a(i).ordinal();
        if (iOrdinal == 16) {
            arrayList.add(this.f23111a.m14691a());
        } else if (iOrdinal == 24) {
            arrayList.add(this.f23111a.m14692b());
        } else if (iOrdinal == 46) {
            arrayList.add(this.f23111a.m14693c());
        }
        return new C3173c5(arrayList);
    }
}
