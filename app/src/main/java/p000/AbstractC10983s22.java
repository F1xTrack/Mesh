package p000;

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
public abstract class AbstractC10983s22 {
    /* renamed from: a */
    public static List m24579a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new T90(0, iArr.length, iArr);
    }

    /* renamed from: b */
    public static int m24580b(long j) {
        int i = (int) j;
        QL1.m6666b(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: c */
    public static int m24581c(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(AbstractC9886jT1.m22040f("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }

    /* renamed from: d */
    public static int m24582d(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (!z) {
            throw new IllegalArgumentException(AbstractC9886jT1.m22040f("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        return (bArr[3] & 255) | ((bArr[2] & 255) << 8) | (bArr[0] << 24) | ((bArr[1] & 255) << 16);
    }

    /* renamed from: e */
    public static int m24583e(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: f */
    public static int m24584f(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: g */
    public static int[] m24585g(Collection collection) {
        if (collection instanceof T90) {
            T90 t90 = (T90) collection;
            return Arrays.copyOfRange(t90.f11182a, t90.f11183b, t90.f11184c);
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

    /* renamed from: h */
    public static double m24586h(double d) {
        if (Double.isNaN(d)) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        if (Double.isInfinite(d) || d == ConfigValue.DOUBLE_DEFAULT_VALUE || d == -0.0d) {
            return d;
        }
        return Math.floor(Math.abs(d)) * (d > ConfigValue.DOUBLE_DEFAULT_VALUE ? 1 : -1);
    }

    /* renamed from: i */
    public static Object m24587i(InterfaceC7885Kz1 interfaceC7885Kz1) {
        if (InterfaceC7885Kz1.f6418j1.equals(interfaceC7885Kz1)) {
            return null;
        }
        if (InterfaceC7885Kz1.f6417i1.equals(interfaceC7885Kz1)) {
            return "";
        }
        if (interfaceC7885Kz1 instanceof C7521Dz1) {
            return m24588j((C7521Dz1) interfaceC7885Kz1);
        }
        if (!(interfaceC7885Kz1 instanceof C11228ty1)) {
            return !interfaceC7885Kz1.zze().isNaN() ? interfaceC7885Kz1.zze() : interfaceC7885Kz1.zzf();
        }
        ArrayList arrayList = new ArrayList();
        C11228ty1 c11228ty1 = (C11228ty1) interfaceC7885Kz1;
        c11228ty1.getClass();
        int i = 0;
        while (i < c11228ty1.m25039r()) {
            if (i >= c11228ty1.m25039r()) {
                throw new NoSuchElementException(AbstractC11153tN0.m24909u(i, "Out of bounds index: "));
            }
            int i2 = i + 1;
            Object objM24587i = m24587i(c11228ty1.m25037i(i));
            if (objM24587i != null) {
                arrayList.add(objM24587i);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: j */
    public static HashMap m24588j(C7521Dz1 c7521Dz1) {
        HashMap map = new HashMap();
        c7521Dz1.getClass();
        Iterator it = new ArrayList(c7521Dz1.f2333a.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objM24587i = m24587i(c7521Dz1.mo1956b(str));
            if (objM24587i != null) {
                map.put(str, objM24587i);
            }
        }
        return map;
    }

    /* renamed from: k */
    public static EnumC9724iC1 m24589k(String str) throws NumberFormatException {
        EnumC9724iC1 enumC9724iC1;
        if (str == null || str.isEmpty()) {
            enumC9724iC1 = null;
        } else {
            enumC9724iC1 = (EnumC9724iC1) EnumC9724iC1.f28954w1.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC9724iC1 != null) {
            return enumC9724iC1;
        }
        throw new IllegalArgumentException(AbstractC7222ym.m26245v("Unsupported commandId ", str));
    }

    /* renamed from: l */
    public static void m24590l(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    /* renamed from: m */
    public static void m24591m(C10919rY0 c10919rY0) {
        int iM24594p = m24594p(c10919rY0.m24411J("runtime.counter").zze().doubleValue() + 1.0d);
        if (iM24594p > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c10919rY0.m24416O("runtime.counter", new C7987My1(Double.valueOf(iM24594p)));
    }

    /* renamed from: n */
    public static void m24592n(EnumC9724iC1 enumC9724iC1, int i, ArrayList arrayList) {
        m24590l(i, enumC9724iC1.name(), arrayList);
    }

    /* renamed from: o */
    public static boolean m24593o(InterfaceC7885Kz1 interfaceC7885Kz1, InterfaceC7885Kz1 interfaceC7885Kz12) {
        if (!interfaceC7885Kz1.getClass().equals(interfaceC7885Kz12.getClass())) {
            return false;
        }
        if ((interfaceC7885Kz1 instanceof C11000sA1) || (interfaceC7885Kz1 instanceof C11867yz1)) {
            return true;
        }
        if (!(interfaceC7885Kz1 instanceof C7987My1)) {
            return interfaceC7885Kz1 instanceof C8509Wz1 ? interfaceC7885Kz1.zzf().equals(interfaceC7885Kz12.zzf()) : interfaceC7885Kz1 instanceof C11865yy1 ? interfaceC7885Kz1.zzd().equals(interfaceC7885Kz12.zzd()) : interfaceC7885Kz1 == interfaceC7885Kz12;
        }
        if (Double.isNaN(interfaceC7885Kz1.zze().doubleValue()) || Double.isNaN(interfaceC7885Kz12.zze().doubleValue())) {
            return false;
        }
        return interfaceC7885Kz1.zze().equals(interfaceC7885Kz12.zze());
    }

    /* renamed from: p */
    public static int m24594p(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d)) * (d > ConfigValue.DOUBLE_DEFAULT_VALUE ? 1 : -1)) % 4.294967296E9d);
    }

    /* renamed from: q */
    public static void m24595q(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    /* renamed from: r */
    public static void m24596r(EnumC9724iC1 enumC9724iC1, int i, ArrayList arrayList) {
        m24595q(i, enumC9724iC1.name(), arrayList);
    }

    /* renamed from: s */
    public static boolean m24597s(InterfaceC7885Kz1 interfaceC7885Kz1) {
        if (interfaceC7885Kz1 == null) {
            return false;
        }
        Double dZze = interfaceC7885Kz1.zze();
        return !dZze.isNaN() && dZze.doubleValue() >= ConfigValue.DOUBLE_DEFAULT_VALUE && dZze.equals(Double.valueOf(Math.floor(dZze.doubleValue())));
    }

    /* renamed from: t */
    public static void m24598t(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }
}
