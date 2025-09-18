package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: yK */
/* loaded from: classes2.dex */
public final class C7194yK extends JV0 {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f46189e = AtomicIntegerFieldUpdater.newUpdater(C7194yK.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.JV0, p000.C9002cc0
    /* renamed from: d */
    public final void mo1298d(Object obj) {
        mo4337h(obj);
    }

    @Override // p000.JV0, p000.C9002cc0
    /* renamed from: h */
    public final void mo4337h(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f46189e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                EU0.m2316c(AbstractC10599p22.m23595b(this.f5561d), HT1.m3452b(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
