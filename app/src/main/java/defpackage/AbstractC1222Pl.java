package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: Pl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1222Pl extends AbstractC2002Zl {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1222Pl(Field field, boolean z) {
        Type genericType = field.getGenericType();
        O90.e(genericType, "getGenericType(...)");
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // defpackage.InterfaceC0755Jl
    public Object call(Object[] objArr) {
        O90.f(objArr, "args");
        c(objArr);
        return ((Field) this.a).get(this.c != null ? J8.n(objArr) : null);
    }
}
