package p000;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
public final class Y22 {

    /* renamed from: a */
    public final ZE1 f14125a;

    public /* synthetic */ Y22(GQ0 gq0) {
        this.f14125a = (ZE1) gq0.f3735b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y22) {
            return Objects.equal(this.f14125a, ((Y22) obj).f14125a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f14125a);
    }
}
