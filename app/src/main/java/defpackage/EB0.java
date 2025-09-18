package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class EB0 {
    public final VV a;

    static {
        new SparseBooleanArray();
        YN1.f(!false);
        AbstractC0277Dh1.L(0);
    }

    public EB0(VV vv) {
        this.a = vv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EB0) {
            return this.a.equals(((EB0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
