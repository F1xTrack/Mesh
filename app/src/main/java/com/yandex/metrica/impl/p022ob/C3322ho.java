package com.yandex.metrica.impl.p022ob;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.ho */
/* loaded from: classes2.dex */
public class C3322ho<T> implements Comparator<Collection<T>> {

    /* renamed from: a */
    private final InterfaceC3244eo<T> f23612a;

    /* renamed from: b */
    private final Comparator<T> f23613b;

    public C3322ho(InterfaceC3244eo<T> interfaceC3244eo, Comparator<T> comparator) {
        this.f23612a = interfaceC3244eo;
        this.f23613b = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (!((collection2 == null) ^ (collection == null))) {
            if (collection == collection2) {
                return 0;
            }
            if (collection.size() == collection2.size()) {
                HashMap map = new HashMap();
                for (Object obj3 : collection) {
                    map.put(this.f23612a.mo15521a(obj3), obj3);
                }
                for (Object obj4 : collection2) {
                    Object obj5 = map.get(this.f23612a.mo15521a(obj4));
                    if (obj5 == null || this.f23613b.compare(obj5, obj4) != 0) {
                    }
                }
                return 0;
            }
        }
        return 10;
    }
}
