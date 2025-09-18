package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: Oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123Oe {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public C1123Oe(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.e = matrix;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1123Oe)) {
            return false;
        }
        C1123Oe c1123Oe = (C1123Oe) obj;
        return this.a.equals(c1123Oe.a) && this.b == c1123Oe.b && this.c == c1123Oe.c && this.d == c1123Oe.d && this.e.equals(c1123Oe.e) && this.f == c1123Oe.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return AbstractC8235ym.m(sb, this.f, "}");
    }
}
