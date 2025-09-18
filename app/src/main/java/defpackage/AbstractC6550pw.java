package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: pw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6550pw {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC6550pw.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(AbstractC6550pw.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC6550pw(KX0 kx0) {
        this._prev$volatile = kx0;
    }

    public final void b() {
        b.set(this, null);
    }

    public final AbstractC6550pw c() {
        Object obj = a.get(this);
        if (obj == O90.a) {
            return null;
        }
        return (AbstractC6550pw) obj;
    }

    public abstract boolean d();

    public final void e() {
        AbstractC6550pw abstractC6550pwC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            AbstractC6550pw abstractC6550pw = (AbstractC6550pw) atomicReferenceFieldUpdater.get(this);
            while (abstractC6550pw != null && abstractC6550pw.d()) {
                abstractC6550pw = (AbstractC6550pw) atomicReferenceFieldUpdater.get(abstractC6550pw);
            }
            AbstractC6550pw abstractC6550pwC2 = c();
            O90.c(abstractC6550pwC2);
            while (abstractC6550pwC2.d() && (abstractC6550pwC = abstractC6550pwC2.c()) != null) {
                abstractC6550pwC2 = abstractC6550pwC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC6550pwC2);
                AbstractC6550pw abstractC6550pw2 = ((AbstractC6550pw) obj) == null ? null : abstractC6550pw;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC6550pwC2, obj, abstractC6550pw2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC6550pwC2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC6550pw != null) {
                a.set(abstractC6550pw, abstractC6550pwC2);
            }
            if (!abstractC6550pwC2.d() || abstractC6550pwC2.c() == null) {
                if (abstractC6550pw == null || !abstractC6550pw.d()) {
                    return;
                }
            }
        }
    }
}
