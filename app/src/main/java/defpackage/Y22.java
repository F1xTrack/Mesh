package defpackage;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
public final class Y22 {
    public final ZE1 a;

    public /* synthetic */ Y22(GQ0 gq0) {
        this.a = (ZE1) gq0.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y22) {
            return Objects.equal(this.a, ((Y22) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
