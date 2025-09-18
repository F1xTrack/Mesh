package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class S12 {
    /* renamed from: a */
    public static void m7149a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: b */
    public static C11228ty1 m7150b(C11228ty1 c11228ty1, C10919rY0 c10919rY0, C8197Qz1 c8197Qz1, Boolean bool, Boolean bool2) {
        C11228ty1 c11228ty12 = new C11228ty1();
        Iterator itM25044y = c11228ty1.m25044y();
        while (itM25044y.hasNext()) {
            int iIntValue = ((Integer) itM25044y.next()).intValue();
            if (c11228ty1.m25043v(iIntValue)) {
                InterfaceC7885Kz1 interfaceC7885Kz1Mo6842a = c8197Qz1.mo6842a(c10919rY0, Arrays.asList(c11228ty1.m25037i(iIntValue), new C7987My1(Double.valueOf(iIntValue)), c11228ty1));
                if (interfaceC7885Kz1Mo6842a.zzd().equals(bool)) {
                    return c11228ty12;
                }
                if (bool2 == null || interfaceC7885Kz1Mo6842a.zzd().equals(bool2)) {
                    c11228ty12.m25042u(iIntValue, interfaceC7885Kz1Mo6842a);
                }
            }
        }
        return c11228ty12;
    }

    /* renamed from: c */
    public static InterfaceC7885Kz1 m7151c(C11228ty1 c11228ty1, C10919rY0 c10919rY0, ArrayList arrayList, boolean z) {
        InterfaceC7885Kz1 interfaceC7885Kz1Mo6842a;
        AbstractC10983s22.m24595q(1, "reduce", arrayList);
        AbstractC10983s22.m24598t(2, "reduce", arrayList);
        InterfaceC7885Kz1 interfaceC7885Kz1M9804d = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(0));
        if (!(interfaceC7885Kz1M9804d instanceof AbstractC9694hz1)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC7885Kz1Mo6842a = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(1));
            if (interfaceC7885Kz1Mo6842a instanceof C8299Sy1) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c11228ty1.m25039r() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC7885Kz1Mo6842a = null;
        }
        AbstractC9694hz1 abstractC9694hz1 = (AbstractC9694hz1) interfaceC7885Kz1M9804d;
        int iM25039r = c11228ty1.m25039r();
        int i = z ? 0 : iM25039r - 1;
        int i2 = z ? iM25039r - 1 : 0;
        int i3 = z ? 1 : -1;
        if (interfaceC7885Kz1Mo6842a == null) {
            interfaceC7885Kz1Mo6842a = c11228ty1.m25037i(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (c11228ty1.m25043v(i)) {
                interfaceC7885Kz1Mo6842a = abstractC9694hz1.mo6842a(c10919rY0, Arrays.asList(interfaceC7885Kz1Mo6842a, c11228ty1.m25037i(i), new C7987My1(Double.valueOf(i)), c11228ty1));
                if (interfaceC7885Kz1Mo6842a instanceof C8299Sy1) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return interfaceC7885Kz1Mo6842a;
    }
}
