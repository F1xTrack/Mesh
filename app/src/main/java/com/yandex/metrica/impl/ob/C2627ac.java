package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2627ac {
    public final a a;
    public final String b;
    public final Boolean c;

    /* renamed from: com.yandex.metrica.impl.ob.ac$a */
    public enum a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C2627ac(a aVar, String str, Boolean bool) {
        this.a = aVar;
        this.b = str;
        this.c = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.a + ", advId='" + this.b + "', limitedAdTracking=" + this.c + '}';
    }
}
