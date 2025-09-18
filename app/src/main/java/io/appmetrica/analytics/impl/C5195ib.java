package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ib */
/* loaded from: classes2.dex */
public final class C5195ib {

    /* renamed from: a */
    public final Handler f31930a;

    /* renamed from: b */
    public final AbstractC4747Q2 f31931b;

    /* renamed from: c */
    public final RunnableC5220jb f31932c;

    public C5195ib(Handler handler, AbstractC4747Q2 abstractC4747Q2) {
        this.f31930a = handler;
        this.f31931b = abstractC4747Q2;
        this.f31932c = new RunnableC5220jb(handler, abstractC4747Q2);
    }

    /* renamed from: a */
    public static void m20574a(Handler handler, AbstractC4747Q2 abstractC4747Q2, Runnable runnable) {
        handler.removeCallbacks(runnable, abstractC4747Q2.f30644b.f31090b.getApiKey());
        handler.postAtTime(runnable, abstractC4747Q2.f30644b.f31090b.getApiKey(), SystemClock.uptimeMillis() + (((Integer) WrapUtils.getOrDefault(abstractC4747Q2.f30644b.f31090b.getSessionTimeout(), 10)).intValue() * 500));
    }
}
