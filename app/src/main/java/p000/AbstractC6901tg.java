package p000;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: tg */
/* loaded from: classes.dex */
public abstract class AbstractC6901tg implements InterfaceC8950cC0 {

    /* renamed from: a */
    public final Class f43205a = getClass();

    /* renamed from: b */
    public final InterfaceC11848yq0 f43206b;

    /* renamed from: c */
    public final C9211eC0 f43207c;

    /* renamed from: d */
    public final SparseArray f43208d;

    /* renamed from: e */
    public final Set f43209e;

    /* renamed from: f */
    public final boolean f43210f;

    /* renamed from: g */
    public final C11649xG0 f43211g;

    /* renamed from: h */
    public final C11649xG0 f43212h;

    /* renamed from: i */
    public final InterfaceC9339fC0 f43213i;

    public AbstractC6901tg(InterfaceC11848yq0 interfaceC11848yq0, C9211eC0 c9211eC0, InterfaceC9339fC0 interfaceC9339fC0) {
        interfaceC11848yq0.getClass();
        this.f43206b = interfaceC11848yq0;
        c9211eC0.getClass();
        this.f43207c = c9211eC0;
        interfaceC9339fC0.getClass();
        this.f43213i = interfaceC9339fC0;
        SparseArray sparseArray = new SparseArray();
        this.f43208d = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            try {
                sparseArray.clear();
                SparseIntArray sparseIntArray2 = c9211eC0.f26592c;
                if (sparseIntArray2 != null) {
                    for (int i = 0; i < sparseIntArray2.size(); i++) {
                        int iKeyAt = sparseIntArray2.keyAt(i);
                        int iValueAt = sparseIntArray2.valueAt(i);
                        int i2 = sparseIntArray.get(iKeyAt, 0);
                        SparseArray sparseArray2 = this.f43208d;
                        int iMo1971j = mo1971j(iKeyAt);
                        this.f43207c.getClass();
                        sparseArray2.put(iKeyAt, new C4197hj(iMo1971j, iValueAt, i2));
                    }
                    this.f43210f = false;
                } else {
                    this.f43210f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f43209e = Collections.newSetFromMap(new IdentityHashMap());
        this.f43212h = new C11649xG0(2);
        this.f43211g = new C11649xG0(2);
    }

    /* renamed from: a */
    public abstract Object mo1967a(int i);

    /* renamed from: b */
    public final synchronized boolean m24959b(int i) {
        C9211eC0 c9211eC0 = this.f43207c;
        int i2 = c9211eC0.f26590a;
        int i3 = this.f43211g.f45509c;
        if (i > i2 - i3) {
            this.f43213i.getClass();
            return false;
        }
        int i4 = c9211eC0.f26591b;
        if (i > i4 - (i3 + this.f43212h.f45509c)) {
            m24965o(i4 - i);
        }
        if (i <= i2 - (this.f43211g.f45509c + this.f43212h.f45509c)) {
            return true;
        }
        this.f43213i.getClass();
        return false;
    }

    /* renamed from: c */
    public final synchronized void m24960c() {
        try {
            ML1.m5338e(!m24963l() || this.f43212h.f45509c == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC11673xS0
    /* renamed from: d */
    public final void mo2828d(Object obj) {
        obj.getClass();
        int iMo1970i = mo1970i(obj);
        int iMo1971j = mo1971j(iMo1970i);
        synchronized (this) {
            try {
                C4197hj c4197hjM24962g = m24962g(iMo1970i);
                if (!this.f43209e.remove(obj)) {
                    Object[] objArr = {Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iMo1970i)};
                    if (AbstractC3929dS.f26114a.m18228o(6)) {
                        String.format(null, "release (free, value unrecognized) (object, size) = (%x, %s)", objArr);
                    }
                    mo1968e(obj);
                    this.f43213i.getClass();
                } else if (c4197hjM24962g == null || c4197hjM24962g.f28547c.size() + c4197hjM24962g.f28548d > c4197hjM24962g.f28546b || m24963l() || !mo22096m(obj)) {
                    if (c4197hjM24962g != null) {
                        ML1.m5338e(c4197hjM24962g.f28548d > 0);
                        c4197hjM24962g.f28548d--;
                    }
                    if (AbstractC3929dS.f26114a.m18228o(2)) {
                        AbstractC3929dS.m17678k(this.f43205a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iMo1970i));
                    }
                    mo1968e(obj);
                    this.f43211g.m25821a(iMo1971j);
                    this.f43213i.getClass();
                } else {
                    int i = c4197hjM24962g.f28548d;
                    if (i > 0) {
                        c4197hjM24962g.f28548d = i - 1;
                        c4197hjM24962g.f28547c.add(obj);
                    } else {
                        AbstractC3929dS.m17673f("BUCKET", "Tried to release value %s from an empty bucket!", obj);
                    }
                    C11649xG0 c11649xG0 = this.f43212h;
                    c11649xG0.f45508b++;
                    c11649xG0.f45509c += iMo1971j;
                    this.f43211g.m25821a(iMo1971j);
                    this.f43213i.getClass();
                    if (AbstractC3929dS.f26114a.m18228o(2)) {
                        AbstractC3929dS.m17678k(this.f43205a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iMo1970i));
                    }
                }
                m24964n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public abstract void mo1968e(Object obj);

    /* renamed from: f */
    public final synchronized C4197hj m24961f(int i) {
        try {
            C4197hj c4197hj = (C4197hj) this.f43208d.get(i);
            if (c4197hj == null && this.f43210f) {
                if (AbstractC3929dS.f26114a.m18228o(2)) {
                    AbstractC3929dS.m17680m("creating new bucket %s", Integer.valueOf(i), this.f43205a);
                }
                int iMo1971j = mo1971j(i);
                this.f43207c.getClass();
                C4197hj c4197hj2 = new C4197hj(iMo1971j, Integer.MAX_VALUE, 0);
                this.f43208d.put(i, c4197hj2);
                return c4197hj2;
            }
            return c4197hj;
        } finally {
        }
    }

    /* renamed from: g */
    public final synchronized C4197hj m24962g(int i) {
        return (C4197hj) this.f43208d.get(i);
    }

    @Override // p000.InterfaceC8950cC0
    public final Object get(int i) {
        Object objMo1967a;
        Object objMo22095k;
        m24960c();
        int iMo1969h = mo1969h(i);
        synchronized (this) {
            try {
                C4197hj c4197hjM24961f = m24961f(iMo1969h);
                if (c4197hjM24961f != null && (objMo22095k = mo22095k(c4197hjM24961f)) != null) {
                    ML1.m5338e(this.f43209e.add(objMo22095k));
                    int iMo1970i = mo1970i(objMo22095k);
                    int iMo1971j = mo1971j(iMo1970i);
                    C11649xG0 c11649xG0 = this.f43211g;
                    c11649xG0.f45508b++;
                    c11649xG0.f45509c += iMo1971j;
                    this.f43212h.m25821a(iMo1971j);
                    this.f43213i.getClass();
                    m24964n();
                    if (AbstractC3929dS.f26114a.m18228o(2)) {
                        AbstractC3929dS.m17678k(this.f43205a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objMo22095k)), Integer.valueOf(iMo1970i));
                    }
                    return objMo22095k;
                }
                int iMo1971j2 = mo1971j(iMo1969h);
                if (!m24959b(iMo1971j2)) {
                    int i2 = this.f43207c.f26590a;
                    int i3 = this.f43211g.f45509c;
                    int i4 = this.f43212h.f45509c;
                    StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Pool hard cap violation? Hard cap = ", " Used size = ", i2, i3, " Free size = ");
                    sbM8594m.append(i4);
                    sbM8594m.append(" Request size = ");
                    sbM8594m.append(iMo1971j2);
                    throw new C6838sg(sbM8594m.toString());
                }
                C11649xG0 c11649xG02 = this.f43211g;
                c11649xG02.f45508b++;
                c11649xG02.f45509c += iMo1971j2;
                if (c4197hjM24961f != null) {
                    c4197hjM24961f.f28548d++;
                }
                try {
                    objMo1967a = mo1967a(iMo1969h);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f43211g.m25821a(iMo1971j2);
                        C4197hj c4197hjM24961f2 = m24961f(iMo1969h);
                        if (c4197hjM24961f2 != null) {
                            ML1.m5338e(c4197hjM24961f2.f28548d > 0);
                            c4197hjM24961f2.f28548d--;
                        }
                        if (Error.class.isInstance(th)) {
                            throw ((Throwable) Error.class.cast(th));
                        }
                        if (RuntimeException.class.isInstance(th)) {
                            throw ((Throwable) RuntimeException.class.cast(th));
                        }
                        objMo1967a = null;
                    }
                }
                synchronized (this) {
                    try {
                        ML1.m5338e(this.f43209e.add(objMo1967a));
                        m24966p();
                        this.f43213i.getClass();
                        m24964n();
                        if (AbstractC3929dS.f26114a.m18228o(2)) {
                            AbstractC3929dS.m17678k(this.f43205a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objMo1967a)), Integer.valueOf(iMo1969h));
                        }
                    } finally {
                    }
                }
                return objMo1967a;
            } finally {
            }
        }
    }

