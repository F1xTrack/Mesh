package p000;

/* renamed from: Sn */
/* loaded from: classes2.dex */
public final class C1182Sn {

    /* renamed from: a */
    public final boolean f10977a;

    /* renamed from: b */
    public final boolean f10978b;

    /* renamed from: c */
    public final EnumC11139tG0 f10979c;

    public C1182Sn(boolean z, boolean z2, EnumC11139tG0 enumC11139tG0) {
        O90.m5968f(enumC11139tG0, "photoQualityBalance");
        this.f10977a = z;
        this.f10978b = z2;
        this.f10979c = enumC11139tG0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1182Sn)) {
            return false;
        }
        C1182Sn c1182Sn = (C1182Sn) obj;
        return this.f10977a == c1182Sn.f10977a && this.f10978b == c1182Sn.f10978b && this.f10979c == c1182Sn.f10979c;
    }

    public final int hashCode() {
        return this.f10979c.hashCode() + ((((this.f10977a ? 1231 : 1237) * 31) + (this.f10978b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Photo(isMirrored=" + this.f10977a + ", enableHdr=" + this.f10978b + ", photoQualityBalance=" + this.f10979c + ")";
    }
}
