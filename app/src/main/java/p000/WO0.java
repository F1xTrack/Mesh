package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class WO0 extends AbstractC10005kP0 {

    /* renamed from: a */
    public final Annotation f13158a;

    public WO0(Annotation annotation) {
        O90.m5968f(annotation, "annotation");
        this.f13158a = annotation;
    }

    /* renamed from: b */
    public final ArrayList m8753b() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation = this.f13158a;
        Method[] declaredMethods = P22.m6213b(P22.m6212a(annotation)).getDeclaredMethods();
        O90.m5967e(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            O90.m5967e(objInvoke, "invoke(...)");
            C8340Tt0 c8340Tt0M7798e = C8340Tt0.m7798e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = VO0.f12536a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C10133lP0(c8340Tt0M7798e, (Enum) objInvoke) : objInvoke instanceof Annotation ? new YO0(c8340Tt0M7798e, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new ZO0(c8340Tt0M7798e, (Object[]) objInvoke) : objInvoke instanceof Class ? new C9621hP0(c8340Tt0M7798e, (Class) objInvoke) : new C10389nP0(c8340Tt0M7798e, objInvoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WO0) {
            if (this.f13158a == ((WO0) obj).f13158a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13158a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC0852NX.m5765n(WO0.class, sb, ": ");
        sb.append(this.f13158a);
        return sb.toString();
    }
}
