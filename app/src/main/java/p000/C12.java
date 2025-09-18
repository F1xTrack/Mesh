package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class C12 {
    /* renamed from: a */
    public static float m947a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    public static float m948b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static String m949c(String str) {
        Context context = AbstractC9120dU1.f26123a;
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

    /* renamed from: d */
    public static int m950d(int i, float f, int i2) {
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
        float fM947a = m947a(f3);
        float fM947a2 = m947a(f4);
        float fM947a3 = m947a((i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float fM947a4 = m947a(f6);
        float fM947a5 = m947a(f7);
        float fM947a6 = m947a((i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float fM8585d = AbstractC1374Vq.m8585d(f5, f2, f, f2);
        float fM8585d2 = AbstractC1374Vq.m8585d(fM947a4, fM947a, f, fM947a);
        float fM8585d3 = AbstractC1374Vq.m8585d(fM947a5, fM947a2, f, fM947a2);
        float fM8585d4 = AbstractC1374Vq.m8585d(fM947a6, fM947a3, f, fM947a3);
        float fM948b = m948b(fM8585d2) * 255.0f;
        float fM948b2 = m948b(fM8585d3) * 255.0f;
        return Math.round(m948b(fM8585d4) * 255.0f) | (Math.round(fM948b) << 16) | (Math.round(fM8585d * 255.0f) << 24) | (Math.round(fM948b2) << 8);
    }
}
