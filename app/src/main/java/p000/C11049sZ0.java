package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: sZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11049sZ0 extends AbstractCollection implements Set {

    /* renamed from: a */
    public final Set f42482a;

    /* renamed from: b */
    public final InterfaceC11895zC0 f42483b;

    public C11049sZ0(Set set, InterfaceC11895zC0 interfaceC11895zC0) {
        this.f42482a = set;
        this.f42483b = interfaceC11895zC0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f42483b.apply(obj)) {
            return this.f42482a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f42483b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f42482a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f42482a;
        boolean z = set instanceof RandomAccess;
        InterfaceC11895zC0 interfaceC11895zC0 = this.f42483b;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC11895zC0.getClass();
            while (it.hasNext()) {
                if (interfaceC11895zC0.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC11895zC0.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!interfaceC11895zC0.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC11239u22.m25080c(list, interfaceC11895zC0, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC11239u22.m25080c(list, interfaceC11895zC0, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f42482a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f42483b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return QR1.m6704b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return QR1.m6706d(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f42482a.iterator();
        InterfaceC11895zC0 interfaceC11895zC0 = this.f42483b;
        QL1.m6668d(interfaceC11895zC0, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (interfaceC11895zC0.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f42482a.iterator();
        it.getClass();
        InterfaceC11895zC0 interfaceC11895zC0 = this.f42483b;
        interfaceC11895zC0.getClass();
        return new C10155la0(it, interfaceC11895zC0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f42482a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f42482a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f42483b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f42482a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f42483b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f42482a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f42483b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C10155la0 c10155la0 = (C10155la0) it;
            if (!c10155la0.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c10155la0.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C10155la0 c10155la0 = (C10155la0) it;
            if (c10155la0.hasNext()) {
                arrayList.add(c10155la0.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
