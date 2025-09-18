package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: vZ0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7627vZ0 {
    public static C6482pZ0 a(C6482pZ0 c6482pZ0) {
        C2391bn0 c2391bn0 = c6482pZ0.a;
        c2391bn0.b();
        return c2391bn0.i > 0 ? c6482pZ0 : C6482pZ0.b;
    }

    public static final C0767Jp b(InterfaceC1729Vy interfaceC1729Vy) {
        C0767Jp c0767Jp;
        C0767Jp c0767Jp2;
        if (!(interfaceC1729Vy instanceof C7961xK)) {
            return new C0767Jp(1, interfaceC1729Vy);
        }
        C7961xK c7961xK = (C7961xK) interfaceC1729Vy;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7961xK.h;
            Object obj = atomicReferenceFieldUpdater.get(c7961xK);
            C8139yG c8139yG = EU0.b;
            c0767Jp = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c7961xK, c8139yG);
                c0767Jp2 = null;
                break;
            }
            if (obj instanceof C0767Jp) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c7961xK, obj, c8139yG)) {
                    if (atomicReferenceFieldUpdater.get(c7961xK) != obj) {
                        break;
                    }
                }
                c0767Jp2 = (C0767Jp) obj;
                break loop0;
            }
            if (obj != c8139yG && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0767Jp2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0767Jp.g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0767Jp2);
            if (!(obj2 instanceof C5783lv) || ((C5783lv) obj2).d == null) {
                C0767Jp.f.set(c0767Jp2, 536870911);
                atomicReferenceFieldUpdater2.set(c0767Jp2, C7334u2.a);
                c0767Jp = c0767Jp2;
            } else {
                c0767Jp2.o();
            }
            if (c0767Jp != null) {
                return c0767Jp;
            }
        }
        return new C0767Jp(2, interfaceC1729Vy);
    }

    public static LinkedHashSet c(Set set, Iterable iterable) {
        O90.f(set, "<this>");
        O90.f(iterable, "elements");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC7287tn0.b(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC0314Du.m(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet d(Set set, Object obj) {
        O90.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC7287tn0.b(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set e(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        O90.e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
