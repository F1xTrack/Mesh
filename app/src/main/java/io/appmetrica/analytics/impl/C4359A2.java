package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.A2 */
/* loaded from: classes2.dex */
public final class C4359A2 extends BroadcastReceiver {

    /* renamed from: a */
    public final BiConsumer f29838a;

    /* renamed from: b */
    public final ICommonExecutor f29839b;

    public C4359A2(C4866V2 c4866v2, ICommonExecutor iCommonExecutor) {
        this.f29838a = c4866v2;
        this.f29839b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f29839b.execute(new RunnableC5611z2(this, context, intent));
    }
}
