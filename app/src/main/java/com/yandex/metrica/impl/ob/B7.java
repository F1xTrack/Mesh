package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class B7 implements InterfaceC2725ea {
    private C7 a = new C7();

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Of[] b(List<C2896l7> list) {
        Of[] ofArr = new Of[list.size()];
        Iterator<C2896l7> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            ofArr[i] = this.a.b(it.next());
            i++;
        }
        return ofArr;
    }
}
