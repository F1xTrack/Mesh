package p000;

import android.os.PowerManager;
import java.util.Locale;

/* renamed from: x6 */
/* loaded from: classes.dex */
public abstract class AbstractC7117x6 {
    /* renamed from: a */
    public static boolean m25758a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* renamed from: b */
    public static String m25759b(Locale locale) {
        return locale.toLanguageTag();
    }
}
