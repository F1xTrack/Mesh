package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Zm */
/* loaded from: classes2.dex */
public class C3113Zm<K, V> {

    /* renamed from: a */
    private final HashMap<K, Collection<V>> f23013a;

    /* renamed from: b */
    private final boolean f23014b;

    public C3113Zm() {
        this(false);
    }

    /* renamed from: a */
    public Collection<V> m15566a(K k) {
        return this.f23013a.get(k);
    }

    /* renamed from: b */
    public boolean m15571b() {
        return this.f23013a.isEmpty();
    }

    /* renamed from: c */
    public int m15572c() {
        Iterator<Collection<V>> it = this.f23013a.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public String toString() {
        return this.f23013a.toString();
    }

    public C3113Zm(boolean z) {
        this.f23013a = new HashMap<>();
        this.f23014b = z;
    }

    /* renamed from: a */
    public Collection<V> m15567a(K k, V v) {
        Collection<V> collection = this.f23013a.get(k);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(v);
        return this.f23013a.put(k, arrayList);
    }

    /* renamed from: b */
    public Collection<V> m15569b(K k) {
        return this.f23013a.remove(k);
    }

    /* renamed from: b */
    public Collection<V> m15570b(K k, V v) {
        Collection<V> collection = this.f23013a.get(k);
        if (collection == null || !collection.remove(v)) {
            return null;
        }
        if (collection.isEmpty() && this.f23014b) {
            this.f23013a.remove(k);
        }
        return new ArrayList(collection);
    }

    /* renamed from: a */
    public Set<? extends Map.Entry<K, ? extends Collection<V>>> m15568a() {
        return this.f23013a.entrySet();
    }
}
