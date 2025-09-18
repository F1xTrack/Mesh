package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: HP */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC0467HP implements Runnable, Comparable, InterfaceC0776MK {
    private volatile Object _heap;

    /* renamed from: a */
    public long f4282a;

    /* renamed from: b */
    public int f4283b = -1;

    public AbstractRunnableC0467HP(long j) {
        this.f4282a = j;
    }

    @Override // p000.InterfaceC0776MK
    /* renamed from: a */
    public final void mo3407a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C7190yG c7190yG = AbstractC8259Se1.f10889a;
                if (obj == c7190yG) {
                    return;
                }
                C0530IP c0530ip = obj instanceof C0530IP ? (C0530IP) obj : null;
                if (c0530ip != null) {
                    c0530ip.m9229b(this);
                }
                this._heap = c7190yG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final Y91 m3408c() {
        Object obj = this._heap;
        if (obj instanceof Y91) {
            return (Y91) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f4282a - ((AbstractRunnableC0467HP) obj).f4282a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* renamed from: d */
    public final int m3409d(long j, C0530IP c0530ip, AbstractC0593JP abstractC0593JP) {
        synchronized (this) {
            if (this._heap == AbstractC8259Se1.f10889a) {
                return 2;
            }
            synchronized (c0530ip) {
                try {
                    AbstractRunnableC0467HP[] abstractRunnableC0467HPArr = c0530ip.f14180a;
                    AbstractRunnableC0467HP abstractRunnableC0467HP = abstractRunnableC0467HPArr != null ? abstractRunnableC0467HPArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0593JP.f5510g;
                    abstractC0593JP.getClass();
                    if (AbstractC0593JP.f5512i.get(abstractC0593JP) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0467HP == null) {
                        c0530ip.f4925c = j;
                    } else {
                        long j2 = abstractRunnableC0467HP.f4282a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c0530ip.f4925c > 0) {
                            c0530ip.f4925c = j;
                        }
                    }
                    long j3 = this.f4282a;
                    long j4 = c0530ip.f4925c;
                    if (j3 - j4 < 0) {
                        this.f4282a = j4;
                    }
                    c0530ip.m9228a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: e */
    public final void m3410e(C0530IP c0530ip) {
        if (this._heap == AbstractC8259Se1.f10889a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0530ip;
    }

    public String toString() {
        return AbstractC11153tN0.m24913y(new StringBuilder("Delayed[nanos="), this.f4282a, ']');
    }
}
