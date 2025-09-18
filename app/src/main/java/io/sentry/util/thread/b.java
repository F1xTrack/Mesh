package io.sentry.util.thread;

/* loaded from: classes2.dex */
public final class b implements a {
    public static final long a = Thread.currentThread().getId();
    public static final b b = new b();

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        return a == Thread.currentThread().getId();
    }
}
