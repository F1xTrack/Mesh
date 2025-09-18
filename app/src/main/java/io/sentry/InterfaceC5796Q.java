package io.sentry;

import java.util.concurrent.Future;

/* renamed from: io.sentry.Q */
/* loaded from: classes2.dex */
public interface InterfaceC5796Q {
    /* renamed from: e */
    void mo13812e(long j);

    boolean isClosed();

    Future submit(Runnable runnable);

    /* renamed from: t */
    Future mo13827t(Runnable runnable, long j);
}
