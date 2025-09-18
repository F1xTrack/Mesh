package com.yandex.varioqub.appmetricaadapter.impl;

import android.app.Activity;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class c implements d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(activity, new b(adapterIdentifiersCallback), AbstractC8259yu.e(StartupParamsCallback.APPMETRICA_UUID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void b(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(activity, new a(adapterIdentifiersCallback), AbstractC8259yu.e(StartupParamsCallback.APPMETRICA_DEVICE_ID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void c(LinkedHashMap linkedHashMap) {
        AppMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(byte[] bArr) {
        ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
