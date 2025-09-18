package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class KY0 extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KY0(String str, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = str;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        KY0 ky0 = new KY0(this.b, interfaceC1729Vy);
        ky0.a = obj;
        return ky0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        KY0 ky0 = (KY0) create((C0546Gt0) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        ky0.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        C0546Gt0 c0546Gt0 = (C0546Gt0) this.a;
        c0546Gt0.getClass();
        LC0 lc0 = TB1.a;
        O90.f(lc0, "key");
        c0546Gt0.d(lc0, this.b);
        return C1518Tf1.a;
    }
}
