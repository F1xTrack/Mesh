package io.sentry.android.core;

/* renamed from: io.sentry.android.core.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5101s implements io.sentry.hints.a, io.sentry.hints.k {
    public final boolean a;

    public C5101s(boolean z) {
        this.a = z;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.a ? "anr_background" : "anr_foreground";
    }
}
