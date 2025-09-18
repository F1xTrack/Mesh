package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;

/* renamed from: com.yandex.metrica.impl.ob.ha */
/* loaded from: classes2.dex */
public class C3308ha implements InterfaceC3230ea {

    /* renamed from: a */
    private final C3282ga f23571a;

    public C3308ha() {
        this(new C3282ga());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(Object obj) {
        C3392kg.f fVar = (C3392kg.f) obj;
        return new C3051Xa(m16038a(fVar.f23989b), m16038a(fVar.f23990c), m16038a(fVar.f23991d));
    }

    public C3308ha(C3282ga c3282ga) {
        this.f23571a = c3282ga;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.f mo13847b(C3051Xa c3051Xa) {
        C3392kg.f fVar = new C3392kg.f();
        fVar.f23989b = m16039a(c3051Xa.f22781a);
        fVar.f23990c = m16039a(c3051Xa.f22782b);
        fVar.f23991d = m16039a(c3051Xa.f22783c);
        return fVar;
    }

    /* renamed from: a */
    public C3051Xa m16040a(C3392kg.f fVar) {
        return new C3051Xa(m16038a(fVar.f23989b), m16038a(fVar.f23990c), m16038a(fVar.f23991d));
    }

    /* renamed from: a */
    private C3392kg.e m16039a(C3026Wa c3026Wa) {
        if (c3026Wa == null) {
            return null;
        }
        this.f23571a.getClass();
        C3392kg.e eVar = new C3392kg.e();
        eVar.f23987b = c3026Wa.f22681a;
        eVar.f23988c = c3026Wa.f22682b;
        return eVar;
    }

    /* renamed from: a */
    private C3026Wa m16038a(C3392kg.e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.f23571a.mo13846a(eVar);
    }
}
