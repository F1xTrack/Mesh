package p000;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: Xy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8558Xy0 {

    /* renamed from: a */
    public final OutputConfiguration f14068a;

    /* renamed from: b */
    public String f14069b;

    /* renamed from: c */
    public boolean f14070c;

    /* renamed from: d */
    public long f14071d = 1;

    public C8558Xy0(OutputConfiguration outputConfiguration) {
        this.f14068a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8558Xy0)) {
            return false;
        }
        C8558Xy0 c8558Xy0 = (C8558Xy0) obj;
        return Objects.equals(this.f14068a, c8558Xy0.f14068a) && this.f14070c == c8558Xy0.f14070c && this.f14071d == c8558Xy0.f14071d && Objects.equals(this.f14069b, c8558Xy0.f14069b);
    }

    public final int hashCode() {
        int iHashCode = this.f14068a.hashCode() ^ 31;
        int i = (this.f14070c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i2 = (i << 5) - i;
        String str = this.f14069b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
        int i3 = (iHashCode2 << 5) - iHashCode2;
        long j = this.f14071d;
        return ((int) (j ^ (j >>> 32))) ^ i3;
    }
}
