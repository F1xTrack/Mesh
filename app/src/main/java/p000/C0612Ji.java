package p000;

/* renamed from: Ji */
/* loaded from: classes2.dex */
public final class C0612Ji extends AbstractC0249Dx {

    /* renamed from: b */
    public final /* synthetic */ int f5675b = 1;

    public /* synthetic */ C0612Ji(Object obj) {
        super(obj);
    }

    @Override // p000.AbstractC0249Dx
    /* renamed from: a */
    public final AbstractC7742Ig0 mo412a(InterfaceC7402Bs0 interfaceC7402Bs0) {
        switch (this.f5675b) {
            case 0:
                O90.m5968f(interfaceC7402Bs0, "module");
                AbstractC11955zg0 abstractC11955zg0Mo897h = interfaceC7402Bs0.mo897h();
                abstractC11955zg0Mo897h.getClass();
                return abstractC11955zg0Mo897h.m26509s(EnumC11005sD0.f42305f);
            case 1:
                O90.m5968f(interfaceC7402Bs0, "module");
                AbstractC11955zg0 abstractC11955zg0Mo897h2 = interfaceC7402Bs0.mo897h();
                abstractC11955zg0Mo897h2.getClass();
                return abstractC11955zg0Mo897h2.m26509s(EnumC11005sD0.f42312m);
            default:
                O90.m5968f(interfaceC7402Bs0, "module");
                AbstractC11955zg0 abstractC11955zg0Mo897h3 = interfaceC7402Bs0.mo897h();
                abstractC11955zg0Mo897h3.getClass();
                return abstractC11955zg0Mo897h3.m26509s(EnumC11005sD0.f42310k);
        }
    }

    @Override // p000.AbstractC0249Dx
    public String toString() {
        switch (this.f5675b) {
            case 1:
                return ((Number) this.f2329a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f2329a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public C0612Ji(double d) {
        super(Double.valueOf(d));
    }

    public C0612Ji(float f) {
        super(Float.valueOf(f));
    }
}
