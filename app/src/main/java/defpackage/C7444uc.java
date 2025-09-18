package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7444uc {
    public final int a;
    public final double b;
    public final Throwable c;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public C7444uc(int i, double d, Throwable th) {
        this.a = i;
        this.b = d;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7444uc)) {
            return false;
        }
        C7444uc c7444uc = (C7444uc) obj;
        if (this.a == c7444uc.a && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(c7444uc.b)) {
            Throwable th = c7444uc.c;
            Throwable th2 = this.c;
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
        int i = (this.a ^ 1000003) * 1000003;
        double d = this.b;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        Throwable th = this.c;
        return iDoubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.a + ", audioAmplitudeInternal=" + this.b + ", errorCause=" + this.c + "}";
    }
}
