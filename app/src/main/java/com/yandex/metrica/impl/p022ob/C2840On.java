package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.On */
/* loaded from: classes2.dex */
public class C2840On<T> implements InterfaceC2865Pn<T> {

    /* renamed from: a */
    private final InterfaceC2865Pn<T> f21888a;

    public C2840On(InterfaceC2865Pn<T> interfaceC2865Pn, T t) {
        this.f21888a = interfaceC2865Pn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2865Pn
    /* renamed from: a */
    public T mo14016a(T t) {
        return t != this.f21888a.mo14016a(t) ? "<truncated data was not sent, see METRIKALIB-4568>" : t;
    }
}
