package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ValidationException;

/* renamed from: com.yandex.metrica.impl.ob.ro */
/* loaded from: classes2.dex */
public class C3582ro<T> implements InterfaceC3660uo<T> {

    /* renamed from: a */
    private final InterfaceC3660uo<T> f24627a;

    public C3582ro(InterfaceC3660uo<T> interfaceC3660uo) {
        this.f24627a = interfaceC3660uo;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(T t) {
        C3608so c3608soMo14391a = this.f24627a.mo14391a(t);
        if (c3608soMo14391a.m16805b()) {
            return c3608soMo14391a;
        }
        throw new ValidationException(c3608soMo14391a.m16804a());
    }
}
