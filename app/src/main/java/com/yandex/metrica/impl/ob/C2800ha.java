package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.ha, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2800ha implements InterfaceC2725ea {
    private final C2775ga a;

    public C2800ha() {
        this(new C2775ga());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(Object obj) {
        C2880kg.f fVar = (C2880kg.f) obj;
        return new Xa(a(fVar.b), a(fVar.c), a(fVar.d));
    }

    public C2800ha(C2775ga c2775ga) {
        this.a = c2775ga;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.f b(Xa xa) {
        C2880kg.f fVar = new C2880kg.f();
        fVar.b = a(xa.a);
        fVar.c = a(xa.b);
        fVar.d = a(xa.c);
        return fVar;
    }

    public Xa a(C2880kg.f fVar) {
        return new Xa(a(fVar.b), a(fVar.c), a(fVar.d));
    }

    private C2880kg.e a(Wa wa) {
        if (wa == null) {
            return null;
        }
        this.a.getClass();
        C2880kg.e eVar = new C2880kg.e();
        eVar.b = wa.a;
        eVar.c = wa.b;
        return eVar;
    }

    private Wa a(C2880kg.e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.a.a(eVar);
    }
}
