package p000;

/* renamed from: PC */
/* loaded from: classes.dex */
public final class C0957PC extends AbstractC9714i71 implements InterfaceC6497nZ {

    /* renamed from: a */
    public int f8888a;

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(InterfaceC1382Vy interfaceC1382Vy) {
        return new C0957PC(1, interfaceC1382Vy);
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        C0957PC c0957pc = (C0957PC) create((InterfaceC1382Vy) obj);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        c0957pc.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f8888a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f8888a = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RQ1.m7017d(obj);
        return C8313Tf1.f11463a;
    }
}
