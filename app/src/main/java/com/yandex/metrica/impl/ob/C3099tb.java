package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fn;

/* renamed from: com.yandex.metrica.impl.ob.tb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3099tb<R, M extends Fn> implements Fn {
    public final R a;
    public final M b;

    public C3099tb(R r, M m) {
        this.a = r;
        this.b = m;
    }

    @Override // com.yandex.metrica.impl.ob.Fn
    public int a() {
        return this.b.a();
    }

    public String toString() {
        return "Result{result=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
