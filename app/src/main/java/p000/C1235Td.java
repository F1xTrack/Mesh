package p000;

/* renamed from: Td */
/* loaded from: classes.dex */
public final class C1235Td {

    /* renamed from: a */
    public final String f11446a;

    /* renamed from: b */
    public final String f11447b;

    public C1235Td(String str, String str2) {
        this.f11446a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f11447b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1235Td)) {
            return false;
        }
        C1235Td c1235Td = (C1235Td) obj;
        return this.f11446a.equals(c1235Td.f11446a) && this.f11447b.equals(c1235Td.f11447b);
    }

    public final int hashCode() {
        return ((this.f11446a.hashCode() ^ 1000003) * 1000003) ^ this.f11447b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f11446a);
        sb.append(", version=");
        return AbstractC1374Vq.m8593l(sb, this.f11447b, "}");
    }
}
