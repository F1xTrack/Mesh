package p000;

/* renamed from: bI */
/* loaded from: classes.dex */
public final class C1776bI {

    /* renamed from: a */
    public final String f16929a;

    /* renamed from: b */
    public final String f16930b;

    /* renamed from: c */
    public final String f16931c;

    public C1776bI(String str, String str2, String str3) {
        this.f16929a = str;
        this.f16930b = str2;
        this.f16931c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1776bI.class != obj.getClass()) {
            return false;
        }
        C1776bI c1776bI = (C1776bI) obj;
        return AbstractC7485Dh1.m1812a(this.f16929a, c1776bI.f16929a) && AbstractC7485Dh1.m1812a(this.f16930b, c1776bI.f16930b) && AbstractC7485Dh1.m1812a(this.f16931c, c1776bI.f16931c);
    }

    public final int hashCode() {
        int iHashCode = this.f16929a.hashCode() * 31;
        String str = this.f16930b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16931c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
