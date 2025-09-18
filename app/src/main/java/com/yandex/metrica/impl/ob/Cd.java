package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public abstract class Cd<T> implements InterfaceC3075sc<T> {
    private final R2 a;
    private final Oc b;

    public Cd(Oc oc, R2 r2) {
        this.b = oc;
        this.a = r2;
    }

    public abstract String a();

    public boolean a(long j) {
        return this.a.b(this.b.a(), j, "last " + a() + " scan attempt");
    }
}
