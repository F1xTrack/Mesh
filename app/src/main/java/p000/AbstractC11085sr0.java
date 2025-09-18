package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: sr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11085sr0 {

    /* renamed from: a */
    public static final char[] f42643a;

    static {
        char[] cArr = new char[80];
        f42643a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: a */
    public static void m24792a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f42643a, 0, i2);
            i -= i2;
        }
    }

    /* renamed from: b */
    public static void m24793b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m24793b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m24793b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m24792a(i, sb);
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
            C0299Ek c0299Ek = C0299Ek.f2870c;
            sb.append(AbstractC10784qU1.m24014a(new C0299Ek(((String) obj).getBytes(AbstractC11635x90.f45425a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0299Ek) {
            sb.append(": \"");
            sb.append(AbstractC10784qU1.m24014a((C0299Ek) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC11868z00) {
            sb.append(" {");
            m24794c((AbstractC11868z00) obj, sb, i + 2);
            sb.append("\n");
            m24792a(i, sb);
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
        m24793b(sb, i3, "key", entry.getKey());
        m24793b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m24792a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24794c(p000.AbstractC11868z00 r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11085sr0.m24794c(z00, java.lang.StringBuilder, int):void");
    }
}
