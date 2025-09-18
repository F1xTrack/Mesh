package io.sentry.android.core;

import android.os.SystemClock;

/* renamed from: io.sentry.android.core.o */
/* loaded from: classes2.dex */
public final class C5098o implements io.sentry.android.core.internal.util.l {
    public float a = 0.0f;
    public final /* synthetic */ C5099p b;

    public C5098o(C5099p c5099p) {
        this.b = c5099p;
    }

    @Override // io.sentry.android.core.internal.util.l
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime());
        C5099p c5099p = this.b;
        long j5 = jElapsedRealtimeNanos - c5099p.a;
        if (j5 < 0) {
            return;
        }
        if (z2) {
            c5099p.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3)));
        } else if (z) {
            c5099p.i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Long.valueOf(j3)));
        }
        if (f != this.a) {
            this.a = f;
            c5099p.h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j5), Float.valueOf(f)));
        }
    }
}
