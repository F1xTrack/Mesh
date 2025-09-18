package io.appmetrica.analytics.impl;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.x2 */
/* loaded from: classes2.dex */
public final class C5561x2 implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public final Object apply(Object obj) {
        return ((LocationManager) obj).getProviders(true);
    }
}
