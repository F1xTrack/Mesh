package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.nk */
/* loaded from: classes2.dex */
public final class C5329nk implements FunctionWithThrowable {

    /* renamed from: a */
    public final /* synthetic */ C5354ok f32306a;

    public C5329nk(C5354ok c5354ok) {
        this.f32306a = c5354ok;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C5354ok c5354ok = this.f32306a;
        if (c5354ok.f32360b.hasPermission(c5354ok.f32359a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
