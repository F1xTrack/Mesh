package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: Ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812Ke {
    public final Size a;
    public final Rect b;
    public final InterfaceC7480uo c;
    public final int d;
    public final boolean e;

    public C0812Ke(Size size, Rect rect, InterfaceC7480uo interfaceC7480uo, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.b = rect;
        this.c = interfaceC7480uo;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0812Ke)) {
            return false;
        }
        C0812Ke c0812Ke = (C0812Ke) obj;
        if (this.a.equals(c0812Ke.a) && this.b.equals(c0812Ke.b)) {
            InterfaceC7480uo interfaceC7480uo = c0812Ke.c;
            InterfaceC7480uo interfaceC7480uo2 = this.c;
            if (interfaceC7480uo2 != null ? interfaceC7480uo2.equals(interfaceC7480uo) : interfaceC7480uo == null) {
                if (this.d == c0812Ke.d && this.e == c0812Ke.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        InterfaceC7480uo interfaceC7480uo = this.c;
        return ((((iHashCode ^ (interfaceC7480uo == null ? 0 : interfaceC7480uo.hashCode())) * 1000003) ^ this.d) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return AbstractC8235ym.m(sb, this.e, "}");
    }
}
