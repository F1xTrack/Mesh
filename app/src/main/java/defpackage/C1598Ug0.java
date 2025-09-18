package defpackage;

/* renamed from: Ug0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1598Ug0 {
    public final String a;
    public final String b;

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
    }

    public C1598Ug0(String str, String str2) {
        this.a = AbstractC0277Dh1.R(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1598Ug0.class != obj.getClass()) {
            return false;
        }
        C1598Ug0 c1598Ug0 = (C1598Ug0) obj;
        return AbstractC0277Dh1.a(this.a, c1598Ug0.a) && AbstractC0277Dh1.a(this.b, c1598Ug0.b);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
