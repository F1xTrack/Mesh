package io.sentry;

import java.time.Instant;

/* renamed from: io.sentry.j1 */
/* loaded from: classes2.dex */
public final class C6053j1 extends AbstractC5827a1 {

    /* renamed from: a */
    public final Instant f34216a = Instant.now();

    @Override // io.sentry.AbstractC5827a1
    /* renamed from: d */
    public final long mo21497d() {
        return (this.f34216a.getEpochSecond() * 1000000000) + this.f34216a.getNano();
    }
}
