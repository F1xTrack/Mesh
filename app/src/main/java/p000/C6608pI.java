package p000;

/* renamed from: pI */
/* loaded from: classes2.dex */
public final class C6608pI implements InterfaceC11025sN0 {

    /* renamed from: a */
    public Object f40012a;

    /* renamed from: b */
    public final /* synthetic */ C6671qI f40013b;

    public C6608pI(Object obj, C6671qI c6671qI) {
        this.f40013b = c6671qI;
        this.f40012a = obj;
    }

    /* renamed from: a */
    public final void m23721a(Object obj, InterfaceC10293mf0 interfaceC10293mf0) {
        O90.m5968f(interfaceC10293mf0, "property");
        if (this.f40013b.f40743a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.f40012a = obj;
    }

    @Override // p000.InterfaceC11025sN0
    public final Object getValue(Object obj, InterfaceC10293mf0 interfaceC10293mf0) {
        O90.m5968f(interfaceC10293mf0, "property");
        return this.f40012a;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f40012a + ')';
    }
}
