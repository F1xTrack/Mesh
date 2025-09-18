package p000;

import java.util.List;

/* renamed from: vj0 */
/* loaded from: classes.dex */
public final class C11453vj0 extends AbstractC11707xj0 {
    @Override // p000.AbstractC11707xj0
    /* renamed from: a */
    public final void mo24973a(long j, Object obj) {
        ((AbstractC1196T0) ((InterfaceC11508w90) AbstractC8055Og1.f8565d.m5421i(j, obj))).f11086a = false;
    }

    @Override // p000.AbstractC11707xj0
    /* renamed from: b */
    public final void mo24974b(B00 b00, B00 b002, long j) {
        AbstractC7951Mg1 abstractC7951Mg1 = AbstractC8055Og1.f8565d;
        InterfaceC11508w90 interfaceC11508w90Mo10442e = (InterfaceC11508w90) abstractC7951Mg1.m5421i(j, b00);
        InterfaceC11508w90 interfaceC11508w90 = (InterfaceC11508w90) abstractC7951Mg1.m5421i(j, b002);
        int size = interfaceC11508w90Mo10442e.size();
        int size2 = interfaceC11508w90.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1196T0) interfaceC11508w90Mo10442e).f11086a) {
                interfaceC11508w90Mo10442e = interfaceC11508w90Mo10442e.mo10442e(size2 + size);
            }
            interfaceC11508w90Mo10442e.addAll(interfaceC11508w90);
        }
        if (size > 0) {
            interfaceC11508w90 = interfaceC11508w90Mo10442e;
        }
        AbstractC8055Og1.m6115r(j, b00, interfaceC11508w90);
    }

    @Override // p000.AbstractC11707xj0
    /* renamed from: c */
    public final List mo24975c(long j, Object obj) {
        InterfaceC11508w90 interfaceC11508w90 = (InterfaceC11508w90) AbstractC8055Og1.f8565d.m5421i(j, obj);
        if (((AbstractC1196T0) interfaceC11508w90).f11086a) {
            return interfaceC11508w90;
        }
        int size = interfaceC11508w90.size();
        InterfaceC11508w90 interfaceC11508w90Mo10442e = interfaceC11508w90.mo10442e(size == 0 ? 10 : size * 2);
        AbstractC8055Og1.m6115r(j, obj, interfaceC11508w90Mo10442e);
        return interfaceC11508w90Mo10442e;
    }
}
