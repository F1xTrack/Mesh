package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.InterfaceC3354j4;
import com.yandex.metrica.impl.p022ob.InterfaceC3432m4;

/* renamed from: com.yandex.metrica.impl.ob.s4 */
/* loaded from: classes2.dex */
public class C3588s4<COMPONENT extends InterfaceC3432m4 & InterfaceC3354j4> implements InterfaceC3302h4<C3562r4> {

    /* renamed from: a */
    private final InterfaceC2671I4<COMPONENT> f24649a;

    public C3588s4(InterfaceC2671I4<COMPONENT> interfaceC2671I4) {
        this.f24649a = interfaceC2671I4;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3302h4
    /* renamed from: a */
    public InterfaceC3406l4 mo15600a(Context context, C3172c4 c3172c4, C3044X3 c3044x3) {
        return new C3562r4(context, c3172c4, c3044x3, new C3692w4(c3044x3.f22749b), this.f24649a, new C3198d4(), C2610Fi.m14135a());
    }
}
