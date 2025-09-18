package p000;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: Zy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8662Zy0 {

    /* renamed from: a */
    public final OutputConfiguration f15242a;

    /* renamed from: b */
    public String f15243b;

    /* renamed from: c */
    public long f15244c = 1;

    public C8662Zy0(OutputConfiguration outputConfiguration) {
        this.f15242a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8662Zy0)) {
            return false;
        }
        C8662Zy0 c8662Zy0 = (C8662Zy0) obj;
        return Objects.equals(this.f15242a, c8662Zy0.f15242a) && this.f15244c == c8662Zy0.f15244c && Objects.equals(this.f15243b, c8662Zy0.f15243b);
    }

    public final int hashCode() {
        int iHashCode = this.f15242a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        String str = this.f15243b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
        int i2 = (iHashCode2 << 5) - iHashCode2;
        long j = this.f15244c;
        return ((int) (j ^ (j >>> 32))) ^ i2;
    }
}
