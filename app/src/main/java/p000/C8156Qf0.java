package p000;

import java.io.Serializable;

/* renamed from: Qf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8156Qf0 implements Serializable {

    /* renamed from: b */
    public static final C8156Qf0 f9709b = new C8156Qf0("EC");

    /* renamed from: c */
    public static final C8156Qf0 f9710c = new C8156Qf0("RSA");

    /* renamed from: d */
    public static final C8156Qf0 f9711d = new C8156Qf0("oct");

    /* renamed from: e */
    public static final C8156Qf0 f9712e = new C8156Qf0("OKP");

    /* renamed from: a */
    public final String f9713a;

    public C8156Qf0(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.f9713a = str;
    }

    /* renamed from: a */
    public static C8156Qf0 m6741a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type to parse must not be null");
        }
        C8156Qf0 c8156Qf0 = f9709b;
        if (str.equals(c8156Qf0.f9713a)) {
            return c8156Qf0;
        }
        C8156Qf0 c8156Qf02 = f9710c;
        if (str.equals(c8156Qf02.f9713a)) {
            return c8156Qf02;
        }
        C8156Qf0 c8156Qf03 = f9711d;
        if (str.equals(c8156Qf03.f9713a)) {
            return c8156Qf03;
        }
        C8156Qf0 c8156Qf04 = f9712e;
        return str.equals(c8156Qf04.f9713a) ? c8156Qf04 : new C8156Qf0(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8156Qf0) {
            if (this.f9713a.equals(((C8156Qf0) obj).f9713a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9713a.hashCode();
    }

    public final String toString() {
        return this.f9713a;
    }
}
