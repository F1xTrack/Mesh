package defpackage;

/* renamed from: u81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7356u81 {
    public final C4065gz0 a;
    public final EnumC2148aW b;
    public final boolean c;

    public C7356u81(C4065gz0 c4065gz0, EnumC2148aW enumC2148aW, boolean z) {
        this.a = c4065gz0;
        this.b = enumC2148aW;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7356u81)) {
            return false;
        }
        C7356u81 c7356u81 = (C7356u81) obj;
        return O90.a(this.a, c7356u81.a) && this.b == c7356u81.b && this.c == c7356u81.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePhotoOptions(file=");
        sb.append(this.a);
        sb.append(", flash=");
        sb.append(this.b);
        sb.append(", enableShutterSound=");
        return AbstractC8235ym.m(sb, this.c, ")");
    }
}
