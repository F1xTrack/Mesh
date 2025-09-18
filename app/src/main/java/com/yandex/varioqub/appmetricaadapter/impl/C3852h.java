package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.Map;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.h */
/* loaded from: classes2.dex */
public final class C3852h implements IIdentifierCallback {

    /* renamed from: a */
    public final /* synthetic */ AdapterIdentifiersCallback f25564a;

    public C3852h(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f25564a = adapterIdentifiersCallback;
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onReceive(Map map) {
        String str = (String) map.get("yandex_mobile_metrica_uuid");
        if (str == null) {
            str = "";
        }
        this.f25564a.onSuccess(str);
    }

    @Override // com.yandex.metrica.IIdentifierCallback
    public final void onRequestError(IIdentifierCallback.Reason reason) {
        this.f25564a.onError(reason.toString());
    }
}
