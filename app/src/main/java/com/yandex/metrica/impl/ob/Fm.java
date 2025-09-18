package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class Fm<K, V> {
    private final Map<K, V> a;
    private final V b;

    public Fm(V v) {
        this(new HashMap(), v);
    }

    public void a(K k, V v) {
        this.a.put(k, v);
    }

    public Fm(Map<K, V> map, V v) {
        this.a = map;
        this.b = v;
    }

    public V a(K k) {
        V v = this.a.get(k);
        return v == null ? this.b : v;
    }

    public Set<K> a() {
        return this.a.keySet();
    }
}
