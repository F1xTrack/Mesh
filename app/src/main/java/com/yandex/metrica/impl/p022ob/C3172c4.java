package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.c4 */
/* loaded from: classes2.dex */
public class C3172c4 {

    /* renamed from: a */
    private final String f23172a;

    /* renamed from: b */
    private final String f23173b;

    public C3172c4(String str, String str2) {
        this.f23172a = str;
        this.f23173b = str2;
    }

    /* renamed from: a */
    public String m15700a() {
        return this.f23173b;
    }

    /* renamed from: b */
    public String m15701b() {
        return this.f23172a;
    }

    /* renamed from: c */
    public String mo15702c() {
        return this.f23172a + "_" + C2968U2.m15231a(this.f23173b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3172c4 c3172c4 = (C3172c4) obj;
        String str = this.f23172a;
        if (str == null ? c3172c4.f23172a != null : !str.equals(c3172c4.f23172a)) {
            return false;
        }
        String str2 = this.f23173b;
        String str3 = c3172c4.f23173b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f23172a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23173b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f23172a + "_" + this.f23173b;
    }
}
