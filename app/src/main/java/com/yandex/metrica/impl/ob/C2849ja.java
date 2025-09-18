package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import defpackage.O90;

/* renamed from: com.yandex.metrica.impl.ob.ja, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2849ja implements InterfaceC2725ea<C3131ui, C2880kg.h> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.h b(C3131ui c3131ui) {
        C2880kg.h hVar = new C2880kg.h();
        hVar.b = c3131ui.c();
        hVar.c = c3131ui.b();
        hVar.d = c3131ui.a();
        hVar.f = c3131ui.e();
        hVar.e = c3131ui.d();
        return hVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C3131ui a(C2880kg.h hVar) {
        String str = hVar.b;
        O90.e(str, "nano.url");
        return new C3131ui(str, hVar.c, hVar.d, hVar.e, hVar.f);
    }
}
