package p000;

import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public final class AP0 implements InterfaceC6434mZ {

    /* renamed from: c */
    public static final C6914tt f186c = new C6914tt(20);

    /* renamed from: a */
    public final InterfaceC6434mZ f187a;

    /* renamed from: b */
    public volatile SoftReference f188b;

    public AP0(InterfaceC7158xl interfaceC7158xl, InterfaceC6434mZ interfaceC6434mZ) {
        if (interfaceC6434mZ == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f188b = null;
        this.f187a = interfaceC6434mZ;
        if (interfaceC7158xl != null) {
            this.f188b = new SoftReference(interfaceC7158xl);
        }
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.f188b;
        Object obj2 = f186c;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f187a.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f188b = new SoftReference(obj2);
        return objInvoke;
    }
}
