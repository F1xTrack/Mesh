package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: m9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5830m9 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ C5257j9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5830m9(C5257j9 c5257j9, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.a = c5257j9;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C5830m9(this.a, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C5830m9 c5830m9 = (C5830m9) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        c5830m9.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        this.a.invoke();
        return C1518Tf1.a;
    }
}
