package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class MP0 extends NP1 {

    /* renamed from: a */
    public final Method f7147a = Class.class.getMethod("isRecord", null);

    /* renamed from: b */
    public final Method f7148b;

    /* renamed from: c */
    public final Method f7149c;

    /* renamed from: d */
    public final Method f7150d;

    public MP0() throws NoSuchMethodException, SecurityException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.f7148b = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f7149c = componentType.getMethod("getName", null);
        this.f7150d = componentType.getMethod("getType", null);
    }

    @Override // p000.NP1
    /* renamed from: b */
    public final Method mo4630b(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.NP1
    /* renamed from: c */
    public final Constructor mo4631c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f7148b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f7150d.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.NP1
    /* renamed from: d */
    public final String[] mo4632d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f7148b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f7149c.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // p000.NP1
    /* renamed from: e */
    public final boolean mo4633e(Class cls) {
        try {
            return ((Boolean) this.f7147a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
