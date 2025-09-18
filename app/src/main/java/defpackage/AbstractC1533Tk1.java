package defpackage;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManager;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.huawei.hms.rn.push.constants.RemoteMessageAttributes;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Tk1 */
/* loaded from: classes.dex */
public abstract class AbstractC1533Tk1 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static AbstractC1455Sk1 a(InterfaceC5297jM0 interfaceC5297jM0, Method method, Class cls) {
        if (cls == Dynamic.class) {
            return new C1065Nk1(interfaceC5297jM0, "mixed", method, 4);
        }
        if (cls == Boolean.TYPE) {
            return new C1143Ok1(interfaceC5297jM0, method, interfaceC5297jM0.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return RemoteMessageAttributes.COLOR.equals(interfaceC5297jM0.customType()) ? new C1221Pk1(interfaceC5297jM0, method, interfaceC5297jM0.defaultInt(), 0) : new C1221Pk1(interfaceC5297jM0, method, interfaceC5297jM0.defaultInt(), 1);
        }
        if (cls == Float.TYPE) {
            return new C1377Rk1(interfaceC5297jM0, method, interfaceC5297jM0.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new C1299Qk1(interfaceC5297jM0, method, interfaceC5297jM0.defaultDouble());
        }
        if (cls == String.class) {
            return new C1065Nk1(interfaceC5297jM0, "String", method, 6);
        }
        if (cls == Boolean.class) {
            return new C1065Nk1(interfaceC5297jM0, "boolean", method, 1);
        }
        if (cls == Integer.class) {
            return RemoteMessageAttributes.COLOR.equals(interfaceC5297jM0.customType()) ? new C1065Nk1(interfaceC5297jM0, "mixed", method, 2) : new C1065Nk1(interfaceC5297jM0, NotificationConstants.NUMBER, method, 3);
        }
        if (cls == ReadableArray.class) {
            return new C1065Nk1(interfaceC5297jM0, "Array", method, 0);
        }
        if (cls == ReadableMap.class) {
            return new C1065Nk1(interfaceC5297jM0, "Map", method, 5);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    public static void b(InterfaceC5488kM0 interfaceC5488kM0, Method method, Class cls, HashMap map) {
        String[] strArrNames = interfaceC5488kM0.names();
        int i = 0;
        if (cls == Dynamic.class) {
            for (int i2 = 0; i2 < strArrNames.length; i2++) {
                map.put(strArrNames[i2], new C1065Nk1(interfaceC5488kM0, "mixed", method, i2, 4));
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i < strArrNames.length) {
                if (RemoteMessageAttributes.COLOR.equals(interfaceC5488kM0.customType())) {
                    map.put(strArrNames[i], new C1221Pk1(interfaceC5488kM0, method, i, interfaceC5488kM0.defaultInt(), 0));
                } else {
                    map.put(strArrNames[i], new C1221Pk1(interfaceC5488kM0, method, i, interfaceC5488kM0.defaultInt(), 1));
                }
                i++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i < strArrNames.length) {
                map.put(strArrNames[i], new C1377Rk1(interfaceC5488kM0, method, i, interfaceC5488kM0.defaultFloat()));
                i++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i < strArrNames.length) {
                map.put(strArrNames[i], new C1299Qk1(interfaceC5488kM0, method, i, interfaceC5488kM0.defaultDouble()));
                i++;
            }
            return;
        }
        if (cls == Integer.class) {
            for (int i3 = 0; i3 < strArrNames.length; i3++) {
                if (RemoteMessageAttributes.COLOR.equals(interfaceC5488kM0.customType())) {
                    map.put(strArrNames[i3], new C1065Nk1(interfaceC5488kM0, "mixed", method, i3, 2));
                } else {
                    map.put(strArrNames[i3], new C1065Nk1(interfaceC5488kM0, NotificationConstants.NUMBER, method, i3, 3));
                }
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
    }

    public static Map c(Class cls) throws SecurityException {
        HashMap map = b;
        if (cls == null) {
            return map;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == DM0.class) {
                return map;
            }
        }
        HashMap map2 = a;
        Map map3 = (Map) map2.get(cls);
        if (map3 != null) {
            return map3;
        }
        HashMap map4 = new HashMap(c(cls.getSuperclass()));
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC5297jM0 interfaceC5297jM0 = (InterfaceC5297jM0) method.getAnnotation(InterfaceC5297jM0.class);
            if (interfaceC5297jM0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map4.put(interfaceC5297jM0.name(), a(interfaceC5297jM0, method, parameterTypes[0]));
            }
            InterfaceC5488kM0 interfaceC5488kM0 = (InterfaceC5488kM0) method.getAnnotation(InterfaceC5488kM0.class);
            if (interfaceC5488kM0 != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                }
                b(interfaceC5488kM0, method, parameterTypes2[1], map4);
            }
        }
        map2.put(cls, map4);
        return map4;
    }

    public static Map d(Class cls) throws SecurityException {
        if (cls == ViewManager.class) {
            return b;
        }
        HashMap map = a;
        Map map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(d(cls.getSuperclass()));
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC5297jM0 interfaceC5297jM0 = (InterfaceC5297jM0) method.getAnnotation(InterfaceC5297jM0.class);
            if (interfaceC5297jM0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                }
                map3.put(interfaceC5297jM0.name(), a(interfaceC5297jM0, method, parameterTypes[1]));
            }
            InterfaceC5488kM0 interfaceC5488kM0 = (InterfaceC5488kM0) method.getAnnotation(InterfaceC5488kM0.class);
            if (interfaceC5488kM0 != null) {
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
                b(interfaceC5488kM0, method, parameterTypes2[2], map3);
            }
        }
        map.put(cls, map3);
        return map3;
    }
}
