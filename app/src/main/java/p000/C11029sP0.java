package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* renamed from: sP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11029sP0 extends AbstractC10517oP0 {

    /* renamed from: a */
    public final Object f42421a;

    public C11029sP0(Object obj) {
        O90.m5968f(obj, "recordComponent");
        this.f42421a = obj;
    }

    @Override // p000.AbstractC10517oP0
    /* renamed from: b */
    public final Member mo22030b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f42421a;
        O90.m5968f(obj, "recordComponent");
        ES1 es1 = F22.f3037a;
        Method method = null;
        if (es1 == null) {
            Class<?> cls = obj.getClass();
            try {
                es1 = new ES1(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), false, 13);
            } catch (NoSuchMethodException unused) {
                es1 = new ES1(method, method, false, 13);
            }
            F22.f3037a = es1;
        }
        Method method2 = (Method) es1.f2709c;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            O90.m5966d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    /* renamed from: f */
    public final InterfaceC11564wb0 m24737f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f42421a;
        O90.m5968f(obj, "recordComponent");
        ES1 es1 = F22.f3037a;
        Class cls = null;
        if (es1 == null) {
            Class<?> cls2 = obj.getClass();
            try {
                es1 = new ES1(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null), false, 13);
            } catch (NoSuchMethodException unused) {
                es1 = new ES1(cls, cls, false, 13);
            }
            F22.f3037a = es1;
        }
        Method method = (Method) es1.f2708b;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            O90.m5966d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C9749iP0(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
