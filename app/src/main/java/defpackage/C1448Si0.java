package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Si0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1448Si0 extends AbstractC0485Fz implements InterfaceC7381uH {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(C1448Si0.class, "runningWorkers$volatile");
    public final /* synthetic */ InterfaceC7381uH c;
    public final AbstractC0485Fz d;
    public final int e;
    public final String f;
    public final C2385bl0 g;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C1448Si0(AbstractC0485Fz abstractC0485Fz, int i2, String str) {
        InterfaceC7381uH interfaceC7381uH = abstractC0485Fz instanceof InterfaceC7381uH ? (InterfaceC7381uH) abstractC0485Fz : null;
        this.c = interfaceC7381uH == null ? AbstractC7184tF.a : interfaceC7381uH;
        this.d = abstractC0485Fz;
        this.e = i2;
        this.f = str;
        this.g = new C2385bl0();
        this.h = new Object();
    }

    @Override // defpackage.InterfaceC7381uH
    public final MK a(long j, RunnableC0490Ga1 runnableC0490Ga1, InterfaceC0173Bz interfaceC0173Bz) {
        return this.c.a(j, runnableC0490Ga1, interfaceC0173Bz);
    }

    @Override // defpackage.InterfaceC7381uH
    public final void e(long j, C0767Jp c0767Jp) {
        this.c.e(j, c0767Jp);
    }

    @Override // defpackage.AbstractC0485Fz
    public final void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        this.g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        if (atomicIntegerFieldUpdater.get(this) < this.e) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableP = p();
                if (runnableP == null) {
                    return;
                }
                this.d.l(this, new WZ(this, runnableP, false, 9));
            }
        }
    }

    public final Runnable p() {
        while (true) {
            Runnable runnable = (Runnable) this.g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.AbstractC0485Fz
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return AbstractC8235ym.l(sb, this.e, ')');
    }
}
