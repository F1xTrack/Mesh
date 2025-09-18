package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* renamed from: com.yandex.varioqub.config.impl.f */
/* loaded from: classes2.dex */
public final class C3866f implements AdapterIdentifiersCallback {

    /* renamed from: a */
    public final /* synthetic */ C3867g f25613a;

    public C3866f(C3867g c3867g) {
        this.f25613a = c3867g;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.f25613a.f25615b.countDown();
        this.f25613a.getClass();
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.f25613a.getClass();
        C3867g c3867g = this.f25613a;
        c3867g.f25616c = str;
        c3867g.f25615b.countDown();
    }
}
