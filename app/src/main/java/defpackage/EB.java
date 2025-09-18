package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class EB implements Serializable {
    public static final EB b = new EB("P-256");
    public static final EB c = new EB("secp256k1");
    public static final EB d = new EB("P-256K");
    public static final EB e = new EB("P-384");
    public static final EB f = new EB("P-521");
    public static final EB g = new EB("Ed25519");
    public static final EB h = new EB("Ed448");
    public static final EB i = new EB("X25519");
    public static final EB j = new EB("X448");
    public final String a;

    public EB(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
        }
        this.a = str;
    }

    public static EB a(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        EB eb = b;
        if (str.equals(eb.a)) {
            return eb;
        }
        EB eb2 = d;
        if (str.equals(eb2.a)) {
            return eb2;
        }
        EB eb3 = c;
        if (str.equals(eb3.a)) {
            return eb3;
        }
        EB eb4 = e;
        if (str.equals(eb4.a)) {
            return eb4;
        }
        EB eb5 = f;
        if (str.equals(eb5.a)) {
            return eb5;
        }
        EB eb6 = g;
        if (str.equals(eb6.a)) {
            return eb6;
        }
        EB eb7 = h;
        if (str.equals(eb7.a)) {
            return eb7;
        }
        EB eb8 = i;
        if (str.equals(eb8.a)) {
            return eb8;
        }
        EB eb9 = j;
        return str.equals(eb9.a) ? eb9 : new EB(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EB) {
            if (this.a.equals(((EB) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return this.a;
    }
}
