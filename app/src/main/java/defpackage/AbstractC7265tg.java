package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: tg */
/* loaded from: classes.dex */
public abstract class AbstractC7265tg implements InterfaceC2470cC0 {
    public final Class a = getClass();
    public final InterfaceC8248yq0 b;
    public final C3536eC0 c;
    public final SparseArray d;
    public final Set e;
    public final boolean f;
    public final C7950xG0 g;
    public final C7950xG0 h;
    public final InterfaceC3727fC0 i;

    public AbstractC7265tg(InterfaceC8248yq0 interfaceC8248yq0, C3536eC0 c3536eC0, InterfaceC3727fC0 interfaceC3727fC0) {
        interfaceC8248yq0.getClass();
        this.b = interfaceC8248yq0;
        c3536eC0.getClass();
        this.c = c3536eC0;
        interfaceC3727fC0.getClass();
        this.i = interfaceC3727fC0;
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            try {
                sparseArray.clear();
                SparseIntArray sparseIntArray2 = c3536eC0.c;
                if (sparseIntArray2 != null) {
                    for (int i = 0; i < sparseIntArray2.size(); i++) {
                        int iKeyAt = sparseIntArray2.keyAt(i);
                        int iValueAt = sparseIntArray2.valueAt(i);
                        int i2 = sparseIntArray.get(iKeyAt, 0);
                        SparseArray sparseArray2 = this.d;
                        int iJ = j(iKeyAt);
                        this.c.getClass();
                        sparseArray2.put(iKeyAt, new C4207hj(iJ, iValueAt, i2));
                    }
                    this.f = false;
                } else {
                    this.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = Collections.newSetFromMap(new IdentityHashMap());
        this.h = new C7950xG0(2);
        this.g = new C7950xG0(2);
    }

    public abstract Object a(int i);

    public final synchronized boolean b(int i) {
        C3536eC0 c3536eC0 = this.c;
        int i2 = c3536eC0.a;
        int i3 = this.g.c;
        if (i > i2 - i3) {
            this.i.getClass();
            return false;
        }
        int i4 = c3536eC0.b;
        if (i > i4 - (i3 + this.h.c)) {
            o(i4 - i);
        }
        if (i <= i2 - (this.g.c + this.h.c)) {
            return true;
        }
        this.i.getClass();
        return false;
    }

    public final synchronized void c() {
        try {
            ML1.e(!l() || this.h.c == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC7986xS0
    public final void d(Object obj) {
        obj.getClass();
        int i = i(obj);
        int iJ = j(i);
        synchronized (this) {
            try {
                C4207hj c4207hjG = g(i);
                if (!this.e.remove(obj)) {
                    Object[] objArr = {Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(i)};
                    if (AbstractC3393dS.a.o(6)) {
                        String.format(null, "release (free, value unrecognized) (object, size) = (%x, %s)", objArr);
                    }
                    e(obj);
                    this.i.getClass();
                } else if (c4207hjG == null || c4207hjG.c.size() + c4207hjG.d > c4207hjG.b || l() || !m(obj)) {
                    if (c4207hjG != null) {
                        ML1.e(c4207hjG.d > 0);
                        c4207hjG.d--;
                    }
                    if (AbstractC3393dS.a.o(2)) {
                        AbstractC3393dS.k(this.a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(i));
                    }
                    e(obj);
                    this.g.a(iJ);
                    this.i.getClass();
                } else {
                    int i2 = c4207hjG.d;
                    if (i2 > 0) {
                        c4207hjG.d = i2 - 1;
                        c4207hjG.c.add(obj);
                    } else {
                        AbstractC3393dS.f("BUCKET", "Tried to release value %s from an empty bucket!", obj);
                    }
                    C7950xG0 c7950xG0 = this.h;
                    c7950xG0.b++;
                    c7950xG0.c += iJ;
                    this.g.a(iJ);
                    this.i.getClass();
                    if (AbstractC3393dS.a.o(2)) {
                        AbstractC3393dS.k(this.a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(i));
                    }
                }
                n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void e(Object obj);

    public final synchronized C4207hj f(int i) {
        try {
            C4207hj c4207hj = (C4207hj) this.d.get(i);
            if (c4207hj == null && this.f) {
                if (AbstractC3393dS.a.o(2)) {
                    AbstractC3393dS.m("creating new bucket %s", Integer.valueOf(i), this.a);
                }
                int iJ = j(i);
                this.c.getClass();
                C4207hj c4207hj2 = new C4207hj(iJ, Integer.MAX_VALUE, 0);
                this.d.put(i, c4207hj2);
                return c4207hj2;
            }
            return c4207hj;
        } finally {
        }
    }

    public final synchronized C4207hj g(int i) {
        return (C4207hj) this.d.get(i);
    }

    @Override // defpackage.InterfaceC2470cC0
    public final Object get(int i) {
        Object objA;
        Object objK;
        c();
        int iH = h(i);
        synchronized (this) {
            try {
                C4207hj c4207hjF = f(iH);
                if (c4207hjF != null && (objK = k(c4207hjF)) != null) {
                    ML1.e(this.e.add(objK));
                    int i2 = i(objK);
                    int iJ = j(i2);
                    C7950xG0 c7950xG0 = this.g;
                    c7950xG0.b++;
                    c7950xG0.c += iJ;
                    this.h.a(iJ);
                    this.i.getClass();
                    n();
                    if (AbstractC3393dS.a.o(2)) {
                        AbstractC3393dS.k(this.a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objK)), Integer.valueOf(i2));
                    }
                    return objK;
                }
                int iJ2 = j(iH);
                if (!b(iJ2)) {
                    int i3 = this.c.a;
                    int i4 = this.g.c;
                    int i5 = this.h.c;
                    StringBuilder sbM = AbstractC1705Vq.m("Pool hard cap violation? Hard cap = ", " Used size = ", i3, i4, " Free size = ");
                    sbM.append(i5);
                    sbM.append(" Request size = ");
                    sbM.append(iJ2);
                    throw new C7074sg(sbM.toString());
                }
                C7950xG0 c7950xG02 = this.g;
                c7950xG02.b++;
                c7950xG02.c += iJ2;
                if (c4207hjF != null) {
                    c4207hjF.d++;
                }
                try {
                    objA = a(iH);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.g.a(iJ2);
                        C4207hj c4207hjF2 = f(iH);
                        if (c4207hjF2 != null) {
                            ML1.e(c4207hjF2.d > 0);
                            c4207hjF2.d--;
                        }
                        if (Error.class.isInstance(th)) {
                            throw ((Throwable) Error.class.cast(th));
                        }
                        if (RuntimeException.class.isInstance(th)) {
                            throw ((Throwable) RuntimeException.class.cast(th));
                        }
                        objA = null;
                    }
                }
                synchronized (this) {
                    try {
                        ML1.e(this.e.add(objA));
                        p();
                        this.i.getClass();
                        n();
                        if (AbstractC3393dS.a.o(2)) {
                            AbstractC3393dS.k(this.a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objA)), Integer.valueOf(iH));
                        }
                    } finally {
                    }
                }
                return objA;
            } finally {
            }
        }
    }

    public abstract int h(int i);

    public abstract int i(Object obj);

    public abstract int j(int i);

    public synchronized Object k(C4207hj c4207hj) {
        Object objA;
        objA = c4207hj.a();
        if (objA != null) {
            c4207hj.d++;
        }
        return objA;
    }

    public final synchronized boolean l() {
        boolean z;
        z = this.g.c + this.h.c > this.c.b;
        if (z) {
            this.i.getClass();
        }
        return z;
    }

    public boolean m(Object obj) {
        obj.getClass();
        return true;
    }

    public final void n() {
        if (AbstractC3393dS.a.o(2)) {
            C7950xG0 c7950xG0 = this.g;
            Integer numValueOf = Integer.valueOf(c7950xG0.b);
            Integer numValueOf2 = Integer.valueOf(c7950xG0.c);
            C7950xG0 c7950xG02 = this.h;
            Integer numValueOf3 = Integer.valueOf(c7950xG02.b);
            Integer numValueOf4 = Integer.valueOf(c7950xG02.c);
            if (AbstractC3393dS.a.o(2)) {
                String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4);
            }
        }
    }

    public final synchronized void o(int i) {
        try {
            int i2 = this.g.c;
            int i3 = this.h.c;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (AbstractC3393dS.a.o(2)) {
                AbstractC3393dS.l(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.g.c + this.h.c), Integer.valueOf(iMin));
            }
            n();
            for (int i4 = 0; i4 < this.d.size() && iMin > 0; i4++) {
                C4207hj c4207hj = (C4207hj) this.d.valueAt(i4);
                c4207hj.getClass();
                while (iMin > 0) {
                    Object objA = c4207hj.a();
                    if (objA == null) {
                        break;
                    }
                    e(objA);
                    int i5 = c4207hj.a;
                    iMin -= i5;
                    this.h.a(i5);
                }
            }
            n();
            if (AbstractC3393dS.a.o(2)) {
                AbstractC3393dS.k(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.g.c + this.h.c));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p() {
        if (l()) {
            o(this.c.b);
        }
    }
}
