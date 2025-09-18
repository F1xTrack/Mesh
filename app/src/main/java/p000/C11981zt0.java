package p000;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: zt0 */
/* loaded from: classes.dex */
public final class C11981zt0 {

    /* renamed from: a */
    public final Object f47077a;

    /* renamed from: b */
    public final CopyOnWriteArraySet f47078b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public Closeable f47079c;

    /* renamed from: d */
    public float f47080d;

    /* renamed from: e */
    public int f47081e;

    /* renamed from: f */
    public C7027vg f47082f;

    /* renamed from: g */
    public C1070R0 f47083g;

    /* renamed from: h */
    public final /* synthetic */ C4259ii f47084h;

    public C11981zt0(C4259ii c4259ii, Object obj) {
        this.f47084h = c4259ii;
        this.f47077a = obj;
    }

    /* renamed from: b */
    public static void m26574b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final boolean m26575a(AbstractC1237Tf abstractC1237Tf, RD0 rd0) {
        Pair pairCreate = Pair.create(abstractC1237Tf, rd0);
        synchronized (this) {
            try {
                if (this.f47084h.m19069e(this.f47077a) != this) {
                    return false;
                }
                this.f47078b.add(pairCreate);
                ArrayList arrayListM26584k = m26584k();
                ArrayList arrayListM26585l = m26585l();
                ArrayList arrayListM26583j = m26583j();
                Closeable closeableM19067c = this.f47079c;
                float f = this.f47080d;
                int i = this.f47081e;
                C7027vg.m25460c(arrayListM26584k);
                C7027vg.m25461d(arrayListM26585l);
                C7027vg.m25459b(arrayListM26583j);
                synchronized (pairCreate) {
                    try {
                        synchronized (this) {
                            if (closeableM19067c != this.f47079c) {
                                closeableM19067c = null;
                            } else if (closeableM19067c != null) {
                                closeableM19067c = this.f47084h.m19067c(closeableM19067c);
                            }
                        }
                        if (closeableM19067c != null) {
                            if (f > 0.0f) {
                                abstractC1237Tf.m7720i(f);
                            }
                            abstractC1237Tf.m7719g(i, closeableM19067c);
                            m26574b(closeableM19067c);
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                ((C7027vg) rd0).m25462a(new E40(this, pairCreate, false, 1));
                return true;
            } finally {
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean m26576c() {
        Iterator it = this.f47078b.iterator();
        while (it.hasNext()) {
            if (((C7027vg) ((RD0) ((Pair) it.next()).second)).m25465g()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized boolean m26577d() {
        Iterator it = this.f47078b.iterator();
        while (it.hasNext()) {
            if (!((C7027vg) ((RD0) ((Pair) it.next()).second)).m25466h()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final synchronized EnumC11133tD0 m26578e() {
        EnumC11133tD0 enumC11133tD0;
        enumC11133tD0 = EnumC11133tD0.f42953a;
        Iterator it = this.f47078b.iterator();
        while (it.hasNext()) {
            EnumC11133tD0 enumC11133tD0M25464f = ((C7027vg) ((RD0) ((Pair) it.next()).second)).m25464f();
            O90.m5968f(enumC11133tD0M25464f, "priority2");
            if (enumC11133tD0.ordinal() <= enumC11133tD0M25464f.ordinal()) {
                enumC11133tD0 = enumC11133tD0M25464f;
            }
        }
        return enumC11133tD0;
    }

    /* renamed from: f */
    public final void m26579f(C1070R0 c1070r0, Throwable th) {
        synchronized (this) {
            try {
                if (this.f47083g != c1070r0) {
                    return;
                }
                Iterator it = this.f47078b.iterator();
                this.f47078b.clear();
                this.f47084h.m19071g(this.f47077a, this);
                m26574b(this.f47079c);
                this.f47079c = null;
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        Object obj = pair.second;
                        ((C7027vg) ((RD0) obj)).f44475c.mo747e((RD0) obj, this.f47084h.f29410c, th, null);
                        ((AbstractC1237Tf) pair.first).m7718e(th);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: g */
    public final void m26580g(C1070R0 c1070r0, Closeable closeable, int i) {
        synchronized (this) {
            try {
                if (this.f47083g != c1070r0) {
                    return;
                }
                m26574b(this.f47079c);
                this.f47079c = null;
                Iterator it = this.f47078b.iterator();
                int size = this.f47078b.size();
                if (AbstractC1237Tf.m7715b(i)) {
                    this.f47079c = this.f47084h.m19067c(closeable);
                    this.f47081e = i;
                } else {
                    this.f47078b.clear();
                    this.f47084h.m19071g(this.f47077a, this);
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        try {
                            if (AbstractC1237Tf.m7714a(i)) {
                                Object obj = pair.second;
                                ((C7027vg) ((RD0) obj)).f44475c.mo743a((RD0) obj, this.f47084h.f29410c, null);
                                C7027vg c7027vg = this.f47082f;
                                if (c7027vg != null) {
                                    ((C7027vg) ((RD0) pair.second)).m25468j(c7027vg.f44478f);
                                }
                                RD0 rd0 = (RD0) pair.second;
                                C7027vg c7027vg2 = (C7027vg) rd0;
                                c7027vg2.m25467i(Integer.valueOf(size), this.f47084h.f29411d);
                            }
                            ((AbstractC1237Tf) pair.first).m7719g(i, closeable);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: h */
    public final void m26581h(C1070R0 c1070r0, float f) {
        synchronized (this) {
            try {
                if (this.f47083g != c1070r0) {
                    return;
                }
                this.f47080d = f;
                Iterator it = this.f47078b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        ((AbstractC1237Tf) pair.first).m7720i(f);
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: i */
    public final void m26582i(int i) {
        boolean z;
        synchronized (this) {
            try {
                if (!(this.f47082f == null)) {
                    throw new IllegalArgumentException();
                }
                if (!(this.f47083g == null)) {
                    throw new IllegalArgumentException();
                }
                if (this.f47078b.isEmpty()) {
                    this.f47084h.m19071g(this.f47077a, this);
                    return;
                }
                RD0 rd0 = (RD0) ((Pair) this.f47078b.iterator().next()).second;
                C7027vg c7027vg = new C7027vg(((C7027vg) rd0).f44473a, ((C7027vg) rd0).f44474b, null, ((C7027vg) rd0).f44475c, ((C7027vg) rd0).f44476d, ((C7027vg) rd0).f44477e, m26577d(), m26576c(), m26578e(), ((C7027vg) rd0).f44484l);
                this.f47082f = c7027vg;
                c7027vg.m25468j(((C7027vg) rd0).f44478f);
                if (i == 0) {
                    throw null;
                }
                if (i != 3) {
                    C7027vg c7027vg2 = this.f47082f;
                    int iM26247x = AbstractC7222ym.m26247x(i);
                    if (iM26247x == 0) {
                        z = true;
                    } else {
                        if (iM26247x != 1) {
                            if (iM26247x == 2) {
                                throw new IllegalStateException("No boolean equivalent for UNSET");
                            }
                            throw new IllegalStateException("Unrecognized TriState value: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "UNSET" : "NO" : "YES"));
                        }
                        z = false;
                    }
                    c7027vg2.m25467i(Boolean.valueOf(z), "started_as_prefetch");
                }
                C1070R0 c1070r0 = new C1070R0(1, this);
                this.f47083g = c1070r0;
                this.f47084h.f29409b.mo312a(c1070r0, this.f47082f);
            } finally {
            }
        }
    }

    /* renamed from: j */
    public final synchronized ArrayList m26583j() {
        C7027vg c7027vg = this.f47082f;
        if (c7027vg == null) {
            return null;
        }
        return c7027vg.m25470l(m26576c());
    }

    /* renamed from: k */
    public final synchronized ArrayList m26584k() {
        C7027vg c7027vg = this.f47082f;
        if (c7027vg == null) {
            return null;
        }
        return c7027vg.m25471m(m26577d());
    }

    /* renamed from: l */
    public final synchronized ArrayList m26585l() {
        C7027vg c7027vg = this.f47082f;
        if (c7027vg == null) {
            return null;
        }
        return c7027vg.m25472n(m26578e());
    }
}
