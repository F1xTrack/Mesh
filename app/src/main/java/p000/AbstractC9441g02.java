package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: g02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9441g02 {

    /* renamed from: a */
    public static Boolean f27523a;

    /* renamed from: a */
    public static final double m18377a(double d, EnumC6738rM enumC6738rM, EnumC6738rM enumC6738rM2) {
        O90.m5968f(enumC6738rM, "sourceUnit");
        O90.m5968f(enumC6738rM2, "targetUnit");
        long jConvert = enumC6738rM2.f41616a.convert(1L, enumC6738rM.f41616a);
        return jConvert > 0 ? d * jConvert : d / r8.convert(1L, r9);
    }

    /* renamed from: b */
    public static final long m18378b(long j, EnumC6738rM enumC6738rM, EnumC6738rM enumC6738rM2) {
        O90.m5968f(enumC6738rM, "sourceUnit");
        O90.m5968f(enumC6738rM2, "targetUnit");
        return enumC6738rM2.f41616a.convert(j, enumC6738rM.f41616a);
    }

    /* renamed from: c */
    public static boolean m18379c(Context context) {
        Boolean bool = f27523a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false);
            f27523a = Boolean.valueOf(z);
            return z;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C6989v4 c6989v4M25319d = C6989v4.m25319d();
            e.getMessage();
            c6989v4M25319d.m25320a();
            return false;
        }
    }

    /* renamed from: d */
    public static int m18380d(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
