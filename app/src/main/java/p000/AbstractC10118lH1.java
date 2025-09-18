package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: lH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10118lH1 {

    /* renamed from: a */
    public static final char[] f36996a;

    static {
        char[] cArr = new char[80];
        f36996a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m22379a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m22379a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m22379a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m22380b(i, sb);
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
            sb.append(AbstractC10215m22.m22644b(new C11769yC1(((String) obj).getBytes(AbstractC9090dF1.f25904a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C11769yC1) {
            sb.append(": \"");
            sb.append(AbstractC10215m22.m22644b((C11769yC1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof EE1) {
            sb.append(" {");
            m22381c((EE1) obj, sb, i + 2);
            sb.append("\n");
            m22380b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m22379a(sb, i3, "key", entry.getKey());
        m22379a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m22380b(i, sb);
        sb.append("}");
    }

    /* renamed from: b */
    public static void m22380b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f36996a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m22381c(p000.EE1 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10118lH1.m22381c(EE1, java.lang.StringBuilder, int):void");
    }
}
