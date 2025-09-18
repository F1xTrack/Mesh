package p000;

/* renamed from: Uc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8358Uc0 extends AbstractC11955zg0 {

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC10293mf0[] f11928h;

    /* renamed from: f */
    public C8306Tc0 f11929f;

    /* renamed from: g */
    public final C8426Vk0 f11930g;

    static {
        IP0 ip0 = BP0.f799a;
        f11928h = new InterfaceC10293mf0[]{ip0.mo3850f(new GE0(ip0.mo3846b(C8358Uc0.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8358Uc0(C8582Yk0 c8582Yk0) {
        super(c8582Yk0);
        EnumC8202Rc0[] enumC8202Rc0Arr = EnumC8202Rc0.f10337a;
        this.f11930g = new C8426Vk0(c8582Yk0, new C7053w5(this, 10, c8582Yk0));
    }

    /* renamed from: I */
    public final C8618Zc0 m8085I() {
        return (C8618Zc0) WS1.m8763b(this.f11930g, f11928h[0]);
    }

    @Override // p000.AbstractC11955zg0
    /* renamed from: d */
    public final InterfaceC6593p3 mo8086d() {
        return m8085I();
    }

    @Override // p000.AbstractC11955zg0
    /* renamed from: l */
    public final Iterable mo8087l() {
        Iterable iterableMo8087l = super.mo8087l();
        C8582Yk0 c8582Yk0 = this.f46930d;
        C7454Cs0 c7454Cs0M26504k = m26504k();
        O90.m5967e(c7454Cs0M26504k, "getBuiltInsModule(...)");
        return AbstractC7167xu.m25967M(iterableMo8087l, new C8150Qc0(c8582Yk0, c7454Cs0M26504k));
    }

    @Override // p000.AbstractC11955zg0
    /* renamed from: p */
    public final InterfaceC11257uB0 mo8088p() {
        return m8085I();
    }
}
