package io.sentry.util;

/* renamed from: io.sentry.util.c */
/* loaded from: classes2.dex */
public final class C6170c {

    /* renamed from: a */
    public volatile Object f34660a = null;

    /* renamed from: b */
    public final InterfaceC6169b f34661b;

    public C6170c(InterfaceC6169b interfaceC6169b) {
        this.f34661b = interfaceC6169b;
    }

    /* renamed from: a */
    public final Object m21880a() {
        if (this.f34660a == null) {
            synchronized (this) {
                try {
                    if (this.f34660a == null) {
                        this.f34660a = this.f34661b.mo3171c();
                    }
                } finally {
                }
            }
        }
        return this.f34660a;
    }
}
