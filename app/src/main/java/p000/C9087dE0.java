package p000;

/* renamed from: dE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9087dE0 {

    /* renamed from: a */
    public final String f25889a;

    /* renamed from: b */
    public final String f25890b;

    /* renamed from: c */
    public final String f25891c;

    /* renamed from: d */
    public final String f25892d;

    /* renamed from: e */
    public final String f25893e;

    public C9087dE0(String str, String str2, String str3, String str4, String str5) {
        this.f25889a = str;
        this.f25890b = str2;
        this.f25891c = str3;
        this.f25892d = str4;
        this.f25893e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9087dE0)) {
            return false;
        }
        C9087dE0 c9087dE0 = (C9087dE0) obj;
        return AbstractC7485Dh1.m1812a(this.f25889a, c9087dE0.f25889a) && AbstractC7485Dh1.m1812a(this.f25890b, c9087dE0.f25890b) && AbstractC7485Dh1.m1812a(this.f25891c, c9087dE0.f25891c) && AbstractC7485Dh1.m1812a(this.f25892d, c9087dE0.f25892d) && AbstractC7485Dh1.m1812a(this.f25893e, c9087dE0.f25893e);
    }

    public final int hashCode() {
        String str = this.f25889a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25890b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25891c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f25892d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f25893e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
