package p000;

/* renamed from: a21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8673a21 {

    /* renamed from: c */
    public static final C8673a21 f15291c = new C8673a21(-1, -1);

    /* renamed from: a */
    public final int f15292a;

    /* renamed from: b */
    public final int f15293b;

    static {
        new C8673a21(0, 0);
    }

    public C8673a21(int i, int i2) {
        YN1.m9278c((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f15292a = i;
        this.f15293b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8673a21)) {
            return false;
        }
        C8673a21 c8673a21 = (C8673a21) obj;
        return this.f15292a == c8673a21.f15292a && this.f15293b == c8673a21.f15293b;
    }

    public final int hashCode() {
        int i = this.f15292a;
        return ((i >>> 16) | (i << 16)) ^ this.f15293b;
    }

    public final String toString() {
        return this.f15292a + "x" + this.f15293b;
    }
}
