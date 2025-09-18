package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.nk */
/* loaded from: classes2.dex */
public final class C4749nk implements FunctionWithThrowable {
    public final /* synthetic */ C4773ok a;

    public C4749nk(C4773ok c4773ok) {
        this.a = c4773ok;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C4773ok c4773ok = this.a;
        if (c4773ok.b.hasPermission(c4773ok.a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
