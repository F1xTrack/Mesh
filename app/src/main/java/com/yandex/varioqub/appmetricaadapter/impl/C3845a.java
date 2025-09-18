package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.a */
/* loaded from: classes2.dex */
public final class C3845a implements StartupParamsCallback {

    /* renamed from: a */
    public final /* synthetic */ AdapterIdentifiersCallback f25561a;

    public C3845a(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f25561a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        String str;
        if (result == null || (str = result.deviceId) == null) {
            str = "";
        }
        this.f25561a.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f25561a.onError(reason.value);
    }
}
