package com.facebook.hermes.unicode;

import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;
import kotlin.Metadata;
import p000.InterfaceC0965PK;
import p000.O90;

@Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m22267d2 = {"Lcom/facebook/hermes/unicode/AndroidUnicodeUtils;", "", "<init>", "()V", "", "left", "right", "", "localeCompare", "(Ljava/lang/String;Ljava/lang/String;)I", "", "unixtimeMs", "", "formatDate", "formatTime", "dateFormat", "(DZZ)Ljava/lang/String;", "input", "targetCase", "useCurrentLocale", "convertToCase", "(Ljava/lang/String;IZ)Ljava/lang/String;", "form", "normalize", "(Ljava/lang/String;I)Ljava/lang/String;", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
@InterfaceC0965PK
/* loaded from: classes.dex */
public final class AndroidUnicodeUtils {
    static {
        new AndroidUnicodeUtils();
    }

    private AndroidUnicodeUtils() {
    }

    @InterfaceC0965PK
    public static final String convertToCase(String input, int targetCase, boolean useCurrentLocale) {
        O90.m5968f(input, "input");
        Locale locale = useCurrentLocale ? Locale.getDefault() : Locale.ENGLISH;
        if (targetCase == 0) {
            O90.m5965c(locale);
            String upperCase = input.toUpperCase(locale);
            O90.m5967e(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (targetCase != 1) {
            throw new IllegalStateException("Invalid target case");
        }
        O90.m5965c(locale);
        String lowerCase = input.toLowerCase(locale);
        O90.m5967e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC0965PK
    public static final String dateFormat(double unixtimeMs, boolean formatDate, boolean formatTime) {
        DateFormat timeInstance;
        if (formatDate && formatTime) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (formatDate) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!formatTime) {
                throw new IllegalStateException("Bad dateFormat configuration");
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) unixtimeMs)).toString();
    }

    @InterfaceC0965PK
    public static final int localeCompare(String left, String right) {
        return Collator.getInstance().compare(left, right);
    }

    @InterfaceC0965PK
    public static final String normalize(String input, int form) {
        if (form == 0) {
            String strNormalize = Normalizer.normalize(input, Normalizer.Form.NFC);
            O90.m5967e(strNormalize, "normalize(...)");
            return strNormalize;
        }
        if (form == 1) {
            String strNormalize2 = Normalizer.normalize(input, Normalizer.Form.NFD);
            O90.m5967e(strNormalize2, "normalize(...)");
            return strNormalize2;
        }
        if (form == 2) {
            String strNormalize3 = Normalizer.normalize(input, Normalizer.Form.NFKC);
            O90.m5967e(strNormalize3, "normalize(...)");
            return strNormalize3;
        }
        if (form != 3) {
            throw new IllegalStateException("Invalid form");
        }
        String strNormalize4 = Normalizer.normalize(input, Normalizer.Form.NFKD);
        O90.m5967e(strNormalize4, "normalize(...)");
        return strNormalize4;
    }
}
