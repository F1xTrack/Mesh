package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.ja */
/* loaded from: classes2.dex */
public final class C3360ja implements InterfaceC3230ea<C3654ui, C3392kg.h> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.h mo13847b(C3654ui c3654ui) {
        C3392kg.h hVar = new C3392kg.h();
        hVar.f23993b = c3654ui.m16927c();
        hVar.f23994c = c3654ui.m16926b();
        hVar.f23995d = c3654ui.m16925a();
        hVar.f23997f = c3654ui.m16929e();
        hVar.f23996e = c3654ui.m16928d();
        return hVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3654ui mo13846a(C3392kg.h hVar) {
        String str = hVar.f23993b;
        O90.m5967e(str, "nano.url");
        return new C3654ui(str, hVar.f23994c, hVar.f23995d, hVar.f23996e, hVar.f23997f);
    }
}
