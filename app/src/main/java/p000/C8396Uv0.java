package p000;

/* renamed from: Uv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8396Uv0 {

    /* renamed from: a */
    public final char f12201a;

    /* renamed from: b */
    public final String f12202b;

    /* renamed from: c */
    public final boolean f12203c;

    public C8396Uv0(char c, String str, boolean z) {
        this.f12201a = c;
        this.f12202b = str;
        this.f12203c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8396Uv0)) {
            return false;
        }
        C8396Uv0 c8396Uv0 = (C8396Uv0) obj;
        return this.f12201a == c8396Uv0.f12201a && O90.m5963a(this.f12202b, c8396Uv0.f12202b) && this.f12203c == c8396Uv0.f12203c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.f12201a * 31;
        String str = this.f12202b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f12203c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return iHashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notation(character=");
        sb.append(this.f12201a);
        sb.append(", characterSet=");
        sb.append(this.f12202b);
        sb.append(", isOptional=");
        return AbstractC7222ym.m26236m(sb, this.f12203c, ")");
    }
}
