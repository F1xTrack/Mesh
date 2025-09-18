package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class Sk {
    private final Map<Float, Integer> a = new HashMap();

    public Sk(TreeSet<Float> treeSet) {
        Iterator<Float> it = treeSet.descendingSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            this.a.put(it.next(), Integer.valueOf(i));
            i++;
        }
    }

    public void a(El el) {
        el.s = this.a.get(el.m);
    }
}
