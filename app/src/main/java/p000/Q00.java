package p000;

/* loaded from: classes2.dex */
public final class Q00 {

    /* renamed from: a */
    public final int f9395a;

    /* renamed from: b */
    public float f9396b;

    /* renamed from: c */
    public float f9397c;

    /* renamed from: d */
    public float f9398d;

    /* renamed from: e */
    public float f9399e;

    public Q00(int i, float f, float f2, float f3, float f4) {
        this.f9395a = i;
        this.f9396b = f;
        this.f9397c = f2;
        this.f9398d = f3;
        this.f9399e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q00)) {
            return false;
        }
        Q00 q00 = (Q00) obj;
        return this.f9395a == q00.f9395a && Float.compare(this.f9396b, q00.f9396b) == 0 && Float.compare(this.f9397c, q00.f9397c) == 0 && Float.compare(this.f9398d, q00.f9398d) == 0 && Float.compare(this.f9399e, q00.f9399e) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9399e) + ((Float.floatToIntBits(this.f9398d) + ((Float.floatToIntBits(this.f9397c) + ((Float.floatToIntBits(this.f9396b) + (this.f9395a * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PointerData(pointerId=" + this.f9395a + ", x=" + this.f9396b + ", y=" + this.f9397c + ", absoluteX=" + this.f9398d + ", absoluteY=" + this.f9399e + ")";
    }
}
