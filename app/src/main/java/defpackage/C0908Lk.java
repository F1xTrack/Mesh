package defpackage;

import java.util.Arrays;

/* renamed from: Lk */
/* loaded from: classes.dex */
public final class C0908Lk {
    public static final F71 c = LB.b(X2.l);
    public final int a;
    public final int b;

    public C0908Lk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0908Lk.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        C0908Lk c0908Lk = (C0908Lk) obj;
        return this.a == c0908Lk.a && this.b == c0908Lk.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%s-%s", Arrays.copyOf(new Object[]{S20.i(this.a), S20.i(this.b)}, 2));
    }
}
