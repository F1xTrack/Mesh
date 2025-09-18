package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class YP0 extends UP0 {
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

    public YP0(Class cls, LinkedHashMap linkedHashMap) throws SecurityException {
        super(linkedHashMap);
        this.d = new HashMap();
        NP1 np1 = OP0.a;
        Constructor constructorC = np1.c(cls);
        this.b = constructorC;
        OP0.e(constructorC);
        String[] strArrD = np1.d(cls);
        for (int i = 0; i < strArrD.length; i++) {
            this.d.put(strArrD[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.UP0
    public final Object c() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.UP0
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            NP1 np1 = OP0.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + OP0.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + OP0.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Failed to invoke constructor '" + OP0.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
        }
    }

    @Override // defpackage.UP0
    public final void e(Object obj, C8206yc0 c8206yc0, SP0 sp0) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.d;
        String str = sp0.c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + OP0.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objA = sp0.i.a(c8206yc0);
        if (objA != null || !sp0.l) {
            objArr[iIntValue] = objA;
        } else {
            StringBuilder sbQ = AbstractC8235ym.q("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbQ.append(c8206yc0.D(false));
            throw new C7074sg(sbQ.toString());
        }
    }
}
