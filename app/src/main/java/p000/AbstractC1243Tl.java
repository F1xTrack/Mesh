package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: Tl */
/* loaded from: classes2.dex */
public abstract class AbstractC1243Tl extends AbstractC1621Zl {

    /* renamed from: e */
    public final /* synthetic */ int f11495e = 0;

    /* renamed from: f */
    public final boolean f11496f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC1243Tl(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.m5967e(genericParameterTypes, "getGenericParameterTypes(...)");
        this(method, z, genericParameterTypes);
    }

    @Override // p000.AbstractC1621Zl
    /* renamed from: c */
    public void mo6129c(Object[] objArr) {
        switch (this.f11495e) {
            case 0:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                if (this.f11496f && AbstractC0576J8.m4197x(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.mo6129c(objArr);
                return;
        }
    }

    @Override // p000.InterfaceC0615Jl
    public Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        O90.m5968f(objArr, "args");
        mo6129c(objArr);
        ((Field) this.f15104a).set(this.f15106c != null ? AbstractC0576J8.m4187n(objArr) : null, AbstractC0576J8.m4197x(objArr));
        return C8313Tf1.f11463a;
    }

    /* renamed from: e */
    public Object m7737e(Object[] objArr, Object obj) {
        O90.m5968f(objArr, "args");
        return this.f11496f ? C8313Tf1.f11463a : ((Method) this.f15104a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1243Tl(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        O90.m5967e(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f11496f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1243Tl(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        O90.m5967e(cls, "TYPE");
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        O90.m5967e(genericType, "getGenericType(...)");
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f11496f = z;
    }
}
