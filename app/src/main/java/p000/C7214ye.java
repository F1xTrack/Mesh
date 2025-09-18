package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: ye */
/* loaded from: classes.dex */
public final class C7214ye {

    /* renamed from: a */
    public final AbstractC4232iH f46367a;

    /* renamed from: b */
    public final List f46368b;

    /* renamed from: c */
    public final String f46369c;

    /* renamed from: d */
    public final int f46370d;

    /* renamed from: e */
    public final int f46371e;

    /* renamed from: f */
    public final C0149CM f46372f;

    public C7214ye(AbstractC4232iH abstractC4232iH, List list, String str, int i, int i2, C0149CM c0149cm) {
        this.f46367a = abstractC4232iH;
        this.f46368b = list;
        this.f46369c = str;
        this.f46370d = i;
        this.f46371e = i2;
        this.f46372f = c0149cm;
    }

    /* renamed from: a */
    public static C8128Pr0 m26209a(AbstractC4232iH abstractC4232iH) {
        C8128Pr0 c8128Pr0 = new C8128Pr0();
        if (abstractC4232iH == null) {
            throw new NullPointerException("Null surface");
        }
        c8128Pr0.f9303a = abstractC4232iH;
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        c8128Pr0.f9304b = listEmptyList;
        c8128Pr0.f9305c = null;
        c8128Pr0.f9306d = -1;
        c8128Pr0.f9307e = -1;
        c8128Pr0.f9308f = C0149CM.f1329d;
        return c8128Pr0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7214ye)) {
            return false;
        }
        C7214ye c7214ye = (C7214ye) obj;
        if (this.f46367a.equals(c7214ye.f46367a) && this.f46368b.equals(c7214ye.f46368b)) {
            String str = c7214ye.f46369c;
            String str2 = this.f46369c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f46370d == c7214ye.f46370d && this.f46371e == c7214ye.f46371e && this.f46372f.equals(c7214ye.f46372f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f46367a.hashCode() ^ 1000003) * 1000003) ^ this.f46368b.hashCode()) * 1000003;
        String str = this.f46369c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f46370d) * 1000003) ^ this.f46371e) * 1000003) ^ this.f46372f.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f46367a + ", sharedSurfaces=" + this.f46368b + ", physicalCameraId=" + this.f46369c + ", mirrorMode=" + this.f46370d + ", surfaceGroupId=" + this.f46371e + ", dynamicRange=" + this.f46372f + "}";
    }
}
