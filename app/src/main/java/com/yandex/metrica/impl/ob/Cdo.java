package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.do, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class Cdo<T> {
    public final T a;

    public Cdo(T t) {
        this.a = t;
    }

    public abstract boolean a(Cdo<T> cdo);

    public boolean equals(Object obj) {
        if (obj instanceof Cdo) {
            try {
                return a((Cdo) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
