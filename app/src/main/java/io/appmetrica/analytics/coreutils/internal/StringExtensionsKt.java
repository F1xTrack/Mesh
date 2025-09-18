package io.appmetrica.analytics.coreutils.internal;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m22267d2 = {"replaceFirstCharWithTitleCase", "", CommonUrlParts.LOCALE, "Ljava/util/Locale;", "core-utils_release"}, m22268k = 2, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class StringExtensionsKt {
    public static final String replaceFirstCharWithTitleCase(String str) {
        return replaceFirstCharWithTitleCase(str, Locale.US);
    }

    public static final String replaceFirstCharWithTitleCase(String str, Locale locale) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            O90.m5968f(locale, CommonUrlParts.LOCALE);
            String strValueOf2 = String.valueOf(cCharAt);
            O90.m5966d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            strValueOf = strValueOf2.toUpperCase(locale);
            O90.m5967e(strValueOf, "toUpperCase(...)");
            if (strValueOf.length() <= 1) {
                String strValueOf3 = String.valueOf(cCharAt);
                O90.m5966d(strValueOf3, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf3.toUpperCase(Locale.ROOT);
                O90.m5967e(upperCase, "toUpperCase(...)");
                if (strValueOf.equals(upperCase)) {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                O90.m5967e(strSubstring, "substring(...)");
                String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
                O90.m5967e(lowerCase, "toLowerCase(...)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
