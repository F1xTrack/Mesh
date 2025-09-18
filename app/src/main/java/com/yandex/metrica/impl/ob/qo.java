package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class qo<T> implements uo<T> {
    private final String a;

    public qo(String str) {
        this.a = str;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(T t) {
        if (t != null) {
            return so.a(this);
        }
        return so.a(this, this.a + " is null.");
    }
}
