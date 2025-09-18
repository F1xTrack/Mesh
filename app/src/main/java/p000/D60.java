package p000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public final class D60 {

    /* renamed from: c */
    public static final D60 f1843c = new D60(GrsBaseInfo.CountryCodeSource.UNKNOWN, null);

    /* renamed from: a */
    public final String f1844a;

    /* renamed from: b */
    public final String f1845b;

    public D60(String str, String str2) {
        this.f1844a = str;
        this.f1845b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D60)) {
            return false;
        }
        D60 d60 = (D60) obj;
        return O90.m5963a(this.f1844a, d60.f1844a) && O90.m5963a(this.f1845b, d60.f1845b);
    }

    public final int hashCode() {
        int iHashCode = this.f1844a.hashCode() * 31;
        String str = this.f1845b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.f1844a;
    }
}
