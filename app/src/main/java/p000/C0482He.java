package p000;

/* renamed from: He */
/* loaded from: classes.dex */
public final class C0482He {

    /* renamed from: a */
    public final int f4390a;

    /* renamed from: b */
    public final int f4391b;

    /* renamed from: c */
    public final boolean f4392c;

    /* renamed from: d */
    public final boolean f4393d;

    public C0482He(int i, int i2, boolean z, boolean z2) {
        this.f4390a = i;
        this.f4391b = i2;
        this.f4392c = z;
        this.f4393d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0482He)) {
            return false;
        }
        C0482He c0482He = (C0482He) obj;
        return this.f4390a == c0482He.f4390a && this.f4391b == c0482He.f4391b && this.f4392c == c0482He.f4392c && this.f4393d == c0482He.f4393d;
    }

    public final int hashCode() {
        return ((((((this.f4390a ^ 1000003) * 1000003) ^ this.f4391b) * 1000003) ^ (this.f4392c ? 1231 : 1237)) * 1000003) ^ (this.f4393d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.f4390a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.f4391b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.f4392c);
        sb.append(", ultraHdrOn=");
        return AbstractC7222ym.m26236m(sb, this.f4393d, "}");
    }
}
