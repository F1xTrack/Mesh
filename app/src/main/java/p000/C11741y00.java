package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: y00 */
/* loaded from: classes2.dex */
public final class C11741y00 {

    /* renamed from: a */
    public final AbstractC11487w00 f46003a;

    /* renamed from: b */
    public final Object f46004b;

    /* renamed from: c */
    public final A00 f46005c;

    /* renamed from: d */
    public final C11614x00 f46006d;

    /* renamed from: e */
    public final Method f46007e;

    public C11741y00(AbstractC11487w00 abstractC11487w00, Object obj, A00 a00, C11614x00 c11614x00, Class cls) {
        if (abstractC11487w00 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c11614x00.f45252b == EnumC10568oo1.f39278f && a00 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f46003a = abstractC11487w00;
        this.f46004b = obj;
        this.f46005c = a00;
        this.f46006d = c11614x00;
        if (!InterfaceC10997s90.class.isAssignableFrom(cls)) {
            this.f46007e = null;
            return;
        }
        try {
            this.f46007e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException(AbstractC11153tN0.m24914z(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
        }
    }

    /* renamed from: a */
    public final Object m26030a(Object obj) {
        if (this.f46006d.f45252b.f39281a != EnumC10952ro1.f41915i) {
            return obj;
        }
        try {
            return this.f46007e.invoke(null, (Integer) obj);
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

    /* renamed from: b */
    public final Object m26031b(Object obj) {
        return this.f46006d.f45252b.f39281a == EnumC10952ro1.f41915i ? Integer.valueOf(((InterfaceC10997s90) obj).mo2106a()) : obj;
    }
}
