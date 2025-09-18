package defpackage;

/* renamed from: ud, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7447ud {
    public final int a;
    public final int b;
    public final C0365El c;

    public C7447ud(int i, int i2, C0365El c0365El) {
        this.a = i;
        this.b = i2;
        this.c = c0365El;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7447ud)) {
            return false;
        }
        C7447ud c7447ud = (C7447ud) obj;
        return this.a == c7447ud.a && this.b == c7447ud.b && this.c.equals(c7447ud.c);
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
