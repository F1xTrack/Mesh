package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.pl */
/* loaded from: classes2.dex */
public class C3527pl implements InterfaceC3320hm {

    /* renamed from: a */
    private final Pattern f24514a;

    public C3527pl(Pattern pattern) {
        this.f24514a = pattern;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public boolean mo13972a(Object obj) {
        return this.f24514a.matcher((String) obj).matches();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public C3037Wl.b mo13971a() {
        return C3037Wl.b.BAD_REGEXP_MATCHED;
    }
}
