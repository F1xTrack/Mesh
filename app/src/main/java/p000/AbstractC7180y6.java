package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: y6 */
/* loaded from: classes.dex */
public abstract class AbstractC7180y6 {
    /* renamed from: a */
    public static void m26044a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* renamed from: b */
    public static C7750Ik0 m26045b(Configuration configuration) {
        return C7750Ik0.m3994b(configuration.getLocales().toLanguageTags());
    }

    /* renamed from: c */
    public static void m26046c(C7750Ik0 c7750Ik0) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c7750Ik0.f5121a.mo4399a()));
    }

    /* renamed from: d */
    public static void m26047d(Configuration configuration, C7750Ik0 c7750Ik0) {
        configuration.setLocales(LocaleList.forLanguageTags(c7750Ik0.f5121a.mo4399a()));
    }
}
