package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: gP0 */
/* loaded from: classes2.dex */
public final class C9493gP0 extends AbstractC10005kP0 implements InterfaceC8302Ta0, InterfaceC7420Cb0 {

    /* renamed from: a */
    public final Class f27782a;

    public C9493gP0(Class cls) {
        O90.m5968f(cls, "klass");
        this.f27782a = cls;
    }

    @Override // p000.InterfaceC8302Ta0
    /* renamed from: a */
    public final WO0 mo7705a(C0664KX c0664kx) {
        Annotation[] declaredAnnotations;
        O90.m5968f(c0664kx, "fqName");
        Class cls = this.f27782a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC9878jP1.m22032b(declaredAnnotations, c0664kx);
    }

    /* renamed from: b */
    public final Collection m18512b() {
        Field[] declaredFields = this.f27782a.getDeclaredFields();
        O90.m5967e(declaredFields, "getDeclaredFields(...)");
        return AbstractC9639hY0.m18835n(AbstractC9639hY0.m18833l(new C7141xU(AbstractC0576J8.m4177d(declaredFields), false, C9109dP0.f26020a), C9237eP0.f26695a));
    }

    /* renamed from: c */
    public final C0664KX m18513c() {
        return VO0.m8433a(this.f27782a).m359b();
    }

    /* renamed from: d */
    public final Collection m18514d() throws SecurityException {
        Method[] declaredMethods = this.f27782a.getDeclaredMethods();
        O90.m5967e(declaredMethods, "getDeclaredMethods(...)");
        return AbstractC9639hY0.m18835n(AbstractC9639hY0.m18833l(new C7141xU(AbstractC0576J8.m4177d(declaredMethods), true, new C10115lG0(2, this)), C9365fP0.f27183a));
    }

    /* renamed from: e */
    public final C8340Tt0 m18515e() {
        Class cls = this.f27782a;
        if (!cls.isAnonymousClass()) {
            return C8340Tt0.m7798e(cls.getSimpleName());
        }
        String name = cls.getName();
        int iM25330E = AbstractC11374v51.m25330E(6, name, ".");
        if (iM25330E != -1) {
            name = name.substring(1 + iM25330E, name.length());
            O90.m5967e(name, "substring(...)");
        }
        return C8340Tt0.m7798e(name);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9493gP0) {
            if (O90.m5963a(this.f27782a, ((C9493gP0) obj).f27782a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final ArrayList m18516f() {
        Class cls = this.f27782a;
        O90.m5968f(cls, "clazz");
        C10919rY0 c10919rY0 = G22.f3551a;
        if (c10919rY0 == null) {
            try {
                c10919rY0 = new C10919rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c10919rY0 = new C10919rY0(null, null, null, null, 9);
            }
            G22.f3551a = c10919rY0;
        }
        Method method = (Method) c10919rY0.f41731e;
        Object[] objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C11029sP0(obj));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final boolean m18517g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f27782a;
        O90.m5968f(cls, "clazz");
        C10919rY0 c10919rY0 = G22.f3551a;
        Boolean bool = null;
        if (c10919rY0 == null) {
            try {
                c10919rY0 = new C10919rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c10919rY0 = new C10919rY0(null, null, null, null, 9);
            }
            G22.f3551a = c10919rY0;
        }
        Method method = (Method) c10919rY0.f41730d;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            O90.m5966d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p000.InterfaceC8302Ta0
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f27782a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C0779MN.f7117a : AbstractC9878jP1.m22033c(declaredAnnotations);
    }

    @Override // p000.InterfaceC7420Cb0
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f27782a.getTypeParameters();
        O90.m5967e(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C11285uP0(typeVariable));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final boolean m18518h() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f27782a;
        O90.m5968f(cls, "clazz");
        C10919rY0 c10919rY0 = G22.f3551a;
        Boolean bool = null;
        if (c10919rY0 == null) {
            try {
                c10919rY0 = new C10919rY0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 9);
            } catch (NoSuchMethodException unused) {
                c10919rY0 = new C10919rY0(null, null, null, null, 9);
            }
            G22.f3551a = c10919rY0;
        }
        Method method = (Method) c10919rY0.f41728b;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            O90.m5966d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.f27782a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC0852NX.m5765n(C9493gP0.class, sb, ": ");
        sb.append(this.f27782a);
        return sb.toString();
    }
}
