package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2631ag;

/* renamed from: com.yandex.metrica.impl.ob.xf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3208xf implements InterfaceC3004pf {
    private final Gn a;

    public C3208xf(Gn gn) {
        this.a = gn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3004pf
    public C2631ag.a a(Gf gf, C2631ag.a aVar) {
        if (gf.a() == this.a.a()) {
            if (gf.a(aVar.c, new String(aVar.b)) != null) {
                gf.a(aVar);
            }
        } else if (gf.a() < this.a.a()) {
            gf.a(aVar);
            gf.b();
        }
        return aVar;
    }
}
