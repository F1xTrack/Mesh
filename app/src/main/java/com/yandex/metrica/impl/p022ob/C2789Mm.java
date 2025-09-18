package com.yandex.metrica.impl.p022ob;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Mm */
/* loaded from: classes2.dex */
public class C2789Mm {

    /* renamed from: a */
    private final C2814Nm f21755a;

    public C2789Mm() {
        this(new C2814Nm());
    }

    /* renamed from: a */
    public long m14630a(long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j);
        this.f21755a.getClass();
        return timeUnit2.toSeconds(SystemClock.elapsedRealtime() - millis);
    }

    /* renamed from: b */
    public long m14631b(long j, TimeUnit timeUnit) {
        if (j == 0) {
            return 0L;
        }
        return this.f21755a.mo14675b() - timeUnit.toSeconds(j);
    }

    /* renamed from: c */
    public long m14632c(long j, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f21755a.getClass();
        return timeUnit2.toSeconds(System.nanoTime() - timeUnit.toNanos(j));
    }

    public C2789Mm(C2814Nm c2814Nm) {
        this.f21755a = c2814Nm;
    }
}
