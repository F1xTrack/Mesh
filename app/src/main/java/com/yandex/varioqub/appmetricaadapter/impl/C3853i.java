package com.yandex.varioqub.appmetricaadapter.impl;

import android.app.Activity;
import com.yandex.metrica.C3797p;
import com.yandex.metrica.ModulesFacade;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.YandexMetrica;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.LinkedHashMap;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.i */
/* loaded from: classes2.dex */
public final class C3853i implements InterfaceC3848d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: a */
    public final void mo17379a(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        C3797p.m17375a(activity, new C3852h(adapterIdentifiersCallback), "yandex_mobile_metrica_uuid");
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: b */
    public final void mo17381b(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        C3797p.m17375a(activity, new C3851g(adapterIdentifiersCallback), "yandex_mobile_metrica_device_id");
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: c */
    public final void mo17382c(LinkedHashMap linkedHashMap) throws ValidationException {
        YandexMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.InterfaceC3848d
    /* renamed from: a */
    public final void mo17380a(byte[] bArr) {
        ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
