package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.ma, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2924ma implements InterfaceC2725ea {
    private final C2899la a;

    public C2924ma() {
        this(new C2899la());
    }

    public C2924ma(C2899la c2899la) {
        this.a = c2899la;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.k.a.C0015a b(Ec ec) {
        C2880kg.k.a.C0015a c0015a = new C2880kg.k.a.C0015a();
        C3231yd c3231yd = ec.a;
        c0015a.b = c3231yd.a;
        c0015a.c = c3231yd.b;
        Dc dc = ec.b;
        if (dc != null) {
            this.a.getClass();
            C2880kg.k.a.C0015a.C0016a c0016a = new C2880kg.k.a.C0015a.C0016a();
            c0016a.b = dc.a;
            c0016a.c = dc.b;
            c0015a.d = c0016a;
        }
        return c0015a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Ec a(C2880kg.k.a.C0015a c0015a) {
        Dc dc;
        C2880kg.k.a.C0015a.C0016a c0016a = c0015a.d;
        if (c0016a != null) {
            this.a.getClass();
            dc = new Dc(c0016a.b, c0016a.c);
        } else {
            dc = null;
        }
        return new Ec(new C3231yd(c0015a.b, c0015a.c), dc);
    }
}
