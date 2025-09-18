package p000;

import com.google.android.gms.common.internal.Objects;

/* renamed from: Ff */
/* loaded from: classes.dex */
public final class C0357Ff {

    /* renamed from: a */
    public final int f3376a;

    public /* synthetic */ C0357Ff(int i) {
        this.f3376a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0357Ff) {
            return this.f3376a == ((C0357Ff) obj).f3376a && Objects.equal(null, null) && Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f3376a), Boolean.FALSE, null, null);
    }
}
