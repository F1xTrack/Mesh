package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Uj {
    public final C4567g5 a;
    public final Tj b;
    public final C4543f5 c;
    public final J9 d;
    public final AbstractC4561g e;
    public final AbstractC4561g f;
    public Gj g;
    public int h = 0;

    public Uj(C4567g5 c4567g5, Tj tj, C4543f5 c4543f5, C4524ea c4524ea, G2 g2, J9 j9) {
        this.a = c4567g5;
        this.c = c4543f5;
        this.e = c4524ea;
        this.f = g2;
        this.b = tj;
        this.d = j9;
    }

    public final synchronized long a() {
        Gj gj;
        gj = this.g;
        return gj == null ? 10000000000L : gj.d - 1;
    }

    public final synchronized Gj b(T5 t5) {
        try {
            if (this.h == 0) {
                Gj gjB = this.e.b();
                if (gjB != null) {
                    if (gjB.a(t5.i)) {
                        this.g = gjB;
                        this.h = 3;
                    } else {
                        a(gjB, t5);
                    }
                }
                Gj gjB2 = this.f.b();
                if (gjB2 != null) {
                    if (gjB2.a(t5.i)) {
                        this.g = gjB2;
                        this.h = 2;
                    } else {
                        a(gjB2, t5);
                    }
                }
                this.g = null;
                this.h = 1;
            }
            if (this.h != 1) {
                Gj gj = this.g;
                if (gj != null) {
                    if (!gj.a(t5.i)) {
                        a(gj, t5);
                    }
                }
                this.h = 1;
                this.g = null;
            }
            int iA = I7.a(this.h);
            if (iA == 1) {
                Gj gj2 = this.g;
                long j = t5.i;
                gj2.i = j;
                Xj xj = gj2.b;
                xj.a(Xj.d, Long.valueOf(j));
                xj.b();
                return this.g;
            }
            if (iA == 2) {
                return this.g;
            }
            this.a.n.info("Start background session", new Object[0]);
            this.h = 2;
            long j2 = t5.i;
            AbstractC4561g abstractC4561g = this.f;
            Hj hj = new Hj(j2, t5.j);
            abstractC4561g.getClass();
            Gj gjA = abstractC4561g.a(hj);
            if (this.a.v.c()) {
                C4543f5 c4543f5 = this.c;
                c4543f5.a.o.a(T5.a(t5, this.d), a(gjA, t5.i));
            } else {
                int i = t5.d;
                Wa wa = Wa.EVENT_TYPE_UNDEFINED;
                if (i == 6145) {
                    C4543f5 c4543f52 = this.c;
                    c4543f52.a.o.a(t5, a(gjA, j2));
                    C4543f5 c4543f53 = this.c;
                    c4543f53.a.o.a(T5.a(t5, this.d), a(gjA, j2));
                }
            }
            this.g = gjA;
            return gjA;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(T5 t5) {
        try {
            if (this.h == 0) {
                Gj gjB = this.e.b();
                if (gjB != null) {
                    if (gjB.a(t5.i)) {
                        this.g = gjB;
                        this.h = 3;
                    } else {
                        a(gjB, t5);
                    }
                }
                Gj gjB2 = this.f.b();
                if (gjB2 != null) {
                    if (gjB2.a(t5.i)) {
                        this.g = gjB2;
                        this.h = 2;
                    } else {
                        a(gjB2, t5);
                    }
                }
                this.g = null;
                this.h = 1;
            }
            int iA = I7.a(this.h);
            if (iA == 0) {
                this.g = a(t5);
            } else if (iA == 1) {
                a(this.g, t5);
                this.g = a(t5);
            } else if (iA == 2) {
                Gj gj = this.g;
                if (gj != null) {
                    if (gj.a(t5.i)) {
                        Gj gj2 = this.g;
                        long j = t5.i;
                        gj2.i = j;
                        Xj xj = gj2.b;
                        xj.a(Xj.d, Long.valueOf(j));
                        xj.b();
                    } else {
                        a(gj, t5);
                    }
                }
                this.g = a(t5);
            }
        } finally {
        }
    }

    public final Gj a(T5 t5) {
        this.a.n.info("Start foreground session", new Object[0]);
        long j = t5.i;
        AbstractC4561g abstractC4561g = this.e;
        Hj hj = new Hj(j, t5.j);
        abstractC4561g.getClass();
        Gj gjA = abstractC4561g.a(hj);
        this.h = 3;
        this.a.q.b();
        C4543f5 c4543f5 = this.c;
        c4543f5.a.o.a(T5.a(t5, this.d), a(gjA, j));
        return gjA;
    }

    public final void a(Gj gj, T5 t5) {
        if (gj.g && gj.d > 0) {
            C4543f5 c4543f5 = this.c;
            T5 t5A = T5.a(t5, Wa.EVENT_TYPE_ALIVE);
            Wj wj = new Wj();
            wj.a = gj.d;
            wj.d = gj.c.a;
            long andIncrement = gj.f.getAndIncrement();
            Xj xj = gj.b;
            xj.a(Xj.g, Long.valueOf(gj.f.get()));
            xj.b();
            wj.b = andIncrement;
            wj.c = TimeUnit.MILLISECONDS.toSeconds(Math.max(gj.i - gj.e, gj.j));
            c4543f5.a.o.a(t5A, wj);
            if (gj.g) {
                gj.g = false;
                Xj xj2 = gj.b;
                xj2.a(Xj.i, Boolean.FALSE);
                xj2.b();
            }
        }
        PublicLogger publicLogger = this.a.n;
        int iOrdinal = gj.c.a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (gj) {
            Xj xj3 = gj.b;
            xj3.getClass();
            xj3.c = new C4425ab();
            xj3.b();
            gj.h = null;
        }
    }

    public static Wj a(Gj gj, long j) {
        Wj wj = new Wj();
        wj.a = gj.d;
        long andIncrement = gj.f.getAndIncrement();
        Xj xj = gj.b;
        xj.a(Xj.g, Long.valueOf(gj.f.get()));
        xj.b();
        wj.b = andIncrement;
        Xj xj2 = gj.b;
        long j2 = j - gj.e;
        gj.j = j2;
        xj2.a(Xj.e, Long.valueOf(j2));
        wj.c = TimeUnit.MILLISECONDS.toSeconds(gj.j);
        wj.d = gj.c.a;
        return wj;
    }
}
