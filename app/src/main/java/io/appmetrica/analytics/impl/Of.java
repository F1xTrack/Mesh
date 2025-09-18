package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* loaded from: classes2.dex */
public final class Of {
    public final String a;
    public final String b;
    public final C4866si c;

    public Of(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C4866si(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.a + "', identifier='" + this.b + "', screen=" + this.c + '}';
    }

    public Of(String str, String str2, C4866si c4866si) {
        this.a = str;
        this.b = str2;
        this.c = c4866si;
    }
}
