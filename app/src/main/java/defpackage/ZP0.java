package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ZP0 extends VP0 {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        e = map;
    }

    public ZP0(Class cls, LinkedHashMap linkedHashMap) throws SecurityException {
        super(linkedHashMap);
        this.d = new HashMap();
        QP1 qp1 = PP0.a;
        Constructor constructorB = qp1.b(cls);
        this.b = constructorB;
        PP0.e(constructorB);
        String[] strArrC = qp1.c(cls);
        for (int i = 0; i < strArrC.length; i++) {
            this.d.put(strArrC[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }
}
