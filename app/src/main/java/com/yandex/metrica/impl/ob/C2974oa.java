package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.oa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2974oa implements InterfaceC2725ea {
    private final C2949na a;

    public C2974oa() {
        this(new C2949na());
    }

    public C2974oa(C2949na c2949na) {
        this.a = c2949na;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.k.a.b b(Jc jc) {
        C2880kg.k.a.b bVar = new C2880kg.k.a.b();
        C3231yd c3231yd = jc.a;
        bVar.b = c3231yd.a;
        bVar.c = c3231yd.b;
        Hc hc = jc.b;
        if (hc != null) {
            bVar.d = this.a.b(hc);
        }
        return bVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Jc a(C2880kg.k.a.b bVar) {
        C2880kg.k.a.b.C0017a c0017a = bVar.d;
        return new Jc(new C3231yd(bVar.b, bVar.c), c0017a != null ? this.a.a(c0017a) : null);
    }
}
