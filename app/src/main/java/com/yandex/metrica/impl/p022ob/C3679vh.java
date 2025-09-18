package com.yandex.metrica.impl.p022ob;

import p000.InterfaceC7769It1;

/* renamed from: com.yandex.metrica.impl.ob.vh */
/* loaded from: classes2.dex */
public class C3679vh implements InterfaceC3331i7 {

    /* renamed from: a */
    private final InterfaceC7769It1 f25090a;

    public C3679vh(InterfaceC7769It1 interfaceC7769It1) {
        this.f25090a = interfaceC7769It1;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3331i7
    /* renamed from: a */
    public void mo15983a(Throwable th, C3227e7 c3227e7) {
        this.f25090a.reportException(th == null ? "" : th.getClass().getName(), th);
    }
}
