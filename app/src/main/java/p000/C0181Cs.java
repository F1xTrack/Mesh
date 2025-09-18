package p000;

/* renamed from: Cs */
/* loaded from: classes2.dex */
public final class C0181Cs {

    /* renamed from: a */
    public final C0055As f1732a;

    /* renamed from: b */
    public final int f1733b;

    public C0181Cs(C0055As c0055As, int i) {
        this.f1732a = c0055As;
        this.f1733b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0181Cs)) {
            return false;
        }
        C0181Cs c0181Cs = (C0181Cs) obj;
        return O90.m5963a(this.f1732a, c0181Cs.f1732a) && this.f1733b == c0181Cs.f1733b;
    }

    public final int hashCode() {
        return (this.f1732a.hashCode() * 31) + this.f1733b;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.f1733b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.f1732a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
