package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class CZ0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public FZ0 f1451a;

    /* renamed from: b */
    public int f1452b;

    /* renamed from: c */
    public final /* synthetic */ FZ0 f1453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CZ0(FZ0 fz0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f1453c = fz0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new CZ0(this.f1453c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CZ0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        FZ0 fz0;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f1452b;
        if (i == 0) {
            RQ1.m7017d(obj);
            FZ0 fz02 = this.f1453c;
            InterfaceC6622pW data = fz02.f3313a.getData();
            this.f1451a = fz02;
            this.f1452b = 1;
            Object objM22336b = AbstractC10084l12.m22336b(data, this);
            if (objM22336b == enumC0817Mz) {
                return enumC0817Mz;
            }
            fz0 = fz02;
            obj = objM22336b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fz0 = this.f1451a;
            RQ1.m7017d(obj);
        }
        FZ0.m2672a(fz0, new C7664Gt0(AbstractC11077sn0.m24789q(((C7664Gt0) obj).m3185a()), true));
        return C8313Tf1.f11463a;
    }
}
