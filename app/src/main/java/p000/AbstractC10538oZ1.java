package p000;

import android.os.Build;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* renamed from: oZ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10538oZ1 {
    /* renamed from: a */
    public static String m23503a(long j) {
        Locale locale = Locale.getDefault();
        return Build.VERSION.SDK_INT >= 24 ? AbstractC10554oh1.m23522c("yMMMd", locale).format(new Date(j)) : AbstractC10554oh1.m23524e(2, locale).format(new Date(j));
    }

    /* renamed from: b */
    public static final Object m23504b(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = AbstractC7167xu.m25987g0(AbstractC11433vZ0.m25453d(set, r4));
            }
            return AbstractC7167xu.m25973S(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (O90.m5963a(r1, r2) && O90.m5963a(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }
}
