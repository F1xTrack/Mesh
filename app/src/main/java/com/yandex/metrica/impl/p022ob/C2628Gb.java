package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.ecommerce.ECommerceReferrer;

/* renamed from: com.yandex.metrica.impl.ob.Gb */
/* loaded from: classes2.dex */
public class C2628Gb {

    /* renamed from: a */
    public final String f21302a;

    /* renamed from: b */
    public final String f21303b;

    /* renamed from: c */
    public final C2653Hb f21304c;

    public C2628Gb(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C2653Hb(eCommerceReferrer.getScreen()));
    }

    public String toString() {
        return "ReferrerWrapper{type='" + this.f21302a + "', identifier='" + this.f21303b + "', screen=" + this.f21304c + '}';
    }

    public C2628Gb(String str, String str2, C2653Hb c2653Hb) {
        this.f21302a = str;
        this.f21303b = str2;
        this.f21304c = c2653Hb;
    }
}
