package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class S12 {
    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static C7321ty1 b(C7321ty1 c7321ty1, C6860rY0 c6860rY0, C1344Qz1 c1344Qz1, Boolean bool, Boolean bool2) {
        C7321ty1 c7321ty12 = new C7321ty1();
        Iterator itY = c7321ty1.y();
        while (itY.hasNext()) {
            int iIntValue = ((Integer) itY.next()).intValue();
            if (c7321ty1.v(iIntValue)) {
                InterfaceC0877Kz1 interfaceC0877Kz1A = c1344Qz1.a(c6860rY0, Arrays.asList(c7321ty1.i(iIntValue), new C1029My1(Double.valueOf(iIntValue)), c7321ty1));
                if (interfaceC0877Kz1A.zzd().equals(bool)) {
                    return c7321ty12;
                }
                if (bool2 == null || interfaceC0877Kz1A.zzd().equals(bool2)) {
                    c7321ty12.u(iIntValue, interfaceC0877Kz1A);
                }
            }
        }
        return c7321ty12;
    }

    public static InterfaceC0877Kz1 c(C7321ty1 c7321ty1, C6860rY0 c6860rY0, ArrayList arrayList, boolean z) {
        InterfaceC0877Kz1 interfaceC0877Kz1A;
        AbstractC6955s22.q(1, "reduce", arrayList);
        AbstractC6955s22.t(2, "reduce", arrayList);
        InterfaceC0877Kz1 interfaceC0877Kz1D = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(0));
        if (!(interfaceC0877Kz1D instanceof AbstractC4257hz1)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC0877Kz1A = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(1));
            if (interfaceC0877Kz1A instanceof C1497Sy1) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c7321ty1.r() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC0877Kz1A = null;
        }
        AbstractC4257hz1 abstractC4257hz1 = (AbstractC4257hz1) interfaceC0877Kz1D;
        int iR = c7321ty1.r();
        int i = z ? 0 : iR - 1;
        int i2 = z ? iR - 1 : 0;
        int i3 = z ? 1 : -1;
        if (interfaceC0877Kz1A == null) {
            interfaceC0877Kz1A = c7321ty1.i(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (c7321ty1.v(i)) {
                interfaceC0877Kz1A = abstractC4257hz1.a(c6860rY0, Arrays.asList(interfaceC0877Kz1A, c7321ty1.i(i), new C1029My1(Double.valueOf(i)), c7321ty1));
                if (interfaceC0877Kz1A instanceof C1497Sy1) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return interfaceC0877Kz1A;
    }
}
