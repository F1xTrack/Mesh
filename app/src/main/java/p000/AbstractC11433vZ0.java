package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: vZ0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11433vZ0 {
    /* renamed from: a */
    public static C10665pZ0 m25450a(C10665pZ0 c10665pZ0) {
        C8896bn0 c8896bn0 = c10665pZ0.f40209a;
        c8896bn0.m10510b();
        return c8896bn0.f17153i > 0 ? c10665pZ0 : C10665pZ0.f40208b;
    }

    /* renamed from: b */
    public static final C0619Jp m25451b(InterfaceC1382Vy interfaceC1382Vy) {
        C0619Jp c0619Jp;
        C0619Jp c0619Jp2;
        if (!(interfaceC1382Vy instanceof C7131xK)) {
            return new C0619Jp(1, interfaceC1382Vy);
        }
        C7131xK c7131xK = (C7131xK) interfaceC1382Vy;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7131xK.f45546h;
            Object obj = atomicReferenceFieldUpdater.get(c7131xK);
            C7190yG c7190yG = EU0.f2720b;
            c0619Jp = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c7131xK, c7190yG);
                c0619Jp2 = null;
                break;
            }
            if (obj instanceof C0619Jp) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c7131xK, obj, c7190yG)) {
                    if (atomicReferenceFieldUpdater.get(c7131xK) != obj) {
                        break;
                    }
                }
                c0619Jp2 = (C0619Jp) obj;
                break loop0;
            }
            if (obj != c7190yG && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0619Jp2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0619Jp.f5709g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0619Jp2);
            if (!(obj2 instanceof C6393lv) || ((C6393lv) obj2).f37360d == null) {
                C0619Jp.f5708f.set(c0619Jp2, 536870911);
                atomicReferenceFieldUpdater2.set(c0619Jp2, C6924u2.f43451a);
                c0619Jp = c0619Jp2;
            } else {
                c0619Jp2.m4435o();
            }
            if (c0619Jp != null) {
                return c0619Jp;
            }
        }
        return new C0619Jp(2, interfaceC1382Vy);
    }

    /* renamed from: c */
    public static LinkedHashSet m25452c(Set set, Iterable iterable) {
        O90.m5968f(set, "<this>");
        O90.m5968f(iterable, "elements");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC11205tn0.m24983b(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC0246Du.m1920m(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: d */
    public static LinkedHashSet m25453d(Set set, Object obj) {
        O90.m5968f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC11205tn0.m24983b(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static Set m25454e(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        O90.m5967e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
