package defpackage;

/* loaded from: classes.dex */
public final class TU {
    public final String a;
    public final String b;

    public TU(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TU)) {
            return false;
        }
        TU tu = (TU) obj;
        return O90.a(this.a, tu.a) && O90.a(this.b, tu.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.a);
        sb.append(", authToken=");
        return F91.v(sb, this.b, ')');
    }
}
