package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.Wd */
/* loaded from: classes2.dex */
public final class C4901Wd implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public final Object apply(Object obj) {
        ConnectivityManager connectivityManager = (ConnectivityManager) obj;
        if (AndroidUtils.isApiAchieved(23)) {
            return AbstractC4949Yd.m20035a(connectivityManager);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? EnumC4925Xd.OFFLINE : (EnumC4925Xd) AbstractC4949Yd.f31113b.m20862a(Integer.valueOf(activeNetworkInfo.getType()));
    }
}
