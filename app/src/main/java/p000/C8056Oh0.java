package p000;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: Oh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8056Oh0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f8572e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC8160Qh0 f8573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8056Oh0(AbstractC8160Qh0 abstractC8160Qh0, int i) {
        super(0);
        this.f8572e = i;
        this.f8573f = abstractC8160Qh0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws C11542wQ0 {
        switch (this.f8572e) {
            case 0:
                C4233iI c4233iI = C4233iI.f29058m;
                InterfaceC10059kq0.f36722a.getClass();
                C9393fd0 c9393fd0 = C9393fd0.f27289o;
                AbstractC8160Qh0 abstractC8160Qh0 = this.f8573f;
                abstractC8160Qh0.getClass();
                O90.m5968f(c4233iI, "kindFilter");
                EnumC11985zv0 enumC11985zv0 = EnumC11985zv0.f47097d;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (c4233iI.m18998a(C4233iI.f29057l)) {
                    for (C8340Tt0 c8340Tt0 : abstractC8160Qh0.mo1772h(c4233iI, c9393fd0)) {
                        c9393fd0.invoke(c8340Tt0);
                        AbstractC9502gT1.m18571a(linkedHashSet, abstractC8160Qh0.mo1770c(c8340Tt0, enumC11985zv0));
                    }
                }
                boolean zM18998a = c4233iI.m18998a(C4233iI.f29054i);
                List list = c4233iI.f29065a;
                if (zM18998a && !list.contains(C3981eI.f26650a)) {
                    for (C8340Tt0 c8340Tt02 : abstractC8160Qh0.mo1773i(c4233iI, c9393fd0)) {
                        c9393fd0.invoke(c8340Tt02);
                        linkedHashSet.addAll(abstractC8160Qh0.mo1769a(c8340Tt02, enumC11985zv0));
                    }
                }
                if (c4233iI.m18998a(C4233iI.f29055j) && !list.contains(C3981eI.f26650a)) {
                    for (C8340Tt0 c8340Tt03 : abstractC8160Qh0.mo1778o(c4233iI)) {
                        c9393fd0.invoke(c8340Tt03);
                        linkedHashSet.addAll(abstractC8160Qh0.mo1771e(c8340Tt03, enumC11985zv0));
                    }
                }
                return AbstractC7167xu.m25982b0(linkedHashSet);
            case 1:
                return this.f8573f.mo1772h(C4233iI.f29060o, null);
            case 2:
                return this.f8573f.mo1775k();
            case 3:
                return this.f8573f.mo1773i(C4233iI.f29061p, null);
            default:
                return this.f8573f.mo1778o(C4233iI.f29062q);
        }
    }
}
