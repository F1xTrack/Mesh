package p000;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: Oe */
/* loaded from: classes.dex */
public final class C0922Oe {

    /* renamed from: a */
    public final Rect f8547a;

    /* renamed from: b */
    public final int f8548b;

    /* renamed from: c */
    public final int f8549c;

    /* renamed from: d */
    public final boolean f8550d;

    /* renamed from: e */
    public final Matrix f8551e;

    /* renamed from: f */
    public final boolean f8552f;

    public C0922Oe(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f8547a = rect;
        this.f8548b = i;
        this.f8549c = i2;
        this.f8550d = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f8551e = matrix;
        this.f8552f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0922Oe)) {
            return false;
        }
        C0922Oe c0922Oe = (C0922Oe) obj;
        return this.f8547a.equals(c0922Oe.f8547a) && this.f8548b == c0922Oe.f8548b && this.f8549c == c0922Oe.f8549c && this.f8550d == c0922Oe.f8550d && this.f8551e.equals(c0922Oe.f8551e) && this.f8552f == c0922Oe.f8552f;
    }

    public final int hashCode() {
        return ((((((((((this.f8547a.hashCode() ^ 1000003) * 1000003) ^ this.f8548b) * 1000003) ^ this.f8549c) * 1000003) ^ (this.f8550d ? 1231 : 1237)) * 1000003) ^ this.f8551e.hashCode()) * 1000003) ^ (this.f8552f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.f8547a);
        sb.append(", getRotationDegrees=");
        sb.append(this.f8548b);
        sb.append(", getTargetRotation=");
        sb.append(this.f8549c);
        sb.append(", hasCameraTransform=");
        sb.append(this.f8550d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.f8551e);
        sb.append(", isMirroring=");
        return AbstractC7222ym.m26236m(sb, this.f8552f, "}");
    }
}
