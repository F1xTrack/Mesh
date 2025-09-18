package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.my.tracker.obfuscated.p1;
import defpackage.RunnableC6880rf;

/* loaded from: classes2.dex */
public abstract class x0 {
    public static void a(z2 z2Var, f0 f0Var, x1 x1Var, Context context) {
        m.a(new RunnableC6880rf(context, z2Var, f0Var, x1Var, 22));
    }

    public static /* synthetic */ void a(Context context, z2 z2Var, f0 f0Var, x1 x1Var) {
        String string;
        String str;
        char c;
        String str2;
        Context context2;
        z2 z2Var2;
        long jB;
        PackageInfo packageInfoA = u.a(context);
        if (packageInfoA != null) {
            string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfoA.getLongVersionCode()) : Integer.toString(packageInfoA.versionCode);
            str = packageInfoA.versionName;
        } else {
            string = "";
            str = string;
        }
        q1 q1VarA = q1.a(context);
        String strA = q1VarA.a();
        String strG = z2Var.g();
        if (!strG.equals(q1VarA.c())) {
            y2.a("InstallHandler: tracking install");
            if (packageInfoA != null) {
                jB = w2.b(packageInfoA.firstInstallTime);
                context2 = context;
                z2Var2 = z2Var;
            } else {
                context2 = context;
                z2Var2 = z2Var;
                jB = 0;
            }
            p1 p1VarA = p1.a(f0Var, z2Var2, context2);
            p1.a aVarA = p1VarA.a();
            f0Var.a(jB, u.b(context), aVarA);
            if (aVarA == null) {
                p1VarA.c();
            }
            q1VarA.e(strG);
            c = 1;
        } else if (string.equals(strA)) {
            c = 0;
        } else {
            if (strA.isEmpty()) {
                str2 = "InstallHandler: tracking update";
            } else {
                str2 = "InstallHandler: tracking update from" + strA + " to " + string;
            }
            y2.a(str2);
            f0Var.a(q1VarA.f(), strA, str, string, u.b(context));
            c = 2;
        }
        long j = q1VarA.j();
        long jA = w2.a();
        String strB = z2Var.b();
        if (!TextUtils.isEmpty(strB)) {
            if (jA - j < 604800 || j == 0) {
                y2.a("InstallHandler: tracking apkPreinstallParams");
                f0Var.d(strB);
            } else {
                y2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c == 0) {
            y2.a("InstallHandler: no install/update");
            x1Var.a(j);
            return;
        }
        if (c == 1) {
            q1VarA.b(jA);
            x1Var.a(jA);
        } else if (c == 2) {
            x1Var.a(j);
        }
        q1VarA.d(string);
        q1VarA.g(str);
        q1VarA.c(jA);
    }
}
