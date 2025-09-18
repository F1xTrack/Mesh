package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ua */
/* loaded from: classes2.dex */
public class C3646ua implements InterfaceC3230ea {

    /* renamed from: a */
    private final C3542qa f24902a;

    public C3646ua() {
        this(new C3542qa());
    }

    public C3646ua(C3542qa c3542qa) {
        this.f24902a = c3542qa;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.y mo13847b(C2580Ed c2580Ed) {
        C3392kg.y yVar = new C3392kg.y();
        yVar.f24121b = c2580Ed.f21113a;
        yVar.f24122c = c2580Ed.f21114b;
        List<C2804Nc> list = c2580Ed.f21115c;
        yVar.f24123d = list == null ? new C3392kg.y.a[0] : this.f24902a.mo13847b(list);
        return yVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2580Ed mo13846a(C3392kg.y yVar) {
        return new C2580Ed(yVar.f24121b, yVar.f24122c, C2968U2.m15247a((Object[]) yVar.f24123d) ? null : this.f24902a.mo13846a(yVar.f24123d));
    }
}
