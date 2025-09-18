package p000;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: w51 */
/* loaded from: classes2.dex */
public abstract class AbstractC11501w51 {
    /* renamed from: a */
    public static void m25560a(StringBuilder sb, Object obj, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(sb, "<this>");
        if (interfaceC6497nZ != null) {
            sb.append((CharSequence) interfaceC6497nZ.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m25561b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Invalid rotation: "));
    }

    /* renamed from: c */
    public static String m25562c(String str) {
        int length;
        Comparable comparable;
        O90.m5968f(str, "<this>");
        List listM25332G = AbstractC11374v51.m25332G(str);
        List list = listM25332G;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC11374v51.m25328C((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!HS1.m3433d(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM25332G.size();
        int iM26273d = AbstractC7230yu.m26273d(listM25332G);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            String str3 = (String) obj2;
            String strM25354s = ((length == 0 || length == iM26273d) && AbstractC11374v51.m25328C(str3)) ? null : AbstractC11374v51.m25354s(iIntValue, str3);
            if (strM25354s != null) {
                arrayList3.add(strM25354s);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC7167xu.m25961G(arrayList3, sb, "\n", null, null, null, 124);
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: d */
    public static String m25563d(String str) {
        O90.m5968f(str, "<this>");
        if (AbstractC11374v51.m25328C(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM25332G = AbstractC11374v51.m25332G(str);
        int length = str.length();
        listM25332G.size();
        int iM26273d = AbstractC7230yu.m26273d(listM25332G);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM25332G) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM26273d) || !AbstractC11374v51.m25328C(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!HS1.m3433d(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && D51.m1555n(str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, i3, false)) {
                    strSubstring = str2.substring(HiAnalyticsConstant.REPORT_VAL_SEPARATOR.length() + i3);
                    O90.m5967e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC7167xu.m25961G(arrayList, sb, "\n", null, null, null, 124);
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
