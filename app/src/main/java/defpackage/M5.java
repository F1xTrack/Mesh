package defpackage;

/* loaded from: classes2.dex */
public abstract class M5 {
    public static final /* synthetic */ InterfaceC5927mf0[] a;
    public static final C3547eG b;

    static {
        IP0 ip0 = BP0.a;
        a = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.c(M5.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        CC0 cc0 = C0733Jd1.b;
        InterfaceC1667Vd0 interfaceC1667Vd0B = ip0.b(L5.class);
        cc0.getClass();
        String strA = interfaceC1667Vd0B.a();
        O90.c(strA);
        b = new C3547eG(cc0.W0(strA), 4);
    }

    public static final I5 a(C0733Jd1 c0733Jd1) {
        I5 i5;
        O90.f(c0733Jd1, "<this>");
        L5 l5 = (L5) b.getValue(c0733Jd1, a[0]);
        return (l5 == null || (i5 = l5.a) == null) ? S20.b : i5;
    }
}
