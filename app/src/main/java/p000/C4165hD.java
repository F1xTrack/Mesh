package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: hD */
/* loaded from: classes2.dex */
public final class C4165hD extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public /* synthetic */ Object f28314a;

    /* renamed from: b */
    public final /* synthetic */ Object f28315b;

    /* renamed from: c */
    public final /* synthetic */ LC0 f28316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4165hD(Object obj, LC0 lc0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f28315b = obj;
        this.f28316c = lc0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C4165hD c4165hD = new C4165hD(this.f28315b, this.f28316c, interfaceC1382Vy);
        c4165hD.f28314a = obj;
        return c4165hD;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4165hD c4165hD = (C4165hD) create((C7664Gt0) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        c4165hD.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        C7664Gt0 c7664Gt0 = (C7664Gt0) this.f28314a;
        LC0 lc0 = this.f28316c;
        Object obj2 = this.f28315b;
        if (obj2 != null) {
            c7664Gt0.getClass();
            O90.m5968f(lc0, "key");
            c7664Gt0.m3188d(lc0, obj2);
        } else {
            c7664Gt0.m3187c(lc0);
        }
        return C8313Tf1.f11463a;
    }
}
