package defpackage;

import android.os.PowerManager;
import java.util.Locale;

/* renamed from: x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7919x6 {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
