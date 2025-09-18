package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Si0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8266Si0 extends AbstractC0377Fz implements InterfaceC6939uH {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10917i = AtomicIntegerFieldUpdater.newUpdater(C8266Si0.class, "runningWorkers$volatile");

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6939uH f10918c;

    /* renamed from: d */
    public final AbstractC0377Fz f10919d;

    /* renamed from: e */
    public final int f10920e;

    /* renamed from: f */
    public final String f10921f;

    /* renamed from: g */
    public final C8892bl0 f10922g;

    /* renamed from: h */
    public final Object f10923h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C8266Si0(AbstractC0377Fz abstractC0377Fz, int i, String str) {
        InterfaceC6939uH interfaceC6939uH = abstractC0377Fz instanceof InterfaceC6939uH ? (InterfaceC6939uH) abstractC0377Fz : null;
        this.f10918c = interfaceC6939uH == null ? AbstractC6874tF.f42962a : interfaceC6939uH;
        this.f10919d = abstractC0377Fz;
        this.f10920e = i;
        this.f10921f = str;
        this.f10922g = new C8892bl0();
        this.f10923h = new Object();
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: a */
    public final InterfaceC0776MK mo4311a(long j, RunnableC7627Ga1 runnableC7627Ga1, InterfaceC0125Bz interfaceC0125Bz) {
        return this.f10918c.mo4311a(j, runnableC7627Ga1, interfaceC0125Bz);
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: e */
    public final void mo4313e(long j, C0619Jp c0619Jp) {
        this.f10918c.mo4313e(j, c0619Jp);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: l */
    public final void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        this.f10922g.m10501a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10917i;
        if (atomicIntegerFieldUpdater.get(this) < this.f10920e) {
            synchronized (this.f10923h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f10920e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM7420p = m7420p();
                if (runnableM7420p == null) {
                    return;
                }
                this.f10919d.mo732l(this, new RunnableC1420WZ(this, runnableM7420p, false, 9));
            }
        }
    }

    /* renamed from: p */
    public final Runnable m7420p() {
        while (true) {
            Runnable runnable = (Runnable) this.f10922g.m10504d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f10923h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10917i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f10922g.m10503c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // p000.AbstractC0377Fz
    public final String toString() {
        String str = this.f10921f;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10919d);
        sb.append(".limitedParallelism(");
        return AbstractC7222ym.m26235l(sb, this.f10920e, ')');
    }
}
