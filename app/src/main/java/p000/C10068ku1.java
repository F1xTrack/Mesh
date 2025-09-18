package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: ku1 */
/* loaded from: classes2.dex */
public final class C10068ku1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f36756a;

    /* renamed from: b */
    public int f36757b;

    /* renamed from: c */
    public final /* synthetic */ C7821Jt1 f36758c;

    /* renamed from: d */
    public final /* synthetic */ K81 f36759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10068ku1(C7821Jt1 c7821Jt1, K81 k81, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f36756a = i;
        this.f36758c = c7821Jt1;
        this.f36759d = k81;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f36756a) {
            case 0:
                return new C10068ku1(this.f36758c, this.f36759d, interfaceC1382Vy, 0);
            default:
                return new C10068ku1(this.f36758c, this.f36759d, interfaceC1382Vy, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f36756a) {
            case 0:
                return new C10068ku1(this.f36758c, this.f36759d, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C10068ku1(this.f36758c, this.f36759d, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        switch (this.f36756a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f36757b;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    C7347Aq1 c7347Aq1 = (C7347Aq1) this.f36758c.f5789n.getValue();
                    this.f36757b = 1;
                    if (c7347Aq1.m349b(this.f36759d, this) == enumC0817Mz) {
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
                int i2 = this.f36757b;
                C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
                if (i2 == 0) {
                    RQ1.m7017d(obj);
                    C7347Aq1 c7347Aq12 = (C7347Aq1) this.f36758c.f5789n.getValue();
                    this.f36757b = 1;
                    obj = c7347Aq12.m348a(this);
                    if (obj == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.m7017d(obj);
                        return c8313Tf1;
                    }
                    RQ1.m7017d(obj);
                }
                String str = (String) obj;
                if (AbstractC11374v51.m25328C(str)) {
                    K81 k81 = this.f36759d;
                    this.f36757b = 2;
                    C7821Jt1 c7821Jt1 = C7821Jt1.f5775v;
                    if (c7821Jt1 == null) {
                        throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
                    }
                    Object objM354g = ((C7347Aq1) c7821Jt1.f5789n.getValue()).m354g(k81, this);
                    if (objM354g != enumC0817Mz2) {
                        objM354g = c8313Tf1;
                    }
                    if (objM354g == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    this.f36759d.m4569b(str);
                }
                return c8313Tf1;
        }
    }
}
