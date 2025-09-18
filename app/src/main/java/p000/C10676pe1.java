package p000;

/* renamed from: pe1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10676pe1 {

    /* renamed from: a */
    public final InterfaceC10292me1 f40261a;

    /* renamed from: b */
    public final C11818yb0 f40262b;

    public C10676pe1(InterfaceC10292me1 interfaceC10292me1, C11818yb0 c11818yb0) {
        O90.m5968f(interfaceC10292me1, "typeParameter");
        O90.m5968f(c11818yb0, "typeAttr");
        this.f40261a = interfaceC10292me1;
        this.f40262b = c11818yb0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10676pe1)) {
            return false;
        }
        C10676pe1 c10676pe1 = (C10676pe1) obj;
        return O90.m5963a(c10676pe1.f40261a, this.f40261a) && O90.m5963a(c10676pe1.f40262b, this.f40262b);
    }

    public final int hashCode() {
        int iHashCode = this.f40261a.hashCode();
        return this.f40262b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f40261a + ", typeAttr=" + this.f40262b + ')';
    }
}
