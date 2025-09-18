package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class GY0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f3799a;

    /* renamed from: b */
    public final /* synthetic */ MY0 f3800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY0(MY0 my0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f3800b = my0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new GY0(this.f3800b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GY0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f3799a;
        if (i == 0) {
            RQ1.m7017d(obj);
            MY0 my0 = this.f3800b;
            C7967Mo1 c7967Mo1 = my0.f7223d;
            C6915tu c6915tu = new C6915tu(1, my0);
            this.f3799a = 1;
            if (c7967Mo1.collect(c6915tu, this) == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return C8313Tf1.f11463a;
    }
}
