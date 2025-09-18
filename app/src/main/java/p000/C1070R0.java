package p000;

import java.io.Closeable;

/* renamed from: R0 */
/* loaded from: classes.dex */
public final class C1070R0 extends AbstractC1237Tf {

    /* renamed from: b */
    public final /* synthetic */ int f9886b;

    /* renamed from: c */
    public final /* synthetic */ Object f9887c;

    public /* synthetic */ C1070R0(int i, Object obj) {
        this.f9886b = i;
        this.f9887c = obj;
    }

    /* renamed from: m */
    private final void m6843m() {
        C7166xt c7166xt = (C7166xt) this.f9887c;
        synchronized (c7166xt) {
            ML1.m5338e(c7166xt.m3667f());
        }
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: d */
    public final void mo6844d() {
        switch (this.f9886b) {
            case 0:
                m6843m();
                return;
            default:
                try {
                    AbstractC4250iZ.m19063b();
                    C11981zt0 c11981zt0 = (C11981zt0) this.f9887c;
                    synchronized (c11981zt0) {
                        try {
                            if (c11981zt0.f47083g == this) {
                                c11981zt0.f47083g = null;
                                c11981zt0.f47082f = null;
                                C11981zt0.m26574b(c11981zt0.f47079c);
                                c11981zt0.f47079c = null;
                                c11981zt0.m26582i(3);
                            }
                        } finally {
                        }
                    }
                    return;
                } finally {
                    AbstractC4250iZ.m19063b();
                }
        }
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: f */
    public final void mo6845f(Throwable th) {
        switch (this.f9886b) {
            case 0:
                O90.m5968f(th, "throwable");
                C7166xt c7166xt = (C7166xt) this.f9887c;
                C11941zZ0 c11941zZ0 = c7166xt.f45871h;
                O90.m5968f(c11941zZ0, "producerContext");
                if (c7166xt.m3670i(th, c11941zZ0.f44478f)) {
                    c7166xt.f45872i.mo746d(c11941zZ0, th);
                    return;
                }
                return;
            default:
                try {
                    AbstractC4250iZ.m19063b();
                    ((C11981zt0) this.f9887c).m26579f(this, th);
                    return;
                } finally {
                    AbstractC4250iZ.m19063b();
                }
        }
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) {
        switch (this.f9886b) {
            case 0:
                C7166xt c7166xt = (C7166xt) this.f9887c;
                C11941zZ0 c11941zZ0 = c7166xt.f45871h;
                switch (c7166xt.f45873j) {
                    case 0:
                        c7166xt.m25953n(AbstractC7292zt.m26568o((AbstractC7292zt) obj), i, c11941zZ0);
                        return;
                    default:
                        c7166xt.m25953n(obj, i, c11941zZ0);
                        return;
                }
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    AbstractC4250iZ.m19063b();
                    ((C11981zt0) this.f9887c).m26580g(this, closeable, i);
                    return;
                } finally {
                    AbstractC4250iZ.m19063b();
                }
        }
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: j */
    public final void mo6847j(float f) {
        switch (this.f9886b) {
            case 0:
                ((C7166xt) this.f9887c).m3671j(f);
                return;
            default:
                try {
                    AbstractC4250iZ.m19063b();
                    ((C11981zt0) this.f9887c).m26581h(this, f);
                    return;
                } finally {
                    AbstractC4250iZ.m19063b();
                }
        }
    }
}
