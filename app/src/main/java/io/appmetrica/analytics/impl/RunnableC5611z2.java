package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.z2 */
/* loaded from: classes2.dex */
public final class RunnableC5611z2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f32903a;

    /* renamed from: b */
    public final /* synthetic */ Intent f32904b;

    /* renamed from: c */
    public final /* synthetic */ C4359A2 f32905c;

    public RunnableC5611z2(C4359A2 c4359a2, Context context, Intent intent) {
        this.f32905c = c4359a2;
        this.f32903a = context;
        this.f32904b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32905c.f29838a.consume(this.f32903a, this.f32904b);
    }
}
