package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2618a3 implements Tm<Context, Intent, Void> {
    final /* synthetic */ AbstractC2690d0 a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ C2643b3 c;

    public C2618a3(C2643b3 c2643b3, AbstractC2690d0 abstractC2690d0, CountDownLatch countDownLatch) {
        this.c = c2643b3;
        this.a = abstractC2690d0;
        this.b = countDownLatch;
    }

    @Override // com.yandex.metrica.impl.ob.Tm
    public Void a(Context context, Intent intent) {
        this.a.a(this.c.c());
        this.b.countDown();
        this.c.k.b(this);
        return null;
    }
}
