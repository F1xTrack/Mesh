package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: y00 */
/* loaded from: classes2.dex */
public final class C8089y00 {
    public final AbstractC7709w00 a;
    public final Object b;
    public final A00 c;
    public final C7899x00 d;
    public final Method e;

    public C8089y00(AbstractC7709w00 abstractC7709w00, Object obj, A00 a00, C7899x00 c7899x00, Class cls) {
        if (abstractC7709w00 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c7899x00.b == EnumC6337oo1.f && a00 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = abstractC7709w00;
        this.b = obj;
        this.c = a00;
        this.d = c7899x00;
        if (!InterfaceC6976s90.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException(AbstractC7209tN0.z(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
        }
    }

    public final Object a(Object obj) {
        if (this.d.b.a != EnumC6909ro1.i) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.d.b.a == EnumC6909ro1.i ? Integer.valueOf(((InterfaceC6976s90) obj).a()) : obj;
    }
}
