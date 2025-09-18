package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.a3 */
/* loaded from: classes2.dex */
class C3119a3 implements InterfaceC2963Tm<Context, Intent, Void> {

    /* renamed from: a */
    final /* synthetic */ AbstractC3194d0 f23032a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f23033b;

    /* renamed from: c */
    final /* synthetic */ C3145b3 f23034c;

    public C3119a3(C3145b3 c3145b3, AbstractC3194d0 abstractC3194d0, CountDownLatch countDownLatch) {
        this.f23034c = c3145b3;
        this.f23032a = abstractC3194d0;
        this.f23033b = countDownLatch;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2963Tm
    /* renamed from: a */
    public Void mo13979a(Context context, Intent intent) {
        this.f23032a.m15722a(this.f23034c.m15671c());
        this.f23033b.countDown();
        this.f23034c.f23109k.m15736b(this);
        return null;
    }
}
