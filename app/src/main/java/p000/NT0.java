package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class NT0 {

    /* renamed from: a */
    public int f7799a;

    /* renamed from: b */
    public float[] f7800b;

    /* renamed from: c */
    public int f7801c;

    /* renamed from: d */
    public float f7802d;

    /* renamed from: e */
    public int f7803e;

    /* renamed from: f */
    public boolean f7804f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NT0.class != obj.getClass()) {
            return false;
        }
        NT0 nt0 = (NT0) obj;
        if (this.f7801c == nt0.f7801c && Float.compare(nt0.f7802d, this.f7802d) == 0 && this.f7803e == nt0.f7803e && Float.compare(0.0f, 0.0f) == 0 && this.f7799a == nt0.f7799a && this.f7804f == nt0.f7804f) {
            return Arrays.equals(this.f7800b, nt0.f7800b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7799a;
        int iM26247x = (i != 0 ? AbstractC7222ym.m26247x(i) : 0) * 961;
        float[] fArr = this.f7800b;
        int iHashCode = (((iM26247x + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f7801c) * 31;
        float f = this.f7802d;
        return ((((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f7803e) * 29791) + (this.f7804f ? 1 : 0);
    }
}
