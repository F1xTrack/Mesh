package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* loaded from: classes2.dex */
public final class Wd implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public final Object apply(Object obj) {
        ConnectivityManager connectivityManager = (ConnectivityManager) obj;
        if (AndroidUtils.isApiAchieved(23)) {
            return Yd.a(connectivityManager);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? Xd.OFFLINE : (Xd) Yd.b.a(Integer.valueOf(activeNetworkInfo.getType()));
    }
}
