package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4925v5 {
    public final Xd a(Context context) {
        SafePackageManager safePackageManager = Yd.a;
        return (Xd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Xd.UNDEFINED, new Wd());
    }
}
