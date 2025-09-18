package p000;

/* renamed from: kO0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10003kO0 {

    /* renamed from: a */
    public final float f36478a;

    /* renamed from: b */
    public final float f36479b;

    /* renamed from: c */
    public final float f36480c;

    /* renamed from: d */
    public final float f36481d;

    public C10003kO0(float f, float f2, float f3, float f4) {
        this.f36478a = f;
        this.f36479b = f2;
        this.f36480c = f3;
        this.f36481d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10003kO0)) {
            return false;
        }
        C10003kO0 c10003kO0 = (C10003kO0) obj;
        return Float.compare(this.f36478a, c10003kO0.f36478a) == 0 && Float.compare(this.f36479b, c10003kO0.f36479b) == 0 && Float.compare(this.f36480c, c10003kO0.f36480c) == 0 && Float.compare(this.f36481d, c10003kO0.f36481d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36481d) + ((Float.floatToIntBits(this.f36480c) + ((Float.floatToIntBits(this.f36479b) + (Float.floatToIntBits(this.f36478a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Rect(x=" + this.f36478a + ", y=" + this.f36479b + ", width=" + this.f36480c + ", height=" + this.f36481d + ")";
    }
}
