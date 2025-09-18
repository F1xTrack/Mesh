package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ac0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8746ac0 implements InterfaceC8814b80 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15583b = AtomicIntegerFieldUpdater.newUpdater(C8746ac0.class, "_isCompleting$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15584c = AtomicReferenceFieldUpdater.newUpdater(C8746ac0.class, Object.class, "_rootCause$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15585d = AtomicReferenceFieldUpdater.newUpdater(C8746ac0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a */
    public final C7824Jv0 f15586a;

    public C8746ac0(C7824Jv0 c7824Jv0, Throwable th) {
        this.f15586a = c7824Jv0;
        this._rootCause$volatile = th;
    }

    /* renamed from: a */
    public final void m9770a(Throwable th) {
        Throwable thM9771b = m9771b();
        if (thM9771b == null) {
            f15584c.set(this, th);
            return;
        }
        if (th == thM9771b) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15585d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    /* renamed from: b */
    public final Throwable m9771b() {
        return (Throwable) f15584c.get(this);
    }

    @Override // p000.InterfaceC8814b80
    /* renamed from: c */
    public final C7824Jv0 mo2199c() {
        return this.f15586a;
    }

    /* renamed from: d */
    public final boolean m9772d() {
        return m9771b() != null;
    }

    /* renamed from: e */
    public final ArrayList m9773e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15585d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM9771b = m9771b();
        if (thM9771b != null) {
            arrayList.add(0, thM9771b);
        }
        if (th != null && !th.equals(thM9771b)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC9720iA1.f28869e);
        return arrayList;
    }

    @Override // p000.InterfaceC8814b80
    public final boolean isActive() {
        return m9771b() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m9772d());
        sb.append(", completing=");
        sb.append(f15583b.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(m9771b());
        sb.append(", exceptions=");
        sb.append(f15585d.get(this));
        sb.append(", list=");
        sb.append(this.f15586a);
        sb.append(']');
        return sb.toString();
    }
}
