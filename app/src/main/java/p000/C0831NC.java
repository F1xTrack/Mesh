package p000;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: NC */
/* loaded from: classes.dex */
public final class C0831NC extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f7545a;

    /* renamed from: b */
    public /* synthetic */ Object f7546b;

    /* renamed from: c */
    public final /* synthetic */ List f7547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0831NC(List list, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f7547c = list;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C0831NC c0831nc = new C0831NC(this.f7547c, interfaceC1382Vy);
        c0831nc.f7546b = obj;
        return c0831nc;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0831NC) create((A11) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f7545a;
        if (i == 0) {
            RQ1.m7017d(obj);
            A11 a11 = (A11) this.f7546b;
            this.f7545a = 1;
            if (AbstractC9258eZ1.m18008a(this.f7547c, a11, this) == enumC0817Mz) {
                return enumC0817Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
        }
        return C8313Tf1.f11463a;
    }
}
