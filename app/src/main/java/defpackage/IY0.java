package defpackage;

/* loaded from: classes.dex */
public final class IY0 extends AbstractC4286i71 implements InterfaceC6481pZ {
    public int a;
    public /* synthetic */ InterfaceC6853rW b;

    @Override // defpackage.InterfaceC6481pZ
    public final Object b(Object obj, Object obj2, Object obj3) {
        IY0 iy0 = new IY0(3, (InterfaceC1729Vy) obj3);
        iy0.b = (InterfaceC6853rW) obj;
        return iy0.invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            InterfaceC6853rW interfaceC6853rW = this.b;
            C0546Gt0 c0546Gt0 = new C0546Gt0(true);
            this.b = null;
            this.a = 1;
            if (interfaceC6853rW.emit(c0546Gt0, this) == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return C1518Tf1.a;
    }
}
