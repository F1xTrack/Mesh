package p000;

import android.graphics.DashPathEffect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ym */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7222ym {

    /* renamed from: a */
    public static final /* synthetic */ int[] f46443a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

    /* renamed from: A */
    public static /* synthetic */ String m26221A(int i) {
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

    /* renamed from: B */
    public static /* synthetic */ int m26222B(String str) {
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

    /* renamed from: C */
    public static /* synthetic */ int[] m26223C(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f46443a, 0, iArr, 0, i);
        return iArr;
    }

    /* renamed from: a */
    public static void m26224a(InterfaceC7034vn interfaceC7034vn, C6551oQ c6551oQ) {
        int i;
        int iMo392i = interfaceC7034vn.mo392i();
        if (iMo392i == 1) {
            return;
        }
        int iM26247x = m26247x(iMo392i);
        if (iM26247x == 1) {
            i = 32;
        } else if (iM26247x == 2) {
            i = 0;
        } else {
            if (iM26247x != 3) {
                if (iMo392i != 1 && iMo392i != 2 && iMo392i != 3 && iMo392i != 4) {
                    throw null;
                }
                AbstractC7806Jm0.m4412f("ExifData");
                return;
            }
            i = 1;
        }
        int i2 = i & 1;
        ArrayList arrayList = c6551oQ.f38994a;
        if (i2 == 1) {
            c6551oQ.m23396c(arrayList, "LightSource", String.valueOf(4));
        }
        c6551oQ.m23396c(arrayList, "Flash", String.valueOf(i));
    }

    /* renamed from: b */
    public static DashPathEffect m26225b(float f, int i) {
        int iM26247x = m26247x(i);
        if (iM26247x == 1) {
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        }
        if (iM26247x != 2) {
            return null;
        }
        return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m26226c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    /* renamed from: d */
    public static ClassCastException m26227d(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* renamed from: e */
    public static Object m26228e(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    /* renamed from: f */
    public static String m26229f(int i, String str, int i2, String str2) {
        return str + i + str2 + i2;
    }

    /* renamed from: g */
    public static String m26230g(int i, String str, String str2) {
        return str + i + str2;
    }

    /* renamed from: h */
    public static String m26231h(IP0 ip0, Class cls, StringBuilder sb) {
        sb.append(ip0.mo3846b(cls));
        return sb.toString();
    }

    /* renamed from: i */
    public static String m26232i(String str, String str2) {
        return str + str2;
    }

    /* renamed from: j */
    public static String m26233j(String str, String str2, int i, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* renamed from: k */
    public static String m26234k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: l */
    public static String m26235l(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: m */
    public static String m26236m(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: n */
    public static StringBuilder m26237n(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* renamed from: o */
    public static StringBuilder m26238o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: p */
    public static StringBuilder m26239p(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    /* renamed from: q */
    public static StringBuilder m26240q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: r */
    public static HashMap m26241r(Class cls, C0136C9 c0136c9) {
        HashMap map = new HashMap();
        map.put(cls, c0136c9);
        return map;
    }

    /* renamed from: s */
    public static Map m26242s(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: t */
    public static void m26243t(int i, int i2, int i3, int i4, int i5) {
        AbstractC7485Dh1.m1797L(i);
        AbstractC7485Dh1.m1797L(i2);
        AbstractC7485Dh1.m1797L(i3);
        AbstractC7485Dh1.m1797L(i4);
        AbstractC7485Dh1.m1797L(i5);
    }

    /* renamed from: u */
    public static void m26244u(int i, String str, String str2) {
        HMSLog.m12622i(str2, str + i);
    }

    /* renamed from: v */
    public static String m26245v(String str, String str2) {
        return str + str2;
    }

    /* renamed from: w */
    public static /* synthetic */ String m26246w(int i) {
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

    /* renamed from: x */
    public static /* synthetic */ int m26247x(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* renamed from: y */
    public static /* synthetic */ String m26248y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    /* renamed from: z */
    public static /* synthetic */ String m26249z(int i) {
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
