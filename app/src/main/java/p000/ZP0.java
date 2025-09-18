package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ZP0 extends VP0 {

    /* renamed from: e */
    public static final HashMap f14880e;

    /* renamed from: b */
    public final Constructor f14881b;

    /* renamed from: c */
    public final Object[] f14882c;

    /* renamed from: d */
    public final HashMap f14883d;

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
        f14880e = map;
    }

    public ZP0(Class cls, LinkedHashMap linkedHashMap) throws SecurityException {
        super(linkedHashMap);
        this.f14883d = new HashMap();
        QP1 qp1 = PP0.f9065a;
        Constructor constructorMo4966b = qp1.mo4966b(cls);
        this.f14881b = constructorMo4966b;
        PP0.m6363e(constructorMo4966b);
        String[] strArrMo4967c = qp1.mo4967c(cls);
        for (int i = 0; i < strArrMo4967c.length; i++) {
            this.f14883d.put(strArrMo4967c[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f14881b.getParameterTypes();
        this.f14882c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f14882c[i2] = f14880e.get(parameterTypes[i2]);
        }
    }
}
