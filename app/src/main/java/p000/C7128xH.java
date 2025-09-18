package p000;

import com.p019vk.push.core.base.DelayedAction;
import kotlin.jvm.functions.Function2;

/* renamed from: xH */
/* loaded from: classes2.dex */
public final class C7128xH extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f45514a;

    /* renamed from: b */
    public /* synthetic */ Object f45515b;

    /* renamed from: c */
    public final /* synthetic */ long f45516c;

    /* renamed from: d */
    public final /* synthetic */ DelayedAction f45517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7128xH(long j, DelayedAction delayedAction, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f45516c = j;
        this.f45517d = delayedAction;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C7128xH c7128xH = new C7128xH(this.f45516c, this.f45517d, interfaceC1382Vy);
        c7128xH.f45515b = obj;
        return c7128xH;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7128xH) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        InterfaceC0754Lz interfaceC0754Lz;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f45514a;
        if (i == 0) {
            RQ1.m7017d(obj);
            InterfaceC0754Lz interfaceC0754Lz2 = (InterfaceC0754Lz) this.f45515b;
            this.f45515b = interfaceC0754Lz2;
            this.f45514a = 1;
            if (AZ1.m234b(this.f45516c, this) == enumC0817Mz) {
                return enumC0817Mz;
            }
            interfaceC0754Lz = interfaceC0754Lz2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0754Lz = (InterfaceC0754Lz) this.f45515b;
            RQ1.m7017d(obj);
        }
        M22.m5248b(interfaceC0754Lz.mo2469b());
        if (AbstractC11432vY1.m25447d(interfaceC0754Lz)) {
            this.f45517d.f20339b.invoke();
        }
        return C8313Tf1.f11463a;
    }
}
