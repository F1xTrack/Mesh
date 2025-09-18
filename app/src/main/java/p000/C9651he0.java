package p000;

/* renamed from: he0 */
/* loaded from: classes2.dex */
public final class C9651he0 extends AbstractC0249Dx {
    public C9651he0(C0055As c0055As, int i) {
        super(new C9395fe0(new C0181Cs(c0055As, i)));
    }

    @Override // p000.AbstractC0249Dx
    /* renamed from: a */
    public final AbstractC7742Ig0 mo412a(InterfaceC7402Bs0 interfaceC7402Bs0) {
        AbstractC7742Ig0 abstractC7742Ig0M22197c;
        O90.m5968f(interfaceC7402Bs0, "module");
        C7789Jd1.f5652b.getClass();
        C7789Jd1 c7789Jd1 = C7789Jd1.f5653c;
        AbstractC11955zg0 abstractC11955zg0Mo897h = interfaceC7402Bs0.mo897h();
        abstractC11955zg0Mo897h.getClass();
        InterfaceC6976us interfaceC6976usM26502i = abstractC11955zg0Mo897h.m26502i(AbstractC10604p41.f39789P.m5393g());
        Object obj = this.f2329a;
        AbstractC9523ge0 abstractC9523ge0 = (AbstractC9523ge0) obj;
        if (abstractC9523ge0 instanceof C9267ee0) {
            abstractC7742Ig0M22197c = ((C9267ee0) obj).f26794a;
        } else {
            if (!(abstractC9523ge0 instanceof C9395fe0)) {
                throw new C6838sg();
            }
            C0181Cs c0181Cs = ((C9395fe0) obj).f27308a;
            C0055As c0055As = c0181Cs.f1732a;
            InterfaceC6976us interfaceC6976usM17465b = AbstractC9060d12.m17465b(interfaceC7402Bs0, c0055As);
            int i = c0181Cs.f1733b;
            if (interfaceC6976usM17465b == null) {
                EnumC6235jP enumC6235jP = EnumC6235jP.f35119d;
                String string = c0055As.toString();
                O90.m5967e(string, "toString(...)");
                abstractC7742Ig0M22197c = C6298kP.m22197c(enumC6235jP, string, String.valueOf(i));
            } else {
                X01 x01Mo1492m = interfaceC6976usM17465b.mo1492m();
                O90.m5967e(x01Mo1492m, "getDefaultType(...)");
                AbstractC8315Tg1 abstractC8315Tg1M1236l = CZ1.m1236l(x01Mo1492m);
                for (int i2 = 0; i2 < i; i2++) {
                    AbstractC11955zg0 abstractC11955zg0Mo897h2 = interfaceC7402Bs0.mo897h();
                    EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
                    abstractC8315Tg1M1236l = abstractC11955zg0Mo897h2.m26500g(abstractC8315Tg1M1236l);
                }
                abstractC7742Ig0M22197c = abstractC8315Tg1M1236l;
            }
        }
        return NV1.m5741y(c7789Jd1, interfaceC6976usM26502i, AbstractC7230yu.m26274e(new C10988s41(abstractC7742Ig0M22197c)));
    }
}
