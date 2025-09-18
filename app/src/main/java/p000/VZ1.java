package p000;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
public final class VZ1 {

    /* renamed from: a */
    public final UZ1 f12622a;

    /* renamed from: b */
    public final Integer f12623b;

    public /* synthetic */ VZ1(TZ1 tz1) {
        this.f12622a = (UZ1) tz1.f11430a;
        this.f12623b = (Integer) tz1.f11431b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VZ1)) {
            return false;
        }
        VZ1 vz1 = (VZ1) obj;
        return Objects.equal(this.f12622a, vz1.f12622a) && Objects.equal(this.f12623b, vz1.f12623b) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f12622a, this.f12623b, null, null);
    }
}
