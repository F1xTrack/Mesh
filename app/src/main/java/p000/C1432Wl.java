package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: Wl */
/* loaded from: classes2.dex */
public final class C1432Wl extends AbstractC1243Tl implements InterfaceC1492Xi {

    /* renamed from: g */
    public final Object f13373g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1432Wl(Object obj, Method method) {
        O90.m5968f(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.m5967e(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC0576J8.m4183j(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f13373g = obj;
    }

    @Override // p000.AbstractC1243Tl, p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        BQ1.m716a(this, objArr);
        J20 j20 = new J20(2);
        j20.m4134a(this.f13373g);
        j20.m4138e(objArr);
        ArrayList arrayList = j20.f5287a;
        return m7737e(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
