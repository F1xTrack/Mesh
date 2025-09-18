package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;

/* loaded from: classes2.dex */
public class Cl implements InterfaceC2812hm {
    private final int a;

    public Cl(int i) {
        this.a = i;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public boolean a(Object obj) {
        return ((String) obj).length() > this.a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public Wl.b a() {
        return Wl.b.TEXT_TOO_LONG;
    }
}
