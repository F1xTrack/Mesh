package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.b */
/* loaded from: classes2.dex */
public final class C3846b implements StartupParamsCallback {

    /* renamed from: a */
    public final /* synthetic */ AdapterIdentifiersCallback f25562a;

    public C3846b(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f25562a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        String str;
        if (result == null || (str = result.uuid) == null) {
            str = "";
        }
        this.f25562a.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f25562a.onError(reason.value);
    }
}
