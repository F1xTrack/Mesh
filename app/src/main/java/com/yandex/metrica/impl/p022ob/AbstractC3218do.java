package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.do */
/* loaded from: classes2.dex */
public abstract class AbstractC3218do<T> {

    /* renamed from: a */
    public final T f23282a;

    public AbstractC3218do(T t) {
        this.f23282a = t;
    }

    /* renamed from: a */
    public abstract boolean mo15520a(AbstractC3218do<T> abstractC3218do);

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3218do) {
            try {
                return mo15520a((AbstractC3218do) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
