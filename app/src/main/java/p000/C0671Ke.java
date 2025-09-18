package p000;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: Ke */
/* loaded from: classes.dex */
public final class C0671Ke {

    /* renamed from: a */
    public final Size f6238a;

    /* renamed from: b */
    public final Rect f6239b;

    /* renamed from: c */
    public final InterfaceC6972uo f6240c;

    /* renamed from: d */
    public final int f6241d;

    /* renamed from: e */
    public final boolean f6242e;

    public C0671Ke(Size size, Rect rect, InterfaceC6972uo interfaceC6972uo, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f6238a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f6239b = rect;
        this.f6240c = interfaceC6972uo;
        this.f6241d = i;
        this.f6242e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0671Ke)) {
            return false;
        }
        C0671Ke c0671Ke = (C0671Ke) obj;
        if (this.f6238a.equals(c0671Ke.f6238a) && this.f6239b.equals(c0671Ke.f6239b)) {
            InterfaceC6972uo interfaceC6972uo = c0671Ke.f6240c;
            InterfaceC6972uo interfaceC6972uo2 = this.f6240c;
            if (interfaceC6972uo2 != null ? interfaceC6972uo2.equals(interfaceC6972uo) : interfaceC6972uo == null) {
                if (this.f6241d == c0671Ke.f6241d && this.f6242e == c0671Ke.f6242e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f6238a.hashCode() ^ 1000003) * 1000003) ^ this.f6239b.hashCode()) * 1000003;
        InterfaceC6972uo interfaceC6972uo = this.f6240c;
        return ((((iHashCode ^ (interfaceC6972uo == null ? 0 : interfaceC6972uo.hashCode())) * 1000003) ^ this.f6241d) * 1000003) ^ (this.f6242e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.f6238a);
        sb.append(", inputCropRect=");
        sb.append(this.f6239b);
        sb.append(", cameraInternal=");
        sb.append(this.f6240c);
        sb.append(", rotationDegrees=");
        sb.append(this.f6241d);
        sb.append(", mirroring=");
        return AbstractC7222ym.m26236m(sb, this.f6242e, "}");
    }
}
