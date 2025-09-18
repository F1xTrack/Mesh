package io.sentry;

/* renamed from: io.sentry.Z */
/* loaded from: classes2.dex */
public final class C5822Z implements InterfaceC5790O {

    /* renamed from: a */
    public final Runtime f33456a = Runtime.getRuntime();

    @Override // io.sentry.InterfaceC5790O
    /* renamed from: a */
    public final void mo21450a(C5755C0 c5755c0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Runtime runtime = this.f33456a;
        c5755c0.f33224a = new C6074p0(jCurrentTimeMillis, runtime.totalMemory() - runtime.freeMemory(), -1L);
    }

    @Override // io.sentry.InterfaceC5790O
    /* renamed from: c */
    public final void mo21451c() {
    }
}
