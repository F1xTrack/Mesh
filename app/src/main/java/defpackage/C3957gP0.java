package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: gP0 */
/* loaded from: classes2.dex */
public final class C3957gP0 extends AbstractC5497kP0 implements InterfaceC1502Ta0, InterfaceC0180Cb0 {
    public final Class a;

    public C3957gP0(Class cls) {
        O90.f(cls, "klass");
        this.a = cls;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final WO0 a(KX kx) {
        Annotation[] declaredAnnotations;
        O90.f(kx, "fqName");
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC5307jP1.b(declaredAnnotations, kx);
    }

    public final Collection b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        O90.e(declaredFields, "getDeclaredFields(...)");
        return AbstractC4175hY0.n(AbstractC4175hY0.l(new C7991xU(J8.d(declaredFields), false, C3385dP0.a), C3575eP0.a));
    }

    public final KX c() {
        return VO0.a(this.a).b();
    }

    public final Collection d() throws SecurityException {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        O90.e(declaredMethods, "getDeclaredMethods(...)");
        return AbstractC4175hY0.n(AbstractC4175hY0.l(new C7991xU(J8.d(declaredMethods), true, new C5661lG0(2, this)), C3766fP0.a));
    }

    public final C1559Tt0 e() {
        Class cls = this.a;
        if (!cls.isAnonymousClass()) {
            return C1559Tt0.e(cls.getSimpleName());
        }
        String name = cls.getName();
        int iE = AbstractC7538v51.E(6, name, ".");
        if (iE != -1) {
            name = name.substring(1 + iE, name.length());
            O90.e(name, "substring(...)");
        }
        return C1559Tt0.e(name);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3957gP0) {
            if (O90.a(this.a, ((C3957gP0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList f() {
        Class cls = this.a;
        O90.f(cls, "clazz");
        C6860rY0 c6860rY0 = G22.a;
        if (c6860rY0 == null) {
            try {
                c6860rY0 = new C6860rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c6860rY0 = new C6860rY0(null, null, null, null, 9);
            }
            G22.a = c6860rY0;
        }
        Method method = (Method) c6860rY0.e;
        Object[] objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C7024sP0(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.a;
        O90.f(cls, "clazz");
        C6860rY0 c6860rY0 = G22.a;
        Boolean bool = null;
        if (c6860rY0 == null) {
            try {
                c6860rY0 = new C6860rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c6860rY0 = new C6860rY0(null, null, null, null, 9);
            }
            G22.a = c6860rY0;
        }
        Method method = (Method) c6860rY0.d;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            O90.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.InterfaceC1502Ta0
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? MN.a : AbstractC5307jP1.c(declaredAnnotations);
    }

    @Override // defpackage.InterfaceC0180Cb0
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        O90.e(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C7406uP0(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.a;
        O90.f(cls, "clazz");
        C6860rY0 c6860rY0 = G22.a;
        Boolean bool = null;
        if (c6860rY0 == null) {
            try {
                c6860rY0 = new C6860rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c6860rY0 = new C6860rY0(null, null, null, null, 9);
            }
            G22.a = c6860rY0;
        }
        Method method = (Method) c6860rY0.b;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            O90.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        NX.n(C3957gP0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
