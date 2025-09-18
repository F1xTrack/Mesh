package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.InterfaceC2843j4;
import com.yandex.metrica.impl.ob.InterfaceC2918m4;

/* renamed from: com.yandex.metrica.impl.ob.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3067s4<COMPONENT extends InterfaceC2918m4 & InterfaceC2843j4> implements InterfaceC2794h4<C3042r4> {
    private final I4<COMPONENT> a;

    public C3067s4(I4<COMPONENT> i4) {
        this.a = i4;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2794h4
    public InterfaceC2893l4 a(Context context, C2669c4 c2669c4, X3 x3) {
        return new C3042r4(context, c2669c4, x3, new C3172w4(x3.b), this.a, new C2694d4(), Fi.a());
    }
}
