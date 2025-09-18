package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* renamed from: pn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6525pn1 {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(C4103hA0 c4103hA0) {
        c4103hA0.getClass();
        String strH = c4103hA0.h(AbstractC8250yr.c);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = AbstractC0277Dh1.a;
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

    public static void d(C4103hA0 c4103hA0) {
        int i = c4103hA0.b;
        if (a(c4103hA0)) {
            return;
        }
        c4103hA0.G(i);
        throw C5643lA0.a(null, "Expected WEBVTT. Got " + c4103hA0.h(AbstractC8250yr.c));
    }
}
