package p000;

import android.animation.TimeInterpolator;

/* renamed from: Ws0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8494Ws0 {

    /* renamed from: a */
    public long f13427a;

    /* renamed from: b */
    public long f13428b;

    /* renamed from: c */
    public TimeInterpolator f13429c;

    /* renamed from: d */
    public int f13430d;

    /* renamed from: e */
    public int f13431e;

    /* renamed from: a */
    public final TimeInterpolator m8869a() {
        TimeInterpolator timeInterpolator = this.f13429c;
        return timeInterpolator != null ? timeInterpolator : AbstractC6467n5.f38091b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8494Ws0)) {
            return false;
        }
        C8494Ws0 c8494Ws0 = (C8494Ws0) obj;
        if (this.f13427a == c8494Ws0.f13427a && this.f13428b == c8494Ws0.f13428b && this.f13430d == c8494Ws0.f13430d && this.f13431e == c8494Ws0.f13431e) {
            return m8869a().getClass().equals(c8494Ws0.m8869a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13427a;
        long j2 = this.f13428b;
        return ((((m8869a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f13430d) * 31) + this.f13431e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C8494Ws0.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f13427a);
        sb.append(" duration: ");
        sb.append(this.f13428b);
        sb.append(" interpolator: ");
        sb.append(m8869a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f13430d);
        sb.append(" repeatMode: ");
        return AbstractC1374Vq.m8591j(sb, this.f13431e, "}\n");
    }
}
