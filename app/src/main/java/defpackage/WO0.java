package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class WO0 extends AbstractC5497kP0 {
    public final Annotation a;

    public WO0(Annotation annotation) {
        O90.f(annotation, "annotation");
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation = this.a;
        Method[] declaredMethods = P22.b(P22.a(annotation)).getDeclaredMethods();
        O90.e(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            O90.e(objInvoke, "invoke(...)");
            C1559Tt0 c1559Tt0E = C1559Tt0.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = VO0.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C5688lP0(c1559Tt0E, (Enum) objInvoke) : objInvoke instanceof Annotation ? new YO0(c1559Tt0E, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new ZO0(c1559Tt0E, (Object[]) objInvoke) : objInvoke instanceof Class ? new C4148hP0(c1559Tt0E, (Class) objInvoke) : new C6070nP0(c1559Tt0E, objInvoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WO0) {
            if (this.a == ((WO0) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        NX.n(WO0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
