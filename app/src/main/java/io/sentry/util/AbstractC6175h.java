package io.sentry.util;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: io.sentry.util.h */
/* loaded from: classes2.dex */
public abstract class AbstractC6175h {

    /* renamed from: a */
    public static final Charset f34667a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Pattern f34668b = Pattern.compile("[\\W_]+");

    /* renamed from: a */
    public static String m21883a(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(strSubstring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    /* renamed from: b */
    public static String m21884b(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }
}
