package com.yandex.metrica.impl.p022ob;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.B7 */
/* loaded from: classes2.dex */
public class C2499B7 implements InterfaceC3230ea {

    /* renamed from: a */
    private C2524C7 f20922a = new C2524C7();

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2832Of[] mo13847b(List<C3409l7> list) {
        C2832Of[] c2832OfArr = new C2832Of[list.size()];
        Iterator<C3409l7> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c2832OfArr[i] = this.f20922a.mo13847b(it.next());
            i++;
        }
        return c2832OfArr;
    }
}
