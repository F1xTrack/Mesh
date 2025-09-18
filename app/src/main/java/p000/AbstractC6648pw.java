package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: pw */
/* loaded from: classes2.dex */
public abstract class AbstractC6648pw {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40440a = AtomicReferenceFieldUpdater.newUpdater(AbstractC6648pw.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40441b = AtomicReferenceFieldUpdater.newUpdater(AbstractC6648pw.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC6648pw(KX0 kx0) {
        this._prev$volatile = kx0;
    }

    /* renamed from: b */
    public final void m23885b() {
        f40441b.set(this, null);
    }

    /* renamed from: c */
    public final AbstractC6648pw m23886c() {
        Object obj = f40440a.get(this);
        if (obj == O90.f8260a) {
            return null;
        }
        return (AbstractC6648pw) obj;
    }

    /* renamed from: d */
    public abstract boolean mo4662d();

    /* renamed from: e */
    public final void m23887e() {
        AbstractC6648pw abstractC6648pwM23886c;
        if (m23886c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40441b;
            AbstractC6648pw abstractC6648pw = (AbstractC6648pw) atomicReferenceFieldUpdater.get(this);
            while (abstractC6648pw != null && abstractC6648pw.mo4662d()) {
                abstractC6648pw = (AbstractC6648pw) atomicReferenceFieldUpdater.get(abstractC6648pw);
            }
            AbstractC6648pw abstractC6648pwM23886c2 = m23886c();
            O90.m5965c(abstractC6648pwM23886c2);
            while (abstractC6648pwM23886c2.mo4662d() && (abstractC6648pwM23886c = abstractC6648pwM23886c2.m23886c()) != null) {
                abstractC6648pwM23886c2 = abstractC6648pwM23886c;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC6648pwM23886c2);
                AbstractC6648pw abstractC6648pw2 = ((AbstractC6648pw) obj) == null ? null : abstractC6648pw;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC6648pwM23886c2, obj, abstractC6648pw2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC6648pwM23886c2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC6648pw != null) {
                f40440a.set(abstractC6648pw, abstractC6648pwM23886c2);
            }
            if (!abstractC6648pwM23886c2.mo4662d() || abstractC6648pwM23886c2.m23886c() == null) {
                if (abstractC6648pw == null || !abstractC6648pw.mo4662d()) {
                    return;
                }
            }
        }
    }
}
