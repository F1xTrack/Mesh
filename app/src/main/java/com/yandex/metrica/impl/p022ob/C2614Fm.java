package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Fm */
/* loaded from: classes2.dex */
public class C2614Fm<K, V> {

    /* renamed from: a */
    private final Map<K, V> f21234a;

    /* renamed from: b */
    private final V f21235b;

    public C2614Fm(V v) {
        this(new HashMap(), v);
    }

    /* renamed from: a */
    public void m14146a(K k, V v) {
        this.f21234a.put(k, v);
    }

    public C2614Fm(Map<K, V> map, V v) {
        this.f21234a = map;
        this.f21235b = v;
    }

    /* renamed from: a */
    public V m14144a(K k) {
        V v = this.f21234a.get(k);
        return v == null ? this.f21235b : v;
    }

    /* renamed from: a */
    public Set<K> m14145a() {
        return this.f21234a.keySet();
    }
}
