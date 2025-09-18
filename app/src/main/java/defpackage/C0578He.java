package defpackage;

/* renamed from: He, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578He {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public C0578He(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0578He)) {
            return false;
        }
        C0578He c0578He = (C0578He) obj;
        return this.a == c0578He.a && this.b == c0578He.b && this.c == c0578He.c && this.d == c0578He.d;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
        sb.append(this.a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", previewStabilizationOn=");
        sb.append(this.c);
        sb.append(", ultraHdrOn=");
        return AbstractC8235ym.m(sb, this.d, "}");
    }
}
