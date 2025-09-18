package p000;

import java.util.ArrayList;

/* renamed from: Xd */
/* loaded from: classes.dex */
public final class C1487Xd extends AbstractC10177ll0 {

    /* renamed from: a */
    public final long f13877a;

    /* renamed from: b */
    public final long f13878b;

    /* renamed from: c */
    public final C0291Ec f13879c;

    /* renamed from: d */
    public final Integer f13880d;

    /* renamed from: e */
    public final String f13881e;

    /* renamed from: f */
    public final ArrayList f13882f;

    public C1487Xd(long j, long j2, C0291Ec c0291Ec, Integer num, String str, ArrayList arrayList) {
        EnumC10755qG0 enumC10755qG0 = EnumC10755qG0.f40710a;
        this.f13877a = j;
        this.f13878b = j2;
        this.f13879c = c0291Ec;
        this.f13880d = num;
        this.f13881e = str;
        this.f13882f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10177ll0)) {
            return false;
        }
        C1487Xd c1487Xd = (C1487Xd) ((AbstractC10177ll0) obj);
        if (this.f13877a == c1487Xd.f13877a) {
            if (this.f13878b == c1487Xd.f13878b) {
                if (this.f13879c.equals(c1487Xd.f13879c)) {
                    Integer num = c1487Xd.f13880d;
                    Integer num2 = this.f13880d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c1487Xd.f13881e;
                        String str2 = this.f13881e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f13882f.equals(c1487Xd.f13882f)) {
                                Object obj2 = EnumC10755qG0.f40710a;
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
        long j = this.f13877a;
        long j2 = this.f13878b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f13879c.hashCode()) * 1000003;
        Integer num = this.f13880d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f13881e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f13882f.hashCode()) * 1000003) ^ EnumC10755qG0.f40710a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f13877a + ", requestUptimeMs=" + this.f13878b + ", clientInfo=" + this.f13879c + ", logSource=" + this.f13880d + ", logSourceName=" + this.f13881e + ", logEvents=" + this.f13882f + ", qosTier=" + EnumC10755qG0.f40710a + "}";
    }
}
