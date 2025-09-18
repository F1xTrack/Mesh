package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class TQ0 extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        TQ0 tq0 = new TQ0(2, interfaceC1729Vy);
        tq0.a = obj;
        return tq0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TQ0 tq0 = (TQ0) create((String) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        tq0.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        return C1518Tf1.a;
    }
}
