package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2669c4 {
    private final String a;
    private final String b;

    public C2669c4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.a + "_" + U2.a(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2669c4 c2669c4 = (C2669c4) obj;
        String str = this.a;
        if (str == null ? c2669c4.a != null : !str.equals(c2669c4.a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = c2669c4.b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.a + "_" + this.b;
    }
}
