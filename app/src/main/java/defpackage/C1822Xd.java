package defpackage;

import java.util.ArrayList;

/* renamed from: Xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1822Xd extends AbstractC5754ll0 {
    public final long a;
    public final long b;
    public final C0338Ec c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public C1822Xd(long j, long j2, C0338Ec c0338Ec, Integer num, String str, ArrayList arrayList) {
        EnumC6616qG0 enumC6616qG0 = EnumC6616qG0.a;
        this.a = j;
        this.b = j2;
        this.c = c0338Ec;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5754ll0)) {
            return false;
        }
        C1822Xd c1822Xd = (C1822Xd) ((AbstractC5754ll0) obj);
        if (this.a == c1822Xd.a) {
            if (this.b == c1822Xd.b) {
                if (this.c.equals(c1822Xd.c)) {
                    Integer num = c1822Xd.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c1822Xd.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f.equals(c1822Xd.f)) {
                                Object obj2 = EnumC6616qG0.a;
                                if (obj2.equals(obj2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ EnumC6616qG0.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + EnumC6616qG0.a + "}";
    }
}
