package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes.dex */
public final class D60 {
    public static final D60 c = new D60(GrsBaseInfo.CountryCodeSource.UNKNOWN, null);
    public final String a;
    public final String b;

    public D60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D60)) {
            return false;
        }
        D60 d60 = (D60) obj;
        return O90.a(this.a, d60.a) && O90.a(this.b, d60.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
