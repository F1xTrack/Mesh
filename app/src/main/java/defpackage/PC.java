package defpackage;

/* loaded from: classes.dex */
public final class PC extends AbstractC4286i71 implements InterfaceC6099nZ {
    public int a;

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(InterfaceC1729Vy interfaceC1729Vy) {
        return new PC(1, interfaceC1729Vy);
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        PC pc = (PC) create((InterfaceC1729Vy) obj);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        pc.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RQ1.d(obj);
        return C1518Tf1.a;
    }
}
