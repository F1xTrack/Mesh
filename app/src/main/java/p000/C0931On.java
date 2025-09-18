package p000;

/* renamed from: On */
/* loaded from: classes2.dex */
public final class C0931On {

    /* renamed from: a */
    public final boolean f8615a;

    /* renamed from: b */
    public final boolean f8616b;

    /* renamed from: c */
    public final boolean f8617c;

    /* renamed from: d */
    public final boolean f8618d;

    /* renamed from: e */
    public final boolean f8619e;

    /* renamed from: f */
    public final boolean f8620f;

    public C0931On(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f8615a = z;
        this.f8616b = z2;
        this.f8617c = z3;
        this.f8618d = z4;
        this.f8619e = z5;
        this.f8620f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0931On)) {
            return false;
        }
        C0931On c0931On = (C0931On) obj;
        return this.f8615a == c0931On.f8615a && this.f8616b == c0931On.f8616b && this.f8617c == c0931On.f8617c && this.f8618d == c0931On.f8618d && this.f8619e == c0931On.f8619e && this.f8620f == c0931On.f8620f;
    }

    public final int hashCode() {
        return ((((((((((this.f8615a ? 1231 : 1237) * 31) + (this.f8616b ? 1231 : 1237)) * 31) + (this.f8617c ? 1231 : 1237)) * 31) + (this.f8618d ? 1231 : 1237)) * 31) + (this.f8619e ? 1231 : 1237)) * 31) + (this.f8620f ? 1231 : 1237);
    }

    public final String toString() {
        return "Difference(deviceChanged=" + this.f8615a + ", outputsChanged=" + this.f8616b + ", sidePropsChanged=" + this.f8617c + ", isActiveChanged=" + this.f8618d + ", orientationChanged=" + this.f8619e + ", locationChanged=" + this.f8620f + ")";
    }
}
