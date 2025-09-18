package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: Bg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0118Bg1 {
    public static final AbstractC0118Bg1 a;

    static {
        AbstractC0118Bg1 c8409zg1;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c8409zg1 = new C7267tg1(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    c8409zg1 = new C8409zg1();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                c8409zg1 = new C7649vg1(iIntValue, declaredMethod2);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            c8409zg1 = new C8029xg1(declaredMethod3);
        }
        a = c8409zg1;
    }

    public abstract Object a(Class cls);
}
