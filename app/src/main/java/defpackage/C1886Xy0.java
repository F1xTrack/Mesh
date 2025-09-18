package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: Xy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1886Xy0 {
    public final OutputConfiguration a;
    public String b;
    public boolean c;
    public long d = 1;

    public C1886Xy0(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1886Xy0)) {
            return false;
        }
        C1886Xy0 c1886Xy0 = (C1886Xy0) obj;
        return Objects.equals(this.a, c1886Xy0.a) && this.c == c1886Xy0.c && this.d == c1886Xy0.d && Objects.equals(this.b, c1886Xy0.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 31;
        int i = (this.c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i2 = (i << 5) - i;
        String str = this.b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
        int i3 = (iHashCode2 << 5) - iHashCode2;
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ i3;
    }
}