    /* renamed from: h */
    public abstract int mo1969h(int i);

    /* renamed from: i */
    public abstract int mo1970i(Object obj);

    /* renamed from: j */
    public abstract int mo1971j(int i);

    /* renamed from: k */
    public synchronized Object mo22095k(C4197hj c4197hj) {
        Object objM18851a;
        objM18851a = c4197hj.m18851a();
        if (objM18851a != null) {
            c4197hj.f28548d++;
        }
        return objM18851a;
    }

    /* renamed from: l */
    public final synchronized boolean m24963l() {
        boolean z;
        z = this.f43211g.f45509c + this.f43212h.f45509c > this.f43207c.f26591b;
        if (z) {
            this.f43213i.getClass();
        }
        return z;
    }

    /* renamed from: m */
    public boolean mo22096m(Object obj) {
        obj.getClass();
        return true;
    }

    /* renamed from: n */
    public final void m24964n() {
        if (AbstractC3929dS.f26114a.m18228o(2)) {
            C11649xG0 c11649xG0 = this.f43211g;
            Integer numValueOf = Integer.valueOf(c11649xG0.f45508b);
            Integer numValueOf2 = Integer.valueOf(c11649xG0.f45509c);
            C11649xG0 c11649xG02 = this.f43212h;
            Integer numValueOf3 = Integer.valueOf(c11649xG02.f45508b);
            Integer numValueOf4 = Integer.valueOf(c11649xG02.f45509c);
            if (AbstractC3929dS.f26114a.m18228o(2)) {
                String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4);
            }
        }
    }

    /* renamed from: o */
    public final synchronized void m24965o(int i) {
        try {
            int i2 = this.f43211g.f45509c;
            int i3 = this.f43212h.f45509c;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (AbstractC3929dS.f26114a.m18228o(2)) {
                AbstractC3929dS.m17679l(this.f43205a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f43211g.f45509c + this.f43212h.f45509c), Integer.valueOf(iMin));
            }
            m24964n();
            for (int i4 = 0; i4 < this.f43208d.size() && iMin > 0; i4++) {
                C4197hj c4197hj = (C4197hj) this.f43208d.valueAt(i4);
                c4197hj.getClass();
                while (iMin > 0) {
                    Object objM18851a = c4197hj.m18851a();
                    if (objM18851a == null) {
                        break;
                    }
                    mo1968e(objM18851a);
                    int i5 = c4197hj.f28545a;
                    iMin -= i5;
                    this.f43212h.m25821a(i5);
                }
            }
            m24964n();
            if (AbstractC3929dS.f26114a.m18228o(2)) {
                AbstractC3929dS.m17678k(this.f43205a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f43211g.f45509c + this.f43212h.f45509c));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: p */
    public final synchronized void m24966p() {
        if (m24963l()) {
            m24965o(this.f43207c.f26591b);
        }
    }
}
