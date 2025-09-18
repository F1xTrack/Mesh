package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes2.dex */
public final class Ok implements A6 {
    public final /* synthetic */ StartupParamsCallback a;
    public final /* synthetic */ Pk b;

    public Ok(Pk pk, StartupParamsCallback startupParamsCallback) {
        this.b = pk;
        this.a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.A6
    public final void a(int i, Bundle bundle) {
        this.b.b(bundle, this.a);
    }
}
