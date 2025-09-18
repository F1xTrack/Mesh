package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: io.appmetrica.analytics.impl.Ok */
/* loaded from: classes2.dex */
public final class C4717Ok implements InterfaceC4363A6 {

    /* renamed from: a */
    public final /* synthetic */ StartupParamsCallback f30588a;

    /* renamed from: b */
    public final /* synthetic */ C4741Pk f30589b;

    public C4717Ok(C4741Pk c4741Pk, StartupParamsCallback startupParamsCallback) {
        this.f30589b = c4741Pk;
        this.f30588a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4363A6
    /* renamed from: a */
    public final void mo19185a(int i, Bundle bundle) {
        this.f30589b.m19722b(bundle, this.f30588a);
    }
}
