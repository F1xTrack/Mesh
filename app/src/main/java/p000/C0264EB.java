package p000;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: EB */
/* loaded from: classes2.dex */
public final class C0264EB implements Serializable {

    /* renamed from: b */
    public static final C0264EB f2524b = new C0264EB("P-256");

    /* renamed from: c */
    public static final C0264EB f2525c = new C0264EB("secp256k1");

    /* renamed from: d */
    public static final C0264EB f2526d = new C0264EB("P-256K");

    /* renamed from: e */
    public static final C0264EB f2527e = new C0264EB("P-384");

    /* renamed from: f */
    public static final C0264EB f2528f = new C0264EB("P-521");

    /* renamed from: g */
    public static final C0264EB f2529g = new C0264EB("Ed25519");

    /* renamed from: h */
    public static final C0264EB f2530h = new C0264EB("Ed448");

    /* renamed from: i */
    public static final C0264EB f2531i = new C0264EB("X25519");

    /* renamed from: j */
    public static final C0264EB f2532j = new C0264EB("X448");

    /* renamed from: a */
    public final String f2533a;

    public C0264EB(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
        }
        this.f2533a = str;
    }

    /* renamed from: a */
    public static C0264EB m2064a(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        C0264EB c0264eb = f2524b;
        if (str.equals(c0264eb.f2533a)) {
            return c0264eb;
        }
        C0264EB c0264eb2 = f2526d;
        if (str.equals(c0264eb2.f2533a)) {
            return c0264eb2;
        }
        C0264EB c0264eb3 = f2525c;
        if (str.equals(c0264eb3.f2533a)) {
            return c0264eb3;
        }
        C0264EB c0264eb4 = f2527e;
        if (str.equals(c0264eb4.f2533a)) {
            return c0264eb4;
        }
        C0264EB c0264eb5 = f2528f;
        if (str.equals(c0264eb5.f2533a)) {
            return c0264eb5;
        }
        C0264EB c0264eb6 = f2529g;
        if (str.equals(c0264eb6.f2533a)) {
            return c0264eb6;
        }
        C0264EB c0264eb7 = f2530h;
        if (str.equals(c0264eb7.f2533a)) {
            return c0264eb7;
        }
        C0264EB c0264eb8 = f2531i;
        if (str.equals(c0264eb8.f2533a)) {
            return c0264eb8;
        }
        C0264EB c0264eb9 = f2532j;
        return str.equals(c0264eb9.f2533a) ? c0264eb9 : new C0264EB(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0264EB) {
            if (this.f2533a.equals(((C0264EB) obj).f2533a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2533a);
    }

    public final String toString() {
        return this.f2533a;
    }
}
