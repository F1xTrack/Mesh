package defpackage;

import android.animation.TimeInterpolator;

/* renamed from: Ws0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1790Ws0 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : AbstractC6009n5.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1790Ws0)) {
            return false;
        }
        C1790Ws0 c1790Ws0 = (C1790Ws0) obj;
        if (this.a == c1790Ws0.a && this.b == c1790Ws0.b && this.d == c1790Ws0.d && this.e == c1790Ws0.e) {
            return a().getClass().equals(c1790Ws0.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C1790Ws0.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return AbstractC1705Vq.j(sb, this.e, "}\n");
    }
}
