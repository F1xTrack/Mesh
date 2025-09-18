package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fn;

/* loaded from: classes2.dex */
public class Qn<V, M extends Fn> implements Fn {
    public final V a;
    public final M b;

    public Qn(V v, M m) {
        this.a = v;
        this.b = m;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.b.a();
    }

    public String toString() {
        return "TrimmingResult{value=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
