package p000;

import android.view.Surface;

/* renamed from: Ne */
/* loaded from: classes.dex */
public final class C0859Ne {

    /* renamed from: a */
    public final int f7932a;

    /* renamed from: b */
    public final Surface f7933b;

    public C0859Ne(int i, Surface surface) {
        this.f7932a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f7933b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0859Ne)) {
            return false;
        }
        C0859Ne c0859Ne = (C0859Ne) obj;
        return this.f7932a == c0859Ne.f7932a && this.f7933b.equals(c0859Ne.f7933b);
    }

    public final int hashCode() {
        return this.f7933b.hashCode() ^ ((this.f7932a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f7932a + ", surface=" + this.f7933b + "}";
    }
}
