package p000;

import java.util.Locale;

/* renamed from: Gk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7646Gk0 {

    /* renamed from: a */
    public static final Locale[] f3870a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* renamed from: a */
    public static Locale m3147a(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: b */
    public static boolean m3148b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f3870a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strM6224a = P40.m6224a(locale);
                if (!strM6224a.isEmpty()) {
                    return strM6224a.equals(P40.m6224a(locale2));
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
