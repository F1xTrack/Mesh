package p000;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: Cd */
/* loaded from: classes.dex */
public final class C0166Cd {

    /* renamed from: a */
    public final String f1483a;

    /* renamed from: b */
    public final Integer f1484b;

    /* renamed from: c */
    public final C1597ZN f1485c;

    /* renamed from: d */
    public final long f1486d;

    /* renamed from: e */
    public final long f1487e;

    /* renamed from: f */
    public final HashMap f1488f;

    /* renamed from: g */
    public final Integer f1489g;

    /* renamed from: h */
    public final String f1490h;

    /* renamed from: i */
    public final byte[] f1491i;

    /* renamed from: j */
    public final byte[] f1492j;

    public C0166Cd(String str, Integer num, C1597ZN c1597zn, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f1483a = str;
        this.f1484b = num;
        this.f1485c = c1597zn;
        this.f1486d = j;
        this.f1487e = j2;
        this.f1488f = map;
        this.f1489g = num2;
        this.f1490h = str2;
        this.f1491i = bArr;
        this.f1492j = bArr2;
    }

    /* renamed from: a */
    public final String m1260a(String str) {
        String str2 = (String) this.f1488f.get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public final int m1261b(String str) {
        String str2 = (String) this.f1488f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: c */
    public final C0103Bd m1262c() {
        C0103Bd c0103Bd = new C0103Bd();
        String str = this.f1483a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c0103Bd.f942a = str;
        c0103Bd.f943b = this.f1484b;
        c0103Bd.f948g = this.f1489g;
        c0103Bd.f949h = this.f1490h;
        c0103Bd.f950i = this.f1491i;
        c0103Bd.f951j = this.f1492j;
        C1597ZN c1597zn = this.f1485c;
        if (c1597zn == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c0103Bd.f944c = c1597zn;
        c0103Bd.f945d = Long.valueOf(this.f1486d);
        c0103Bd.f946e = Long.valueOf(this.f1487e);
        c0103Bd.f947f = new HashMap(this.f1488f);
        return c0103Bd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0166Cd)) {
            return false;
        }
        C0166Cd c0166Cd = (C0166Cd) obj;
        if (this.f1483a.equals(c0166Cd.f1483a)) {
            Integer num = c0166Cd.f1484b;
            Integer num2 = this.f1484b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f1485c.equals(c0166Cd.f1485c) && this.f1486d == c0166Cd.f1486d && this.f1487e == c0166Cd.f1487e && this.f1488f.equals(c0166Cd.f1488f)) {
                    Integer num3 = c0166Cd.f1489g;
                    Integer num4 = this.f1489g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = c0166Cd.f1490h;
                        String str2 = this.f1490h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.f1491i, c0166Cd.f1491i) && Arrays.equals(this.f1492j, c0166Cd.f1492j)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1483a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1484b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f1485c.hashCode()) * 1000003;
        long j = this.f1486d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f1487e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f1488f.hashCode()) * 1000003;
        Integer num2 = this.f1489g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f1490h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f1491i)) * 1000003) ^ Arrays.hashCode(this.f1492j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1483a + ", code=" + this.f1484b + ", encodedPayload=" + this.f1485c + ", eventMillis=" + this.f1486d + ", uptimeMillis=" + this.f1487e + ", autoMetadata=" + this.f1488f + ", productId=" + this.f1489g + ", pseudonymousId=" + this.f1490h + ", experimentIdsClear=" + Arrays.toString(this.f1491i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f1492j) + "}";
    }
}
