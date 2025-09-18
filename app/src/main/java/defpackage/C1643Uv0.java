package defpackage;

/* renamed from: Uv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1643Uv0 {
    public final char a;
    public final String b;
    public final boolean c;

    public C1643Uv0(char c, String str, boolean z) {
        this.a = c;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1643Uv0)) {
            return false;
        }
        C1643Uv0 c1643Uv0 = (C1643Uv0) obj;
        return this.a == c1643Uv0.a && O90.a(this.b, c1643Uv0.b) && this.c == c1643Uv0.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return iHashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notation(character=");
        sb.append(this.a);
        sb.append(", characterSet=");
        sb.append(this.b);
        sb.append(", isOptional=");
        return AbstractC8235ym.m(sb, this.c, ")");
    }
}
