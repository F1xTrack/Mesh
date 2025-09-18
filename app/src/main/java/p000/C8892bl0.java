package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: bl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8892bl0 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17130a = AtomicReferenceFieldUpdater.newUpdater(C8892bl0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C9153dl0(8, false);

    /* renamed from: a */
    public final boolean m10501a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17130a;
            C9153dl0 c9153dl0 = (C9153dl0) atomicReferenceFieldUpdater.get(this);
            int iM17736a = c9153dl0.m17736a(runnable);
            if (iM17736a == 0) {
                return true;
            }
            if (iM17736a == 1) {
                C9153dl0 c9153dl0M17738c = c9153dl0.m17738c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c9153dl0, c9153dl0M17738c) && atomicReferenceFieldUpdater.get(this) == c9153dl0) {
                }
            } else if (iM17736a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m10502b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17130a;
            C9153dl0 c9153dl0 = (C9153dl0) atomicReferenceFieldUpdater.get(this);
            if (c9153dl0.m17737b()) {
                return;
            }
            C9153dl0 c9153dl0M17738c = c9153dl0.m17738c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c9153dl0, c9153dl0M17738c) && atomicReferenceFieldUpdater.get(this) == c9153dl0) {
            }
        }
    }

    /* renamed from: c */
    public final int m10503c() {
        C9153dl0 c9153dl0 = (C9153dl0) f17130a.get(this);
        c9153dl0.getClass();
        long j = C9153dl0.f26255f.get(c9153dl0);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* renamed from: d */
    public final Object m10504d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17130a;
            C9153dl0 c9153dl0 = (C9153dl0) atomicReferenceFieldUpdater.get(this);
            Object objM17739d = c9153dl0.m17739d();
            if (objM17739d != C9153dl0.f26256g) {
                return objM17739d;
            }
            C9153dl0 c9153dl0M17738c = c9153dl0.m17738c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c9153dl0, c9153dl0M17738c) && atomicReferenceFieldUpdater.get(this) == c9153dl0) {
            }
        }
    }
}
