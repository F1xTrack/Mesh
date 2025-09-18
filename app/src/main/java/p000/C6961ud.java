package p000;

/* renamed from: ud */
/* loaded from: classes.dex */
public final class C6961ud {

    /* renamed from: a */
    public final int f43776a;

    /* renamed from: b */
    public final int f43777b;

    /* renamed from: c */
    public final C0300El f43778c;

    public C6961ud(int i, int i2, C0300El c0300El) {
        this.f43776a = i;
        this.f43777b = i2;
        this.f43778c = c0300El;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6961ud)) {
            return false;
        }
        C6961ud c6961ud = (C6961ud) obj;
        return this.f43776a == c6961ud.f43776a && this.f43777b == c6961ud.f43777b && this.f43778c.equals(c6961ud.f43778c);
    }

    public final int hashCode() {
        return ((((this.f43776a ^ 1000003) * 1000003) ^ this.f43777b) * 1000003) ^ this.f43778c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f43776a + ", rotationDegrees=" + this.f43777b + ", completer=" + this.f43778c + "}";
    }
}
