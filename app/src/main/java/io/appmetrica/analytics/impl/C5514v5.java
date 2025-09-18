package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.v5 */
/* loaded from: classes2.dex */
public final class C5514v5 {
    /* renamed from: a */
    public final EnumC4925Xd m21155a(Context context) {
        SafePackageManager safePackageManager = AbstractC4949Yd.f31112a;
        return (EnumC4925Xd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC4925Xd.UNDEFINED, new C4901Wd());
    }
}
