package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: Pl */
/* loaded from: classes2.dex */
public abstract class AbstractC0992Pl extends AbstractC1621Zl {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0992Pl(Field field, boolean z) {
        Type genericType = field.getGenericType();
        O90.m5967e(genericType, "getGenericType(...)");
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p000.InterfaceC0615Jl
    public Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        mo6129c(objArr);
        return ((Field) this.f15104a).get(this.f15106c != null ? AbstractC0576J8.m4187n(objArr) : null);
    }
}
