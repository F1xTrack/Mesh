package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.pl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3010pl implements InterfaceC2812hm {
    private final Pattern a;

    public C3010pl(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public boolean a(Object obj) {
        return this.a.matcher((String) obj).matches();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2812hm
    public Wl.b a() {
        return Wl.b.BAD_REGEXP_MATCHED;
    }
}
