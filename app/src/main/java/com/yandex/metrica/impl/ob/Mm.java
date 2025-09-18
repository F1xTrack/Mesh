package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class Mm {
    private final Nm a;

    public Mm() {
        this(new Nm());
    }

    public long a(long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j);
        this.a.getClass();
        return timeUnit2.toSeconds(SystemClock.elapsedRealtime() - millis);
    }

    public long b(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return 0L;
        }
        return this.a.b() - timeUnit.toSeconds(j);
    }

    public long c(long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.a.getClass();
        return timeUnit2.toSeconds(System.nanoTime() - timeUnit.toNanos(j));
    }

    public Mm(Nm nm) {
        this.a = nm;
    }
}
