package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6966s6 {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
