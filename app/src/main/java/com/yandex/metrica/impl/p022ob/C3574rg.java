package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.rg */
/* loaded from: classes2.dex */
public class C3574rg implements InterfaceC3660uo<Void> {

    /* renamed from: a */
    private final C3626tg f24617a;

    public C3574rg(C3626tg c3626tg) {
        this.f24617a = c3626tg;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(Void r1) {
        this.f24617a.getClass();
        return C3405l3.m16360h() ? C3608so.m16802a(this) : C3608so.m16803a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }

    /* renamed from: a */
    public C3608so m16693a() {
        this.f24617a.getClass();
        if (C3405l3.m16360h()) {
            return C3608so.m16802a(this);
        }
        return C3608so.m16803a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }
}
