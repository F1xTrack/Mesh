package p000;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: s6 */
/* loaded from: classes.dex */
public abstract class AbstractC6802s6 {
    /* renamed from: a */
    public static LocaleList m24614a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    /* renamed from: b */
    public static void m24615b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
