package p000;

/* loaded from: classes.dex */
public final class XH1 implements InterfaceC10760qI1 {

    /* renamed from: b */
    public final int f13664b;

    public XH1(int i) {
        this.f13664b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC10760qI1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC10760qI1)) {
            return false;
        }
        XH1 xh1 = (XH1) ((InterfaceC10760qI1) obj);
        if (this.f13664b == xh1.f13664b) {
            Object obj2 = EnumC10632pI1.f40014a;
            xh1.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f13664b ^ 14552422) + (EnumC10632pI1.f40014a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f13664b + "intEncoding=" + EnumC10632pI1.f40014a + ')';
    }
}
