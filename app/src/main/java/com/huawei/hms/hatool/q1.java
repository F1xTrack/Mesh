package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes.dex */
public class q1 {
    private static q1 c = new q1();
    private boolean a = false;
    private Context b = q0.i();

    private q1() {
    }

    public static q1 b() {
        return c;
    }

    @TargetApi(24)
    public boolean a() {
        boolean zIsUserUnlocked;
        if (!this.a) {
            Context context = this.b;
            if (context == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    zIsUserUnlocked = userManager.isUserUnlocked();
                } else {
                    this.a = false;
                }
            } else {
                zIsUserUnlocked = true;
            }
            this.a = zIsUserUnlocked;
        }
        return this.a;
    }
}
