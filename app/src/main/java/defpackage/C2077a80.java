package defpackage;

/* renamed from: a80, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2077a80 {
    public final Object a;
    public final C6112nd0 b;
    public final C6112nd0 c;
    public final C6112nd0 d;
    public final String e;
    public final C0074As f;

    public C2077a80(Object obj, C6112nd0 c6112nd0, C6112nd0 c6112nd02, C6112nd0 c6112nd03, String str, C0074As c0074As) {
        O90.f(str, "filePath");
        this.a = obj;
        this.b = c6112nd0;
        this.c = c6112nd02;
        this.d = c6112nd03;
        this.e = str;
        this.f = c0074As;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2077a80)) {
            return false;
        }
        C2077a80 c2077a80 = (C2077a80) obj;
        return this.a.equals(c2077a80.a) && O90.a(this.b, c2077a80.b) && O90.a(this.c, c2077a80.c) && this.d.equals(c2077a80.d) && O90.a(this.e, c2077a80.e) && this.f.equals(c2077a80.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C6112nd0 c6112nd0 = this.b;
        int iHashCode2 = (iHashCode + (c6112nd0 == null ? 0 : c6112nd0.hashCode())) * 31;
        C6112nd0 c6112nd02 = this.c;
        return this.f.hashCode() + AbstractC1705Vq.e((this.d.hashCode() + ((iHashCode2 + (c6112nd02 != null ? c6112nd02.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
