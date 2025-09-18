package defpackage;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: zt0 */
/* loaded from: classes.dex */
public final class C8447zt0 {
    public final Object a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public Closeable c;
    public float d;
    public int e;
    public C7647vg f;
    public R0 g;
    public final /* synthetic */ C4394ii h;

    public C8447zt0(C4394ii c4394ii, Object obj) {
        this.h = c4394ii;
        this.a = obj;
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean a(AbstractC1516Tf abstractC1516Tf, RD0 rd0) {
        Pair pairCreate = Pair.create(abstractC1516Tf, rd0);
        synchronized (this) {
            try {
                if (this.h.e(this.a) != this) {
                    return false;
                }
                this.b.add(pairCreate);
                ArrayList arrayListK = k();
                ArrayList arrayListL = l();
                ArrayList arrayListJ = j();
                Closeable closeableC = this.c;
                float f = this.d;
                int i = this.e;
                C7647vg.c(arrayListK);
                C7647vg.d(arrayListL);
                C7647vg.b(arrayListJ);
                synchronized (pairCreate) {
                    try {
                        synchronized (this) {
                            if (closeableC != this.c) {
                                closeableC = null;
                            } else if (closeableC != null) {
                                closeableC = this.h.c(closeableC);
                            }
                        }
                        if (closeableC != null) {
                            if (f > 0.0f) {
                                abstractC1516Tf.i(f);
                            }
                            abstractC1516Tf.g(i, closeableC);
                            b(closeableC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                ((C7647vg) rd0).a(new E40(this, pairCreate, false, 1));
                return true;
            } finally {
            }
        }
    }

    public final synchronized boolean c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((C7647vg) ((RD0) ((Pair) it.next()).second)).g()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (!((C7647vg) ((RD0) ((Pair) it.next()).second)).h()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized EnumC7179tD0 e() {
        EnumC7179tD0 enumC7179tD0;
        enumC7179tD0 = EnumC7179tD0.a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            EnumC7179tD0 enumC7179tD0F = ((C7647vg) ((RD0) ((Pair) it.next()).second)).f();
            O90.f(enumC7179tD0F, "priority2");
            if (enumC7179tD0.ordinal() <= enumC7179tD0F.ordinal()) {
                enumC7179tD0 = enumC7179tD0F;
            }
        }
        return enumC7179tD0;
    }

    public final void f(R0 r0, Throwable th) {
        synchronized (this) {
            try {
                if (this.g != r0) {
                    return;
                }
                Iterator it = this.b.iterator();
                this.b.clear();
                this.h.g(this.a, this);
                b(this.c);
                this.c = null;
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        Object obj = pair.second;
                        ((C7647vg) ((RD0) obj)).c.e((RD0) obj, this.h.c, th, null);
                        ((AbstractC1516Tf) pair.first).e(th);
                    }
                }
            } finally {
            }
        }
    }

    public final void g(R0 r0, Closeable closeable, int i) {
        synchronized (this) {
            try {
                if (this.g != r0) {
                    return;
                }
                b(this.c);
                this.c = null;
                Iterator it = this.b.iterator();
                int size = this.b.size();
                if (AbstractC1516Tf.b(i)) {
                    this.c = this.h.c(closeable);
                    this.e = i;
                } else {
                    this.b.clear();
                    this.h.g(this.a, this);
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        try {
                            if (AbstractC1516Tf.a(i)) {
                                Object obj = pair.second;
                                ((C7647vg) ((RD0) obj)).c.a((RD0) obj, this.h.c, null);
                                C7647vg c7647vg = this.f;
                                if (c7647vg != null) {
                                    ((C7647vg) ((RD0) pair.second)).j(c7647vg.f);
                                }
                                RD0 rd0 = (RD0) pair.second;
                                C7647vg c7647vg2 = (C7647vg) rd0;
                                c7647vg2.i(Integer.valueOf(size), this.h.d);
                            }
                            ((AbstractC1516Tf) pair.first).g(i, closeable);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void h(R0 r0, float f) {
        synchronized (this) {
            try {
                if (this.g != r0) {
                    return;
                }
                this.d = f;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        ((AbstractC1516Tf) pair.first).i(f);
                    }
                }
            } finally {
            }
        }
    }

    public final void i(int i) {
        boolean z;
        synchronized (this) {
            try {
                if (!(this.f == null)) {
                    throw new IllegalArgumentException();
                }
                if (!(this.g == null)) {
                    throw new IllegalArgumentException();
                }
                if (this.b.isEmpty()) {
                    this.h.g(this.a, this);
                    return;
                }
                RD0 rd0 = (RD0) ((Pair) this.b.iterator().next()).second;
                C7647vg c7647vg = new C7647vg(((C7647vg) rd0).a, ((C7647vg) rd0).b, null, ((C7647vg) rd0).c, ((C7647vg) rd0).d, ((C7647vg) rd0).e, d(), c(), e(), ((C7647vg) rd0).l);
                this.f = c7647vg;
                c7647vg.j(((C7647vg) rd0).f);
                if (i == 0) {
                    throw null;
                }
                if (i != 3) {
                    C7647vg c7647vg2 = this.f;
                    int iX = AbstractC8235ym.x(i);
                    if (iX == 0) {
                        z = true;
                    } else {
                        if (iX != 1) {
                            if (iX == 2) {
                                throw new IllegalStateException("No boolean equivalent for UNSET");
                            }
                            throw new IllegalStateException("Unrecognized TriState value: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "UNSET" : "NO" : "YES"));
                        }
                        z = false;
                    }
                    c7647vg2.i(Boolean.valueOf(z), "started_as_prefetch");
                }
                R0 r0 = new R0(1, this);
                this.g = r0;
                this.h.b.a(r0, this.f);
            } finally {
            }
        }
    }

    public final synchronized ArrayList j() {
        C7647vg c7647vg = this.f;
        if (c7647vg == null) {
            return null;
        }
        return c7647vg.l(c());
    }

    public final synchronized ArrayList k() {
        C7647vg c7647vg = this.f;
        if (c7647vg == null) {
            return null;
        }
        return c7647vg.m(d());
    }

    public final synchronized ArrayList l() {
        C7647vg c7647vg = this.f;
        if (c7647vg == null) {
            return null;
        }
        return c7647vg.n(e());
    }
}
