package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.Pk */
/* loaded from: classes2.dex */
public class C2862Pk implements InterfaceC3320hm {

    /* renamed from: a */
    private final Pattern f21963a;

    public C2862Pk(Pattern pattern) {
        this.f21963a = pattern;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public boolean mo13972a(Object obj) {
        return !this.f21963a.matcher((String) obj).matches();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public C3037Wl.b mo13971a() {
        return C3037Wl.b.REGEXP_NOT_MATCHED;
    }
}
