package p000;

import java.util.Arrays;

/* renamed from: Lk */
/* loaded from: classes.dex */
public final class C0739Lk {

    /* renamed from: c */
    public static final F71 f6823c = AbstractC0705LB.m4915b(C1450X2.f13508l);

    /* renamed from: a */
    public final int f6824a;

    /* renamed from: b */
    public final int f6825b;

    public C0739Lk(int i, int i2) {
        this.f6824a = i;
        this.f6825b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0739Lk.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        O90.m5966d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        C0739Lk c0739Lk = (C0739Lk) obj;
        return this.f6824a == c0739Lk.f6824a && this.f6825b == c0739Lk.f6825b;
    }

    public final int hashCode() {
        return (this.f6824a * 31) + this.f6825b;
    }

    public final String toString() {
        return String.format(null, "%s-%s", Arrays.copyOf(new Object[]{S20.m7153i(this.f6824a), S20.m7153i(this.f6825b)}, 2));
    }
}
