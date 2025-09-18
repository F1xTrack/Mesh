package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: he */
/* loaded from: classes.dex */
public final class C4192he {

    /* renamed from: a */
    public final Object f28488a;

    /* renamed from: b */
    public final C6299kQ f28489b;

    /* renamed from: c */
    public final int f28490c;

    /* renamed from: d */
    public final Size f28491d;

    /* renamed from: e */
    public final Rect f28492e;

    /* renamed from: f */
    public final int f28493f;

    /* renamed from: g */
    public final Matrix f28494g;

    /* renamed from: h */
    public final InterfaceC7034vn f28495h;

    public C4192he(Object obj, C6299kQ c6299kQ, int i, Size size, Rect rect, int i2, Matrix matrix, InterfaceC7034vn interfaceC7034vn) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f28488a = obj;
        this.f28489b = c6299kQ;
        this.f28490c = i;
        this.f28491d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f28492e = rect;
        this.f28493f = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f28494g = matrix;
        if (interfaceC7034vn == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f28495h = interfaceC7034vn;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4192he)) {
            return false;
        }
        C4192he c4192he = (C4192he) obj;
        if (this.f28488a.equals(c4192he.f28488a)) {
            C6299kQ c6299kQ = c4192he.f28489b;
            C6299kQ c6299kQ2 = this.f28489b;
            if (c6299kQ2 != null ? c6299kQ2.equals(c6299kQ) : c6299kQ == null) {
                if (this.f28490c == c4192he.f28490c && this.f28491d.equals(c4192he.f28491d) && this.f28492e.equals(c4192he.f28492e) && this.f28493f == c4192he.f28493f && this.f28494g.equals(c4192he.f28494g) && this.f28495h.equals(c4192he.f28495h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f28488a.hashCode() ^ 1000003) * 1000003;
        C6299kQ c6299kQ = this.f28489b;
        return ((((((((((((iHashCode ^ (c6299kQ == null ? 0 : c6299kQ.hashCode())) * 1000003) ^ this.f28490c) * 1000003) ^ this.f28491d.hashCode()) * 1000003) ^ this.f28492e.hashCode()) * 1000003) ^ this.f28493f) * 1000003) ^ this.f28494g.hashCode()) * 1000003) ^ this.f28495h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f28488a + ", exif=" + this.f28489b + ", format=" + this.f28490c + ", size=" + this.f28491d + ", cropRect=" + this.f28492e + ", rotationDegrees=" + this.f28493f + ", sensorToBufferTransform=" + this.f28494g + ", cameraCaptureResult=" + this.f28495h + "}";
    }
}
