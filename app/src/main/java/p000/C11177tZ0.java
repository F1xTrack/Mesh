package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: tZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11177tZ0 extends C11049sZ0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f42482a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f42482a.iterator();
        it.getClass();
        InterfaceC11895zC0 interfaceC11895zC0 = this.f42483b;
        interfaceC11895zC0.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC11895zC0.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C11177tZ0(((SortedSet) this.f42482a).headSet(obj), this.f42483b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f42482a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f42483b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C11177tZ0(((SortedSet) this.f42482a).subSet(obj, obj2), this.f42483b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C11177tZ0(((SortedSet) this.f42482a).tailSet(obj), this.f42483b);
    }
}
