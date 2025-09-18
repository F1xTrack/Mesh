package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: OL */
/* loaded from: classes.dex */
public final class C0903OL {

    /* renamed from: a */
    public final int f8364a;

    /* renamed from: b */
    public final C7604Fp0 f8365b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f8366c;

    public C0903OL(CopyOnWriteArrayList copyOnWriteArrayList, int i, C7604Fp0 c7604Fp0) {
        this.f8366c = copyOnWriteArrayList;
        this.f8364a = i;
        this.f8365b = c7604Fp0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    /* renamed from: a */
    public final void m6015a() {
        Iterator it = this.f8366c.iterator();
        while (it.hasNext()) {
            C0840NL c0840nl = (C0840NL) it.next();
            AbstractC7485Dh1.m1806U(c0840nl.f7729a, new RunnableC0777ML(this, c0840nl.f7730b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    /* renamed from: b */
    public final void m6016b() {
        Iterator it = this.f8366c.iterator();
        while (it.hasNext()) {
            C0840NL c0840nl = (C0840NL) it.next();
            AbstractC7485Dh1.m1806U(c0840nl.f7729a, new RunnableC0777ML(this, c0840nl.f7730b, 1));
        }
    }

    /* renamed from: c */
    public final void m6017c(int i) {
        Iterator it = this.f8366c.iterator();
        while (it.hasNext()) {
            C0840NL c0840nl = (C0840NL) it.next();
            AbstractC7485Dh1.m1806U(c0840nl.f7729a, new RunnableC6694qf(this, c0840nl.f7730b, i, 8));
        }
    }

    /* renamed from: d */
    public final void m6018d(Exception exc) {
        Iterator it = this.f8366c.iterator();
        while (it.hasNext()) {
            C0840NL c0840nl = (C0840NL) it.next();
            AbstractC7485Dh1.m1806U(c0840nl.f7729a, new RunnableC8339Ts1(this, c0840nl.f7730b, exc, 18));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [PL, java.lang.Object] */
    /* renamed from: e */
    public final void m6019e() {
        Iterator it = this.f8366c.iterator();
        while (it.hasNext()) {
            C0840NL c0840nl = (C0840NL) it.next();
            AbstractC7485Dh1.m1806U(c0840nl.f7729a, new RunnableC0777ML(this, c0840nl.f7730b, 0));
        }
    }
}
