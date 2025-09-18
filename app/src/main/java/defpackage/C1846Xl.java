package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Xl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1846Xl extends AbstractC1534Tl implements InterfaceC1837Xi {
    public final Object[] g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1846Xl(Method method, Object[] objArr) {
        Collection collectionE;
        O90.f(method, "method");
        O90.f(objArr, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        O90.e(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = objArr.length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(length, "Requested element count ", " is less than zero.").toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC8235ym.g(length2, "Requested element count ", " is less than zero.").toString());
        }
        if (length2 == 0) {
            collectionE = MN.a;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionE = J8.D(genericParameterTypes);
            } else if (length2 == 1) {
                collectionE = AbstractC8259yu.e(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i = length3 - length2; i < length3; i++) {
                    arrayList.add(genericParameterTypes[i]);
                }
                collectionE = arrayList;
            }
        }
        super(method, false, (Type[]) collectionE.toArray(new Type[0]));
        this.g = objArr;
    }

    @Override // defpackage.AbstractC1534Tl, defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) {
        O90.f(objArr, "args");
        BQ1.a(this, objArr);
        J20 j20 = new J20(2);
        j20.e(this.g);
        j20.e(objArr);
        ArrayList arrayList = j20.a;
        return e(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
