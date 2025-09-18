package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.la, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2899la implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(Object obj) {
        C2880kg.k.a.C0015a.C0016a c0016a = (C2880kg.k.a.C0015a.C0016a) obj;
        return new Dc(c0016a.b, c0016a.c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object b(Object obj) {
        Dc dc = (Dc) obj;
        C2880kg.k.a.C0015a.C0016a c0016a = new C2880kg.k.a.C0015a.C0016a();
        c0016a.b = dc.a;
        c0016a.c = dc.b;
        return c0016a;
    }
}
