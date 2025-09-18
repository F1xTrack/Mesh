package com.yandex.metrica.impl.p022ob;

import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.En */
/* loaded from: classes2.dex */
public class C2590En implements InterfaceC2615Fn {

    /* renamed from: a */
    public final int f21158a;

    public C2590En(int i) {
        this.f21158a = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2615Fn
    /* renamed from: a */
    public int mo14051a() {
        return this.f21158a;
    }

    public String toString() {
        return AbstractC7222ym.m26235l(new StringBuilder("BytesTruncatedInfo{bytesTruncated="), this.f21158a, '}');
    }

    /* renamed from: a */
    public static InterfaceC2615Fn m14050a(InterfaceC2615Fn... interfaceC2615FnArr) {
        int iMo14051a = 0;
        for (InterfaceC2615Fn interfaceC2615Fn : interfaceC2615FnArr) {
            if (interfaceC2615Fn != null) {
                iMo14051a = interfaceC2615Fn.mo14051a() + iMo14051a;
            }
        }
        return new C2590En(iMo14051a);
    }
}
