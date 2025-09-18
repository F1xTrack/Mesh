package defpackage;

/* renamed from: Pn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1228Pn {
    public final boolean a;
    public final EnumC5646lB0 b;

    public C1228Pn(boolean z, EnumC5646lB0 enumC5646lB0) {
        O90.f(enumC5646lB0, "pixelFormat");
        this.a = z;
        this.b = enumC5646lB0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228Pn)) {
            return false;
        }
        C1228Pn c1228Pn = (C1228Pn) obj;
        return this.a == c1228Pn.a && this.b == c1228Pn.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "FrameProcessor(isMirrored=" + this.a + ", pixelFormat=" + this.b + ")";
    }
}
