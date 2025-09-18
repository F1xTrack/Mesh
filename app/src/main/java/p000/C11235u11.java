package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: u11 */
/* loaded from: classes.dex */
public final class C11235u11 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public /* synthetic */ Object f43449a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC11880z41 f43450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11235u11(AbstractC11880z41 abstractC11880z41, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f43450b = abstractC11880z41;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C11235u11 c11235u11 = new C11235u11(this.f43450b, interfaceC1382Vy);
        c11235u11.f43449a = obj;
        return c11235u11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11235u11) create((AbstractC11880z41) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        AbstractC11880z41 abstractC11880z41 = (AbstractC11880z41) this.f43449a;
        AbstractC11880z41 abstractC11880z412 = this.f43450b;
        boolean z = false;
        if (!(abstractC11880z412 instanceof C0013AC) && !(abstractC11880z412 instanceof C7204yU) && abstractC11880z41 == abstractC11880z412) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
