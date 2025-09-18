package io.sentry.android.replay;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.replay.q */
/* loaded from: classes2.dex */
public final class C5957q implements Closeable {

    /* renamed from: a */
    public final AtomicBoolean f34007a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Object f34008b = new Object();

    /* renamed from: c */
    public final C5956p f34009c = new C5956p(this);

    /* renamed from: d */
    public final C5955o f34010d = new C5955o(this);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34007a.set(true);
        this.f34009c.clear();
    }
}
