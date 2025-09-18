package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.mk */
/* loaded from: classes2.dex */
public final class C5304mk implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public final Object apply(Object obj) {
        return ((TelephonyManager) obj).getSimOperatorName();
    }
}
