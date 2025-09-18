package p000;

import android.icu.util.ULocale;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class O40 {
    /* renamed from: a */
    public static ULocale m5950a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* renamed from: b */
    public static ULocale m5951b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* renamed from: c */
    public static String m5952c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
