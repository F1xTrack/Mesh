package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class Jk {
    private final List<Object> a;

    public Jk(List<Object> list) {
        this.a = list;
    }

    public Wl.b a(String str) {
        Iterator<Object> it = this.a.iterator();
        while (it.hasNext()) {
            InterfaceC2812hm interfaceC2812hm = (InterfaceC2812hm) it.next();
            if (interfaceC2812hm.a(str)) {
                return interfaceC2812hm.a();
            }
        }
        return null;
    }
}
