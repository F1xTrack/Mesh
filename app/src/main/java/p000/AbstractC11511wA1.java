package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: wA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11511wA1 {
    /* renamed from: a */
    public static final String m25568a(String str) {
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

    /* renamed from: b */
    public static C8540Xp0 m25569b(String str) {
        O90.m5968f(str, "<this>");
        Matcher matcher = C8540Xp0.f13986d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        O90.m5967e(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        O90.m5967e(locale, "US");
        String lowerCase = strGroup.toLowerCase(locale);
        O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        O90.m5967e(strGroup2, "typeSubtype.group(2)");
        O90.m5967e(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C8540Xp0.f13987e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(F91.m2539v(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (D51.m1556o(strGroup4, "'", false) && D51.m1550i(strGroup4, "'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    O90.m5967e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new C8540Xp0(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: c */
    public static C8540Xp0 m25570c(String str) {
        O90.m5968f(str, "<this>");
        try {
            return m25569b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static final void m25571d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m25571d(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m25571d(sb, i, str, (Map.Entry) it2.next());
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
            C0362Fk c0362Fk = C0362Fk.f3403c;
            sb.append(AbstractC11168tU1.m24938b(new C0362Fk(((String) obj).getBytes(AbstractC11889z90.f46666a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0362Fk) {
            sb.append(": \"");
            sb.append(AbstractC11168tU1.m24938b((C0362Fk) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof B00) {
            sb.append(" {");
            m25572e((B00) obj, sb, i + 2);
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
        m25571d(sb, i4, "key", entry.getKey());
        m25571d(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0209  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m25572e(p000.B00 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11511wA1.m25572e(B00, java.lang.StringBuilder, int):void");
    }
}
