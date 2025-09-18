package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class NT0 {
    public int a;
    public float[] b;
    public int c;
    public float d;
    public int e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NT0.class != obj.getClass()) {
            return false;
        }
        NT0 nt0 = (NT0) obj;
        if (this.c == nt0.c && Float.compare(nt0.d, this.d) == 0 && this.e == nt0.e && Float.compare(0.0f, 0.0f) == 0 && this.a == nt0.a && this.f == nt0.f) {
            return Arrays.equals(this.b, nt0.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int iX = (i != 0 ? AbstractC8235ym.x(i) : 0) * 961;
        float[] fArr = this.b;
        int iHashCode = (((iX + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.c) * 31;
        float f = this.d;
        return ((((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.e) * 29791) + (this.f ? 1 : 0);
    }
}
