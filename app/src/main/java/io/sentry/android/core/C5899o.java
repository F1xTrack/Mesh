package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.android.core.internal.util.InterfaceC5892l;
import io.sentry.profilemeasurements.C6077b;

/* renamed from: io.sentry.android.core.o */
/* loaded from: classes2.dex */
public final class C5899o implements InterfaceC5892l {

    /* renamed from: a */
    public float f33795a = 0.0f;

    /* renamed from: b */
    public final /* synthetic */ C5900p f33796b;

    public C5899o(C5900p c5900p) {
        this.f33796b = c5900p;
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC5892l
    /* renamed from: b */
    public final void mo21563b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime());
        C5900p c5900p = this.f33796b;
        long j5 = jElapsedRealtimeNanos - c5900p.f33797a;
        if (j5 < 0) {
            return;
        }
        if (z2) {
            c5900p.f33806j.addLast(new C6077b(Long.valueOf(j5), Long.valueOf(j3)));
        } else if (z) {
            c5900p.f33805i.addLast(new C6077b(Long.valueOf(j5), Long.valueOf(j3)));
        }
        if (f != this.f33795a) {
            this.f33795a = f;
            c5900p.f33804h.addLast(new C6077b(Long.valueOf(j5), Float.valueOf(f)));
        }
    }
}
