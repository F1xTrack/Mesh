package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: Dg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0274Dg1 {
    public static final AbstractC0274Dg1 a;

    static {
        AbstractC0274Dg1 c0040Ag1;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c0040Ag1 = new C7458ug1(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    c0040Ag1 = new C0040Ag1();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                c0040Ag1 = new C7839wg1(iIntValue, declaredMethod2);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            c0040Ag1 = new C8219yg1(declaredMethod3);
        }
        a = c0040Ag1;
    }

    public abstract Object a(Class cls);
}
