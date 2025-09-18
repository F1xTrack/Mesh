package defpackage;

/* renamed from: Ib0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0648Ib0 extends AbstractC6952s2 {
    public static final C0648Ib0 d = new C0648Ib0("package", false);

    @Override // defpackage.AbstractC6952s2
    public final Integer a(AbstractC6952s2 abstractC6952s2) {
        O90.f(abstractC6952s2, "visibility");
        if (this == abstractC6952s2) {
            return 0;
        }
        C2391bn0 c2391bn0 = AbstractC2389bm1.a;
        return (abstractC6952s2 == C1770Wl1.d || abstractC6952s2 == C1848Xl1.d) ? 1 : -1;
    }

    @Override // defpackage.AbstractC6952s2
    public final String d() {
        return "public/*package*/";
    }

    @Override // defpackage.AbstractC6952s2
    public final AbstractC6952s2 m() {
        return C1926Yl1.d;
    }
}
