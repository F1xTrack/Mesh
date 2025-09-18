package io.appmetrica.analytics.ecommerce;

/* loaded from: classes2.dex */
public class ECommerceReferrer {

    /* renamed from: a */
    private String f29793a;

    /* renamed from: b */
    private String f29794b;

    /* renamed from: c */
    private ECommerceScreen f29795c;

    public String getIdentifier() {
        return this.f29794b;
    }

    public ECommerceScreen getScreen() {
        return this.f29795c;
    }

    public String getType() {
        return this.f29793a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f29794b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f29795c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f29793a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f29793a + "', identifier='" + this.f29794b + "', screen=" + this.f29795c + '}';
    }
}
