package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.p018my.tracker.obfuscated.C2354p1;
import p000.RunnableC6757rf;

/* renamed from: com.my.tracker.obfuscated.x0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2385x0 {
    /* renamed from: a */
    public static void m13533a(C2395z2 c2395z2, C2313f0 c2313f0, C2386x1 c2386x1, Context context) {
        AbstractC2340m.m13290a(new RunnableC6757rf(context, c2395z2, c2313f0, c2386x1, 22));
    }

    /* renamed from: a */
    public static /* synthetic */ void m13532a(Context context, C2395z2 c2395z2, C2313f0 c2313f0, C2386x1 c2386x1) {
        String string;
        String str;
        char c;
        String str2;
        Context context2;
        C2395z2 c2395z22;
        long jM13530b;
        PackageInfo packageInfoM13512a = AbstractC2372u.m13512a(context);
        if (packageInfoM13512a != null) {
            string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfoM13512a.getLongVersionCode()) : Integer.toString(packageInfoM13512a.versionCode);
            str = packageInfoM13512a.versionName;
        } else {
            string = "";
            str = string;
        }
        C2358q1 c2358q1M13407a = C2358q1.m13407a(context);
        String strM13408a = c2358q1M13407a.m13408a();
        String strM13607g = c2395z2.m13607g();
        if (!strM13607g.equals(c2358q1M13407a.m13418c())) {
            AbstractC2391y2.m13568a("InstallHandler: tracking install");
            if (packageInfoM13512a != null) {
                jM13530b = AbstractC2383w2.m13530b(packageInfoM13512a.firstInstallTime);
                context2 = context;
                c2395z22 = c2395z2;
            } else {
                context2 = context;
                c2395z22 = c2395z2;
                jM13530b = 0;
            }
            C2354p1 c2354p1M13383a = C2354p1.m13383a(c2313f0, c2395z22, context2);
            C2354p1.a aVarM13385a = c2354p1M13383a.m13385a();
            c2313f0.m13057a(jM13530b, AbstractC2372u.m13513b(context), aVarM13385a);
            if (aVarM13385a == null) {
                c2354p1M13383a.m13389c();
            }
            c2358q1M13407a.m13425e(strM13607g);
            c = 1;
        } else if (string.equals(strM13408a)) {
            c = 0;
        } else {
            if (strM13408a.isEmpty()) {
                str2 = "InstallHandler: tracking update";
            } else {
                str2 = "InstallHandler: tracking update from" + strM13408a + " to " + string;
            }
            AbstractC2391y2.m13568a(str2);
            c2313f0.m13065a(c2358q1M13407a.m13426f(), strM13408a, str, string, AbstractC2372u.m13513b(context));
            c = 2;
        }
        long jM13434j = c2358q1M13407a.m13434j();
        long jM13528a = AbstractC2383w2.m13528a();
        String strM13592b = c2395z2.m13592b();
        if (!TextUtils.isEmpty(strM13592b)) {
            if (jM13528a - jM13434j < 604800 || jM13434j == 0) {
                AbstractC2391y2.m13568a("InstallHandler: tracking apkPreinstallParams");
                c2313f0.m13086d(strM13592b);
            } else {
                AbstractC2391y2.m13568a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c == 0) {
            AbstractC2391y2.m13568a("InstallHandler: no install/update");
            c2386x1.m13542a(jM13434j);
            return;
        }
        if (c == 1) {
            c2358q1M13407a.m13417b(jM13528a);
            c2386x1.m13542a(jM13528a);
        } else if (c == 2) {
            c2386x1.m13542a(jM13434j);
        }
        c2358q1M13407a.m13423d(string);
        c2358q1M13407a.m13429g(str);
        c2358q1M13407a.m13420c(jM13528a);
    }
}
