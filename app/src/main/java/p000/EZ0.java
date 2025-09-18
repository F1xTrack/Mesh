package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class EZ0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public /* synthetic */ Object f2780a;

    /* renamed from: b */
    public final /* synthetic */ Object f2781b;

    /* renamed from: c */
    public final /* synthetic */ LC0 f2782c;

    /* renamed from: d */
    public final /* synthetic */ FZ0 f2783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZ0(Object obj, LC0 lc0, FZ0 fz0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f2781b = obj;
        this.f2782c = lc0;
        this.f2783d = fz0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        EZ0 ez0 = new EZ0(this.f2781b, this.f2782c, this.f2783d, interfaceC1382Vy);
        ez0.f2780a = obj;
        return ez0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EZ0 ez0 = (EZ0) create((C7664Gt0) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        ez0.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        C7664Gt0 c7664Gt0 = (C7664Gt0) this.f2780a;
        LC0 lc0 = this.f2782c;
        Object obj2 = this.f2781b;
        if (obj2 != null) {
            c7664Gt0.getClass();
            O90.m5968f(lc0, "key");
            c7664Gt0.m3188d(lc0, obj2);
        } else {
            c7664Gt0.m3187c(lc0);
        }
        FZ0.m2672a(this.f2783d, c7664Gt0);
        return C8313Tf1.f11463a;
    }
}
