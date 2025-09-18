package defpackage;

/* renamed from: ld0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5730ld0 extends R22 {
    public final String b;
    public final String c;

    public C5730ld0(String str, String str2) {
        O90.f(str, "name");
        O90.f(str2, "desc");
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.R22
    public final String a() {
        return this.b + ':' + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5730ld0)) {
            return false;
        }
        C5730ld0 c5730ld0 = (C5730ld0) obj;
        return O90.a(this.b, c5730ld0.b) && O90.a(this.c, c5730ld0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
