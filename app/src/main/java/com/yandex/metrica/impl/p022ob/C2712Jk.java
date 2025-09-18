package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Jk */
/* loaded from: classes2.dex */
class C2712Jk {

    /* renamed from: a */
    private final List<Object> f21558a;

    public C2712Jk(List<Object> list) {
        this.f21558a = list;
    }

    /* renamed from: a */
    public C3037Wl.b m14445a(String str) {
        Iterator<Object> it = this.f21558a.iterator();
        while (it.hasNext()) {
            InterfaceC3320hm interfaceC3320hm = (InterfaceC3320hm) it.next();
            if (interfaceC3320hm.mo13972a(str)) {
                return interfaceC3320hm.mo13971a();
            }
        }
        return null;
    }
}
