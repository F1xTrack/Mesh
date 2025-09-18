package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes2.dex */
public final class I20 {

    /* renamed from: d */
    public static final C0551Ik f4661d;

    /* renamed from: e */
    public static final C0551Ik f4662e;

    /* renamed from: f */
    public static final C0551Ik f4663f;

    /* renamed from: g */
    public static final C0551Ik f4664g;

    /* renamed from: h */
    public static final C0551Ik f4665h;

    /* renamed from: i */
    public static final C0551Ik f4666i;

    /* renamed from: a */
    public final C0551Ik f4667a;

    /* renamed from: b */
    public final C0551Ik f4668b;

    /* renamed from: c */
    public final int f4669c;

    static {
        C0551Ik c0551Ik = C0551Ik.f5116d;
        f4661d = C1210TE.m7631D(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f4662e = C1210TE.m7631D(":status");
        f4663f = C1210TE.m7631D(":method");
        f4664g = C1210TE.m7631D(":path");
        f4665h = C1210TE.m7631D(":scheme");
        f4666i = C1210TE.m7631D(":authority");
    }

    public I20(C0551Ik c0551Ik, C0551Ik c0551Ik2) {
        O90.m5968f(c0551Ik, "name");
        O90.m5968f(c0551Ik2, "value");
        this.f4667a = c0551Ik;
        this.f4668b = c0551Ik2;
        this.f4669c = c0551Ik2.mo3983c() + c0551Ik.mo3983c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I20)) {
            return false;
        }
        I20 i20 = (I20) obj;
        return O90.m5963a(this.f4667a, i20.f4667a) && O90.m5963a(this.f4668b, i20.f4668b);
    }

    public final int hashCode() {
        return this.f4668b.hashCode() + (this.f4667a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4667a.m3991k() + ": " + this.f4668b.m3991k();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I20(String str, String str2) {
        this(C1210TE.m7631D(str), C1210TE.m7631D(str2));
        O90.m5968f(str, "name");
        O90.m5968f(str2, "value");
        C0551Ik c0551Ik = C0551Ik.f5116d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I20(C0551Ik c0551Ik, String str) {
        this(c0551Ik, C1210TE.m7631D(str));
        O90.m5968f(c0551Ik, "name");
        O90.m5968f(str, "value");
        C0551Ik c0551Ik2 = C0551Ik.f5116d;
    }
}
