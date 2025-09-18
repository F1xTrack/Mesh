package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: rC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6794rC0 extends AbstractC8332zH {
    public final E90 c;
    public final RD0 d;
    public final InterfaceC6604qC0 e;
    public boolean f;
    public AbstractC8446zt g;
    public int h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ C1484Su0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6794rC0(C1484Su0 c1484Su0, AbstractC1516Tf abstractC1516Tf, E90 e90, InterfaceC6604qC0 interfaceC6604qC0, RD0 rd0) {
        super(abstractC1516Tf);
        this.k = c1484Su0;
        this.g = null;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.c = e90;
        this.e = interfaceC6604qC0;
        this.d = rd0;
        ((C7647vg) rd0).a(new SD(6, this));
    }

    public static void m(C6794rC0 c6794rC0) {
        boolean zR;
        synchronized (c6794rC0) {
            c6794rC0.j = false;
            zR = c6794rC0.r();
        }
        if (zR) {
            ((ExecutorService) c6794rC0.k.d).execute(new RunnableC6133nk0(2, c6794rC0));
        }
    }

    public static void n(C6794rC0 c6794rC0, AbstractC8446zt abstractC8446zt, int i) throws Throwable {
        UE ueQ;
        InterfaceC6604qC0 interfaceC6604qC0 = c6794rC0.e;
        if (!AbstractC8446zt.D(abstractC8446zt)) {
            throw new IllegalArgumentException();
        }
        if (!(((InterfaceC7876wt) abstractC8446zt.w()) instanceof InterfaceC0077At)) {
            c6794rC0.p(abstractC8446zt, i);
            return;
        }
        E90 e90 = c6794rC0.c;
        RD0 rd0 = c6794rC0.d;
        e90.j(rd0, "PostprocessorProducer");
        UE ue = null;
        Map mapA = null;
        try {
            try {
                ueQ = c6794rC0.q((InterfaceC7876wt) abstractC8446zt.w());
            } catch (Exception e) {
                e90.e(rd0, "PostprocessorProducer", e, !e90.i(rd0, "PostprocessorProducer") ? null : C1723Vw.a("Postprocessor", interfaceC6604qC0.getName()));
                if (c6794rC0.o()) {
                    c6794rC0.b.e(e);
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (e90.i(rd0, "PostprocessorProducer")) {
                mapA = C1723Vw.a("Postprocessor", interfaceC6604qC0.getName());
            }
            e90.a(rd0, "PostprocessorProducer", mapA);
            c6794rC0.p(ueQ, i);
            AbstractC8446zt.p(ueQ);
        } catch (Throwable th2) {
            th = th2;
            ue = ueQ;
            AbstractC8446zt.p(ue);
            throw th;
        }
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void d() {
        if (o()) {
            this.b.c();
        }
    }

    @Override // defpackage.AbstractC8332zH, defpackage.AbstractC1516Tf
    public final void f(Throwable th) {
        if (o()) {
            this.b.e(th);
        }
    }

    @Override // defpackage.AbstractC1516Tf
    public final void h(int i, Object obj) {
        AbstractC8446zt abstractC8446zt = (AbstractC8446zt) obj;
        if (!AbstractC8446zt.D(abstractC8446zt)) {
            if (AbstractC1516Tf.a(i)) {
                p(null, i);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (!this.f) {
                    AbstractC8446zt abstractC8446zt2 = this.g;
                    this.g = AbstractC8446zt.o(abstractC8446zt);
                    this.h = i;
                    this.i = true;
                    boolean zR = r();
                    AbstractC8446zt.p(abstractC8446zt2);
                    if (zR) {
                        ((ExecutorService) this.k.d).execute(new RunnableC6133nk0(2, this));
                    }
                }
            } finally {
            }
        }
    }

    public final boolean o() {
        synchronized (this) {
            try {
                if (this.f) {
                    return false;
                }
                AbstractC8446zt abstractC8446zt = this.g;
                this.g = null;
                this.f = true;
                AbstractC8446zt.p(abstractC8446zt);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(defpackage.AbstractC8446zt r3, int r4) {
        /*
            r2 = this;
            boolean r0 = defpackage.AbstractC1516Tf.a(r4)
            if (r0 != 0) goto L10
            monitor-enter(r2)
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            if (r1 == 0) goto L18
            goto L10
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L10:
            if (r0 == 0) goto L1d
            boolean r0 = r2.o()
            if (r0 == 0) goto L1d
        L18:
            Tf r0 = r2.b
            r0.g(r4, r3)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6794rC0.p(zt, int):void");
    }

    public final UE q(InterfaceC7876wt interfaceC7876wt) {
        InterfaceC0077At interfaceC0077At = (InterfaceC0077At) interfaceC7876wt;
        VE ve = (VE) interfaceC0077At;
        AbstractC8446zt abstractC8446ztA = this.e.a(ve.d, (N8) this.k.c);
        int i = ve.f;
        int i2 = ve.g;
        try {
            InterfaceC7379uG0 interfaceC7379uG0 = ((VE) interfaceC7876wt).e;
            int i3 = VE.i;
            VE ve2 = new VE(abstractC8446ztA, interfaceC7379uG0, i, i2);
            ve2.a(((VE) interfaceC0077At).a);
            return AbstractC8446zt.J(ve2);
        } finally {
            AbstractC8446zt.p(abstractC8446ztA);
        }
    }

    public final synchronized boolean r() {
        if (this.f || !this.i || this.j || !AbstractC8446zt.D(this.g)) {
            return false;
        }
        this.j = true;
        return true;
    }
}
