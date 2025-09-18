package p000;

/* renamed from: uj0 */
/* loaded from: classes.dex */
public final class C11325uj0 extends AbstractC11580wj0 {
    @Override // p000.AbstractC11580wj0
    /* renamed from: a */
    public final void mo24772a(long j, Object obj) {
        AbstractC1133S0 abstractC1133S0 = (AbstractC1133S0) ((InterfaceC11381v90) AbstractC8003Ng1.f7951c.m5056i(j, obj));
        if (abstractC1133S0.f10523a) {
            abstractC1133S0.f10523a = false;
        }
    }

    @Override // p000.AbstractC11580wj0
    /* renamed from: b */
    public final void mo24773b(long j, Object obj, Object obj2) {
        AbstractC7899Lg1 abstractC7899Lg1 = AbstractC8003Ng1.f7951c;
        InterfaceC11381v90 interfaceC11381v90Mo9686e = (InterfaceC11381v90) abstractC7899Lg1.m5056i(j, obj);
        InterfaceC11381v90 interfaceC11381v90 = (InterfaceC11381v90) abstractC7899Lg1.m5056i(j, obj2);
        int size = interfaceC11381v90Mo9686e.size();
        int size2 = interfaceC11381v90.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1133S0) interfaceC11381v90Mo9686e).f10523a) {
                interfaceC11381v90Mo9686e = interfaceC11381v90Mo9686e.mo9686e(size2 + size);
            }
            interfaceC11381v90Mo9686e.addAll(interfaceC11381v90);
        }
        if (size > 0) {
            interfaceC11381v90 = interfaceC11381v90Mo9686e;
        }
        AbstractC8003Ng1.m5813o(j, obj, interfaceC11381v90);
    }
}
