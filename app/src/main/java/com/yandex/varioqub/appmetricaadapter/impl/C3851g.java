package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.Map;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.g */
/* loaded from: classes2.dex */
public final class C3851g implements IIdentifierCallback {

    /* renamed from: a */
    public final /* synthetic */ AdapterIdentifiersCallback f25563a;

    public C3851g(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f25563a = adapterIdentifiersCallback;
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onReceive(Map map) {
        String str = (String) map.get("yandex_mobile_metrica_device_id");
        if (str == null) {
            str = "";
        }
        this.f25563a.onSuccess(str);
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onRequestError(IIdentifierCallback.Reason reason) {
        this.f25563a.onError(reason.toString());
    }
}
