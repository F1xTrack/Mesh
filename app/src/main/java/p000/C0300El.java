package p000;

import java.util.concurrent.Executor;

/* renamed from: El */
/* loaded from: classes.dex */
public final class C0300El {

    /* renamed from: a */
    public Object f2876a;

    /* renamed from: b */
    public C0489Hl f2877b;

    /* renamed from: c */
    public C9883jS0 f2878c;

    /* renamed from: d */
    public boolean f2879d;

    /* renamed from: a */
    public final void m2374a(Runnable runnable, Executor executor) {
        C9883jS0 c9883jS0 = this.f2878c;
        if (c9883jS0 != null) {
            c9883jS0.mo2494d(runnable, executor);
        }
    }

    /* renamed from: b */
    public final boolean m2375b(Object obj) {
        this.f2879d = true;
        C0489Hl c0489Hl = this.f2877b;
        boolean z = c0489Hl != null && c0489Hl.f4484b.m10413j(obj);
        if (z) {
            this.f2876a = null;
            this.f2877b = null;
            this.f2878c = null;
        }
        return z;
    }

    /* renamed from: c */
    public final void m2376c() {
        this.f2879d = true;
        C0489Hl c0489Hl = this.f2877b;
        if (c0489Hl == null || !c0489Hl.f4484b.cancel(true)) {
            return;
        }
        this.f2876a = null;
        this.f2877b = null;
        this.f2878c = null;
    }

    /* renamed from: d */
    public final boolean m2377d(Throwable th) {
        this.f2879d = true;
        C0489Hl c0489Hl = this.f2877b;
        boolean z = c0489Hl != null && c0489Hl.f4484b.mo10414k(th);
        if (z) {
            this.f2876a = null;
            this.f2877b = null;
            this.f2878c = null;
        }
        return z;
    }

    public final void finalize() {
        C9883jS0 c9883jS0;
        C0489Hl c0489Hl = this.f2877b;
        if (c0489Hl != null) {
            C0426Gl c0426Gl = c0489Hl.f4484b;
            if (!c0426Gl.isDone()) {
                c0426Gl.mo10414k(new C1195T("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2876a, 3));
            }
        }
        if (this.f2879d || (c9883jS0 = this.f2878c) == null) {
            return;
        }
        c9883jS0.m10413j(null);
    }
}
