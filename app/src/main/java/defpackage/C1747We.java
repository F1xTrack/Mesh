package defpackage;

/* renamed from: We, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1747We {
    public static final C1747We d = new C1747We(0, 0, 0);
    public static final C1747We e = new C1747We(1, 3, 2);
    public static final C1747We f = new C1747We(6, 7, 1);
    public static final C1747We g = new C1747We(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public C1747We(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1747We)) {
            return false;
        }
        C1747We c1747We = (C1747We) obj;
        return this.a == c1747We.a && this.b == c1747We.b && this.c == c1747We.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return AbstractC1705Vq.j(sb, this.c, "}");
    }
}
