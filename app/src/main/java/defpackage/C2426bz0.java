package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: bz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2426bz0 {
    public final OutputConfiguration a;
    public long b = 1;

    public C2426bz0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2426bz0)) {
            return false;
        }
        C2426bz0 c2426bz0 = (C2426bz0) obj;
        return Objects.equals(this.a, c2426bz0.a) && this.b == c2426bz0.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ i;
    }
}
