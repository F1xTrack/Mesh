package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.hints.AbstractC6028c;
import io.sentry.hints.InterfaceC6026a;
import io.sentry.hints.InterfaceC6027b;
import io.sentry.protocol.C6104t;

/* renamed from: io.sentry.android.core.x */
/* loaded from: classes2.dex */
public final class C5915x extends AbstractC6028c implements InterfaceC6027b, InterfaceC6026a {

    /* renamed from: d */
    public final long f33862d;

    /* renamed from: e */
    public final boolean f33863e;

    /* renamed from: f */
    public final boolean f33864f;

    public C5915x(long j, ILogger iLogger, long j2, boolean z, boolean z2) {
        super(j, iLogger);
        this.f33862d = j2;
        this.f33863e = z;
        this.f33864f = z2;
    }

    @Override // io.sentry.hints.InterfaceC6027b
    /* renamed from: a */
    public final boolean mo21644a() {
        return this.f33863e;
    }

    @Override // io.sentry.hints.InterfaceC6026a
    /* renamed from: b */
    public final Long mo21617b() {
        return Long.valueOf(this.f33862d);
    }

    @Override // io.sentry.hints.InterfaceC6026a
    /* renamed from: c */
    public final boolean mo21618c() {
        return false;
    }

    @Override // io.sentry.hints.InterfaceC6026a
    /* renamed from: e */
    public final String mo21619e() {
        return this.f33864f ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.AbstractC6028c
    /* renamed from: f */
    public final boolean mo21645f(C6104t c6104t) {
        return true;
    }

    @Override // io.sentry.hints.AbstractC6028c
    /* renamed from: g */
    public final void mo21646g(C6104t c6104t) {
    }
}
