package defpackage;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
public final class VZ1 {
    public final UZ1 a;
    public final Integer b;

    public /* synthetic */ VZ1(TZ1 tz1) {
        this.a = (UZ1) tz1.a;
        this.b = (Integer) tz1.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VZ1)) {
            return false;
        }
        VZ1 vz1 = (VZ1) obj;
        return Objects.equal(this.a, vz1.a) && Objects.equal(this.b, vz1.b) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, null, null);
    }
}
