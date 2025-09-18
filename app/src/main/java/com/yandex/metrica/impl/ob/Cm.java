package com.yandex.metrica.impl.ob;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
class Cm implements Callable<String> {
    final /* synthetic */ Dm a;

    public Cm(Dm dm) {
        this.a = dm;
    }

    @Override // java.util.concurrent.Callable
    public String call() throws Exception {
        return this.a.a();
    }
}
