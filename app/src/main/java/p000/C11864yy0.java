package p000;

import android.text.TextUtils;

/* renamed from: yy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11864yy0 {

    /* renamed from: e */
    public static final C9937jt0 f46557e = new C9937jt0(18);

    /* renamed from: a */
    public final Object f46558a;

    /* renamed from: b */
    public final InterfaceC11737xy0 f46559b;

    /* renamed from: c */
    public final String f46560c;

    /* renamed from: d */
    public volatile byte[] f46561d;

    public C11864yy0(String str, Object obj, InterfaceC11737xy0 interfaceC11737xy0) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f46560c = str;
        this.f46558a = obj;
        this.f46559b = interfaceC11737xy0;
    }

    /* renamed from: a */
    public static C11864yy0 m26288a(Object obj, String str) {
        return new C11864yy0(str, obj, f46557e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11864yy0) {
            return this.f46560c.equals(((C11864yy0) obj).f46560c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46560c.hashCode();
    }

    public final String toString() {
        return AbstractC1374Vq.m8593l(new StringBuilder("Option{key='"), this.f46560c, "'}");
    }
}
