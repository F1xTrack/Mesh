package p000;

/* renamed from: Tj1 */
/* loaded from: classes.dex */
public final class C8321Tj1 {

    /* renamed from: e */
    public static final C8321Tj1 f11486e = new C8321Tj1(0, 0, 0, 1.0f);

    /* renamed from: a */
    public final int f11487a;

    /* renamed from: b */
    public final int f11488b;

    /* renamed from: c */
    public final int f11489c;

    /* renamed from: d */
    public final float f11490d;

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(2);
        AbstractC7485Dh1.m1797L(3);
    }

    public C8321Tj1(int i, int i2, int i3, float f) {
        this.f11487a = i;
        this.f11488b = i2;
        this.f11489c = i3;
        this.f11490d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8321Tj1)) {
            return false;
        }
        C8321Tj1 c8321Tj1 = (C8321Tj1) obj;
        return this.f11487a == c8321Tj1.f11487a && this.f11488b == c8321Tj1.f11488b && this.f11489c == c8321Tj1.f11489c && this.f11490d == c8321Tj1.f11490d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f11490d) + ((((((217 + this.f11487a) * 31) + this.f11488b) * 31) + this.f11489c) * 31);
    }
}
