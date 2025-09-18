package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* renamed from: io.appmetrica.analytics.impl.vi */
/* loaded from: classes2.dex */
public abstract class AbstractC5527vi {
    /* renamed from: a */
    public static void m21161a(String str, Object... objArr) {
        ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format(str, objArr), new Object[0]);
    }

    /* renamed from: a */
    public static String m21160a() {
        StringBuilder sb = new StringBuilder("public");
        if (!TextUtils.isEmpty(BuildConfig.SDK_DEPENDENCY)) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }
}
