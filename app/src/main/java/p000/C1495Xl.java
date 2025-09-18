package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Xl */
/* loaded from: classes2.dex */
public final class C1495Xl extends AbstractC1243Tl implements InterfaceC1492Xi {

    /* renamed from: g */
    public final Object[] f13946g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1495Xl(Method method, Object[] objArr) {
        Collection collectionM26274e;
        O90.m5968f(method, "method");
        O90.m5968f(objArr, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.m5967e(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = objArr.length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(length, "Requested element count ", " is less than zero.").toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC7222ym.m26230g(length2, "Requested element count ", " is less than zero.").toString());
        }
        if (length2 == 0) {
            collectionM26274e = C0779MN.f7117a;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionM26274e = AbstractC0576J8.m4173D(genericParameterTypes);
            } else if (length2 == 1) {
                collectionM26274e = AbstractC7230yu.m26274e(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i = length3 - length2; i < length3; i++) {
                    arrayList.add(genericParameterTypes[i]);
                }
                collectionM26274e = arrayList;
            }
        }
        super(method, false, (Type[]) collectionM26274e.toArray(new Type[0]));
        this.f13946g = objArr;
    }

    @Override // p000.AbstractC1243Tl, p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) {
        O90.m5968f(objArr, "args");
        BQ1.m716a(this, objArr);
        J20 j20 = new J20(2);
        j20.m4138e(this.f13946g);
        j20.m4138e(objArr);
        ArrayList arrayList = j20.f5287a;
        return m7737e(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
