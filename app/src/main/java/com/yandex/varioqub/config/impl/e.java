package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* loaded from: classes2.dex */
public final class e implements AdapterIdentifiersCallback {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.a.getClass();
        l.a(3);
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.a.getClass();
        this.a.d = str;
        l.a(3);
    }
}
