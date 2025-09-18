package defpackage;

/* renamed from: s80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6973s80 implements InterfaceC1845Xk1 {
    public final C1689Vk1[] a;

    public C6973s80(C1689Vk1... c1689Vk1Arr) {
        O90.f(c1689Vk1Arr, "initializers");
        this.a = c1689Vk1Arr;
    }

    @Override // defpackage.InterfaceC1845Xk1
    public final AbstractC1611Uk1 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // defpackage.InterfaceC1845Xk1
    public final AbstractC1611Uk1 b(Class cls, C0312Dt0 c0312Dt0) {
        AbstractC1611Uk1 abstractC1611Uk1 = null;
        for (C1689Vk1 c1689Vk1 : this.a) {
            if (c1689Vk1.a.equals(cls)) {
                abstractC1611Uk1 = (AbstractC1611Uk1) XS0.k.invoke(c0312Dt0);
            }
        }
        if (abstractC1611Uk1 != null) {
            return abstractC1611Uk1;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
