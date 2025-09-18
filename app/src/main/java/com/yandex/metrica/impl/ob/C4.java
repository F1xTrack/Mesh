package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;

/* loaded from: classes2.dex */
public class C4 {
    private final String a;
    private final String b;
    private final Integer c;
    private final String d;
    private final com.yandex.metrica.c e;

    public C4(String str, String str2, Integer num, String str3, com.yandex.metrica.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = cVar;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public Integer c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public com.yandex.metrica.c e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4.class != obj.getClass()) {
            return false;
        }
        C4 c4 = (C4) obj;
        String str = this.a;
        if (str == null ? c4.a != null : !str.equals(c4.a)) {
            return false;
        }
        if (!this.b.equals(c4.b)) {
            return false;
        }
        Integer num = this.c;
        if (num == null ? c4.c != null : !num.equals(c4.c)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null ? c4.d == null : str2.equals(c4.d)) {
            return this.e == c4.e;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iE = AbstractC1705Vq.e((str != null ? str.hashCode() : 0) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iE + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ClientDescription{mApiKey='" + this.a + "', mPackageName='" + this.b + "', mProcessID=" + this.c + ", mProcessSessionID='" + this.d + "', mReporterType=" + this.e + '}';
    }

    public static C4 a(T3 t3) {
        return new C4(t3.b().a(), t3.a().f(), t3.a().g(), t3.a().h(), com.yandex.metrica.c.a(t3.b().a.getAsString("CFG_REPORTER_TYPE")));
    }
}
