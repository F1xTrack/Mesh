package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: Fz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0486Fz0 {
    static {
        TE.M("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            TE.G().getClass();
        } catch (Exception unused) {
            TE.G().getClass();
        }
    }
}
