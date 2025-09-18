package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: Kl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0833Kl extends AbstractC2002Zl implements InterfaceC1837Xi {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0833Kl(Constructor constructor, Object obj, int i) {
        this.e = i;
        switch (i) {
            case 1:
                O90.f(constructor, "constructor");
                Class declaringClass = constructor.getDeclaringClass();
                O90.e(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                O90.e(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj;
                break;
            default:
                O90.f(constructor, "constructor");
                Class declaringClass2 = constructor.getDeclaringClass();
                O90.e(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                O90.e(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : J8.j(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f = obj;
                break;
        }
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        switch (this.e) {
            case 0:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                Constructor constructor = (Constructor) this.a;
                J20 j20 = new J20(3);
                j20.a(this.f);
                j20.e(objArr);
                j20.a(null);
                ArrayList arrayList = j20.a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                O90.f(objArr, "args");
                BQ1.a(this, objArr);
                Constructor constructor2 = (Constructor) this.a;
                J20 j202 = new J20(2);
                j202.a(this.f);
                j202.e(objArr);
                ArrayList arrayList2 = j202.a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
