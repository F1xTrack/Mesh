package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.kk */
/* loaded from: classes2.dex */
public final class C5254kk implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public final Object apply(Object obj) {
        String simOperator = ((TelephonyManager) obj).getSimOperator();
        String strSubstring = !TextUtils.isEmpty(simOperator) ? simOperator.substring(0, 3) : null;
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }
}
