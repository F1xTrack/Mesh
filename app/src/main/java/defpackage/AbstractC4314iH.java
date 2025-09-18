package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iH */
/* loaded from: classes.dex */
public abstract class AbstractC4314iH {
    public static final Size k = new Size(0, 0);
    public static final boolean l = AbstractC0759Jm0.e("DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);
    public static final AtomicInteger n = new AtomicInteger(0);
    public final Object a;
    public int b;
    public boolean c;
    public C0365El d;
    public final C0599Hl e;
    public C0365El f;
    public final C0599Hl g;
    public final Size h;
    public final int i;
    public Class j;

    public AbstractC4314iH() {
        this(k, 0);
    }

    public void a() {
        C0365El c0365El;
        synchronized (this.a) {
            try {
                if (this.c) {
                    c0365El = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        c0365El = this.d;
                        this.d = null;
                    } else {
                        c0365El = null;
                    }
                    if (AbstractC0759Jm0.e("DeferrableSurface")) {
                        toString();
                        AbstractC0759Jm0.f("DeferrableSurface");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0365El != null) {
            c0365El.b(null);
        }
    }

    public final void b() {
        C0365El c0365El;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    c0365El = this.d;
                    this.d = null;
                } else {
                    c0365El = null;
                }
                if (AbstractC0759Jm0.e("DeferrableSurface")) {
                    toString();
                    AbstractC0759Jm0.f("DeferrableSurface");
                    if (this.b == 0) {
                        n.get();
                        m.decrementAndGet();
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0365El != null) {
            c0365El.b(null);
        }
    }

    public final InterfaceFutureC0750Jj0 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new F70(1, new C4123hH(this, "DeferrableSurface already closed."));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new C4123hH(this, "Cannot begin use on a closed surface.");
                }
                this.b = i + 1;
                if (AbstractC0759Jm0.e("DeferrableSurface")) {
                    if (this.b == 1) {
                        n.get();
                        m.incrementAndGet();
                        e();
                    }
                    toString();
                    AbstractC0759Jm0.f("DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (!l && AbstractC0759Jm0.e("DeferrableSurface")) {
            AbstractC0759Jm0.f("DeferrableSurface");
        }
        toString();
        AbstractC0759Jm0.f("DeferrableSurface");
    }

    public abstract InterfaceFutureC0750Jj0 f();

    public AbstractC4314iH(Size size, int i) {
        this.a = new Object();
        this.b = 0;
        this.c = false;
        this.h = size;
        this.i = i;
        final int i2 = 0;
        C0599Hl c0599HlB = AbstractC8171yQ1.b(new InterfaceC0443Fl(this) { // from class: fH
            public final /* synthetic */ AbstractC4314iH b;

            {
                this.b = this;
            }

            private final Object a(C0365El c0365El) {
                AbstractC4314iH abstractC4314iH = this.b;
                synchronized (abstractC4314iH.a) {
                    abstractC4314iH.d = c0365El;
                }
                return "DeferrableSurface-termination(" + abstractC4314iH + ")";
            }

            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El) {
                switch (i2) {
                    case 0:
                        return a(c0365El);
                    default:
                        AbstractC4314iH abstractC4314iH = this.b;
                        synchronized (abstractC4314iH.a) {
                            abstractC4314iH.f = c0365El;
                        }
                        return "DeferrableSurface-close(" + abstractC4314iH + ")";
                }
            }
        });
        this.e = c0599HlB;
        final int i3 = 1;
        this.g = AbstractC8171yQ1.b(new InterfaceC0443Fl(this) { // from class: fH
            public final /* synthetic */ AbstractC4314iH b;

            {
                this.b = this;
            }

            private final Object a(C0365El c0365El) {
                AbstractC4314iH abstractC4314iH = this.b;
                synchronized (abstractC4314iH.a) {
                    abstractC4314iH.d = c0365El;
                }
                return "DeferrableSurface-termination(" + abstractC4314iH + ")";
            }

            @Override // defpackage.InterfaceC0443Fl
            public final Object h0(C0365El c0365El) {
                switch (i3) {
                    case 0:
                        return a(c0365El);
                    default:
                        AbstractC4314iH abstractC4314iH = this.b;
                        synchronized (abstractC4314iH.a) {
                            abstractC4314iH.f = c0365El;
                        }
                        return "DeferrableSurface-close(" + abstractC4314iH + ")";
                }
            }
        });
        if (AbstractC0759Jm0.e("DeferrableSurface")) {
            n.incrementAndGet();
            m.get();
            e();
            c0599HlB.b.d(new RunnableC3932gH(this, Log.getStackTraceString(new Exception())), QR1.a());
        }
    }
}
