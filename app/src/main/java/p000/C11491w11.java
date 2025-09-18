package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: w11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11491w11 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f44653a;

    /* renamed from: b */
    public /* synthetic */ Object f44654b;

    /* renamed from: c */
    public final /* synthetic */ I11 f44655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11491w11(I11 i11, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f44655c = i11;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        C11491w11 c11491w11 = new C11491w11(this.f44655c, interfaceC1382Vy);
        c11491w11.f44654b = obj;
        return c11491w11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11491w11) create((InterfaceC6748rW) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f44653a;
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.m7017d(obj);
            return c8313Tf1;
        }
        RQ1.m7017d(obj);
        InterfaceC6748rW interfaceC6748rW = (InterfaceC6748rW) this.f44654b;
        I11 i11 = this.f44655c;
        AbstractC11880z41 abstractC11880z41 = (AbstractC11880z41) i11.f4656f.m489e();
        if (!(abstractC11880z41 instanceof C0013AC)) {
            i11.f4658h.m24403B(new C10723q11(abstractC11880z41));
        }
        C11235u11 c11235u11 = new C11235u11(abstractC11880z41, null);
        this.f44653a = 1;
        i11.f4656f.collect(new C7143xW(new SO0(), new C6915tu(2, interfaceC6748rW), c11235u11), this);
        return enumC0817Mz;
    }
}
