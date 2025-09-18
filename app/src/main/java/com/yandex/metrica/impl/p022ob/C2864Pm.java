package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: com.yandex.metrica.impl.ob.Pm */
/* loaded from: classes2.dex */
public class C2864Pm {
    /* renamed from: a */
    public boolean m14801a(Context context) {
        Boolean boolValueOf;
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        Boolean bool = Boolean.TRUE;
        if (userManager != null) {
            try {
                boolValueOf = Boolean.valueOf(userManager.isUserUnlocked());
            } catch (Throwable unused) {
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            bool = boolValueOf;
        }
        return bool.booleanValue();
    }
}
