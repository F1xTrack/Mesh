package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class OL {
    public final int a;
    public final C0456Fp0 b;
    public final CopyOnWriteArrayList c;

    public OL(CopyOnWriteArrayList copyOnWriteArrayList, int i, C0456Fp0 c0456Fp0) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = c0456Fp0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            NL nl = (NL) it.next();
            AbstractC0277Dh1.U(nl.a, new ML(this, nl.b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            NL nl = (NL) it.next();
            AbstractC0277Dh1.U(nl.a, new ML(this, nl.b, 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            NL nl = (NL) it.next();
            AbstractC0277Dh1.U(nl.a, new RunnableC6690qf(this, nl.b, i, 8));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            NL nl = (NL) it.next();
            AbstractC0277Dh1.U(nl.a, new RunnableC1557Ts1(this, nl.b, exc, 18));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            NL nl = (NL) it.next();
            AbstractC0277Dh1.U(nl.a, new ML(this, nl.b, 0));
        }
    }
}
