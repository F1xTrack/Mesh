package defpackage;

/* renamed from: Td */
/* loaded from: classes.dex */
public final class C1510Td {
    public final String a;
    public final String b;

    public C1510Td(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1510Td)) {
            return false;
        }
        C1510Td c1510Td = (C1510Td) obj;
        return this.a.equals(c1510Td.a) && this.b.equals(c1510Td.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return AbstractC1705Vq.l(sb, this.b, "}");
    }
}
