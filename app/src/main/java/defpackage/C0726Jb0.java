package defpackage;

/* renamed from: Jb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0726Jb0 extends AbstractC6952s2 {
    public static final C0726Jb0 d = new C0726Jb0("protected_and_package", true);

    @Override // defpackage.AbstractC6952s2
    public final Integer a(AbstractC6952s2 abstractC6952s2) {
        O90.f(abstractC6952s2, "visibility");
        if (equals(abstractC6952s2)) {
            return 0;
        }
        if (abstractC6952s2 == C1536Tl1.d) {
            return null;
        }
        C2391bn0 c2391bn0 = AbstractC2389bm1.a;
        return abstractC6952s2 == C1770Wl1.d || abstractC6952s2 == C1848Xl1.d ? 1 : -1;
    }

    @Override // defpackage.AbstractC6952s2
    public final String d() {
        return "protected/*protected and package*/";
    }

    @Override // defpackage.AbstractC6952s2
    public final AbstractC6952s2 m() {
        return C1926Yl1.d;
    }
}
