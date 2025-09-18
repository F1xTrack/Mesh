package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;

/* loaded from: classes2.dex */
public class Uk implements InterfaceC2812hm {
    private final String a;

    public Uk(String str) {
        this.a = str;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public boolean a(Object obj) {
        return ((String) obj).equals(this.a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public Wl.b a() {
        return Wl.b.EQUALS;
    }
}
