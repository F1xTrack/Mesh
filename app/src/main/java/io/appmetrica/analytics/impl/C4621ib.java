package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ib */
/* loaded from: classes2.dex */
public final class C4621ib {
    public final Handler a;
    public final Q2 b;
    public final RunnableC4644jb c;

    public C4621ib(Handler handler, Q2 q2) {
        this.a = handler;
        this.b = q2;
        this.c = new RunnableC4644jb(handler, q2);
    }

    public static void a(Handler handler, Q2 q2, Runnable runnable) {
        handler.removeCallbacks(runnable, q2.b.b.getApiKey());
        handler.postAtTime(runnable, q2.b.b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(q2.b.b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
