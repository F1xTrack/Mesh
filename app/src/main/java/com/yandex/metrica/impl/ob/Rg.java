package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Og;

/* loaded from: classes2.dex */
public final class Rg implements Xg {
    final /* synthetic */ Og.d a;

    public Rg(Og.d dVar) {
        this.a = dVar;
    }

    @Override // com.yandex.metrica.impl.ob.Xg
    public void a(Fg fg) {
        Og og = Og.this;
        Og.a(og, fg, Og.b(og));
    }

    @Override // com.yandex.metrica.impl.ob.Xg
    public void a(Throwable th) {
        Og og = Og.this;
        Og.a(og, null, Og.b(og));
    }
}
