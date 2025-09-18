package p000;

/* renamed from: s80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10995s80 implements InterfaceC8531Xk1 {

    /* renamed from: a */
    public final C8427Vk1[] f42277a;

    public C10995s80(C8427Vk1... c8427Vk1Arr) {
        O90.m5968f(c8427Vk1Arr, "initializers");
        this.f42277a = c8427Vk1Arr;
    }

    @Override // p000.InterfaceC8531Xk1
    /* renamed from: a */
    public final AbstractC8375Uk1 mo8847a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // p000.InterfaceC8531Xk1
    /* renamed from: b */
    public final AbstractC8375Uk1 mo8848b(Class cls, C7508Dt0 c7508Dt0) {
        AbstractC8375Uk1 abstractC8375Uk1 = null;
        for (C8427Vk1 c8427Vk1 : this.f42277a) {
            if (c8427Vk1.f12712a.equals(cls)) {
                abstractC8375Uk1 = (AbstractC8375Uk1) XS0.f13775k.invoke(c7508Dt0);
            }
        }
        if (abstractC8375Uk1 != null) {
            return abstractC8375Uk1;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
