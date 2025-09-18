package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* renamed from: io.appmetrica.analytics.impl.Of */
/* loaded from: classes2.dex */
public final class C4712Of {

    /* renamed from: a */
    public final String f30557a;

    /* renamed from: b */
    public final String f30558b;

    /* renamed from: c */
    public final C5452si f30559c;

    public C4712Of(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C5452si(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f30557a + "', identifier='" + this.f30558b + "', screen=" + this.f30559c + '}';
    }

    public C4712Of(String str, String str2, C5452si c5452si) {
        this.f30557a = str;
        this.f30558b = str2;
        this.f30559c = c5452si;
    }
}
