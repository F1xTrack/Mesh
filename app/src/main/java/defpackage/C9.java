package defpackage;

/* loaded from: classes.dex */
public final class C9 implements XF0 {
    public final int b;

    public C9(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return XF0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XF0)) {
            return false;
        }
        C9 c9 = (C9) ((XF0) obj);
        if (this.b == c9.b) {
            Object obj2 = WF0.a;
            c9.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.b) + (WF0.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + WF0.a + ')';
    }
}
