package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* loaded from: classes2.dex */
public final class Um {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager) context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new Tm())).booleanValue();
        }
        return true;
    }
}
