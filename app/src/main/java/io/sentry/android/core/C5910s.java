package io.sentry.android.core;

import io.sentry.hints.InterfaceC6026a;
import io.sentry.hints.InterfaceC6036k;

/* renamed from: io.sentry.android.core.s */
/* loaded from: classes2.dex */
public final class C5910s implements InterfaceC6026a, InterfaceC6036k {

    /* renamed from: a */
    public final boolean f33853a;

    public C5910s(boolean z) {
        this.f33853a = z;
    }

    @Override // io.sentry.hints.InterfaceC6026a
    /* renamed from: b */
    public final Long mo21617b() {
        return null;
    }

    @Override // io.sentry.hints.InterfaceC6026a
    /* renamed from: c */
    public final boolean mo21618c() {
        return true;
    }

    @Override // io.sentry.hints.InterfaceC6026a
    /* renamed from: e */
    public final String mo21619e() {
        return this.f33853a ? "anr_background" : "anr_foreground";
    }
}
