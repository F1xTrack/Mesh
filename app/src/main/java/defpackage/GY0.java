package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class GY0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ MY0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GY0(MY0 my0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = my0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new GY0(this.b, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GY0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        if (i == 0) {
            RQ1.d(obj);
            MY0 my0 = this.b;
            C0999Mo1 c0999Mo1 = my0.d;
            C7307tu c7307tu = new C7307tu(1, my0);
            this.a = 1;
            if (c0999Mo1.collect(c7307tu, this) == enumC1030Mz) {
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
