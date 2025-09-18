package p000;

/* renamed from: Iu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7771Iu1 extends AbstractC9714i71 implements InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ int f5197a;

    /* renamed from: b */
    public int f5198b;

    /* renamed from: c */
    public final /* synthetic */ C7821Jt1 f5199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7771Iu1(C7821Jt1 c7821Jt1, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(1, interfaceC1382Vy);
        this.f5197a = i;
        this.f5199c = c7821Jt1;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f5197a) {
            case 0:
                return new C7771Iu1(this.f5199c, interfaceC1382Vy, 0);
            default:
                return new C7771Iu1(this.f5199c, interfaceC1382Vy, 1);
        }
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj;
        switch (this.f5197a) {
            case 0:
                return new C7771Iu1(this.f5199c, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C7771Iu1(this.f5199c, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM7015b;
        switch (this.f5197a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f5198b;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    C7347Aq1 c7347Aq1 = (C7347Aq1) this.f5199c.f5789n.getValue();
                    this.f5198b = 1;
                    if (c7347Aq1.m353f(this) == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return C8313Tf1.f11463a;
            default:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                int i2 = this.f5198b;
                C7821Jt1 c7821Jt1 = this.f5199c;
                if (i2 == 0) {
                    RQ1.m7017d(obj);
                    C9452g41 c9452g41 = c7821Jt1.f5795t;
                    if (c9452g41 != null) {
                        this.f5198b = 1;
                        if (c9452g41.m10799F(this) == enumC0817Mz2) {
                            return enumC0817Mz2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                try {
                    objM7015b = (String) c7821Jt1.getToken().m6586c();
                } catch (Throwable th) {
                    objM7015b = RQ1.m7015b(th);
                }
                return new PS0(objM7015b);
        }
    }
}
