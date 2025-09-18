package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class NC0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f7548a;

    /* renamed from: b */
    public /* synthetic */ Object f7549b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC9714i71 f7550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NC0(Function2 function2, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f7550c = (AbstractC9714i71) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        NC0 nc0 = new NC0(this.f7550c, interfaceC1382Vy);
        nc0.f7549b = obj;
        return nc0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NC0) create((C7664Gt0) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f7548a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7664Gt0 c7664Gt0 = (C7664Gt0) this.f7549b;
            RQ1.m7017d(obj);
            return c7664Gt0;
        }
        RQ1.m7017d(obj);
        C7664Gt0 c7664Gt02 = new C7664Gt0(AbstractC11077sn0.m24789q(((C7664Gt0) this.f7549b).m3185a()), false);
        this.f7549b = c7664Gt02;
        this.f7548a = 1;
        return this.f7550c.invoke(c7664Gt02, this) == enumC0817Mz ? enumC0817Mz : c7664Gt02;
    }
}
