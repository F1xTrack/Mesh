package defpackage;

/* loaded from: classes.dex */
public final class XH1 implements InterfaceC6623qI1 {
    public final int b;

    public XH1(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC6623qI1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC6623qI1)) {
            return false;
        }
        XH1 xh1 = (XH1) ((InterfaceC6623qI1) obj);
        if (this.b == xh1.b) {
            Object obj2 = EnumC6432pI1.a;
            xh1.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (EnumC6432pI1.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + EnumC6432pI1.a + ')';
    }
}
