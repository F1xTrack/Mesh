package defpackage;

import java.io.Serializable;

/* renamed from: Qf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1283Qf0 implements Serializable {
    public static final C1283Qf0 b = new C1283Qf0("EC");
    public static final C1283Qf0 c = new C1283Qf0("RSA");
    public static final C1283Qf0 d = new C1283Qf0("oct");
    public static final C1283Qf0 e = new C1283Qf0("OKP");
    public final String a;

    public C1283Qf0(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.a = str;
    }

    public static C1283Qf0 a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type to parse must not be null");
        }
        C1283Qf0 c1283Qf0 = b;
        if (str.equals(c1283Qf0.a)) {
            return c1283Qf0;
        }
        C1283Qf0 c1283Qf02 = c;
        if (str.equals(c1283Qf02.a)) {
            return c1283Qf02;
        }
        C1283Qf0 c1283Qf03 = d;
        if (str.equals(c1283Qf03.a)) {
            return c1283Qf03;
        }
        C1283Qf0 c1283Qf04 = e;
        return str.equals(c1283Qf04.a) ? c1283Qf04 : new C1283Qf0(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1283Qf0) {
            if (this.a.equals(((C1283Qf0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
