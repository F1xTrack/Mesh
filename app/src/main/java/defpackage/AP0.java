package defpackage;

import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public final class AP0 implements InterfaceC5908mZ {
    public static final C7304tt c = new C7304tt(20);
    public final InterfaceC5908mZ a;
    public volatile SoftReference b;

    public AP0(InterfaceC8042xl interfaceC8042xl, InterfaceC5908mZ interfaceC5908mZ) {
        if (interfaceC5908mZ == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.b = null;
        this.a = interfaceC5908mZ;
        if (interfaceC8042xl != null) {
            this.b = new SoftReference(interfaceC8042xl);
        }
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.b;
        Object obj2 = c;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.a.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.b = new SoftReference(obj2);
        return objInvoke;
    }
}
