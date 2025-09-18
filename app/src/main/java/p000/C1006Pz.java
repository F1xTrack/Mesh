package p000;

import androidx.work.CoroutineWorker;
import kotlin.jvm.functions.Function2;

/* renamed from: Pz */
/* loaded from: classes.dex */
public final class C1006Pz extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public C8304Tb0 f9380a;

    /* renamed from: b */
    public int f9381b;

    /* renamed from: c */
    public final /* synthetic */ C8304Tb0 f9382c;

    /* renamed from: d */
    public final /* synthetic */ CoroutineWorker f9383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006Pz(C8304Tb0 c8304Tb0, CoroutineWorker coroutineWorker, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f9382c = c8304Tb0;
        this.f9383d = coroutineWorker;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1006Pz(this.f9382c, this.f9383d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1006Pz c1006Pz = (C1006Pz) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        c1006Pz.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f9381b;
        if (i == 0) {
            RQ1.m7017d(obj);
            this.f9380a = this.f9382c;
            this.f9381b = 1;
            this.f9383d.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C8304Tb0 c8304Tb0 = this.f9380a;
        RQ1.m7017d(obj);
        c8304Tb0.f11433a.m25921j(obj);
        return C8313Tf1.f11463a;
    }
}
