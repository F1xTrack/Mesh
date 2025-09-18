package com.yandex.metrica.ecommerce;

/* loaded from: classes2.dex */
public class ECommerceReferrer {

    /* renamed from: a */
    public String f20806a;

    /* renamed from: b */
    public String f20807b;

    /* renamed from: c */
    public ECommerceScreen f20808c;

    public String getIdentifier() {
        return this.f20807b;
    }

    public ECommerceScreen getScreen() {
        return this.f20808c;
    }

    public String getType() {
        return this.f20806a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f20807b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f20808c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f20806a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f20806a + "', identifier='" + this.f20807b + "', screen=" + this.f20808c + '}';
    }
}
