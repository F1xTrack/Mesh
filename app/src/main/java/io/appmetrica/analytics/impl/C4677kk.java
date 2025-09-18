package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4677kk implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public final Object apply(Object obj) {
        String simOperator = ((TelephonyManager) obj).getSimOperator();
        String strSubstring = !TextUtils.isEmpty(simOperator) ? simOperator.substring(0, 3) : null;
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }
}
