package p000;

import android.util.Size;
import java.util.ArrayList;

/* renamed from: yc */
/* loaded from: classes.dex */
public final class C7212yc {

    /* renamed from: a */
    public final String f46334a;

    /* renamed from: b */
    public final Class f46335b;

    /* renamed from: c */
    public final C11812yY0 f46336c;

    /* renamed from: d */
    public final InterfaceC9914jh1 f46337d;

    /* renamed from: e */
    public final Size f46338e;

    /* renamed from: f */
    public final C0419Ge f46339f;

    /* renamed from: g */
    public final ArrayList f46340g;

    public C7212yc(String str, Class cls, C11812yY0 c11812yY0, InterfaceC9914jh1 interfaceC9914jh1, Size size, C0419Ge c0419Ge, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f46334a = str;
        this.f46335b = cls;
        if (c11812yY0 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f46336c = c11812yY0;
        if (interfaceC9914jh1 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f46337d = interfaceC9914jh1;
        this.f46338e = size;
        this.f46339f = c0419Ge;
        this.f46340g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7212yc)) {
            return false;
        }
        C7212yc c7212yc = (C7212yc) obj;
        if (this.f46334a.equals(c7212yc.f46334a) && this.f46335b.equals(c7212yc.f46335b) && this.f46336c.equals(c7212yc.f46336c) && this.f46337d.equals(c7212yc.f46337d)) {
            Size size = c7212yc.f46338e;
            Size size2 = this.f46338e;
            if (size2 != null ? size2.equals(size) : size == null) {
                C0419Ge c0419Ge = c7212yc.f46339f;
                C0419Ge c0419Ge2 = this.f46339f;
                if (c0419Ge2 != null ? c0419Ge2.equals(c0419Ge) : c0419Ge == null) {
                    ArrayList arrayList = c7212yc.f46340g;
                    ArrayList arrayList2 = this.f46340g;
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
        int iHashCode = (((((((this.f46334a.hashCode() ^ 1000003) * 1000003) ^ this.f46335b.hashCode()) * 1000003) ^ this.f46336c.hashCode()) * 1000003) ^ this.f46337d.hashCode()) * 1000003;
        Size size = this.f46338e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        C0419Ge c0419Ge = this.f46339f;
        int iHashCode3 = (iHashCode2 ^ (c0419Ge == null ? 0 : c0419Ge.hashCode())) * 1000003;
        ArrayList arrayList = this.f46340g;
        return iHashCode3 ^ (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f46334a + ", useCaseType=" + this.f46335b + ", sessionConfig=" + this.f46336c + ", useCaseConfig=" + this.f46337d + ", surfaceResolution=" + this.f46338e + ", streamSpec=" + this.f46339f + ", captureTypes=" + this.f46340g + "}";
    }
}
