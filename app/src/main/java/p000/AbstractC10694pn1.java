package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* renamed from: pn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10694pn1 {

    /* renamed from: a */
    public static final Pattern f40393a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m23878a(C9591hA0 c9591hA0) {
        c9591hA0.getClass();
        String strM18750h = c9591hA0.m18750h(AbstractC7227yr.f46511c);
        return strM18750h != null && strM18750h.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static float m23879b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m23880c(String str) {
        int i = AbstractC7485Dh1.f2166a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: d */
    public static void m23881d(C9591hA0 c9591hA0) {
        int i = c9591hA0.f28294b;
        if (m23878a(c9591hA0)) {
            return;
        }
        c9591hA0.m18741G(i);
        throw C10103lA0.m22366a(null, "Expected WEBVTT. Got " + c9591hA0.m18750h(AbstractC7227yr.f46511c));
    }
}
