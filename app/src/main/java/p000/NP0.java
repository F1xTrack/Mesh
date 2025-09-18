package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class NP0 extends QP1 {

    /* renamed from: a */
    public final Method f7762a = Class.class.getMethod("isRecord", null);

    /* renamed from: b */
    public final Method f7763b;

    /* renamed from: c */
    public final Method f7764c;

    /* renamed from: d */
    public final Method f7765d;

    public NP0() throws NoSuchMethodException, SecurityException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.f7763b = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f7764c = componentType.getMethod("getName", null);
        this.f7765d = componentType.getMethod("getType", null);
    }

    @Override // p000.QP1
    /* renamed from: a */
    public final Method mo4965a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.QP1
    /* renamed from: b */
    public final Constructor mo4966b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f7763b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f7765d.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.QP1
    /* renamed from: c */
    public final String[] mo4967c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f7763b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f7764c.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.QP1
    /* renamed from: d */
    public final boolean mo4968d(Class cls) {
        try {
            return ((Boolean) this.f7762a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
