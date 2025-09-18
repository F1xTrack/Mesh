package p000;

import android.net.Uri;

/* renamed from: pp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10697pp0 {

    /* renamed from: a */
    public final Uri f40406a;

    /* renamed from: b */
    public final String f40407b;

    /* renamed from: c */
    public final String f40408c;

    /* renamed from: d */
    public final int f40409d;

    /* renamed from: e */
    public final int f40410e;

    /* renamed from: f */
    public final String f40411f;

    static {
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
        AbstractC7485Dh1.m1797L(5);
        AbstractC7485Dh1.m1797L(6);
    }

    public C10697pp0(C11967zm0 c11967zm0) {
        this.f40406a = (Uri) c11967zm0.f46990c;
        this.f40407b = (String) c11967zm0.f46991d;
        this.f40408c = (String) c11967zm0.f46992e;
        this.f40409d = c11967zm0.f46988a;
        this.f40410e = c11967zm0.f46989b;
        this.f40411f = (String) c11967zm0.f46993f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10697pp0)) {
            return false;
        }
        C10697pp0 c10697pp0 = (C10697pp0) obj;
        return this.f40406a.equals(c10697pp0.f40406a) && AbstractC7485Dh1.m1812a(this.f40407b, c10697pp0.f40407b) && AbstractC7485Dh1.m1812a(this.f40408c, c10697pp0.f40408c) && this.f40409d == c10697pp0.f40409d && this.f40410e == c10697pp0.f40410e && AbstractC7485Dh1.m1812a(this.f40411f, c10697pp0.f40411f) && AbstractC7485Dh1.m1812a(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.f40406a.hashCode() * 31;
        String str = this.f40407b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f40408c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f40409d) * 31) + this.f40410e) * 31;
        String str3 = this.f40411f;
        return (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }
}
