package p000;

/* renamed from: ld0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10161ld0 extends R22 {

    /* renamed from: b */
    public final String f37193b;

    /* renamed from: c */
    public final String f37194c;

    public C10161ld0(String str, String str2) {
        O90.m5968f(str, "name");
        O90.m5968f(str2, "desc");
        this.f37193b = str;
        this.f37194c = str2;
    }

    @Override // p000.R22
    /* renamed from: a */
    public final String mo6888a() {
        return this.f37193b + ':' + this.f37194c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10161ld0)) {
            return false;
        }
        C10161ld0 c10161ld0 = (C10161ld0) obj;
        return O90.m5963a(this.f37193b, c10161ld0.f37193b) && O90.m5963a(this.f37194c, c10161ld0.f37194c);
    }

    public final int hashCode() {
        return this.f37194c.hashCode() + (this.f37193b.hashCode() * 31);
    }
}
