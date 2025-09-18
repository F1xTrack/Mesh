package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: Wl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1768Wl extends AbstractC1534Tl implements InterfaceC1837Xi {
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1768Wl(Object obj, Method method) {
        O90.f(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.e(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : J8.j(genericParameterTypes, 1, genericParameterTypes.length)));
        this.g = obj;
    }

    @Override // defpackage.AbstractC1534Tl, defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        O90.f(objArr, "args");
        BQ1.a(this, objArr);
        J20 j20 = new J20(2);
        j20.a(this.g);
        j20.e(objArr);
        ArrayList arrayList = j20.a;
        return e(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
