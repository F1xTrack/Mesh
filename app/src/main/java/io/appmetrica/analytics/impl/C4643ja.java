package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4643ja implements InterfaceC4939vj {
    @Override // io.appmetrica.analytics.impl.InterfaceC4939vj
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4939vj
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
