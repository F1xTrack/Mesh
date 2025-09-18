package com.yandex.metrica.impl.ob;

import defpackage.InterfaceC0703It1;

/* renamed from: com.yandex.metrica.impl.ob.vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3160vh implements InterfaceC2822i7 {
    private final InterfaceC0703It1 a;

    public C3160vh(InterfaceC0703It1 interfaceC0703It1) {
        this.a = interfaceC0703It1;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2822i7
    public void a(Throwable th, C2722e7 c2722e7) {
        this.a.reportException(th == null ? "" : th.getClass().getName(), th);
    }
}
