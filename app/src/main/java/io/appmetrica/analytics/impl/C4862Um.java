package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.Um */
/* loaded from: classes2.dex */
public final class C4862Um {
    /* renamed from: a */
    public static boolean m19896a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager) context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new C4838Tm())).booleanValue();
        }
        return true;
    }
}
