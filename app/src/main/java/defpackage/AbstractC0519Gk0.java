package defpackage;

import java.util.Locale;

/* renamed from: Gk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0519Gk0 {
    public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strA = P40.a(locale);
                if (!strA.isEmpty()) {
                    return strA.equals(P40.a(locale2));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i].equals(locale)) {
                break;
            }
            i++;
        }
        return false;
    }
}
