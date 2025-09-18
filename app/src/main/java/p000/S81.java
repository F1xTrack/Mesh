package p000;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class S81 {

    /* renamed from: a */
    public final C9450g32 f10598a = new C9450g32();

    public S81() {
    }

    /* renamed from: a */
    public final void m7183a(Exception exc) {
        this.f10598a.m18388o(exc);
    }

    /* renamed from: b */
    public final void m7184b(Object obj) {
        this.f10598a.m18389p(obj);
    }

    /* renamed from: c */
    public final boolean m7185c(Exception exc) {
        C9450g32 c9450g32 = this.f10598a;
        c9450g32.getClass();
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (c9450g32.f27543a) {
            try {
                if (c9450g32.f27545c) {
                    return false;
                }
                c9450g32.f27545c = true;
                c9450g32.f27548f = exc;
                c9450g32.f27544b.m8923u(c9450g32);
                return true;
            } finally {
            }
        }
    }

    /* renamed from: d */
    public final void m7186d(Object obj) {
        this.f10598a.m18391r(obj);
    }

    public S81(AbstractC0933Op abstractC0933Op) {
        C10226m71 c10226m71 = new C10226m71(11, this);
        FA1 fa1 = (FA1) abstractC0933Op;
        fa1.getClass();
        GQ0 gq0 = new GQ0(10, c10226m71);
        fa1.f3084a.mo11138e(Y81.f14171a, gq0);
    }
}
