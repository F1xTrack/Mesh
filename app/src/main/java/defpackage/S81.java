package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class S81 {
    public final C3892g32 a = new C3892g32();

    public S81() {
    }

    public final void a(Exception exc) {
        this.a.o(exc);
    }

    public final void b(Object obj) {
        this.a.p(obj);
    }

    public final boolean c(Exception exc) {
        C3892g32 c3892g32 = this.a;
        c3892g32.getClass();
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (c3892g32.a) {
            try {
                if (c3892g32.c) {
                    return false;
                }
                c3892g32.c = true;
                c3892g32.f = exc;
                c3892g32.b.u(c3892g32);
                return true;
            } finally {
            }
        }
    }

    public final void d(Object obj) {
        this.a.r(obj);
    }

    public S81(AbstractC1156Op abstractC1156Op) {
        C5826m71 c5826m71 = new C5826m71(11, this);
        FA1 fa1 = (FA1) abstractC1156Op;
        fa1.getClass();
        GQ0 gq0 = new GQ0(10, c5826m71);
        fa1.a.e(Y81.a, gq0);
    }
}
