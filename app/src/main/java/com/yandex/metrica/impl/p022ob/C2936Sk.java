package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.Sk */
/* loaded from: classes2.dex */
public class C2936Sk {

    /* renamed from: a */
    private final Map<Float, Integer> f22330a = new HashMap();

    public C2936Sk(TreeSet<Float> treeSet) {
        Iterator<Float> it = treeSet.descendingSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f22330a.put(it.next(), Integer.valueOf(i));
            i++;
        }
    }

    /* renamed from: a */
    public void m15138a(C2588El c2588El) {
        c2588El.f21147s = this.f22330a.get(c2588El.f21141m);
    }
}
