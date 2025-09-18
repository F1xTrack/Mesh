package p000;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: Fz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7624Fz0 {
    static {
        C1210TE.m7637M("PackageManagerHelper");
    }

    /* renamed from: a */
    public static void m2870a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C1210TE.m7634G().getClass();
        } catch (Exception unused) {
            C1210TE.m7634G().getClass();
        }
    }
}
