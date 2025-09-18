package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: Hk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0597Hk0 {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
