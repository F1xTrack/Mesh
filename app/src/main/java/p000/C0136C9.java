package p000;

/* renamed from: C9 */
/* loaded from: classes.dex */
public final class C0136C9 implements XF0 {

    /* renamed from: b */
    public final int f1227b;

    public C0136C9(int i) {
        this.f1227b = i;
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
        C0136C9 c0136c9 = (C0136C9) ((XF0) obj);
        if (this.f1227b == c0136c9.f1227b) {
            Object obj2 = WF0.f13096a;
            c0136c9.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f1227b) + (WF0.f13096a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f1227b + "intEncoding=" + WF0.f13096a + ')';
    }
}
