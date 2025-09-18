package p000;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* renamed from: nn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10438nn1 {

    /* renamed from: a */
    public static final Pattern f38508a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f38509b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map f38510c;

    /* renamed from: d */
    public static final Map f38511d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f38510c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f38511d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m23222a(java.lang.String r18, p000.C10054kn1 r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10438nn1.m23222a(java.lang.String, kn1, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m23223b(java.util.List r8, java.lang.String r9, p000.C10054kn1 r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            hn1 r3 = (p000.C9670hn1) r3
            java.lang.String r4 = r10.f36695a
            java.lang.String r5 = r3.f28586a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f28587b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.f28588c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.f28589d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.f28586a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = p000.C9670hn1.m18882a(r1, r5, r6, r9)
            java.lang.String r6 = r3.f28587b
            r7 = 2
            int r4 = p000.C9670hn1.m18882a(r5, r6, r7, r4)
            java.lang.String r5 = r3.f28589d
            java.lang.String r6 = r10.f36697c
            r7 = 4
            int r4 = p000.C9670hn1.m18882a(r4, r5, r7, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set r5 = r3.f28588c
            java.util.Set r6 = r10.f36698d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set r5 = r3.f28588c
            int r5 = r5.size()
            int r5 = r5 * r7
            int r4 = r4 + r5
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 <= 0) goto L74
            ln1 r5 = new ln1
            r5.<init>(r4, r3)
            r0.add(r5)
        L74:
            int r2 = r2 + 1
            goto L7
        L77:
            java.util.Collections.sort(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10438nn1.m23223b(java.util.List, java.lang.String, kn1):java.util.ArrayList");
    }

    /* renamed from: c */
    public static int m23224c(List list, String str, C10054kn1 c10054kn1) {
        ArrayList arrayListM23223b = m23223b(list, str, c10054kn1);
        for (int i = 0; i < arrayListM23223b.size(); i++) {
            int i2 = ((C10182ln1) arrayListM23223b.get(i)).f37291b.f28601p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static C9798in1 m23225d(String str, Matcher matcher, C9591hA0 c9591hA0, ArrayList arrayList) {
        C10310mn1 c10310mn1 = new C10310mn1();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c10310mn1.f37920a = AbstractC10694pn1.m23880c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c10310mn1.f37921b = AbstractC10694pn1.m23880c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m23226e(strGroup3, c10310mn1);
            StringBuilder sb = new StringBuilder();
            c9591hA0.getClass();
            String strM18750h = c9591hA0.m18750h(AbstractC7227yr.f46511c);
            while (!TextUtils.isEmpty(strM18750h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM18750h.trim());
                strM18750h = c9591hA0.m18750h(AbstractC7227yr.f46511c);
            }
            c10310mn1.f37922c = m23227f(arrayList, str, sb.toString());
            return new C9798in1(c10310mn1.m22968a().m24850a(), c10310mn1.f37920a, c10310mn1.f37921b);
        } catch (NumberFormatException unused) {
            AbstractC10872rA1.m24175h("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m23226e(java.lang.String r18, p000.C10310mn1 r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10438nn1.m23226e(java.lang.String, mn1):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString m23227f(java.util.List r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10438nn1.m23227f(java.util.List, java.lang.String, java.lang.String):android.text.SpannedString");
    }

    /* renamed from: g */
    public static void m23228g(String str, C10310mn1 c10310mn1) {
        String strSubstring;
        int i = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    AbstractC10872rA1.m24175h("Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c10310mn1.f37926g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c10310mn1.f37924e = AbstractC10694pn1.m23879b(str);
            c10310mn1.f37925f = 0;
        } else {
            c10310mn1.f37924e = Integer.parseInt(str);
            c10310mn1.f37925f = 1;
        }
    }
}
