package defpackage;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: w51 */
/* loaded from: classes2.dex */
public abstract class AbstractC7728w51 {
    public static void a(StringBuilder sb, Object obj, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(sb, "<this>");
        if (interfaceC6099nZ != null) {
            sb.append((CharSequence) interfaceC6099nZ.invoke(obj));
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

    public static int b(int i) {
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
        throw new IllegalArgumentException(AbstractC7209tN0.u(i, "Invalid rotation: "));
    }

    public static String c(String str) {
        int length;
        Comparable comparable;
        O90.f(str, "<this>");
        List listG = AbstractC7538v51.G(str);
        List list = listG;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC7538v51.C((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
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
                if (!HS1.d(str2.charAt(length))) {
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
        listG.size();
        int iD = AbstractC8259yu.d(listG);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            String str3 = (String) obj2;
            String strS = ((length == 0 || length == iD) && AbstractC7538v51.C(str3)) ? null : AbstractC7538v51.s(iIntValue, str3);
            if (strS != null) {
                arrayList3.add(strS);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC8069xu.G(arrayList3, sb, "\n", null, null, null, 124);
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static String d(String str) {
        O90.f(str, "<this>");
        if (AbstractC7538v51.C(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listG = AbstractC7538v51.G(str);
        int length = str.length();
        listG.size();
        int iD = AbstractC8259yu.d(listG);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listG) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iD) || !AbstractC7538v51.C(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!HS1.d(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && D51.n(str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, i3, false)) {
                    strSubstring = str2.substring(HiAnalyticsConstant.REPORT_VAL_SEPARATOR.length() + i3);
                    O90.e(strSubstring, "substring(...)");
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
        AbstractC8069xu.G(arrayList, sb, "\n", null, null, null, 124);
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
