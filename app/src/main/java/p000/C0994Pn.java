package p000;

/* renamed from: Pn */
/* loaded from: classes2.dex */
public final class C0994Pn {

    /* renamed from: a */
    public final boolean f9278a;

    /* renamed from: b */
    public final EnumC10105lB0 f9279b;

    public C0994Pn(boolean z, EnumC10105lB0 enumC10105lB0) {
        O90.m5968f(enumC10105lB0, "pixelFormat");
        this.f9278a = z;
        this.f9279b = enumC10105lB0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0994Pn)) {
            return false;
        }
        C0994Pn c0994Pn = (C0994Pn) obj;
        return this.f9278a == c0994Pn.f9278a && this.f9279b == c0994Pn.f9279b;
    }

    public final int hashCode() {
        return this.f9279b.hashCode() + ((this.f9278a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "FrameProcessor(isMirrored=" + this.f9278a + ", pixelFormat=" + this.f9279b + ")";
    }
}
