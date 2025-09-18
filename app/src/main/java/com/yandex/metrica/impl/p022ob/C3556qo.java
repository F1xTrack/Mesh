package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.qo */
/* loaded from: classes2.dex */
public class C3556qo<T> implements InterfaceC3660uo<T> {

    /* renamed from: a */
    private final String f24568a;

    public C3556qo(String str) {
        this.f24568a = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(T t) {
        if (t != null) {
            return C3608so.m16802a(this);
        }
        return C3608so.m16803a(this, this.f24568a + " is null.");
    }
}
