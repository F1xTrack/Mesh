package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: zo0 */
/* loaded from: classes.dex */
public final class C11971zo0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f47010a;

    /* renamed from: b */
    public final /* synthetic */ C7446Co0 f47011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11971zo0(C7446Co0 c7446Co0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f47011b = c7446Co0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C11971zo0(this.f47011b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11971zo0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f47010a;
        if (i == 0) {
            RQ1.m7017d(obj);
            C11844yo0 c11844yo0 = this.f47011b.f1664a;
            this.f47010a = 1;
            obj = c11844yo0.m26257b(this);
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
