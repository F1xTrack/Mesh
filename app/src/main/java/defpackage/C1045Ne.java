package defpackage;

import android.view.Surface;

/* renamed from: Ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045Ne {
    public final int a;
    public final Surface b;

    public C1045Ne(int i, Surface surface) {
        this.a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1045Ne)) {
            return false;
        }
        C1045Ne c1045Ne = (C1045Ne) obj;
        return this.a == c1045Ne.a && this.b.equals(c1045Ne.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
