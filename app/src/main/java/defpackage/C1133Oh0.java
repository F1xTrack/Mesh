package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: Oh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1133Oh0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractC1289Qh0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1133Oh0(AbstractC1289Qh0 abstractC1289Qh0, int i) {
        super(0);
        this.e = i;
        this.f = abstractC1289Qh0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws C7790wQ0 {
        switch (this.e) {
            case 0:
                C4317iI c4317iI = C4317iI.m;
                InterfaceC5578kq0.a.getClass();
                C3808fd0 c3808fd0 = C3808fd0.o;
                AbstractC1289Qh0 abstractC1289Qh0 = this.f;
                abstractC1289Qh0.getClass();
                O90.f(c4317iI, "kindFilter");
                EnumC8453zv0 enumC8453zv0 = EnumC8453zv0.d;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c4317iI.a(C4317iI.l)) {
                    for (C1559Tt0 c1559Tt0 : abstractC1289Qh0.h(c4317iI, c3808fd0)) {
                        c3808fd0.invoke(c1559Tt0);
                        AbstractC3970gT1.a(linkedHashSet, abstractC1289Qh0.c(c1559Tt0, enumC8453zv0));
                    }
                }
                boolean zA = c4317iI.a(C4317iI.i);
                List list = c4317iI.a;
                if (zA && !list.contains(C3553eI.a)) {
                    for (C1559Tt0 c1559Tt02 : abstractC1289Qh0.i(c4317iI, c3808fd0)) {
                        c3808fd0.invoke(c1559Tt02);
                        linkedHashSet.addAll(abstractC1289Qh0.a(c1559Tt02, enumC8453zv0));
                    }
                }
                if (c4317iI.a(C4317iI.j) && !list.contains(C3553eI.a)) {
                    for (C1559Tt0 c1559Tt03 : abstractC1289Qh0.o(c4317iI)) {
                        c3808fd0.invoke(c1559Tt03);
                        linkedHashSet.addAll(abstractC1289Qh0.e(c1559Tt03, enumC8453zv0));
                    }
                }
                return AbstractC8069xu.b0(linkedHashSet);
            case 1:
                return this.f.h(C4317iI.o, null);
            case 2:
                return this.f.k();
            case 3:
                return this.f.i(C4317iI.p, null);
            default:
                return this.f.o(C4317iI.q);
        }
    }
}
