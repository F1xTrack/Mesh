package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class SimpleSettableFuture implements Future {

    /* renamed from: a */
    public final CountDownLatch f17895a = new CountDownLatch(1);

    /* renamed from: b */
    public Object f17896b;

    /* renamed from: c */
    public Exception f17897c;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        this.f17895a.await();
        if (this.f17897c == null) {
            return this.f17896b;
        }
        throw new ExecutionException(this.f17897c);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17895a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (this.f17895a.await(j, timeUnit)) {
            if (this.f17897c == null) {
                return this.f17896b;
            }
            throw new ExecutionException(this.f17897c);
        }
        throw new TimeoutException("Timed out waiting for result");
    }
}
