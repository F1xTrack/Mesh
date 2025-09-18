package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: Kl */
/* loaded from: classes2.dex */
public final class C0678Kl extends AbstractC1621Zl implements InterfaceC1492Xi {

    /* renamed from: e */
    public final /* synthetic */ int f6270e;

    /* renamed from: f */
    public final Object f6271f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0678Kl(Constructor constructor, Object obj, int i) {
        this.f6270e = i;
        switch (i) {
            case 1:
                O90.m5968f(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                O90.m5967e(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                O90.m5967e(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f6271f = obj;
                break;
            default:
                O90.m5968f(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                O90.m5967e(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                O90.m5967e(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : AbstractC0576J8.m4183j(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f6271f = obj;
                break;
        }
    }

    @Override // p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        switch (this.f6270e) {
            case 0:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                Constructor constructor = (Constructor) this.f15104a;
                J20 j20 = new J20(3);
                j20.m4134a(this.f6271f);
                j20.m4138e(objArr);
                j20.m4134a(null);
                ArrayList arrayList = j20.f5287a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                O90.m5968f(objArr, "args");
                BQ1.m716a(this, objArr);
                Constructor constructor2 = (Constructor) this.f15104a;
                J20 j202 = new J20(2);
                j202.m4134a(this.f6271f);
                j202.m4138e(objArr);
                ArrayList arrayList2 = j202.f5287a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
