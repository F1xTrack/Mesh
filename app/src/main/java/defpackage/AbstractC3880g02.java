package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: g02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3880g02 {
    public static Boolean a;

    public static final double a(double d, EnumC6823rM enumC6823rM, EnumC6823rM enumC6823rM2) {
        O90.f(enumC6823rM, "sourceUnit");
        O90.f(enumC6823rM2, "targetUnit");
        long jConvert = enumC6823rM2.a.convert(1L, enumC6823rM.a);
        return jConvert > 0 ? d * jConvert : d / r8.convert(1L, r9);
    }

    public static final long b(long j, EnumC6823rM enumC6823rM, EnumC6823rM enumC6823rM2) {
        O90.f(enumC6823rM, "sourceUnit");
        O90.f(enumC6823rM2, "targetUnit");
        return enumC6823rM2.a.convert(j, enumC6823rM.a);
    }

    public static boolean c(Context context) {
        Boolean bool = a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false);
            a = Boolean.valueOf(z);
            return z;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C7533v4 c7533v4D = C7533v4.d();
            e.getMessage();
            c7533v4D.a();
            return false;
        }
    }

    public static int d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
