package defpackage;

/* renamed from: Uc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1586Uc0 extends AbstractC8408zg0 {
    public static final /* synthetic */ InterfaceC5927mf0[] h;
    public C1508Tc0 f;
    public final C1688Vk0 g;

    static {
        IP0 ip0 = BP0.a;
        h = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C1586Uc0.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586Uc0(C1922Yk0 c1922Yk0) {
        super(c1922Yk0);
        EnumC1352Rc0[] enumC1352Rc0Arr = EnumC1352Rc0.a;
        this.g = new C1688Vk0(c1922Yk0, new C7726w5(this, 10, c1922Yk0));
    }

    public final C1976Zc0 I() {
        return (C1976Zc0) WS1.b(this.g, h[0]);
    }

    @Override // defpackage.AbstractC8408zg0
    public final InterfaceC6384p3 d() {
        return I();
    }

    @Override // defpackage.AbstractC8408zg0
    public final Iterable l() {
        Iterable iterableL = super.l();
        C1922Yk0 c1922Yk0 = this.d;
        C0231Cs0 c0231Cs0K = k();
        O90.e(c0231Cs0K, "getBuiltInsModule(...)");
        return AbstractC8069xu.M(iterableL, new C1274Qc0(c1922Yk0, c0231Cs0K));
    }

    @Override // defpackage.AbstractC8408zg0
    public final InterfaceC7364uB0 p() {
        return I();
    }
}
