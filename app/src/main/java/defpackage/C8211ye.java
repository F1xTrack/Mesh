package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8211ye {
    public final AbstractC4314iH a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final CM f;

    public C8211ye(AbstractC4314iH abstractC4314iH, List list, String str, int i, int i2, CM cm) {
        this.a = abstractC4314iH;
        this.b = list;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = cm;
    }

    public static C1241Pr0 a(AbstractC4314iH abstractC4314iH) {
        C1241Pr0 c1241Pr0 = new C1241Pr0();
        if (abstractC4314iH == null) {
            throw new NullPointerException("Null surface");
        }
        c1241Pr0.a = abstractC4314iH;
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        c1241Pr0.b = listEmptyList;
        c1241Pr0.c = null;
        c1241Pr0.d = -1;
        c1241Pr0.e = -1;
        c1241Pr0.f = CM.d;
        return c1241Pr0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8211ye)) {
            return false;
        }
        C8211ye c8211ye = (C8211ye) obj;
        if (this.a.equals(c8211ye.a) && this.b.equals(c8211ye.b)) {
            String str = c8211ye.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d == c8211ye.d && this.e == c8211ye.e && this.f.equals(c8211ye.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.c + ", mirrorMode=" + this.d + ", surfaceGroupId=" + this.e + ", dynamicRange=" + this.f + "}";
    }
}
