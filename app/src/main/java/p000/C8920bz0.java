package p000;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: bz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8920bz0 {

    /* renamed from: a */
    public final OutputConfiguration f17249a;

    /* renamed from: b */
    public long f17250b = 1;

    public C8920bz0(OutputConfiguration outputConfiguration) {
        this.f17249a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8920bz0)) {
            return false;
        }
        C8920bz0 c8920bz0 = (C8920bz0) obj;
        return Objects.equals(this.f17249a, c8920bz0.f17249a) && this.f17250b == c8920bz0.f17250b;
    }

    public final int hashCode() {
        int iHashCode = this.f17249a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        long j = this.f17250b;
        return ((int) (j ^ (j >>> 32))) ^ i;
    }
}
