package defpackage;

import java.util.concurrent.Executor;

/* renamed from: El */
/* loaded from: classes.dex */
public final class C0365El {
    public Object a;
    public C0599Hl b;
    public C5315jS0 c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        C5315jS0 c5315jS0 = this.c;
        if (c5315jS0 != null) {
            c5315jS0.d(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        C0599Hl c0599Hl = this.b;
        boolean z = c0599Hl != null && c0599Hl.b.j(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        C0599Hl c0599Hl = this.b;
        if (c0599Hl == null || !c0599Hl.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        C0599Hl c0599Hl = this.b;
        boolean z = c0599Hl != null && c0599Hl.b.k(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        C5315jS0 c5315jS0;
        C0599Hl c0599Hl = this.b;
        if (c0599Hl != null) {
            C0521Gl c0521Gl = c0599Hl.b;
            if (!c0521Gl.isDone()) {
                c0521Gl.k(new T("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 3));
            }
        }
        if (this.d || (c5315jS0 = this.c) == null) {
            return;
        }
        c5315jS0.j(null);
    }
}
