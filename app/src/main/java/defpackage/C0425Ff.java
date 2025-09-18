package defpackage;

import com.google.android.gms.common.internal.Objects;

/* renamed from: Ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425Ff {
    public final int a;

    public /* synthetic */ C0425Ff(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0425Ff) {
            return this.a == ((C0425Ff) obj).a && Objects.equal(null, null) && Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Boolean.FALSE, null, null);
    }
}
