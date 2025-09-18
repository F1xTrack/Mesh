package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: wA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7743wA1 {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static C1859Xp0 b(String str) {
        O90.f(str, "<this>");
        Matcher matcher = C1859Xp0.d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        O90.e(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        O90.e(locale, "US");
        String lowerCase = strGroup.toLowerCase(locale);
        O90.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        O90.e(strGroup2, "typeSubtype.group(2)");
        O90.e(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C1859Xp0.e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(F91.v(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (D51.o(strGroup4, "'", false) && D51.i(strGroup4, "'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    O90.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new C1859Xp0(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static C1859Xp0 c(String str) {
        O90.f(str, "<this>");
        try {
            return b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final void d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0440Fk c0440Fk = C0440Fk.c;
            sb.append(AbstractC7231tU1.b(new C0440Fk(((String) obj).getBytes(AbstractC8309z90.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0440Fk) {
            sb.append(": \"");
            sb.append(AbstractC7231tU1.b((C0440Fk) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof B00) {
            sb.append(" {");
            e((B00) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        d(sb, i4, "key", entry.getKey());
        d(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.B00 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7743wA1.e(B00, java.lang.StringBuilder, int):void");
    }
}
