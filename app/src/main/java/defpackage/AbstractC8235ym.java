package defpackage;

import android.graphics.DashPathEffect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ym */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8235ym {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int B(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SOLID")) {
            return 1;
        }
        if (str.equals("DASHED")) {
            return 2;
        }
        if (str.equals("DOTTED")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.facebook.react.uimanager.drawable.CSSBackgroundDrawable.BorderStyle.".concat(str));
    }

    public static /* synthetic */ int[] C(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static void a(InterfaceC7668vn interfaceC7668vn, C6263oQ c6263oQ) {
        int i;
        int i2 = interfaceC7668vn.i();
        if (i2 == 1) {
            return;
        }
        int iX = x(i2);
        if (iX == 1) {
            i = 32;
        } else if (iX == 2) {
            i = 0;
        } else {
            if (iX != 3) {
                if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                    throw null;
                }
                AbstractC0759Jm0.f("ExifData");
                return;
            }
            i = 1;
        }
        int i3 = i & 1;
        ArrayList arrayList = c6263oQ.a;
        if (i3 == 1) {
            c6263oQ.c(arrayList, "LightSource", String.valueOf(4));
        }
        c6263oQ.c(arrayList, "Flash", String.valueOf(i));
    }

    public static DashPathEffect b(float f, int i) {
        int iX = x(i);
        if (iX == 1) {
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        }
        if (iX != 2) {
            return null;
        }
        return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static ClassCastException d(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object e(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String f(int i, String str, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String g(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String h(IP0 ip0, Class cls, StringBuilder sb) {
        sb.append(ip0.b(cls));
        return sb.toString();
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, int i, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder n(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap r(Class cls, C9 c9) {
        HashMap map = new HashMap();
        map.put(cls, c9);
        return map;
    }

    public static Map s(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void t(int i, int i2, int i3, int i4, int i5) {
        AbstractC0277Dh1.L(i);
        AbstractC0277Dh1.L(i2);
        AbstractC0277Dh1.L(i3);
        AbstractC0277Dh1.L(i4);
        AbstractC0277Dh1.L(i5);
    }

    public static void u(int i, String str, String str2) {
        HMSLog.i(str2, str + i);
    }

    public static String v(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int x(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }
}
