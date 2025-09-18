package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class Pk implements InterfaceC2812hm {
    private final Pattern a;

    public Pk(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public boolean a(Object obj) {
        return !this.a.matcher((String) obj).matches();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public Wl.b a() {
        return Wl.b.REGEXP_NOT_MATCHED;
    }
}
