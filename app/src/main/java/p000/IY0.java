package p000;

/* loaded from: classes.dex */
public final class IY0 extends AbstractC9714i71 implements InterfaceC6625pZ {

    /* renamed from: a */
    public int f4981a;

    /* renamed from: b */
    public /* synthetic */ InterfaceC6748rW f4982b;

    @Override // p000.InterfaceC6625pZ
    /* renamed from: b */
    public final Object mo300b(Object obj, Object obj2, Object obj3) {
        IY0 iy0 = new IY0(3, (InterfaceC1382Vy) obj3);
        iy0.f4982b = (InterfaceC6748rW) obj;
        return iy0.invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f4981a;
        if (i == 0) {
            RQ1.m7017d(obj);
            InterfaceC6748rW interfaceC6748rW = this.f4982b;
            C7664Gt0 c7664Gt0 = new C7664Gt0(true);
            this.f4982b = null;
            this.f4981a = 1;
            if (interfaceC6748rW.emit(c7664Gt0, this) == enumC0817Mz) {
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
