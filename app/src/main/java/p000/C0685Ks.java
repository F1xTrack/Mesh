package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Ks */
/* loaded from: classes.dex */
public final class C0685Ks {

    /* renamed from: c */
    public static final C0685Ks f6364c = new C0685Ks();

    /* renamed from: a */
    public final HashMap f6365a = new HashMap();

    /* renamed from: b */
    public final HashMap f6366b = new HashMap();

    /* renamed from: b */
    public static void m4773b(HashMap map, C0622Js c0622Js, EnumC7382Bi0 enumC7382Bi0, Class cls) {
        EnumC7382Bi0 enumC7382Bi02 = (EnumC7382Bi0) map.get(c0622Js);
        if (enumC7382Bi02 == null || enumC7382Bi0 == enumC7382Bi02) {
            if (enumC7382Bi02 == null) {
                map.put(c0622Js, enumC7382Bi0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0622Js.f5761b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC7382Bi02 + ", new value " + enumC7382Bi0);
    }

    /* renamed from: a */
    public final C0559Is m4774a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f6365a;
        if (superclass != null) {
            C0559Is c0559IsM4774a = (C0559Is) map2.get(superclass);
            if (c0559IsM4774a == null) {
                c0559IsM4774a = m4774a(superclass, null);
            }
            map.putAll(c0559IsM4774a.f5188b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0559Is c0559IsM4774a2 = (C0559Is) map2.get(cls2);
            if (c0559IsM4774a2 == null) {
                c0559IsM4774a2 = m4774a(cls2, null);
            }
            for (Map.Entry entry : c0559IsM4774a2.f5188b.entrySet()) {
                m4773b(map, (C0622Js) entry.getKey(), (EnumC7382Bi0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC8504Wx0 interfaceC8504Wx0 = (InterfaceC8504Wx0) method.getAnnotation(InterfaceC8504Wx0.class);
            if (interfaceC8504Wx0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC7902Li0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC7382Bi0 enumC7382Bi0Value = interfaceC8504Wx0.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC7382Bi0.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC7382Bi0Value != EnumC7382Bi0.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m4773b(map, new C0622Js(i, method), enumC7382Bi0Value, cls);
                z = true;
            }
        }
        C0559Is c0559Is = new C0559Is(map);
        map2.put(cls, c0559Is);
        this.f6366b.put(cls, Boolean.valueOf(z));
        return c0559Is;
    }
}
