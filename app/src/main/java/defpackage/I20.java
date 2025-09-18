package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes2.dex */
public final class I20 {
    public static final C0674Ik d;
    public static final C0674Ik e;
    public static final C0674Ik f;
    public static final C0674Ik g;
    public static final C0674Ik h;
    public static final C0674Ik i;
    public final C0674Ik a;
    public final C0674Ik b;
    public final int c;

    static {
        C0674Ik c0674Ik = C0674Ik.d;
        d = TE.D(StringUtils.PROCESS_POSTFIX_DELIMITER);
        e = TE.D(":status");
        f = TE.D(":method");
        g = TE.D(":path");
        h = TE.D(":scheme");
        i = TE.D(":authority");
    }

    public I20(C0674Ik c0674Ik, C0674Ik c0674Ik2) {
        O90.f(c0674Ik, "name");
        O90.f(c0674Ik2, "value");
        this.a = c0674Ik;
        this.b = c0674Ik2;
        this.c = c0674Ik2.c() + c0674Ik.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I20)) {
            return false;
        }
        I20 i20 = (I20) obj;
        return O90.a(this.a, i20.a) && O90.a(this.b, i20.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.k() + ": " + this.b.k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I20(String str, String str2) {
        this(TE.D(str), TE.D(str2));
        O90.f(str, "name");
        O90.f(str2, "value");
        C0674Ik c0674Ik = C0674Ik.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I20(C0674Ik c0674Ik, String str) {
        this(c0674Ik, TE.D(str));
        O90.f(c0674Ik, "name");
        O90.f(str, "value");
        C0674Ik c0674Ik2 = C0674Ik.d;
    }
}
