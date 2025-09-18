package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: da0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9131da0 extends AbstractC8356Ub0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26141f = AtomicIntegerFieldUpdater.newUpdater(C9131da0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e */
    public final C8252Sb0 f26142e;

    public C9131da0(C8252Sb0 c8252Sb0) {
        this.f26142e = c8252Sb0;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: j */
    public final boolean mo2434j() {
        return true;
    }

    @Override // p000.AbstractC8356Ub0
    /* renamed from: k */
    public final void mo2435k(Throwable th) {
        if (f26141f.compareAndSet(this, 0, 1)) {
            this.f26142e.invoke(th);
        }
    }
}
