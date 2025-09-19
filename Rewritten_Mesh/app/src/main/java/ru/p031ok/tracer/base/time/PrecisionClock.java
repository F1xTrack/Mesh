package ru.p031ok.tracer.base.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m22267d2 = {"Lru/ok/tracer/base/time/PrecisionClock;", "", "()V", "epochNanos", "", "nanoTime", "currentTimeNanos", "tracer-base_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PrecisionClock {
    public static final PrecisionClock INSTANCE = new PrecisionClock();
    private static final long epochNanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    private static final long nanoTime = SystemClock.elapsedRealtimeNanos();

    private PrecisionClock() {
    }

    public static final long currentTimeNanos() {
        return (SystemClock.elapsedRealtimeNanos() + epochNanos) - nanoTime;
    }
}
