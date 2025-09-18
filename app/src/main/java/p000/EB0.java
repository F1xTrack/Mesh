package p000;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class EB0 {

    /* renamed from: a */
    public final C1353VV f2534a;

    static {
        new SparseBooleanArray();
        YN1.m9281f(!false);
        AbstractC7485Dh1.m1797L(0);
    }

    public EB0(C1353VV c1353vv) {
        this.f2534a = c1353vv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EB0) {
            return this.f2534a.equals(((EB0) obj).f2534a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2534a.hashCode();
    }
}
