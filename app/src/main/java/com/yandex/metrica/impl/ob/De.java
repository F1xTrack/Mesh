package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Be;
import com.yandex.metrica.impl.ob.C2781gg;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class De implements InterfaceC2725ea<Be, C2781gg> {
    private final Me a;
    private final C3257ze b;

    public De() {
        this(new Me(), new C3257ze());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Be a(C2781gg c2781gg) {
        C2781gg c2781gg2 = c2781gg;
        ArrayList arrayList = new ArrayList(c2781gg2.c.length);
        for (C2781gg.b bVar : c2781gg2.c) {
            arrayList.add(this.b.a(bVar));
        }
        C2781gg.a aVar = c2781gg2.b;
        return new Be(aVar == null ? this.a.a(new C2781gg.a()) : this.a.a(aVar), arrayList);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2781gg b(Be be) {
        Be be2 = be;
        C2781gg c2781gg = new C2781gg();
        c2781gg.b = this.a.b(be2.a);
        c2781gg.c = new C2781gg.b[be2.b.size()];
        Iterator<Be.a> it = be2.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c2781gg.c[i] = this.b.b(it.next());
            i++;
        }
        return c2781gg;
    }

    public De(Me me2, C3257ze c3257ze) {
        this.a = me2;
        this.b = c3257ze;
    }
}
