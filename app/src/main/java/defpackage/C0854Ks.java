package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Ks, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854Ks {
    public static final C0854Ks c = new C0854Ks();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, C0776Js c0776Js, EnumC0123Bi0 enumC0123Bi0, Class cls) {
        EnumC0123Bi0 enumC0123Bi02 = (EnumC0123Bi0) map.get(c0776Js);
        if (enumC0123Bi02 == null || enumC0123Bi0 == enumC0123Bi02) {
            if (enumC0123Bi02 == null) {
                map.put(c0776Js, enumC0123Bi0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0776Js.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0123Bi02 + ", new value " + enumC0123Bi0);
    }

    public final C0698Is a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            C0698Is c0698IsA = (C0698Is) map2.get(superclass);
            if (c0698IsA == null) {
                c0698IsA = a(superclass, null);
            }
            map.putAll(c0698IsA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0698Is c0698IsA2 = (C0698Is) map2.get(cls2);
            if (c0698IsA2 == null) {
                c0698IsA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0698IsA2.b.entrySet()) {
                b(map, (C0776Js) entry.getKey(), (EnumC0123Bi0) entry.getValue(), cls);
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
            InterfaceC1805Wx0 interfaceC1805Wx0 = (InterfaceC1805Wx0) method.getAnnotation(InterfaceC1805Wx0.class);
            if (interfaceC1805Wx0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0903Li0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0123Bi0 enumC0123Bi0Value = interfaceC1805Wx0.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0123Bi0.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0123Bi0Value != EnumC0123Bi0.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0776Js(i, method), enumC0123Bi0Value, cls);
                z = true;
            }
        }
        C0698Is c0698Is = new C0698Is(map);
        map2.put(cls, c0698Is);
        this.b.put(cls, Boolean.valueOf(z));
        return c0698Is;
    }
}
