package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class On<T> implements Pn<T> {
    private final Pn<T> a;

    public On(Pn<T> pn, T t) {
        this.a = pn;
    }

    @Override // com.yandex.metrica.impl.ob.Pn
    public T a(T t) {
        return t != this.a.a(t) ? "<truncated data was not sent, see METRIKALIB-4568>" : t;
    }
}
