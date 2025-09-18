package defpackage;

/* renamed from: Iu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0706Iu1 extends AbstractC4286i71 implements InterfaceC6099nZ {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ C0781Jt1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0706Iu1(C0781Jt1 c0781Jt1, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(1, interfaceC1729Vy);
        this.a = i;
        this.c = c0781Jt1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C0706Iu1(this.c, interfaceC1729Vy, 0);
            default:
                return new C0706Iu1(this.c, interfaceC1729Vy, 1);
        }
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj;
        switch (this.a) {
            case 0:
                return new C0706Iu1(this.c, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            default:
                return new C0706Iu1(this.c, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        Object objB;
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                int i = this.b;
                if (i == 0) {
                    RQ1.d(obj);
                    C0070Aq1 c0070Aq1 = (C0070Aq1) this.c.n.getValue();
                    this.b = 1;
                    if (c0070Aq1.f(this) == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return C1518Tf1.a;
            default:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                int i2 = this.b;
                C0781Jt1 c0781Jt1 = this.c;
                if (i2 == 0) {
                    RQ1.d(obj);
                    C3895g41 c3895g41 = c0781Jt1.t;
                    if (c3895g41 != null) {
                        this.b = 1;
                        if (c3895g41.F(this) == enumC1030Mz2) {
                            return enumC1030Mz2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                try {
                    objB = (String) c0781Jt1.getToken().c();
                } catch (Throwable th) {
                    objB = RQ1.b(th);
                }
                return new PS0(objB);
        }
    }
}
