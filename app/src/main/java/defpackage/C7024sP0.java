package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* renamed from: sP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7024sP0 extends AbstractC6261oP0 {
    public final Object a;

    public C7024sP0(Object obj) {
        O90.f(obj, "recordComponent");
        this.a = obj;
    }

    @Override // defpackage.AbstractC6261oP0
    public final Member b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.a;
        O90.f(obj, "recordComponent");
        ES1 es1 = F22.a;
        Method method = null;
        if (es1 == null) {
            Class<?> cls = obj.getClass();
            try {
                es1 = new ES1(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), false, 13);
            } catch (NoSuchMethodException unused) {
                es1 = new ES1(method, method, false, 13);
            }
            F22.a = es1;
        }
        Method method2 = (Method) es1.c;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            O90.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final InterfaceC7823wb0 f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.a;
        O90.f(obj, "recordComponent");
        ES1 es1 = F22.a;
        Class cls = null;
        if (es1 == null) {
            Class<?> cls2 = obj.getClass();
            try {
                es1 = new ES1(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null), false, 13);
            } catch (NoSuchMethodException unused) {
                es1 = new ES1(cls, cls, false, 13);
            }
            F22.a = es1;
        }
        Method method = (Method) es1.b;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            O90.d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C4339iP0(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
