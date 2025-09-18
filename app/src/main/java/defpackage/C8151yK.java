package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: yK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8151yK extends JV0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C8151yK.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.JV0, defpackage.C2548cc0
    public final void d(Object obj) {
        h(obj);
    }

    @Override // defpackage.JV0, defpackage.C2548cc0
    public final void h(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                EU0.c(AbstractC6383p22.b(this.d), HT1.b(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
