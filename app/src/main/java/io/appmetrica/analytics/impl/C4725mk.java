package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4725mk implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public final Object apply(Object obj) {
        return ((TelephonyManager) obj).getSimOperatorName();
    }
}
