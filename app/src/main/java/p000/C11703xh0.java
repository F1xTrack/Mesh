package p000;

import java.util.Iterator;

/* renamed from: xh0 */
/* loaded from: classes2.dex */
public final class C11703xh0 implements InterfaceC0510I5 {

    /* renamed from: a */
    public final C6479nH f45740a;

    /* renamed from: b */
    public final InterfaceC8302Ta0 f45741b;

    /* renamed from: c */
    public final boolean f45742c;

    /* renamed from: d */
    public final C8478Wk0 f45743d;

    public C11703xh0(C6479nH c6479nH, InterfaceC8302Ta0 interfaceC8302Ta0, boolean z) {
        O90.m5968f(c6479nH, "c");
        O90.m5968f(interfaceC8302Ta0, "annotationOwner");
        this.f45740a = c6479nH;
        this.f45741b = interfaceC8302Ta0;
        this.f45742c = z;
        this.f45743d = ((C8582Yk0) ((C9773ib0) c6479nH.f38228b).f29338a).m9351c(new C7236z(23, this));
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: D */
    public final InterfaceC7116x5 mo3260D(C0664KX c0664kx) {
        InterfaceC7116x5 interfaceC7116x5;
        O90.m5968f(c0664kx, "fqName");
        InterfaceC8302Ta0 interfaceC8302Ta0 = this.f45741b;
        WO0 wo0Mo7705a = interfaceC8302Ta0.mo7705a(c0664kx);
        if (wo0Mo7705a != null && (interfaceC7116x5 = (InterfaceC7116x5) this.f45743d.invoke(wo0Mo7705a)) != null) {
            return interfaceC7116x5;
        }
        C8340Tt0 c8340Tt0 = AbstractC8250Sa0.f10860a;
        return AbstractC8250Sa0.m7397a(c0664kx, interfaceC8302Ta0, this.f45740a);
    }

    @Override // p000.InterfaceC0510I5
    /* renamed from: g */
    public final boolean mo3261g(C0664KX c0664kx) {
        return AbstractC10642pN1.m23770c(this, c0664kx);
    }

    @Override // p000.InterfaceC0510I5
    public final boolean isEmpty() {
        return this.f45741b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC8302Ta0 interfaceC8302Ta0 = this.f45741b;
        C7319Ac1 c7319Ac1M18833l = AbstractC9639hY0.m18833l(AbstractC7167xu.m25992t(interfaceC8302Ta0.getAnnotations()), this.f45743d);
        C8340Tt0 c8340Tt0 = AbstractC8250Sa0.f10860a;
        return new C7078wU(new C7141xU(AbstractC9639hY0.m18830i(AbstractC0576J8.m4177d(new InterfaceC9127dY0[]{c7319Ac1M18833l, AbstractC0576J8.m4177d(new Object[]{AbstractC8250Sa0.m7397a(AbstractC10604p41.f39815m, interfaceC8302Ta0, this.f45740a)})})), false, XS0.f13778n));
    }
}
