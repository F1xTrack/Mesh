package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ja */
/* loaded from: classes2.dex */
public final class C5219ja implements InterfaceC5528vj {
    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
