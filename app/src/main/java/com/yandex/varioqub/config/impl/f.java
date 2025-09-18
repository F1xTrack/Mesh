package com.yandex.varioqub.config.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;

/* loaded from: classes2.dex */
public final class f implements AdapterIdentifiersCallback {
    public final /* synthetic */ g a;

    public f(g gVar) {
        this.a = gVar;
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onError(String str) {
        this.a.b.countDown();
        this.a.getClass();
    }

    @Override // com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
    public final void onSuccess(String str) {
        this.a.getClass();
        g gVar = this.a;
        gVar.c = str;
        gVar.b.countDown();
    }
}
