package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: Tl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1534Tl extends AbstractC2002Zl {
    public final /* synthetic */ int e = 0;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC1534Tl(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.e(genericParameterTypes, "getGenericParameterTypes(...)");
        this(method, z, genericParameterTypes);
    }

    @Override // defpackage.AbstractC2002Zl
    public void c(Object[] objArr) {
        switch (this.e) {
            case 0:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                if (this.f && J8.x(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.c(objArr);
                return;
        }
    }

    @Override // defpackage.InterfaceC0755Jl
    public Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        O90.f(objArr, "args");
        c(objArr);
        ((Field) this.a).set(this.c != null ? J8.n(objArr) : null, J8.x(objArr));
        return C1518Tf1.a;
    }

    public Object e(Object[] objArr, Object obj) {
        O90.f(objArr, "args");
        return this.f ? C1518Tf1.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1534Tl(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        O90.e(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1534Tl(Field field, boolean z, boolean z2) {
        Class cls = Void.TYPE;
        O90.e(cls, "TYPE");
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        O90.e(genericType, "getGenericType(...)");
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f = z;
    }
}
