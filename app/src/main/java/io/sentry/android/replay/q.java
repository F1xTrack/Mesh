package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class q implements Closeable {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Object b = new Object();
    public final p c = new p(this);
    public final o d = new o(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.set(true);
        this.c.clear();
    }
}
