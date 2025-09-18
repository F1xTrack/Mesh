package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class DC0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f1894a;

    /* renamed from: b */
    public /* synthetic */ Object f1895b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC9714i71 f1896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DC0(Function2 function2, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f1896c = (AbstractC9714i71) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        DC0 dc0 = new DC0(this.f1896c, interfaceC1382Vy);
        dc0.f1895b = obj;
        return dc0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DC0) create((C7664Gt0) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f1894a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C7664Gt0 c7664Gt0 = (C7664Gt0) this.f1895b;
            this.f1894a = 1;
            obj = this.f1896c.invoke(c7664Gt0, this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        C7664Gt0 c7664Gt02 = (C7664Gt0) obj;
        c7664Gt02.f3945b.set(true);
        return c7664Gt02;
    }
}
