package p000;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: B0 */
/* loaded from: classes.dex */
public final class C0064B0 extends C0253E0 implements NavigableSet {

    /* renamed from: e */
    public final /* synthetic */ C11473vt0 f505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064B0(C11473vt0 c11473vt0, NavigableMap navigableMap) {
        super(c11473vt0, navigableMap);
        this.f505e = c11473vt0;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo425b().ceilingKey(obj);
    }

    @Override // p000.C0253E0
    /* renamed from: d */
    public final NavigableMap mo425b() {
        return (NavigableMap) ((SortedMap) this.f46565b);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C7237z0) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0064B0(this.f505e, mo425b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo425b().floorKey(obj);
    }

    @Override // p000.C0253E0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo425b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo425b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C7111x0 c7111x0 = (C7111x0) iterator();
        if (!c7111x0.hasNext()) {
            return null;
        }
        Object next = c7111x0.next();
        c7111x0.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // p000.C0253E0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p000.C0253E0, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C0064B0(this.f505e, mo425b().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C0064B0(this.f505e, mo425b().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C0064B0(this.f505e, mo425b().tailMap(obj, z));
    }
}
