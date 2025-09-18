package com.yandex.varioqub.appmetricaadapter.impl;

import android.app.Activity;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.LinkedHashMap;
import p000.AbstractC7230yu;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.c */
/* loaded from: classes2.dex */
public final class C3847c implements InterfaceC3848d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: a */
    public final void mo17379a(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(activity, new C3846b(adapterIdentifiersCallback), AbstractC7230yu.m26274e(StartupParamsCallback.APPMETRICA_UUID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: b */
    public final void mo17381b(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(activity, new C3845a(adapterIdentifiersCallback), AbstractC7230yu.m26274e(StartupParamsCallback.APPMETRICA_DEVICE_ID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: c */
    public final void mo17382c(LinkedHashMap linkedHashMap) {
        AppMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: a */
    public final void mo17380a(byte[] bArr) {
        ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
