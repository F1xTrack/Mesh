package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class HP implements Runnable, Comparable, MK {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public HP(long j) {
        this.a = j;
    }

    @Override // defpackage.MK
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C8139yG c8139yG = AbstractC1437Se1.a;
                if (obj == c8139yG) {
                    return;
                }
                IP ip = obj instanceof IP ? (IP) obj : null;
                if (ip != null) {
                    ip.b(this);
                }
                this._heap = c8139yG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Y91 c() {
        Object obj = this._heap;
        if (obj instanceof Y91) {
            return (Y91) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((HP) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final int d(long j, IP ip, JP jp) {
        synchronized (this) {
            if (this._heap == AbstractC1437Se1.a) {
                return 2;
            }
            synchronized (ip) {
                try {
                    HP[] hpArr = ip.a;
                    HP hp = hpArr != null ? hpArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JP.g;
                    jp.getClass();
                    if (JP.i.get(jp) != 0) {
                        return 1;
                    }
                    if (hp == null) {
                        ip.c = j;
                    } else {
                        long j2 = hp.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - ip.c > 0) {
                            ip.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = ip.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    ip.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(IP ip) {
        if (this._heap == AbstractC1437Se1.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = ip;
    }

    public String toString() {
        return AbstractC7209tN0.y(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
