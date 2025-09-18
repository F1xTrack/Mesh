package defpackage;

/* renamed from: pI */
/* loaded from: classes2.dex */
public final class C6430pI implements InterfaceC7018sN0 {
    public Object a;
    public final /* synthetic */ C6621qI b;

    public C6430pI(Object obj, C6621qI c6621qI) {
        this.b = c6621qI;
        this.a = obj;
    }

    public final void a(Object obj, InterfaceC5927mf0 interfaceC5927mf0) {
        O90.f(interfaceC5927mf0, "property");
        if (this.b.a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.a = obj;
    }

    @Override // defpackage.InterfaceC7018sN0
    public final Object getValue(Object obj, InterfaceC5927mf0 interfaceC5927mf0) {
        O90.f(interfaceC5927mf0, "property");
        return this.a;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
