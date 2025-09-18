package io.sentry;

/* loaded from: classes2.dex */
public final class Z implements O {
    public final Runtime a = Runtime.getRuntime();

    @Override // io.sentry.O
    public final void a(C0 c0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Runtime runtime = this.a;
        c0.a = new C5153p0(jCurrentTimeMillis, runtime.totalMemory() - runtime.freeMemory(), -1L);
    }

    @Override // io.sentry.O
    public final void c() {
    }
}
