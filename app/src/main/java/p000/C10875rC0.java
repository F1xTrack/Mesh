package p000;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: rC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10875rC0 extends AbstractC7254zH {

    /* renamed from: c */
    public final E90 f41376c;

    /* renamed from: d */
    public final RD0 f41377d;

    /* renamed from: e */
    public final InterfaceC10747qC0 f41378e;

    /* renamed from: f */
    public boolean f41379f;

    /* renamed from: g */
    public AbstractC7292zt f41380g;

    /* renamed from: h */
    public int f41381h;

    /* renamed from: i */
    public boolean f41382i;

    /* renamed from: j */
    public boolean f41383j;

    /* renamed from: k */
    public final /* synthetic */ C8290Su0 f41384k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10875rC0(C8290Su0 c8290Su0, AbstractC1237Tf abstractC1237Tf, E90 e90, InterfaceC10747qC0 interfaceC10747qC0, RD0 rd0) {
        super(abstractC1237Tf);
        this.f41384k = c8290Su0;
        this.f41380g = null;
        this.f41381h = 0;
        this.f41382i = false;
        this.f41383j = false;
        this.f41376c = e90;
        this.f41378e = interfaceC10747qC0;
        this.f41377d = rd0;
        ((C7027vg) rd0).m25462a(new C1146SD(6, this));
    }

    /* renamed from: m */
    public static void m24235m(C10875rC0 c10875rC0) {
        boolean zM24240r;
        synchronized (c10875rC0) {
            c10875rC0.f41383j = false;
            zM24240r = c10875rC0.m24240r();
        }
        if (zM24240r) {
            ((ExecutorService) c10875rC0.f41384k.f11066d).execute(new RunnableC10431nk0(2, c10875rC0));
        }
    }

    /* renamed from: n */
    public static void m24236n(C10875rC0 c10875rC0, AbstractC7292zt abstractC7292zt, int i) throws Throwable {
        C1273UE c1273ueM24239q;
        InterfaceC10747qC0 interfaceC10747qC0 = c10875rC0.f41378e;
        if (!AbstractC7292zt.m26565D(abstractC7292zt)) {
            throw new IllegalArgumentException();
        }
        if (!(((InterfaceC7103wt) abstractC7292zt.m26572w()) instanceof InterfaceC0056At)) {
            c10875rC0.m24238p(abstractC7292zt, i);
            return;
        }
        E90 e90 = c10875rC0.f41376c;
        RD0 rd0 = c10875rC0.f41377d;
        e90.mo752j(rd0, "PostprocessorProducer");
        C1273UE c1273ue = null;
        Map mapM8640a = null;
        try {
            try {
                c1273ueM24239q = c10875rC0.m24239q((InterfaceC7103wt) abstractC7292zt.m26572w());
            } catch (Exception e) {
                e90.mo747e(rd0, "PostprocessorProducer", e, !e90.mo751i(rd0, "PostprocessorProducer") ? null : C1380Vw.m8640a("Postprocessor", interfaceC10747qC0.getName()));
                if (c10875rC0.m24237o()) {
                    c10875rC0.f46773b.m7718e(e);
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (e90.mo751i(rd0, "PostprocessorProducer")) {
                mapM8640a = C1380Vw.m8640a("Postprocessor", interfaceC10747qC0.getName());
            }
            e90.mo743a(rd0, "PostprocessorProducer", mapM8640a);
            c10875rC0.m24238p(c1273ueM24239q, i);
            AbstractC7292zt.m26569p(c1273ueM24239q);
        } catch (Throwable th2) {
            th = th2;
            c1273ue = c1273ueM24239q;
            AbstractC7292zt.m26569p(c1273ue);
            throw th;
        }
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: d */
    public final void mo6844d() {
        if (m24237o()) {
            this.f46773b.m7717c();
        }
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: f */
    public final void mo6845f(Throwable th) {
        if (m24237o()) {
            this.f46773b.m7718e(th);
        }
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) {
        AbstractC7292zt abstractC7292zt = (AbstractC7292zt) obj;
        if (!AbstractC7292zt.m26565D(abstractC7292zt)) {
            if (AbstractC1237Tf.m7714a(i)) {
                m24238p(null, i);
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (!this.f41379f) {
                    AbstractC7292zt abstractC7292zt2 = this.f41380g;
                    this.f41380g = AbstractC7292zt.m26568o(abstractC7292zt);
                    this.f41381h = i;
                    this.f41382i = true;
                    boolean zM24240r = m24240r();
                    AbstractC7292zt.m26569p(abstractC7292zt2);
                    if (zM24240r) {
                        ((ExecutorService) this.f41384k.f11066d).execute(new RunnableC10431nk0(2, this));
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: o */
    public final boolean m24237o() {
        synchronized (this) {
            try {
                if (this.f41379f) {
                    return false;
                }
                AbstractC7292zt abstractC7292zt = this.f41380g;
                this.f41380g = null;
                this.f41379f = true;
                AbstractC7292zt.m26569p(abstractC7292zt);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24238p(p000.AbstractC7292zt r3, int r4) {
        /*
            r2 = this;
            boolean r0 = p000.AbstractC1237Tf.m7714a(r4)
            if (r0 != 0) goto L10
            monitor-enter(r2)
            boolean r1 = r2.f41379f     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            if (r1 == 0) goto L18
            goto L10
        Ld:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        L10:
            if (r0 == 0) goto L1d
            boolean r0 = r2.m24237o()
            if (r0 == 0) goto L1d
        L18:
            Tf r0 = r2.f46773b
            r0.m7719g(r4, r3)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10875rC0.m24238p(zt, int):void");
    }

    /* renamed from: q */
    public final C1273UE m24239q(InterfaceC7103wt interfaceC7103wt) {
        InterfaceC0056At interfaceC0056At = (InterfaceC0056At) interfaceC7103wt;
        C1336VE c1336ve = (C1336VE) interfaceC0056At;
        AbstractC7292zt abstractC7292ztMo3818a = this.f41378e.mo3818a(c1336ve.f12446d, (C0827N8) this.f41384k.f11065c);
        int i = c1336ve.f12448f;
        int i2 = c1336ve.f12449g;
        try {
            InterfaceC11267uG0 interfaceC11267uG0 = ((C1336VE) interfaceC7103wt).f12447e;
            int i3 = C1336VE.f12442i;
            C1336VE c1336ve2 = new C1336VE(abstractC7292ztMo3818a, interfaceC11267uG0, i, i2);
            c1336ve2.m8336a(((C1336VE) interfaceC0056At).f12443a);
            return AbstractC7292zt.m26566J(c1336ve2);
        } finally {
            AbstractC7292zt.m26569p(abstractC7292ztMo3818a);
        }
    }

    /* renamed from: r */
    public final synchronized boolean m24240r() {
        if (this.f41379f || !this.f41382i || this.f41383j || !AbstractC7292zt.m26565D(this.f41380g)) {
            return false;
        }
        this.f41383j = true;
        return true;
    }
}
