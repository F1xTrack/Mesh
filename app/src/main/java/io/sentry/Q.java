package io.sentry;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public interface Q {
    void e(long j);

    boolean isClosed();

    Future submit(Runnable runnable);

    Future t(Runnable runnable, long j);
}
