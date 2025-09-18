package defpackage;

import android.icu.util.ULocale;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: u10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7331u10 {
    public static final C4403il a = new C4403il(11);

    public static String a(String str, String[] strArr) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static ULocale b(Y40 y40) {
        ULocale[] availableLocales = ULocale.getAvailableLocales();
        ULocale[] uLocaleArr = {L10.i(y40.c())};
        boolean[] zArr = new boolean[1];
        ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(uLocaleArr, availableLocales, zArr);
        if (zArr[0] || uLocaleAcceptLanguage == null) {
            return null;
        }
        return uLocaleAcceptLanguage;
    }

    public static C3383dO1 c(String[] strArr) throws C0254Da {
        C3383dO1 c3383dO1 = new C3383dO1(16);
        for (String str : strArr) {
            Y40 y40B = AbstractC7522v10.b(str);
            ULocale uLocaleB = b(y40B);
            if (uLocaleB != null) {
                c3383dO1.b = new C1142Ok0(uLocaleB);
                c3383dO1.c = y40B.mo2a();
                return c3383dO1;
            }
        }
        c3383dO1.b = new C1142Ok0(ULocale.getDefault(ULocale.Category.FORMAT));
        return c3383dO1;
    }

    public static String[] d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b(AbstractC7522v10.b(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static C3383dO1 f(String[] strArr) throws C0254Da {
        String[] strArrE = e();
        C3383dO1 c3383dO1 = new C3383dO1(16);
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Y40 y40B = AbstractC7522v10.b(strArr[i]);
                String strA = a(y40B.e(), strArrE);
                if (!strA.isEmpty()) {
                    c3383dO1.b = AbstractC7522v10.b(strA);
                    c3383dO1.c = y40B.mo2a();
                    break;
                }
                i++;
            } else {
                c3383dO1.b = Build.VERSION.SDK_INT >= 24 ? new C1142Ok0(ULocale.getDefault(ULocale.Category.FORMAT)) : new C1064Nk0(Locale.getDefault());
            }
        }
        return c3383dO1;
    }

    public static String[] g(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArrE = e();
        for (String str : strArr) {
            String strA = a(AbstractC7522v10.b(str).e(), strArrE);
            if (strA != null && !strA.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
