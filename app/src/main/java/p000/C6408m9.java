package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: m9 */
/* loaded from: classes2.dex */
public final class C6408m9 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ C6219j9 f37525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6408m9(C6219j9 c6219j9, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f37525a = c6219j9;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C6408m9(this.f37525a, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6408m9 c6408m9 = (C6408m9) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        c6408m9.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        this.f37525a.invoke();
        return C8313Tf1.f11463a;
    }
}
