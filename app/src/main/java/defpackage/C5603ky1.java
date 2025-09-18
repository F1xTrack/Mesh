package defpackage;

/* renamed from: ky1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5603ky1 implements InterfaceC1107Ny1 {
    public final int b;

    public C5603ky1(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1107Ny1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC1107Ny1)) {
            return false;
        }
        C5603ky1 c5603ky1 = (C5603ky1) ((InterfaceC1107Ny1) obj);
        if (this.b == c5603ky1.b) {
            Object obj2 = EnumC0718Iy1.a;
            c5603ky1.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (EnumC0718Iy1.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + EnumC0718Iy1.a + ')';
    }
}
