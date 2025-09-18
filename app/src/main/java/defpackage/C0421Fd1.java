package defpackage;

/* renamed from: Fd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0421Fd1 extends CZ implements InterfaceC0343Ed1 {
    public static final C6518pl0 H;
    public final Z41 E;
    public final InterfaceC0499Gd1 F;
    public C6729qs G;

    static {
        IP0 ip0 = BP0.a;
        ip0.f(new GE0(ip0.b(C0421Fd1.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        H = new C6518pl0(22);
    }

    public C0421Fd1(Z41 z41, InterfaceC0499Gd1 interfaceC0499Gd1, C6729qs c6729qs, InterfaceC0343Ed1 interfaceC0343Ed1, I5 i5, int i, W21 w21) {
        super(i, i5, interfaceC0499Gd1, interfaceC0343Ed1, AbstractC5431k31.e, w21);
        this.E = z41;
        this.F = interfaceC0499Gd1;
        C7726w5 c7726w5 = new C7726w5(this, 27, c6729qs);
        C1922Yk0 c1922Yk0 = (C1922Yk0) z41;
        c1922Yk0.getClass();
        new C1610Uk0(c1922Yk0, c7726w5);
        this.G = c6729qs;
    }

    @Override // defpackage.CZ
    public final CZ A1(int i, I5 i5, CD cd, AZ az, C1559Tt0 c1559Tt0, W21 w21) {
        O90.f(cd, "newOwner");
        NX.m(i, "kind");
        O90.f(i5, "annotations");
        if (i != 1) {
        }
        return new C0421Fd1(this.E, this.F, this.G, this, i5, 1, w21);
    }

    @Override // defpackage.FD
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0343Ed1 x1() {
        AZ azX1 = super.x1();
        O90.d(azX1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC0343Ed1) azX1;
    }

    @Override // defpackage.CZ, defpackage.R51
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public final C0421Fd1 b(C7833we1 c7833we1) {
        O90.f(c7833we1, "substitutor");
        AZ azB = super.b(c7833we1);
        O90.d(azB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C0421Fd1 c0421Fd1 = (C0421Fd1) azB;
        AbstractC0663Ig0 abstractC0663Ig0 = c0421Fd1.h;
        O90.c(abstractC0663Ig0);
        C6729qs c6729qsB = this.G.x1().b(C7833we1.d(abstractC0663Ig0));
        if (c6729qsB == null) {
            return null;
        }
        c0421Fd1.G = c6729qsB;
        return c0421Fd1;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC7662vl
    public final AbstractC0663Ig0 getReturnType() {
        AbstractC0663Ig0 abstractC0663Ig0 = this.h;
        O90.c(abstractC0663Ig0);
        return abstractC0663Ig0;
    }

    @Override // defpackage.FD, defpackage.CD
    public final InterfaceC1165Os i() {
        return this.F;
    }

    @Override // defpackage.CZ, defpackage.InterfaceC8042xl
    public final InterfaceC8042xl m0(InterfaceC7492us interfaceC7492us, EnumC6348os0 enumC6348os0, C7575vI c7575vI) {
        O90.f(interfaceC7492us, "newOwner");
        O90.f(c7575vI, "visibility");
        NX.m(2, "kind");
        BZ bzE1 = E1(C7833we1.b);
        bzE1.b = interfaceC7492us;
        bzE1.c = enumC6348os0;
        bzE1.d = c7575vI;
        bzE1.f = 2;
        bzE1.m = false;
        InterfaceC2400bq0 interfaceC2400bq0B1 = bzE1.x.B1(bzE1);
        O90.d(interfaceC2400bq0B1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (InterfaceC0343Ed1) interfaceC2400bq0B1;
    }

    @Override // defpackage.InterfaceC6174ny
    public final boolean y() {
        return this.G.E;
    }

    @Override // defpackage.InterfaceC6174ny
    public final InterfaceC7492us z() {
        InterfaceC7492us interfaceC7492usZ = this.G.z();
        O90.e(interfaceC7492usZ, "getConstructedClass(...)");
        return interfaceC7492usZ;
    }

    @Override // defpackage.FD, defpackage.CD
    public final CD i() {
        return this.F;
    }
}
