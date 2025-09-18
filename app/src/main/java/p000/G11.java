package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class G11 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f3532a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC9714i71 f3533b;

    /* renamed from: c */
    public final /* synthetic */ Object f3534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G11(Function2 function2, Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f3533b = (AbstractC9714i71) function2;
        this.f3534c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new G11(this.f3533b, this.f3534c, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G11) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f3532a;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f3532a = 1;
            obj = this.f3533b.invoke(this.f3534c, this);
            if (obj == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return obj;
    }
}
