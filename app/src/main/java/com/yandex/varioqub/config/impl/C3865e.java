package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* renamed from: com.yandex.varioqub.config.impl.e */
/* loaded from: classes2.dex */
public final class C3865e implements AdapterIdentifiersCallback {

    /* renamed from: a */
    public final /* synthetic */ C3867g f25612a;

    public C3865e(C3867g c3867g) {
        this.f25612a = c3867g;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f25612a.getClass();
        AbstractC3872l.m17398a(3);
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f25612a.getClass();
        this.f25612a.f25617d = str;
        AbstractC3872l.m17398a(3);
    }
}
