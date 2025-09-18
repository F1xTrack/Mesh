package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.xo */
/* loaded from: classes2.dex */
class C3738xo implements InterfaceC3660uo<Integer> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3608so mo14391a(Integer num) {
        if (num == null || num.intValue() > 0) {
            return C3608so.m16802a(this);
        }
        return C3608so.m16803a(this, "Invalid quantity value " + num);
    }
}
