package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* renamed from: yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8205yc {
    public final String a;
    public final Class b;
    public final C8194yY0 c;
    public final InterfaceC5361jh1 d;
    public final Size e;
    public final C0500Ge f;
    public final ArrayList g;

    public C8205yc(String str, Class cls, C8194yY0 c8194yY0, InterfaceC5361jh1 interfaceC5361jh1, Size size, C0500Ge c0500Ge, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.a = str;
        this.b = cls;
        if (c8194yY0 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.c = c8194yY0;
        if (interfaceC5361jh1 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.d = interfaceC5361jh1;
        this.e = size;
        this.f = c0500Ge;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8205yc)) {
            return false;
        }
        C8205yc c8205yc = (C8205yc) obj;
        if (this.a.equals(c8205yc.a) && this.b.equals(c8205yc.b) && this.c.equals(c8205yc.c) && this.d.equals(c8205yc.d)) {
            Size size = c8205yc.e;
            Size size2 = this.e;
            if (size2 != null ? size2.equals(size) : size == null) {
                C0500Ge c0500Ge = c8205yc.f;
                C0500Ge c0500Ge2 = this.f;
                if (c0500Ge2 != null ? c0500Ge2.equals(c0500Ge) : c0500Ge == null) {
                    ArrayList arrayList = c8205yc.g;
                    ArrayList arrayList2 = this.g;
                    if (arrayList2 == null) {
                        if (arrayList == null) {
                            return true;
                        }
                    } else if (arrayList2.equals(arrayList)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        C0500Ge c0500Ge = this.f;
        int iHashCode3 = (iHashCode2 ^ (c0500Ge == null ? 0 : c0500Ge.hashCode())) * 1000003;
        ArrayList arrayList = this.g;
        return iHashCode3 ^ (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.a + ", useCaseType=" + this.b + ", sessionConfig=" + this.c + ", useCaseConfig=" + this.d + ", surfaceResolution=" + this.e + ", streamSpec=" + this.f + ", captureTypes=" + this.g + "}";
    }
}
