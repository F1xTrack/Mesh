package io.sentry.util.thread;

/* renamed from: io.sentry.util.thread.b */
/* loaded from: classes2.dex */
public final class C6177b implements InterfaceC6176a {

    /* renamed from: a */
    public static final long f34669a = Thread.currentThread().getId();

    /* renamed from: b */
    public static final C6177b f34670b = new C6177b();

    @Override // io.sentry.util.thread.InterfaceC6176a
    /* renamed from: a */
    public final boolean mo21581a() {
        return f34669a == Thread.currentThread().getId();
    }
}
