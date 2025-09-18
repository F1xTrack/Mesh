package defpackage;

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
public abstract class AbstractC6143nn1 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

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
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r18, defpackage.C5570kn1 r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6143nn1.a(java.lang.String, kn1, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList b(java.util.List r8, java.lang.String r9, defpackage.C5570kn1 r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L77
            java.lang.Object r3 = r8.get(r2)
            hn1 r3 = (defpackage.C4221hn1) r3
            java.lang.String r4 = r10.a
            java.lang.String r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.util.Set r5 = r3.c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            java.lang.String r5 = r3.d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            goto L6a
        L3a:
            java.lang.String r5 = r3.a
            r6 = 1073741824(0x40000000, float:2.0)
            int r5 = defpackage.C4221hn1.a(r1, r5, r6, r9)
            java.lang.String r6 = r3.b
            r7 = 2
            int r4 = defpackage.C4221hn1.a(r5, r6, r7, r4)
            java.lang.String r5 = r3.d
            java.lang.String r6 = r10.c
            r7 = 4
            int r4 = defpackage.C4221hn1.a(r4, r5, r7, r6)
            r5 = -1
            if (r4 == r5) goto L69
            java.util.Set r5 = r3.c
            java.util.Set r6 = r10.d
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L60
            goto L69
        L60:
            java.util.Set r5 = r3.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6143nn1.b(java.util.List, java.lang.String, kn1):java.util.ArrayList");
    }

    public static int c(List list, String str, C5570kn1 c5570kn1) {
        ArrayList arrayListB = b(list, str, c5570kn1);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((C5761ln1) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static C4411in1 d(String str, Matcher matcher, C4103hA0 c4103hA0, ArrayList arrayList) {
        C5952mn1 c5952mn1 = new C5952mn1();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c5952mn1.a = AbstractC6525pn1.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c5952mn1.b = AbstractC6525pn1.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, c5952mn1);
            StringBuilder sb = new StringBuilder();
            c4103hA0.getClass();
            String strH = c4103hA0.h(AbstractC8250yr.c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = c4103hA0.h(AbstractC8250yr.c);
            }
            c5952mn1.c = f(arrayList, str, sb.toString());
            return new C4411in1(c5952mn1.a().a(), c5952mn1.a, c5952mn1.b);
        } catch (NumberFormatException unused) {
            AbstractC6789rA1.h("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r18, defpackage.C5952mn1 r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6143nn1.e(java.lang.String, mn1):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.util.List r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6143nn1.f(java.util.List, java.lang.String, java.lang.String):android.text.SpannedString");
    }

    public static void g(String str, C5952mn1 c5952mn1) {
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
                    AbstractC6789rA1.h("Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c5952mn1.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c5952mn1.e = AbstractC6525pn1.b(str);
            c5952mn1.f = 0;
        } else {
            c5952mn1.e = Integer.parseInt(str);
            c5952mn1.f = 1;
        }
    }
}
