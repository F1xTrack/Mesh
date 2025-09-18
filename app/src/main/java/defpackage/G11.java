package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class G11 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ AbstractC4286i71 b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G11(Function2 function2, Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = (AbstractC4286i71) function2;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new G11(this.b, this.c, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G11) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [i71, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            this.a = 1;
            obj = this.b.invoke(this.c, this);
            if (obj == enumC1030Mz) {
                return enumC1030Mz;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RQ1.d(obj);
        }
        return obj;
    }
}
