package p000;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManager;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Tk1 */
/* loaded from: classes.dex */
public abstract class AbstractC8323Tk1 {

    /* renamed from: a */
    public static final HashMap f11493a = new HashMap();

    /* renamed from: b */
    public static final HashMap f11494b = new HashMap();

    /* renamed from: a */
    public static AbstractC8271Sk1 m7733a(InterfaceC9871jM0 interfaceC9871jM0, Method method, Class cls) {
        if (cls == Dynamic.class) {
            return new C8011Nk1(interfaceC9871jM0, "mixed", method, 4);
        }
        if (cls == Boolean.TYPE) {
            return new C8063Ok1(interfaceC9871jM0, method, interfaceC9871jM0.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return RemoteMessageAttributes.COLOR.equals(interfaceC9871jM0.customType()) ? new C8115Pk1(interfaceC9871jM0, method, interfaceC9871jM0.defaultInt(), 0) : new C8115Pk1(interfaceC9871jM0, method, interfaceC9871jM0.defaultInt(), 1);
        }
        if (cls == Float.TYPE) {
            return new C8219Rk1(interfaceC9871jM0, method, interfaceC9871jM0.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new C8167Qk1(interfaceC9871jM0, method, interfaceC9871jM0.defaultDouble());
        }
        if (cls == String.class) {
            return new C8011Nk1(interfaceC9871jM0, "String", method, 6);
        }
        if (cls == Boolean.class) {
            return new C8011Nk1(interfaceC9871jM0, "boolean", method, 1);
        }
        if (cls == Integer.class) {
            return RemoteMessageAttributes.COLOR.equals(interfaceC9871jM0.customType()) ? new C8011Nk1(interfaceC9871jM0, "mixed", method, 2) : new C8011Nk1(interfaceC9871jM0, NotificationConstants.NUMBER, method, 3);
        }
        if (cls == ReadableArray.class) {
            return new C8011Nk1(interfaceC9871jM0, "Array", method, 0);
        }
        if (cls == ReadableMap.class) {
            return new C8011Nk1(interfaceC9871jM0, "Map", method, 5);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* renamed from: b */
    public static void m7734b(InterfaceC9999kM0 interfaceC9999kM0, Method method, Class cls, HashMap map) {
        String[] strArrNames = interfaceC9999kM0.names();
        int i = 0;
        if (cls == Dynamic.class) {
            for (int i2 = 0; i2 < strArrNames.length; i2++) {
                map.put(strArrNames[i2], new C8011Nk1(interfaceC9999kM0, "mixed", method, i2, 4));
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i < strArrNames.length) {
                if (RemoteMessageAttributes.COLOR.equals(interfaceC9999kM0.customType())) {
                    map.put(strArrNames[i], new C8115Pk1(interfaceC9999kM0, method, i, interfaceC9999kM0.defaultInt(), 0));
                } else {
                    map.put(strArrNames[i], new C8115Pk1(interfaceC9999kM0, method, i, interfaceC9999kM0.defaultInt(), 1));
                }
                i++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i < strArrNames.length) {
                map.put(strArrNames[i], new C8219Rk1(interfaceC9999kM0, method, i, interfaceC9999kM0.defaultFloat()));
                i++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i < strArrNames.length) {
                map.put(strArrNames[i], new C8167Qk1(interfaceC9999kM0, method, i, interfaceC9999kM0.defaultDouble()));
                i++;
            }
            return;
        }
        if (cls == Integer.class) {
            for (int i3 = 0; i3 < strArrNames.length; i3++) {
                if (RemoteMessageAttributes.COLOR.equals(interfaceC9999kM0.customType())) {
                    map.put(strArrNames[i3], new C8011Nk1(interfaceC9999kM0, "mixed", method, i3, 2));
                } else {
                    map.put(strArrNames[i3], new C8011Nk1(interfaceC9999kM0, NotificationConstants.NUMBER, method, i3, 3));
                }
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    /* renamed from: c */
    public static Map m7735c(Class cls) throws SecurityException {
        HashMap map = f11494b;
        if (cls == null) {
            return map;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == DM0.class) {
                return map;
            }
        }
        HashMap map2 = f11493a;
        Map map3 = (Map) map2.get(cls);
        if (map3 != null) {
            return map3;
        }
        HashMap map4 = new HashMap(m7735c(cls.getSuperclass()));
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC9871jM0 interfaceC9871jM0 = (InterfaceC9871jM0) method.getAnnotation(InterfaceC9871jM0.class);
            if (interfaceC9871jM0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map4.put(interfaceC9871jM0.name(), m7733a(interfaceC9871jM0, method, parameterTypes[0]));
            }
            InterfaceC9999kM0 interfaceC9999kM0 = (InterfaceC9999kM0) method.getAnnotation(InterfaceC9999kM0.class);
            if (interfaceC9999kM0 != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                m7734b(interfaceC9999kM0, method, parameterTypes2[1], map4);
            }
        }
        map2.put(cls, map4);
        return map4;
    }

    /* renamed from: d */
    public static Map m7736d(Class cls) throws SecurityException {
        if (cls == ViewManager.class) {
            return f11494b;
        }
        HashMap map = f11493a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(m7736d(cls.getSuperclass()));
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC9871jM0 interfaceC9871jM0 = (InterfaceC9871jM0) method.getAnnotation(InterfaceC9871jM0.class);
            if (interfaceC9871jM0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map3.put(interfaceC9871jM0.name(), m7733a(interfaceC9871jM0, method, parameterTypes[1]));
            }
            InterfaceC9999kM0 interfaceC9999kM0 = (InterfaceC9999kM0) method.getAnnotation(InterfaceC9999kM0.class);
            if (interfaceC9999kM0 != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                m7734b(interfaceC9999kM0, method, parameterTypes2[2], map3);
            }
        }
        map.put(cls, map3);
        return map3;
    }
}
