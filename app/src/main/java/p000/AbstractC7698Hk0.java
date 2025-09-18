package p000;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: Hk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7698Hk0 {
    /* renamed from: a */
    public static LocaleList m3584a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: b */
    public static LocaleList m3585b() {
        return LocaleList.getAdjustedDefault();
    }

    /* renamed from: c */
    public static LocaleList m3586c() {
        return LocaleList.getDefault();
    }
}
