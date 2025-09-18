package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: OT */
/* loaded from: classes2.dex */
public final class C0911OT extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f8451a;

    /* renamed from: b */
    public final /* synthetic */ C1414WT f8452b;

    /* renamed from: c */
    public final /* synthetic */ C0534IT f8453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0911OT(InterfaceC1382Vy interfaceC1382Vy, C0534IT c0534it, C1414WT c1414wt) {
        super(2, interfaceC1382Vy);
        this.f8452b = c1414wt;
        this.f8453c = c0534it;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C0911OT(interfaceC1382Vy, this.f8453c, this.f8452b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0911OT) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f8451a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f8451a = 1;
            C1414WT c1414wt = this.f8452b;
            c1414wt.getClass();
            C0399GK c0399gk = C0399GK.f3694a;
            if (AbstractC9366fP1.m18233e(ExecutorC1023QF.f9548c, new C1351VT(null, this.f8453c, c1414wt), this) == enumC0817Mz) {
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
