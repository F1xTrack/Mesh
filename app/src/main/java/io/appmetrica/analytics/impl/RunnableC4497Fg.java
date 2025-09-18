package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.Fg */
/* loaded from: classes2.dex */
public final class RunnableC4497Fg implements Runnable {

    /* renamed from: a */
    public final Context f30143a;

    /* renamed from: b */
    public final C4821T5 f30144b;

    /* renamed from: c */
    public final Bundle f30145c;

    /* renamed from: d */
    public final C5363p4 f30146d;

    public RunnableC4497Fg(Context context, C4821T5 c4821t5, Bundle bundle, C5363p4 c5363p4) {
        this.f30143a = context;
        this.f30144b = c4821t5;
        this.f30145c = bundle;
        this.f30146d = c5363p4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4939Y3 c4939y3M20018a = C4939Y3.m20018a(this.f30143a, this.f30145c);
        if (c4939y3M20018a == null) {
            return;
        }
        C5088e4 c5088e4M20302a = C5088e4.m20302a(c4939y3M20018a);
        C5502ui c5502uiM20634s = C5244ka.f32038C.m20634s();
        c5502uiM20634s.m21136a(c4939y3M20018a.f31090b.getAppVersion(), c4939y3M20018a.f31090b.getAppBuildNumber());
        c5502uiM20634s.m21135a(c4939y3M20018a.f31090b.getDeviceType());
        C4436D4 c4436d4 = new C4436D4(c4939y3M20018a);
        this.f30146d.m20901a(c5088e4M20302a, c4436d4).mo19487a(this.f30144b, c4436d4);
    }
}
