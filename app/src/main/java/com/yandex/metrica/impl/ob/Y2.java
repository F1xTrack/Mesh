package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class Y2 implements Um<Im> {
    final /* synthetic */ Throwable a;
    final /* synthetic */ String b;

    public Y2(X2 x2, Throwable th, String str) {
        this.a = th;
        this.b = str;
    }

    @Override // com.yandex.metrica.impl.ob.Um
    public void b(Im im) {
        Im im2 = im;
        if (im2.c()) {
            im2.a(this.a, this.b);
        }
    }
}
