package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4192he {
    public final Object a;
    public final C5499kQ b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final InterfaceC7668vn h;

    public C4192he(Object obj, C5499kQ c5499kQ, int i, Size size, Rect rect, int i2, Matrix matrix, InterfaceC7668vn interfaceC7668vn) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
        this.b = c5499kQ;
        this.c = i;
        this.d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.e = rect;
        this.f = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.g = matrix;
        if (interfaceC7668vn == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.h = interfaceC7668vn;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4192he)) {
            return false;
        }
        C4192he c4192he = (C4192he) obj;
        if (this.a.equals(c4192he.a)) {
            C5499kQ c5499kQ = c4192he.b;
            C5499kQ c5499kQ2 = this.b;
            if (c5499kQ2 != null ? c5499kQ2.equals(c5499kQ) : c5499kQ == null) {
                if (this.c == c4192he.c && this.d.equals(c4192he.d) && this.e.equals(c4192he.e) && this.f == c4192he.f && this.g.equals(c4192he.g) && this.h.equals(c4192he.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        C5499kQ c5499kQ = this.b;
        return ((((((((((((iHashCode ^ (c5499kQ == null ? 0 : c5499kQ.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
