package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: com.huawei.hms.hatool.q1 */
/* loaded from: classes.dex */
public class C2178q1 {

    /* renamed from: c */
    private static C2178q1 f19275c = new C2178q1();

    /* renamed from: a */
    private boolean f19276a = false;

    /* renamed from: b */
    private Context f19277b = AbstractC2177q0.m12197i();

    private C2178q1() {
    }

    /* renamed from: b */
    public static C2178q1 m12204b() {
        return f19275c;
    }

    @TargetApi(24)
    /* renamed from: a */
    public boolean m12205a() {
        boolean zIsUserUnlocked;
        if (!this.f19276a) {
            Context context = this.f19277b;
            if (context == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    zIsUserUnlocked = userManager.isUserUnlocked();
                } else {
                    this.f19276a = false;
                }
            } else {
                zIsUserUnlocked = true;
            }
            this.f19276a = zIsUserUnlocked;
        }
        return this.f19276a;
    }
}
