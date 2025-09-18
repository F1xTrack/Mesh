package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: bl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2385bl0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C2385bl0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C3451dl0(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C3451dl0 c3451dl0 = (C3451dl0) atomicReferenceFieldUpdater.get(this);
            int iA = c3451dl0.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C3451dl0 c3451dl0C = c3451dl0.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3451dl0, c3451dl0C) && atomicReferenceFieldUpdater.get(this) == c3451dl0) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C3451dl0 c3451dl0 = (C3451dl0) atomicReferenceFieldUpdater.get(this);
            if (c3451dl0.b()) {
                return;
            }
            C3451dl0 c3451dl0C = c3451dl0.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3451dl0, c3451dl0C) && atomicReferenceFieldUpdater.get(this) == c3451dl0) {
            }
        }
    }

    public final int c() {
        C3451dl0 c3451dl0 = (C3451dl0) a.get(this);
        c3451dl0.getClass();
        long j = C3451dl0.f.get(c3451dl0);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            C3451dl0 c3451dl0 = (C3451dl0) atomicReferenceFieldUpdater.get(this);
            Object objD = c3451dl0.d();
            if (objD != C3451dl0.g) {
                return objD;
            }
            C3451dl0 c3451dl0C = c3451dl0.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3451dl0, c3451dl0C) && atomicReferenceFieldUpdater.get(this) == c3451dl0) {
            }
        }
    }
}
