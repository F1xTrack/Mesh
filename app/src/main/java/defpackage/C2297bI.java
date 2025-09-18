package defpackage;

/* renamed from: bI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297bI {
    public final String a;
    public final String b;
    public final String c;

    public C2297bI(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2297bI.class != obj.getClass()) {
            return false;
        }
        C2297bI c2297bI = (C2297bI) obj;
        return AbstractC0277Dh1.a(this.a, c2297bI.a) && AbstractC0277Dh1.a(this.b, c2297bI.b) && AbstractC0277Dh1.a(this.c, c2297bI.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
