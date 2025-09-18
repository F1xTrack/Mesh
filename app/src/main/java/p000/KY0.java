package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class KY0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public /* synthetic */ Object f6188a;

    /* renamed from: b */
    public final /* synthetic */ String f6189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KY0(String str, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f6189b = str;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        KY0 ky0 = new KY0(this.f6189b, interfaceC1382Vy);
        ky0.f6188a = obj;
        return ky0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        KY0 ky0 = (KY0) create((C7664Gt0) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        ky0.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        C7664Gt0 c7664Gt0 = (C7664Gt0) this.f6188a;
        c7664Gt0.getClass();
        LC0 lc0 = TB1.f11196a;
        O90.m5968f(lc0, "key");
        c7664Gt0.m3188d(lc0, this.f6189b);
        return C8313Tf1.f11463a;
    }
}
