package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public abstract class D0<T> {
    private final Fm<E0, Integer> a;

    public D0() {
        Fm<E0, Integer> fm = new Fm<>(0);
        fm.a(E0.UNDEFINED, 0);
        fm.a(E0.APP, 1);
        fm.a(E0.SATELLITE, 2);
        fm.a(E0.RETAIL, 3);
        this.a = fm;
    }

    public final Fm<E0, Integer> a() {
        return this.a;
    }

    public abstract boolean a(T t, T t2);
}
