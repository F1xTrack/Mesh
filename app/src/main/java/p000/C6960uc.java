package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: uc */
/* loaded from: classes.dex */
public final class C6960uc {

    /* renamed from: a */
    public final int f43773a;

    /* renamed from: b */
    public final double f43774b;

    /* renamed from: c */
    public final Throwable f43775c;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public C6960uc(int i, double d, Throwable th) {
        this.f43773a = i;
        this.f43774b = d;
        this.f43775c = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6960uc)) {
            return false;
        }
        C6960uc c6960uc = (C6960uc) obj;
        if (this.f43773a == c6960uc.f43773a && Double.doubleToLongBits(this.f43774b) == Double.doubleToLongBits(c6960uc.f43774b)) {
            Throwable th = c6960uc.f43775c;
            Throwable th2 = this.f43775c;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f43773a ^ 1000003) * 1000003;
        double d = this.f43774b;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        Throwable th = this.f43775c;
        return iDoubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f43773a + ", audioAmplitudeInternal=" + this.f43774b + ", errorCause=" + this.f43775c + "}";
    }
}
