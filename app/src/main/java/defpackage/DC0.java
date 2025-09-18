package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class DC0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC4286i71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DC0(Function2 function2, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = (AbstractC4286i71) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        DC0 dc0 = new DC0(this.c, interfaceC1729Vy);
        dc0.b = obj;
        return dc0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DC0) create((C0546Gt0) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            C0546Gt0 c0546Gt0 = (C0546Gt0) this.b;
            this.a = 1;
            obj = this.c.invoke(c0546Gt0, this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        C0546Gt0 c0546Gt02 = (C0546Gt0) obj;
        c0546Gt02.b.set(true);
        return c0546Gt02;
    }
}
