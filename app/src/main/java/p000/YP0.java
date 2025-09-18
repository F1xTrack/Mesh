package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class YP0 extends UP0 {

    /* renamed from: e */
    public static final HashMap f14292e;

    /* renamed from: b */
    public final Constructor f14293b;

    /* renamed from: c */
    public final Object[] f14294c;

    /* renamed from: d */
    public final HashMap f14295d;

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
        f14292e = map;
    }

    public YP0(Class cls, LinkedHashMap linkedHashMap) throws SecurityException {
        super(linkedHashMap);
        this.f14295d = new HashMap();
        NP1 np1 = OP0.f8436a;
        Constructor constructorMo4631c = np1.mo4631c(cls);
        this.f14293b = constructorMo4631c;
        OP0.m6066e(constructorMo4631c);
        String[] strArrMo4632d = np1.mo4632d(cls);
        for (int i = 0; i < strArrMo4632d.length; i++) {
            this.f14295d.put(strArrMo4632d[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f14293b.getParameterTypes();
        this.f14294c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f14294c[i2] = f14292e.get(parameterTypes[i2]);
        }
    }

    @Override // p000.UP0
    /* renamed from: c */
    public final Object mo8009c() {
        return (Object[]) this.f14294c.clone();
    }

    @Override // p000.UP0
    /* renamed from: d */
    public final Object mo8010d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f14293b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            NP1 np1 = OP0.f8436a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + OP0.m6063b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + OP0.m6063b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + OP0.m6063b(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // p000.UP0
    /* renamed from: e */
    public final void mo8011e(Object obj, C11820yc0 c11820yc0, SP0 sp0) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f14295d;
        String str = sp0.f10746c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + OP0.m6063b(this.f14293b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo480a = sp0.f10752i.mo480a(c11820yc0);
        if (objMo480a != null || !sp0.f10755l) {
            objArr[iIntValue] = objMo480a;
        } else {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM26240q.append(c11820yc0.m26176D(false));
            throw new C6838sg(sbM26240q.toString());
        }
    }
}
