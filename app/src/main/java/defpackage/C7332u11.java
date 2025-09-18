package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: u11 */
/* loaded from: classes.dex */
public final class C7332u11 extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AbstractC8295z41 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7332u11(AbstractC8295z41 abstractC8295z41, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = abstractC8295z41;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C7332u11 c7332u11 = new C7332u11(this.b, interfaceC1729Vy);
        c7332u11.a = obj;
        return c7332u11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7332u11) create((AbstractC8295z41) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        AbstractC8295z41 abstractC8295z41 = (AbstractC8295z41) this.a;
        AbstractC8295z41 abstractC8295z412 = this.b;
        boolean z = false;
        if (!(abstractC8295z412 instanceof AC) && !(abstractC8295z412 instanceof C8181yU) && abstractC8295z41 == abstractC8295z412) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
