package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class R0 extends AbstractC1516Tf {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ R0(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    private final void m() {
        C8066xt c8066xt = (C8066xt) this.c;
        synchronized (c8066xt) {
            ML1.e(c8066xt.f());
        }
    }

    @Override // defpackage.AbstractC1516Tf
    public final void d() {
        switch (this.b) {
            case 0:
                m();
                return;
            default:
                try {
                    AbstractC4368iZ.b();
                    C8447zt0 c8447zt0 = (C8447zt0) this.c;
                    synchronized (c8447zt0) {
                        try {
                            if (c8447zt0.g == this) {
                                c8447zt0.g = null;
                                c8447zt0.f = null;
                                C8447zt0.b(c8447zt0.c);
                                c8447zt0.c = null;
                                c8447zt0.i(3);
                            }
                        } finally {
                        }
                    }
                    return;
                } finally {
                    AbstractC4368iZ.b();
                }
        }
    }

    @Override // defpackage.AbstractC1516Tf
    public final void f(Throwable th) {
        switch (this.b) {
            case 0:
                O90.f(th, "throwable");
                C8066xt c8066xt = (C8066xt) this.c;
                C8387zZ0 c8387zZ0 = c8066xt.h;
                O90.f(c8387zZ0, "producerContext");
                if (c8066xt.i(th, c8387zZ0.f)) {
                    c8066xt.i.d(c8387zZ0, th);
                    return;
                }
                return;
            default:
                try {
                    AbstractC4368iZ.b();
                    ((C8447zt0) this.c).f(this, th);
                    return;
                } finally {
                    AbstractC4368iZ.b();
                }
        }
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) {
        switch (this.b) {
            case 0:
                C8066xt c8066xt = (C8066xt) this.c;
                C8387zZ0 c8387zZ0 = c8066xt.h;
                switch (c8066xt.j) {
                    case 0:
                        c8066xt.n(AbstractC8446zt.o((AbstractC8446zt) obj), i, c8387zZ0);
                        return;
                    default:
                        c8066xt.n(obj, i, c8387zZ0);
                        return;
                }
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    AbstractC4368iZ.b();
                    ((C8447zt0) this.c).g(this, closeable, i);
                    return;
                } finally {
                    AbstractC4368iZ.b();
                }
        }
    }

    @Override // defpackage.AbstractC1516Tf
    public final void j(float f) {
        switch (this.b) {
            case 0:
                ((C8066xt) this.c).j(f);
                return;
            default:
                try {
                    AbstractC4368iZ.b();
                    ((C8447zt0) this.c).h(this, f);
                    return;
                } finally {
                    AbstractC4368iZ.b();
                }
        }
    }
}
