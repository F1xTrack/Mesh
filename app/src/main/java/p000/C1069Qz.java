package p000;

import androidx.work.CoroutineWorker;
import kotlin.jvm.functions.Function2;

/* renamed from: Qz */
/* loaded from: classes.dex */
public final class C1069Qz extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f9878a;

    /* renamed from: b */
    public final /* synthetic */ CoroutineWorker f9879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069Qz(CoroutineWorker coroutineWorker, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f9879b = coroutineWorker;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1069Qz(this.f9879b, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1069Qz) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f9878a;
        CoroutineWorker coroutineWorker = this.f9879b;
        try {
            if (i == 0) {
                RQ1.m7017d(obj);
                this.f9878a = 1;
                obj = coroutineWorker.mo10322a(this);
                if (obj == enumC0817Mz) {
                    return enumC0817Mz;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
            }
            coroutineWorker.f16564b.m25921j((AbstractC8008Nj0) obj);
        } catch (Throwable th) {
            coroutineWorker.f16564b.m25922k(th);
        }
        return C8313Tf1.f11463a;
    }
}
