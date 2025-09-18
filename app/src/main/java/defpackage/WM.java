package defpackage;

/* loaded from: classes2.dex */
public final class WM {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public WM(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WM)) {
            return false;
        }
        WM wm = (WM) obj;
        return Float.compare(this.a, wm.a) == 0 && Float.compare(this.b, wm.b) == 0 && Float.compare(this.c, wm.c) == 0 && Float.compare(this.d, wm.d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + ((Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EdgeInsets(top=" + this.a + ", right=" + this.b + ", bottom=" + this.c + ", left=" + this.d + ")";
    }
}
