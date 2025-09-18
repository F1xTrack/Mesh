package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* renamed from: io.sentry.transport.n */
/* loaded from: classes2.dex */
public final class C6162n extends AbstractQueuedSynchronizer {

    /* renamed from: a */
    public static final /* synthetic */ int f34655a = 0;

    public C6162n() {
        setState(0);
    }

    /* renamed from: a */
    public static int m21875a(C6162n c6162n) {
        return c6162n.getState();
    }

    /* renamed from: b */
    public static void m21876b(C6162n c6162n) {
        int state;
        do {
            state = c6162n.getState();
        } while (!c6162n.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i) {
        int state;
        int i2;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i2 = state - 1;
        } while (!compareAndSetState(state, i2));
        return i2 == 0;
    }
}
