package p000;

/* renamed from: Fd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7581Fd1 extends AbstractC0162CZ implements InterfaceC7529Ed1 {

    /* renamed from: H */
    public static final C10689pl0 f3365H;

    /* renamed from: E */
    public final Z41 f3366E;

    /* renamed from: F */
    public final InterfaceC7633Gd1 f3367F;

    /* renamed from: G */
    public C6707qs f3368G;

    static {
        IP0 ip0 = BP0.f799a;
        ip0.mo3850f(new GE0(ip0.mo3846b(C7581Fd1.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        f3365H = new C10689pl0(22);
    }

    public C7581Fd1(Z41 z41, InterfaceC7633Gd1 interfaceC7633Gd1, C6707qs c6707qs, InterfaceC7529Ed1 interfaceC7529Ed1, InterfaceC0510I5 interfaceC0510I5, int i, W21 w21) {
        super(i, interfaceC0510I5, interfaceC7633Gd1, interfaceC7529Ed1, AbstractC9961k31.f36278e, w21);
        this.f3366E = z41;
        this.f3367F = interfaceC7633Gd1;
        C7053w5 c7053w5 = new C7053w5(this, 27, c6707qs);
        C8582Yk0 c8582Yk0 = (C8582Yk0) z41;
        c8582Yk0.getClass();
        new C8374Uk0(c8582Yk0, c7053w5);
        this.f3368G = c6707qs;
    }

    @Override // p000.AbstractC0162CZ
    /* renamed from: A1 */
    public final AbstractC0162CZ mo148A1(int i, InterfaceC0510I5 interfaceC0510I5, InterfaceC0140CD interfaceC0140CD, InterfaceC0036AZ interfaceC0036AZ, C8340Tt0 c8340Tt0, W21 w21) {
        O90.m5968f(interfaceC0140CD, "newOwner");
        AbstractC0852NX.m5764m(i, "kind");
        O90.m5968f(interfaceC0510I5, "annotations");
        if (i != 1) {
        }
        return new C7581Fd1(this.f3366E, this.f3367F, this.f3368G, this, interfaceC0510I5, 1, w21);
    }

    @Override // p000.AbstractC0329FD
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC7529Ed1 mo2089x1() {
        InterfaceC0036AZ interfaceC0036AZMo2089x1 = super.mo2089x1();
        O90.m5966d(interfaceC0036AZMo2089x1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC7529Ed1) interfaceC0036AZMo2089x1;
    }

    @Override // p000.AbstractC0162CZ, p000.R51
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public final C7581Fd1 mo114b(C11571we1 c11571we1) {
        O90.m5968f(c11571we1, "substitutor");
        InterfaceC0036AZ interfaceC0036AZMo114b = super.mo114b(c11571we1);
        O90.m5966d(interfaceC0036AZMo114b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C7581Fd1 c7581Fd1 = (C7581Fd1) interfaceC0036AZMo114b;
        AbstractC7742Ig0 abstractC7742Ig0 = c7581Fd1.f1432h;
        O90.m5965c(abstractC7742Ig0);
        C6707qs c6707qsMo114b = this.f3368G.mo2089x1().mo114b(C11571we1.m25662d(abstractC7742Ig0));
        if (c6707qsMo114b == null) {
            return null;
        }
        c7581Fd1.f3368G = c6707qsMo114b;
        return c7581Fd1;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC7032vl
    public final AbstractC7742Ig0 getReturnType() {
        AbstractC7742Ig0 abstractC7742Ig0 = this.f1432h;
        O90.m5965c(abstractC7742Ig0);
        return abstractC7742Ig0;
    }

    @Override // p000.AbstractC0329FD, p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0936Os mo423i() {
        return this.f3367F;
    }

    @Override // p000.AbstractC0162CZ, p000.InterfaceC7158xl
    /* renamed from: m0 */
    public final InterfaceC7158xl mo117m0(InterfaceC6976us interfaceC6976us, EnumC10575os0 enumC10575os0, C7003vI c7003vI) {
        O90.m5968f(interfaceC6976us, "newOwner");
        O90.m5968f(c7003vI, "visibility");
        AbstractC0852NX.m5764m(2, "kind");
        C0099BZ c0099bzM1216E1 = m1216E1(C11571we1.f45010b);
        c0099bzM1216E1.f881b = interfaceC6976us;
        c0099bzM1216E1.f882c = enumC10575os0;
        c0099bzM1216E1.f883d = c7003vI;
        c0099bzM1216E1.f885f = 2;
        c0099bzM1216E1.f892m = false;
        InterfaceC8902bq0 interfaceC8902bq0Mo1214B1 = c0099bzM1216E1.f903x.mo1214B1(c0099bzM1216E1);
        O90.m5966d(interfaceC8902bq0Mo1214B1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC7529Ed1) interfaceC8902bq0Mo1214B1;
    }

    @Override // p000.InterfaceC6522ny
    /* renamed from: y */
    public final boolean mo2718y() {
        return this.f3368G.f41218E;
    }

    @Override // p000.InterfaceC6522ny
    /* renamed from: z */
    public final InterfaceC6976us mo2719z() {
        InterfaceC6976us interfaceC6976usMo2719z = this.f3368G.mo2719z();
        O90.m5967e(interfaceC6976usMo2719z, "getConstructedClass(...)");
        return interfaceC6976usMo2719z;
    }

    @Override // p000.AbstractC0329FD, p000.InterfaceC0140CD
    /* renamed from: i */
    public final InterfaceC0140CD mo423i() {
        return this.f3367F;
    }
}
