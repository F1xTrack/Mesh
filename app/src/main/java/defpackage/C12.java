package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class C12 {
    public static float a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static String c(String str) {
        Context context = AbstractC3401dU1.a;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            return "";
        } catch (Exception e2) {
            e2.getMessage();
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int d(int i, float f, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f3 = ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f5 = ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f6 = ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float fA = a(f3);
        float fA2 = a(f4);
        float fA3 = a((i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float fA4 = a(f6);
        float fA5 = a(f7);
        float fA6 = a((i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float fD = AbstractC1705Vq.d(f5, f2, f, f2);
        float fD2 = AbstractC1705Vq.d(fA4, fA, f, fA);
        float fD3 = AbstractC1705Vq.d(fA5, fA2, f, fA2);
        float fD4 = AbstractC1705Vq.d(fA6, fA3, f, fA3);
        float fB = b(fD2) * 255.0f;
        float fB2 = b(fD3) * 255.0f;
        return Math.round(b(fD4) * 255.0f) | (Math.round(fB) << 16) | (Math.round(fD * 255.0f) << 24) | (Math.round(fB2) << 8);
    }
}
