package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: Cd */
/* loaded from: classes.dex */
public final class C0185Cd {
    public final String a;
    public final Integer b;
    public final ZN c;
    public final long d;
    public final long e;
    public final HashMap f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public C0185Cd(String str, Integer num, ZN zn, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = zn;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C0107Bd c() {
        C0107Bd c0107Bd = new C0107Bd();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c0107Bd.a = str;
        c0107Bd.b = this.b;
        c0107Bd.g = this.g;
        c0107Bd.h = this.h;
        c0107Bd.i = this.i;
        c0107Bd.j = this.j;
        ZN zn = this.c;
        if (zn == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c0107Bd.c = zn;
        c0107Bd.d = Long.valueOf(this.d);
        c0107Bd.e = Long.valueOf(this.e);
        c0107Bd.f = new HashMap(this.f);
        return c0107Bd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0185Cd)) {
            return false;
        }
        C0185Cd c0185Cd = (C0185Cd) obj;
        if (this.a.equals(c0185Cd.a)) {
            Integer num = c0185Cd.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(c0185Cd.c) && this.d == c0185Cd.d && this.e == c0185Cd.e && this.f.equals(c0185Cd.f)) {
                    Integer num3 = c0185Cd.g;
                    Integer num4 = this.g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = c0185Cd.h;
                        String str2 = this.h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.i, c0185Cd.i) && Arrays.equals(this.j, c0185Cd.j)) {
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
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
