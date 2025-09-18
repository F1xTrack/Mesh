package p000;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: Dg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7483Dg1 {

    /* renamed from: a */
    public static final AbstractC7483Dg1 f2155a;

    static {
        AbstractC7483Dg1 c7327Ag1;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c7327Ag1 = new C11320ug1(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    c7327Ag1 = new C7327Ag1();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                c7327Ag1 = new C11575wg1(iIntValue, declaredMethod2);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            c7327Ag1 = new C11829yg1(declaredMethod3);
        }
        f2155a = c7327Ag1;
    }

    /* renamed from: a */
    public abstract Object mo281a(Class cls);
}
