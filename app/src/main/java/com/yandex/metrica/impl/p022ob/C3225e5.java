package com.yandex.metrica.impl.p022ob;

import java.util.LinkedList;

/* renamed from: com.yandex.metrica.impl.ob.e5 */
/* loaded from: classes2.dex */
public class C3225e5 extends AbstractC3251f5<AbstractC3589s5> {

    /* renamed from: a */
    private final C2522C5 f23324a;

    /* renamed from: b */
    private final C3226e6 f23325b;

    /* renamed from: c */
    private final C3745y5 f23326c;

    public C3225e5(C3250f4 c3250f4) {
        this.f23324a = new C2522C5(c3250f4);
        this.f23325b = new C3226e6(c3250f4);
        this.f23326c = new C3745y5(c3250f4);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3251f5
    /* renamed from: a */
    public C3173c5 mo15679a(int i) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC3377k1.m16248a(i).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f23324a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f23326c);
        } else if (iOrdinal == 40) {
            linkedList.add(this.f23325b);
            linkedList.add(this.f23324a);
        }
        return new C3173c5(linkedList);
    }
}
