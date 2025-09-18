package defpackage;

import android.os.Build;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* renamed from: oZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6292oZ1 {
    public static String a(long j) {
        Locale locale = Locale.getDefault();
        return Build.VERSION.SDK_INT >= 24 ? AbstractC6316oh1.c("yMMMd", locale).format(new Date(j)) : AbstractC6316oh1.e(2, locale).format(new Date(j));
    }

    public static final Object b(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = AbstractC8069xu.g0(AbstractC7627vZ0.d(set, r4));
            }
            return AbstractC8069xu.S(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (O90.a(r1, r2) && O90.a(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }
}
