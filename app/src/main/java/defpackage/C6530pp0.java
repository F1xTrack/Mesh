package defpackage;

import android.net.Uri;

/* renamed from: pp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6530pp0 {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
        AbstractC0277Dh1.L(5);
        AbstractC0277Dh1.L(6);
    }

    public C6530pp0(C8426zm0 c8426zm0) {
        this.a = (Uri) c8426zm0.c;
        this.b = (String) c8426zm0.d;
        this.c = (String) c8426zm0.e;
        this.d = c8426zm0.a;
        this.e = c8426zm0.b;
        this.f = (String) c8426zm0.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6530pp0)) {
            return false;
        }
        C6530pp0 c6530pp0 = (C6530pp0) obj;
        return this.a.equals(c6530pp0.a) && AbstractC0277Dh1.a(this.b, c6530pp0.b) && AbstractC0277Dh1.a(this.c, c6530pp0.c) && this.d == c6530pp0.d && this.e == c6530pp0.e && AbstractC0277Dh1.a(this.f, c6530pp0.f) && AbstractC0277Dh1.a(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        return (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }
}
