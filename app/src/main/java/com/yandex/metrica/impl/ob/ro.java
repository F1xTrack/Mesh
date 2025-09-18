package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ValidationException;

/* loaded from: classes2.dex */
public class ro<T> implements uo<T> {
    private final uo<T> a;

    public ro(uo<T> uoVar) {
        this.a = uoVar;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(T t) {
        so soVarA = this.a.a(t);
        if (soVarA.b()) {
            return soVarA;
        }
        throw new ValidationException(soVarA.a());
    }
}
