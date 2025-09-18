package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.tc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3100tc extends Cd<Ec> {
    private final String c;

    public C3100tc(Oc oc, String str) {
        this(oc, str, new R2());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3075sc
    public boolean a(Object obj) {
        Dc dc = ((Ec) obj).b;
        return dc != null && a(dc.b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3075sc
    public boolean b(Object obj) {
        return ((Ec) obj).a.a;
    }

    public C3100tc(Oc oc, String str, R2 r2) {
        super(oc, r2);
        this.c = str;
    }

    @Override // com.yandex.metrica.impl.ob.Cd
    public String a() {
        return this.c;
    }
}
