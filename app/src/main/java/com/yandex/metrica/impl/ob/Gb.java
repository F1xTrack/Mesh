package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceReferrer;

/* loaded from: classes2.dex */
public class Gb {
    public final String a;
    public final String b;
    public final Hb c;

    public Gb(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new Hb(eCommerceReferrer.getScreen()));
    }

    public String toString() {
        return "ReferrerWrapper{type='" + this.a + "', identifier='" + this.b + "', screen=" + this.c + '}';
    }

    public Gb(String str, String str2, Hb hb) {
        this.a = str;
        this.b = str2;
        this.c = hb;
    }
}
