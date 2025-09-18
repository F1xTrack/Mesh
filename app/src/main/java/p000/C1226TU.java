package p000;

/* renamed from: TU */
/* loaded from: classes.dex */
public final class C1226TU {

    /* renamed from: a */
    public final String f11394a;

    /* renamed from: b */
    public final String f11395b;

    public C1226TU(String str, String str2) {
        this.f11394a = str;
        this.f11395b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1226TU)) {
            return false;
        }
        C1226TU c1226tu = (C1226TU) obj;
        return O90.m5963a(this.f11394a, c1226tu.f11394a) && O90.m5963a(this.f11395b, c1226tu.f11395b);
    }

    public final int hashCode() {
        String str = this.f11394a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11395b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f11394a);
        sb.append(", authToken=");
        return F91.m2539v(sb, this.f11395b, ')');
    }
}
