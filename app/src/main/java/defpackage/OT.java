package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class OT extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ WT b;
    public final /* synthetic */ IT c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OT(InterfaceC1729Vy interfaceC1729Vy, IT it, WT wt) {
        super(2, interfaceC1729Vy);
        this.b = wt;
        this.c = it;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new OT(interfaceC1729Vy, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OT) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            WT wt = this.b;
            wt.getClass();
            GK gk = GK.a;
            if (AbstractC3767fP1.e(QF.c, new VT(null, this.c, wt), this) == enumC1030Mz) {
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
