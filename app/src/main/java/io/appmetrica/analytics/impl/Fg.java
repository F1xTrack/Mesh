package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Fg implements Runnable {
    public final Context a;
    public final T5 b;
    public final Bundle c;
    public final C4781p4 d;

    public Fg(Context context, T5 t5, Bundle bundle, C4781p4 c4781p4) {
        this.a = context;
        this.b = t5;
        this.c = bundle;
        this.d = c4781p4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y3 y3A = Y3.a(this.a, this.c);
        if (y3A == null) {
            return;
        }
        C4518e4 c4518e4A = C4518e4.a(y3A);
        C4914ui c4914uiS = C4667ka.C.s();
        c4914uiS.a(y3A.b.getAppVersion(), y3A.b.getAppBuildNumber());
        c4914uiS.a(y3A.b.getDeviceType());
        D4 d4 = new D4(y3A);
        this.d.a(c4518e4A, d4).a(this.b, d4);
    }
}
