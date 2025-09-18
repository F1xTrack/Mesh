package defpackage;

/* renamed from: he0 */
/* loaded from: classes2.dex */
public final class C4193he0 extends AbstractC0323Dx {
    public C4193he0(C0074As c0074As, int i) {
        super(new C3811fe0(new C0230Cs(c0074As, i)));
    }

    @Override // defpackage.AbstractC0323Dx
    public final AbstractC0663Ig0 a(InterfaceC0153Bs0 interfaceC0153Bs0) {
        AbstractC0663Ig0 abstractC0663Ig0C;
        O90.f(interfaceC0153Bs0, "module");
        C0733Jd1.b.getClass();
        C0733Jd1 c0733Jd1 = C0733Jd1.c;
        AbstractC8408zg0 abstractC8408zg0H = interfaceC0153Bs0.h();
        abstractC8408zg0H.getClass();
        InterfaceC7492us interfaceC7492usI = abstractC8408zg0H.i(AbstractC6390p41.P.g());
        Object obj = this.a;
        AbstractC4002ge0 abstractC4002ge0 = (AbstractC4002ge0) obj;
        if (abstractC4002ge0 instanceof C3620ee0) {
            abstractC0663Ig0C = ((C3620ee0) obj).a;
        } else {
            if (!(abstractC4002ge0 instanceof C3811fe0)) {
                throw new C7074sg();
            }
            C0230Cs c0230Cs = ((C3811fe0) obj).a;
            C0074As c0074As = c0230Cs.a;
            InterfaceC7492us interfaceC7492usB = AbstractC3312d12.b(interfaceC0153Bs0, c0074As);
            int i = c0230Cs.b;
            if (interfaceC7492usB == null) {
                EnumC5305jP enumC5305jP = EnumC5305jP.d;
                String string = c0074As.toString();
                O90.e(string, "toString(...)");
                abstractC0663Ig0C = C5496kP.c(enumC5305jP, string, String.valueOf(i));
            } else {
                X01 x01M = interfaceC7492usB.m();
                O90.e(x01M, "getDefaultType(...)");
                AbstractC1521Tg1 abstractC1521Tg1L = CZ1.l(x01M);
                for (int i2 = 0; i2 < i; i2++) {
                    AbstractC8408zg0 abstractC8408zg0H2 = interfaceC0153Bs0.h();
                    EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
                    abstractC1521Tg1L = abstractC8408zg0H2.g(abstractC1521Tg1L);
                }
                abstractC0663Ig0C = abstractC1521Tg1L;
            }
        }
        return NV1.y(c0733Jd1, interfaceC7492usI, AbstractC8259yu.e(new C6962s41(abstractC0663Ig0C)));
    }
}
