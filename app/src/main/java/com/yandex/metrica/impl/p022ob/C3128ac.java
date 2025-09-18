package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.ac */
/* loaded from: classes2.dex */
public class C3128ac {

    /* renamed from: a */
    public final a f23040a;

    /* renamed from: b */
    public final String f23041b;

    /* renamed from: c */
    public final Boolean f23042c;

    /* renamed from: com.yandex.metrica.impl.ob.ac$a */
    public enum a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C3128ac(a aVar, String str, Boolean bool) {
        this.f23040a = aVar;
        this.f23041b = str;
        this.f23042c = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.f23040a + ", advId='" + this.f23041b + "', limitedAdTracking=" + this.f23042c + '}';
    }
}
