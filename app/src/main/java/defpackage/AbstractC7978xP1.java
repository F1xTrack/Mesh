package defpackage;

/* renamed from: xP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7978xP1 {
    public static AP0 a(InterfaceC8042xl interfaceC8042xl, InterfaceC5908mZ interfaceC5908mZ) {
        if (interfaceC5908mZ != null) {
            return new AP0(interfaceC8042xl, interfaceC5908mZ);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public abstract void b(byte[] bArr, int i, int i2);
}
