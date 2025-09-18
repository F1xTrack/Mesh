package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: s22 */
/* loaded from: classes.dex */
public abstract class AbstractC6955s22 {
    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new T90(0, iArr.length, iArr);
    }

    public static int b(long j) {
        int i = (int) j;
        QL1.b(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int c(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(AbstractC5319jT1.f("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }

    public static int d(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (!z) {
            throw new IllegalArgumentException(AbstractC5319jT1.f("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (bArr[0] << 24) | ((bArr[1] & 255) << 16);
    }

    public static int e(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] g(Collection collection) {
        if (collection instanceof T90) {
            T90 t90 = (T90) collection;
            return Arrays.copyOfRange(t90.a, t90.b, t90.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static double h(double d) {
        if (Double.isNaN(d)) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        if (Double.isInfinite(d) || d == ConfigValue.DOUBLE_DEFAULT_VALUE || d == -0.0d) {
            return d;
        }
        return Math.floor(Math.abs(d)) * (d > ConfigValue.DOUBLE_DEFAULT_VALUE ? 1 : -1);
    }

    public static Object i(InterfaceC0877Kz1 interfaceC0877Kz1) {
        if (InterfaceC0877Kz1.j1.equals(interfaceC0877Kz1)) {
            return null;
        }
        if (InterfaceC0877Kz1.i1.equals(interfaceC0877Kz1)) {
            return "";
        }
        if (interfaceC0877Kz1 instanceof C0331Dz1) {
            return j((C0331Dz1) interfaceC0877Kz1);
        }
        if (!(interfaceC0877Kz1 instanceof C7321ty1)) {
            return !interfaceC0877Kz1.zze().isNaN() ? interfaceC0877Kz1.zze() : interfaceC0877Kz1.zzf();
        }
        ArrayList arrayList = new ArrayList();
        C7321ty1 c7321ty1 = (C7321ty1) interfaceC0877Kz1;
        c7321ty1.getClass();
        int i = 0;
        while (i < c7321ty1.r()) {
            if (i >= c7321ty1.r()) {
                throw new NoSuchElementException(AbstractC7209tN0.u(i, "Out of bounds index: "));
            }
            int i2 = i + 1;
            Object objI = i(c7321ty1.i(i));
            if (objI != null) {
                arrayList.add(objI);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap j(C0331Dz1 c0331Dz1) {
        HashMap map = new HashMap();
        c0331Dz1.getClass();
        Iterator it = new ArrayList(c0331Dz1.a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objI = i(c0331Dz1.b(str));
            if (objI != null) {
                map.put(str, objI);
            }
        }
        return map;
    }

    public static EnumC4301iC1 k(String str) throws NumberFormatException {
        EnumC4301iC1 enumC4301iC1;
        if (str == null || str.isEmpty()) {
            enumC4301iC1 = null;
        } else {
            enumC4301iC1 = (EnumC4301iC1) EnumC4301iC1.w1.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC4301iC1 != null) {
            return enumC4301iC1;
        }
        throw new IllegalArgumentException(AbstractC8235ym.v("Unsupported commandId ", str));
    }

    public static void l(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void m(C6860rY0 c6860rY0) {
        int iP = p(c6860rY0.J("runtime.counter").zze().doubleValue() + 1.0d);
        if (iP > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c6860rY0.O("runtime.counter", new C1029My1(Double.valueOf(iP)));
    }

    public static void n(EnumC4301iC1 enumC4301iC1, int i, ArrayList arrayList) {
        l(i, enumC4301iC1.name(), arrayList);
    }

    public static boolean o(InterfaceC0877Kz1 interfaceC0877Kz1, InterfaceC0877Kz1 interfaceC0877Kz12) {
        if (!interfaceC0877Kz1.getClass().equals(interfaceC0877Kz12.getClass())) {
            return false;
        }
        if ((interfaceC0877Kz1 instanceof C6980sA1) || (interfaceC0877Kz1 instanceof C8276yz1)) {
            return true;
        }
        if (!(interfaceC0877Kz1 instanceof C1029My1)) {
            return interfaceC0877Kz1 instanceof C1812Wz1 ? interfaceC0877Kz1.zzf().equals(interfaceC0877Kz12.zzf()) : interfaceC0877Kz1 instanceof C8273yy1 ? interfaceC0877Kz1.zzd().equals(interfaceC0877Kz12.zzd()) : interfaceC0877Kz1 == interfaceC0877Kz12;
        }
        if (Double.isNaN(interfaceC0877Kz1.zze().doubleValue()) || Double.isNaN(interfaceC0877Kz12.zze().doubleValue())) {
            return false;
        }
        return interfaceC0877Kz1.zze().equals(interfaceC0877Kz12.zze());
    }

    public static int p(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d)) * (d > ConfigValue.DOUBLE_DEFAULT_VALUE ? 1 : -1)) % 4.294967296E9d);
    }

    public static void q(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void r(EnumC4301iC1 enumC4301iC1, int i, ArrayList arrayList) {
        q(i, enumC4301iC1.name(), arrayList);
    }

    public static boolean s(InterfaceC0877Kz1 interfaceC0877Kz1) {
        if (interfaceC0877Kz1 == null) {
            return false;
        }
        Double dZze = interfaceC0877Kz1.zze();
        return !dZze.isNaN() && dZze.doubleValue() >= ConfigValue.DOUBLE_DEFAULT_VALUE && dZze.equals(Double.valueOf(Math.floor(dZze.doubleValue())));
    }

    public static void t(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }
}
