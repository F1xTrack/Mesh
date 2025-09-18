package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class H41 implements Runnable {
    public final AtomicInteger a;
    public final AbstractC1516Tf b;
    public final E90 c;
    public final RD0 d;
    public final String e;

    public H41(AbstractC1516Tf abstractC1516Tf, E90 e90, RD0 rd0, String str) {
        O90.f(abstractC1516Tf, "consumer");
        O90.f(e90, "producerListener");
        O90.f(rd0, "producerContext");
        O90.f(str, "producerName");
        this.a = new AtomicInteger(0);
        this.b = abstractC1516Tf;
        this.c = e90;
        this.d = rd0;
        this.e = str;
        e90.j(rd0, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        E90 e90 = this.c;
        RD0 rd0 = this.d;
        String str = this.e;
        e90.i(rd0, str);
        e90.k(rd0, str);
        this.b.c();
    }

    public void f(Exception exc) {
        E90 e90 = this.c;
        RD0 rd0 = this.d;
        String str = this.e;
        e90.i(rd0, str);
        e90.e(rd0, str, exc, null);
        this.b.e(exc);
    }

    public void g(Object obj) {
        E90 e90 = this.c;
        RD0 rd0 = this.d;
        String str = this.e;
        e90.a(rd0, str, e90.i(rd0, str) ? c(obj) : null);
        this.b.g(1, obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objD = d();
                atomicInteger.set(3);
                try {
                    g(objD);
                } finally {
                    b(objD);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
