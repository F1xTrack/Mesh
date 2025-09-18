package p000;

/* renamed from: e31 */
/* loaded from: classes2.dex */
public final class C9193e31 {

    /* renamed from: a */
    public final String f26519a;

    /* renamed from: b */
    public final C8340Tt0 f26520b;

    /* renamed from: c */
    public final String f26521c;

    /* renamed from: d */
    public final String f26522d;

    /* renamed from: e */
    public final String f26523e;

    public C9193e31(String str, C8340Tt0 c8340Tt0, String str2, String str3) {
        O90.m5968f(str, "classInternalName");
        this.f26519a = str;
        this.f26520b = c8340Tt0;
        this.f26521c = str2;
        this.f26522d = str3;
        String str4 = c8340Tt0 + '(' + str2 + ')' + str3;
        O90.m5968f(str4, "jvmDescriptor");
        this.f26523e = str + '.' + str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9193e31)) {
            return false;
        }
        C9193e31 c9193e31 = (C9193e31) obj;
        return O90.m5963a(this.f26519a, c9193e31.f26519a) && O90.m5963a(this.f26520b, c9193e31.f26520b) && O90.m5963a(this.f26521c, c9193e31.f26521c) && O90.m5963a(this.f26522d, c9193e31.f26522d);
    }

    public final int hashCode() {
        return this.f26522d.hashCode() + AbstractC1374Vq.m8586e((this.f26520b.hashCode() + (this.f26519a.hashCode() * 31)) * 31, 31, this.f26521c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f26519a);
        sb.append(", name=");
        sb.append(this.f26520b);
        sb.append(", parameters=");
        sb.append(this.f26521c);
        sb.append(", returnType=");
        return F91.m2539v(sb, this.f26522d, ')');
    }
}
