package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8109y6 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static C0675Ik0 b(Configuration configuration) {
        return C0675Ik0.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(C0675Ik0 c0675Ik0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c0675Ik0.a.a()));
    }

    public static void d(Configuration configuration, C0675Ik0 c0675Ik0) {
        configuration.setLocales(LocaleList.forLanguageTags(c0675Ik0.a.a()));
    }
}
