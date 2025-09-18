package p000;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iH */
/* loaded from: classes.dex */
public abstract class AbstractC4232iH {

    /* renamed from: k */
    public static final Size f29015k = new Size(0, 0);

    /* renamed from: l */
    public static final boolean f29016l = AbstractC7806Jm0.m4411e("DeferrableSurface");

    /* renamed from: m */
    public static final AtomicInteger f29017m = new AtomicInteger(0);

    /* renamed from: n */
    public static final AtomicInteger f29018n = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f29019a;

    /* renamed from: b */
    public int f29020b;

    /* renamed from: c */
    public boolean f29021c;

    /* renamed from: d */
    public C0300El f29022d;

    /* renamed from: e */
    public final C0489Hl f29023e;

    /* renamed from: f */
    public C0300El f29024f;

    /* renamed from: g */
    public final C0489Hl f29025g;

    /* renamed from: h */
    public final Size f29026h;

    /* renamed from: i */
    public final int f29027i;

    /* renamed from: j */
    public Class f29028j;

    public AbstractC4232iH() {
        this(f29015k, 0);
    }

    /* renamed from: a */
    public void mo6573a() {
        C0300El c0300El;
        synchronized (this.f29019a) {
            try {
                if (this.f29021c) {
                    c0300El = null;
                } else {
                    this.f29021c = true;
                    this.f29024f.m2375b(null);
                    if (this.f29020b == 0) {
                        c0300El = this.f29022d;
                        this.f29022d = null;
                    } else {
                        c0300El = null;
                    }
                    if (AbstractC7806Jm0.m4411e("DeferrableSurface")) {
                        toString();
                        AbstractC7806Jm0.m4412f("DeferrableSurface");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0300El != null) {
            c0300El.m2375b(null);
        }
    }

    /* renamed from: b */
    public final void m18991b() {
        C0300El c0300El;
        synchronized (this.f29019a) {
            try {
                int i = this.f29020b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.f29020b = i2;
                if (i2 == 0 && this.f29021c) {
                    c0300El = this.f29022d;
                    this.f29022d = null;
                } else {
                    c0300El = null;
                }
                if (AbstractC7806Jm0.m4411e("DeferrableSurface")) {
                    toString();
                    AbstractC7806Jm0.m4412f("DeferrableSurface");
                    if (this.f29020b == 0) {
                        f29018n.get();
                        f29017m.decrementAndGet();
                        m18994e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0300El != null) {
            c0300El.m2375b(null);
        }
    }

    /* renamed from: c */
    public final InterfaceFutureC7800Jj0 m18992c() {
        synchronized (this.f29019a) {
            try {
                if (this.f29021c) {
                    return new F70(1, new C4169hH(this, "DeferrableSurface already closed."));
                }
                return mo2926f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m18993d() {
        synchronized (this.f29019a) {
            try {
                int i = this.f29020b;
                if (i == 0 && this.f29021c) {
                    throw new C4169hH(this, "Cannot begin use on a closed surface.");
                }
                this.f29020b = i + 1;
                if (AbstractC7806Jm0.m4411e("DeferrableSurface")) {
                    if (this.f29020b == 1) {
                        f29018n.get();
                        f29017m.incrementAndGet();
                        m18994e();
                    }
                    toString();
                    AbstractC7806Jm0.m4412f("DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void m18994e() {
        if (!f29016l && AbstractC7806Jm0.m4411e("DeferrableSurface")) {
            AbstractC7806Jm0.m4412f("DeferrableSurface");
        }
        toString();
        AbstractC7806Jm0.m4412f("DeferrableSurface");
    }

    /* renamed from: f */
    public abstract InterfaceFutureC7800Jj0 mo2926f();

    public AbstractC4232iH(Size size, int i) {
        this.f29019a = new Object();
        this.f29020b = 0;
        this.f29021c = false;
        this.f29026h = size;
        this.f29027i = i;
        final int i2 = 0;
        C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new InterfaceC0363Fl(this) { // from class: fH

            /* renamed from: b */
            public final /* synthetic */ AbstractC4232iH f27126b;

            {
                this.f27126b = this;
            }

            /* renamed from: a */
            private final Object m18199a(C0300El c0300El) {
                AbstractC4232iH abstractC4232iH = this.f27126b;
                synchronized (abstractC4232iH.f29019a) {
                    abstractC4232iH.f29022d = c0300El;
                }
                return "DeferrableSurface-termination(" + abstractC4232iH + ")";
            }

            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El) {
                switch (i2) {
                    case 0:
                        return m18199a(c0300El);
                    default:
                        AbstractC4232iH abstractC4232iH = this.f27126b;
                        synchronized (abstractC4232iH.f29019a) {
                            abstractC4232iH.f29024f = c0300El;
                        }
                        return "DeferrableSurface-close(" + abstractC4232iH + ")";
                }
            }
        });
        this.f29023e = c0489HlM26149b;
        final int i3 = 1;
        this.f29025g = AbstractC11797yQ1.m26149b(new InterfaceC0363Fl(this) { // from class: fH

            /* renamed from: b */
            public final /* synthetic */ AbstractC4232iH f27126b;

            {
                this.f27126b = this;
            }

            /* renamed from: a */
            private final Object m18199a(C0300El c0300El) {
                AbstractC4232iH abstractC4232iH = this.f27126b;
                synchronized (abstractC4232iH.f29019a) {
                    abstractC4232iH.f29022d = c0300El;
                }
                return "DeferrableSurface-termination(" + abstractC4232iH + ")";
            }

            @Override // p000.InterfaceC0363Fl
            /* renamed from: h0 */
            public final Object mo411h0(C0300El c0300El) {
                switch (i3) {
                    case 0:
                        return m18199a(c0300El);
                    default:
                        AbstractC4232iH abstractC4232iH = this.f27126b;
                        synchronized (abstractC4232iH.f29019a) {
                            abstractC4232iH.f29024f = c0300El;
                        }
                        return "DeferrableSurface-close(" + abstractC4232iH + ")";
                }
            }
        });
        if (AbstractC7806Jm0.m4411e("DeferrableSurface")) {
            f29018n.incrementAndGet();
            f29017m.get();
            m18994e();
            c0489HlM26149b.f4484b.mo2494d(new RunnableC4106gH(this, Log.getStackTraceString(new Exception())), QR1.m6703a());
        }
    }
}
