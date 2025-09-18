package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class CZ0 extends AbstractC4286i71 implements Function2 {
    public FZ0 a;
    public int b;
    public final /* synthetic */ FZ0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CZ0(FZ0 fz0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = fz0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new CZ0(this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CZ0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        FZ0 fz0;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.b;
        if (i == 0) {
            RQ1.d(obj);
            FZ0 fz02 = this.c;
            InterfaceC6472pW data = fz02.a.getData();
            this.a = fz02;
            this.b = 1;
            Object objB = AbstractC5615l12.b(data, this);
            if (objB == enumC1030Mz) {
                return enumC1030Mz;
            }
            fz0 = fz02;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fz0 = this.a;
            RQ1.d(obj);
        }
        FZ0.a(fz0, new C0546Gt0(AbstractC7096sn0.q(((C0546Gt0) obj).a()), true));
        return C1518Tf1.a;
    }
}
