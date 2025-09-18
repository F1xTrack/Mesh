package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2506Be;
import com.yandex.metrica.impl.p022ob.C3288gg;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.De */
/* loaded from: classes2.dex */
public class C2556De implements InterfaceC3230ea<C2506Be, C3288gg> {

    /* renamed from: a */
    private final C2781Me f21024a;

    /* renamed from: b */
    private final C3780ze f21025b;

    public C2556De() {
        this(new C2781Me(), new C3780ze());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2506Be mo13846a(C3288gg c3288gg) {
        C3288gg c3288gg2 = c3288gg;
        ArrayList arrayList = new ArrayList(c3288gg2.f23516c.length);
        for (C3288gg.b bVar : c3288gg2.f23516c) {
            arrayList.add(this.f21025b.mo13846a(bVar));
        }
        C3288gg.a aVar = c3288gg2.f23515b;
        return new C2506Be(aVar == null ? this.f21024a.mo13846a(new C3288gg.a()) : this.f21024a.mo13846a(aVar), arrayList);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3288gg mo13847b(C2506Be c2506Be) {
        C2506Be c2506Be2 = c2506Be;
        C3288gg c3288gg = new C3288gg();
        c3288gg.f23515b = this.f21024a.mo13847b(c2506Be2.f20930a);
        c3288gg.f23516c = new C3288gg.b[c2506Be2.f20931b.size()];
        Iterator<C2506Be.a> it = c2506Be2.f20931b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c3288gg.f23516c[i] = this.f21025b.mo13847b(it.next());
            i++;
        }
        return c3288gg;
    }

    public C2556De(C2781Me c2781Me, C3780ze c3780ze) {
        this.f21024a = c2781Me;
        this.f21025b = c3780ze;
    }
}
