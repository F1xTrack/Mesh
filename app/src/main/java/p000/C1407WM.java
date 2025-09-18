package p000;

/* renamed from: WM */
/* loaded from: classes2.dex */
public final class C1407WM {

    /* renamed from: a */
    public final float f13142a;

    /* renamed from: b */
    public final float f13143b;

    /* renamed from: c */
    public final float f13144c;

    /* renamed from: d */
    public final float f13145d;

    public C1407WM(float f, float f2, float f3, float f4) {
        this.f13142a = f;
        this.f13143b = f2;
        this.f13144c = f3;
        this.f13145d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1407WM)) {
            return false;
        }
        C1407WM c1407wm = (C1407WM) obj;
        return Float.compare(this.f13142a, c1407wm.f13142a) == 0 && Float.compare(this.f13143b, c1407wm.f13143b) == 0 && Float.compare(this.f13144c, c1407wm.f13144c) == 0 && Float.compare(this.f13145d, c1407wm.f13145d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13145d) + ((Float.floatToIntBits(this.f13144c) + ((Float.floatToIntBits(this.f13143b) + (Float.floatToIntBits(this.f13142a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EdgeInsets(top=" + this.f13142a + ", right=" + this.f13143b + ", bottom=" + this.f13144c + ", left=" + this.f13145d + ")";
    }
}
