package defpackage;

/* renamed from: e31 */
/* loaded from: classes2.dex */
public final class C3509e31 {
    public final String a;
    public final C1559Tt0 b;
    public final String c;
    public final String d;
    public final String e;

    public C3509e31(String str, C1559Tt0 c1559Tt0, String str2, String str3) {
        O90.f(str, "classInternalName");
        this.a = str;
        this.b = c1559Tt0;
        this.c = str2;
        this.d = str3;
        String str4 = c1559Tt0 + '(' + str2 + ')' + str3;
        O90.f(str4, "jvmDescriptor");
        this.e = str + '.' + str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3509e31)) {
            return false;
        }
        C3509e31 c3509e31 = (C3509e31) obj;
        return O90.a(this.a, c3509e31.a) && O90.a(this.b, c3509e31.b) && O90.a(this.c, c3509e31.c) && O90.a(this.d, c3509e31.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC1705Vq.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", parameters=");
        sb.append(this.c);
        sb.append(", returnType=");
        return F91.v(sb, this.d, ')');
    }
}
