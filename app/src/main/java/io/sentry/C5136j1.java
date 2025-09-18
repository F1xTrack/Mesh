package io.sentry;

import java.time.Instant;

/* renamed from: io.sentry.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5136j1 extends AbstractC5083a1 {
    public final Instant a = Instant.now();

    @Override // io.sentry.AbstractC5083a1
    public final long d() {
        return (this.a.getEpochSecond() * 1000000000) + this.a.getNano();
    }
}
