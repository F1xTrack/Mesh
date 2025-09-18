package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: gw */
/* loaded from: classes.dex */
public final class C4055gw {
    public static final ExecutorC4096h8 m = new ExecutorC4096h8(1);
    public final C3864fw a;
    public final C8418zj1 b;
    public final C0361Ej1 c;
    public final C3482dw d;
    public final M71 e;
    public final CopyOnWriteArraySet f;
    public C6666qX g;
    public InterfaceC7848wj1 h;
    public R71 i;
    public Pair j;
    public int k;
    public int l;

    public C4055gw(C2226aw c2226aw) {
        C3864fw c3864fw = new C3864fw(this, (Context) c2226aw.b);
        this.a = c3864fw;
        M71 m71 = (M71) c2226aw.g;
        this.e = m71;
        C8418zj1 c8418zj1 = (C8418zj1) c2226aw.d;
        this.b = c8418zj1;
        c8418zj1.k = m71;
        this.c = new C0361Ej1(new C3866fw1(7, this), c8418zj1);
        C3482dw c3482dw = (C3482dw) c2226aw.f;
        YN1.h(c3482dw);
        this.d = c3482dw;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f = copyOnWriteArraySet;
        this.l = 0;
        copyOnWriteArraySet.add(c3864fw);
    }

    public final void a(long j, long j2) {
        C0361Ej1 c0361Ej1;
        C5971mu c5971mu;
        int i;
        if (this.k != 0 || (i = (c5971mu = (c0361Ej1 = this.c).f).b) == 0) {
            return;
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long j3 = ((long[]) c5971mu.d)[c5971mu.a];
        Long l = (Long) c0361Ej1.e.q(j3);
        C8418zj1 c8418zj1 = c0361Ej1.b;
        if (l != null && l.longValue() != c0361Ej1.i) {
            c0361Ej1.i = l.longValue();
            c8418zj1.c(2);
        }
        int iA = c0361Ej1.b.a(j3, j, j2, c0361Ej1.i, false, c0361Ej1.c);
        C4055gw c4055gw = (C4055gw) c0361Ej1.a.b;
        if (iA != 0 && iA != 1) {
            if (iA != 2 && iA != 3 && iA != 4) {
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
                return;
            }
            c0361Ej1.j = j3;
            c5971mu.P();
            Iterator it = c4055gw.f.iterator();
            while (it.hasNext()) {
                C3864fw c3864fw = (C3864fw) it.next();
                c3864fw.i.execute(new RunnableC3673ew(c3864fw, c3864fw.h, 1));
            }
            YN1.h(null);
            throw null;
        }
        c0361Ej1.j = j3;
        long jP = c5971mu.P();
        C1530Tj1 c1530Tj1 = (C1530Tj1) c0361Ej1.d.q(jP);
        if (c1530Tj1 != null && !c1530Tj1.equals(C1530Tj1.e) && !c1530Tj1.equals(c0361Ej1.h)) {
            c0361Ej1.h = c1530Tj1;
            C6475pX c6475pX = new C6475pX();
            c6475pX.r = c1530Tj1.a;
            c6475pX.s = c1530Tj1.b;
            c6475pX.l = AbstractC1865Xr0.n("video/raw");
            c4055gw.g = new C6666qX(c6475pX);
            Iterator it2 = c4055gw.f.iterator();
            while (it2.hasNext()) {
                C3864fw c3864fw2 = (C3864fw) it2.next();
                c3864fw2.i.execute(new RunnableC3673ew(c3864fw2, c3864fw2.h, c1530Tj1));
            }
        }
        boolean z = c8418zj1.d != 3;
        c8418zj1.d = 3;
        c8418zj1.k.getClass();
        c8418zj1.f = AbstractC0277Dh1.Q(SystemClock.elapsedRealtime());
        if (z && c4055gw.j != null) {
            Iterator it3 = c4055gw.f.iterator();
            while (it3.hasNext()) {
                C3864fw c3864fw3 = (C3864fw) it3.next();
                c3864fw3.i.execute(new RunnableC3673ew(c3864fw3, c3864fw3.h, 2));
            }
        }
        if (c4055gw.h != null) {
            C6666qX c6666qX = c4055gw.g;
            C6666qX c6666qX2 = c6666qX == null ? new C6666qX(new C6475pX()) : c6666qX;
            InterfaceC7848wj1 interfaceC7848wj1 = c4055gw.h;
            c4055gw.e.getClass();
            interfaceC7848wj1.c(jP, System.nanoTime(), c6666qX2, null);
        }
        YN1.h(null);
        throw null;
    }
}
