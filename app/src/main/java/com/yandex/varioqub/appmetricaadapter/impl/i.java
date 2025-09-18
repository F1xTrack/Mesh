package com.yandex.varioqub.appmetricaadapter.impl;

import android.app.Activity;
import com.yandex.metrica.ModulesFacade;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.p;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class i implements d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a(activity, new h(adapterIdentifiersCallback), "yandex_mobile_metrica_uuid");
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void b(Activity activity, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a(activity, new g(adapterIdentifiersCallback), "yandex_mobile_metrica_device_id");
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void c(LinkedHashMap linkedHashMap) throws ValidationException {
        YandexMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(byte[] bArr) {
        ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
