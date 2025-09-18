package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: rU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10912rU1 {

    /* renamed from: a */
    public static final char[] f41685a;

    static {
        char[] cArr = new char[80];
        f41685a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m24389a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f41685a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: b */
    public static void m24390b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m24390b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m24390b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m24389a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            JQ1 jq1 = JQ1.f5516c;
            sb.append(M22.m5250d(new JQ1(((String) obj).getBytes(BS1.f826a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof JQ1) {
            sb.append(": \"");
            sb.append(M22.m5250d((JQ1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC10908rS1) {
            sb.append(" {");
            m24391c((AbstractC10908rS1) obj, sb, i + 2);
            sb.append("\n");
            m24389a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m24390b(sb, i3, "key", entry.getKey());
        m24390b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m24389a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24391c(p000.AbstractC10908rS1 r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10912rU1.m24391c(rS1, java.lang.StringBuilder, int):void");
    }
}
