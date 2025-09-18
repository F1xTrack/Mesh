package p000;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: Bg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7379Bg1 {

    /* renamed from: a */
    public static final AbstractC7379Bg1 f972a;

    static {
        AbstractC7379Bg1 c11956zg1;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c11956zg1 = new C11192tg1(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    c11956zg1 = new C11956zg1();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                c11956zg1 = new C11448vg1(iIntValue, declaredMethod2);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            c11956zg1 = new C11702xg1(declaredMethod3);
        }
        f972a = c11956zg1;
    }

    /* renamed from: a */
    public abstract Object mo799a(Class cls);
}
