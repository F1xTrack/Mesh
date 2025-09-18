package io.sentry.exception;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6094j;

/* renamed from: io.sentry.exception.a */
/* loaded from: classes2.dex */
public final class C6015a extends RuntimeException {

    /* renamed from: a */
    public final C6094j f34139a;

    /* renamed from: b */
    public final Throwable f34140b;

    /* renamed from: c */
    public final Thread f34141c;

    /* renamed from: d */
    public final boolean f34142d;

    public C6015a(C6094j c6094j, Throwable th, Thread thread, boolean z) {
        this.f34139a = c6094j;
        AbstractC6003a.m21735D(th, "Throwable is required.");
        this.f34140b = th;
        AbstractC6003a.m21735D(thread, "Thread is required.");
        this.f34141c = thread;
        this.f34142d = z;
    }
}
