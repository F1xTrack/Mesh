package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Fe */
/* loaded from: classes.dex */
public final class C0356Fe {

    /* renamed from: d */
    public static final C0356Fe f3369d = new C0356Fe(0, 2, null);

    /* renamed from: e */
    public static final Set f3370e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: f */
    public static final C0186Cx f3371f = new C0186Cx(new C0356Fe(0, 1, null));

    /* renamed from: a */
    public final int f3372a;

    /* renamed from: b */
    public final int f3373b;

    /* renamed from: c */
    public final C0922Oe f3374c;

    public C0356Fe(int i, int i2, C0922Oe c0922Oe) {
        this.f3372a = i;
        if (i2 == 0) {
            throw new NullPointerException("Null streamState");
        }
        this.f3373b = i2;
        this.f3374c = c0922Oe;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0356Fe)) {
            return false;
        }
        C0356Fe c0356Fe = (C0356Fe) obj;
        if (this.f3372a == c0356Fe.f3372a && AbstractC7222ym.m26226c(this.f3373b, c0356Fe.f3373b)) {
            C0922Oe c0922Oe = c0356Fe.f3374c;
            C0922Oe c0922Oe2 = this.f3374c;
            if (c0922Oe2 == null) {
                if (c0922Oe == null) {
                    return true;
                }
            } else if (c0922Oe2.equals(c0922Oe)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM26247x = (((this.f3372a ^ 1000003) * 1000003) ^ AbstractC7222ym.m26247x(this.f3373b)) * 1000003;
        C0922Oe c0922Oe = this.f3374c;
        return (c0922Oe == null ? 0 : c0922Oe.hashCode()) ^ iM26247x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.f3372a);
        sb.append(", streamState=");
        int i = this.f3373b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.f3374c);
        sb.append("}");
        return sb.toString();
    }
}
