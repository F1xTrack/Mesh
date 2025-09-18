package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: Zy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2042Zy0 {
    public final OutputConfiguration a;
    public String b;
    public long c = 1;

    public C2042Zy0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2042Zy0)) {
            return false;
        }
        C2042Zy0 c2042Zy0 = (C2042Zy0) obj;
        return Objects.equals(this.a, c2042Zy0.a) && this.c == c2042Zy0.c && Objects.equals(this.b, c2042Zy0.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        String str = this.b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
        int i2 = (iHashCode2 << 5) - iHashCode2;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ i2;
    }
}
