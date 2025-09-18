package defpackage;

/* renamed from: Cs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0230Cs {
    public final C0074As a;
    public final int b;

    public C0230Cs(C0074As c0074As, int i) {
        this.a = c0074As;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0230Cs)) {
            return false;
        }
        C0230Cs c0230Cs = (C0230Cs) obj;
        return O90.a(this.a, c0230Cs.a) && this.b == c0230Cs.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
