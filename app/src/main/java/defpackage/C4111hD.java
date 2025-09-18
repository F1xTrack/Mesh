package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: hD */
/* loaded from: classes2.dex */
public final class C4111hD extends AbstractC4286i71 implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ LC0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4111hD(Object obj, LC0 lc0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = obj;
        this.c = lc0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        C4111hD c4111hD = new C4111hD(this.b, this.c, interfaceC1729Vy);
        c4111hD.a = obj;
        return c4111hD;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4111hD c4111hD = (C4111hD) create((C0546Gt0) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        c4111hD.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        C0546Gt0 c0546Gt0 = (C0546Gt0) this.a;
        LC0 lc0 = this.c;
        Object obj2 = this.b;
        if (obj2 != null) {
            c0546Gt0.getClass();
            O90.f(lc0, "key");
            c0546Gt0.d(lc0, obj2);
        } else {
            c0546Gt0.c(lc0);
        }
        return C1518Tf1.a;
    }
}
