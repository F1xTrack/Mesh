package p000;

/* renamed from: ky1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10076ky1 implements InterfaceC8039Ny1 {

    /* renamed from: b */
    public final int f36791b;

    public C10076ky1(int i) {
        this.f36791b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC8039Ny1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC8039Ny1)) {
            return false;
        }
        C10076ky1 c10076ky1 = (C10076ky1) ((InterfaceC8039Ny1) obj);
        if (this.f36791b == c10076ky1.f36791b) {
            Object obj2 = EnumC7779Iy1.f5237a;
            c10076ky1.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f36791b ^ 14552422) + (EnumC7779Iy1.f5237a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f36791b + "intEncoding=" + EnumC7779Iy1.f5237a + ')';
    }
}
