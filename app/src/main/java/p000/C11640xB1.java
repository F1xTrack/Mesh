package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: xB1 */
/* loaded from: classes.dex */
public final class C11640xB1 extends AbstractC11305uZ0 {

    /* renamed from: b */
    public final C1752av f45436b;

    /* renamed from: c */
    public final /* synthetic */ C10492oC1 f45437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11640xB1(C10492oC1 c10492oC1, C1752av c1752av) {
        super(1);
        this.f45437c = c10492oC1;
        this.f45436b = c1752av;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C7111x0 c7111x0 = (C7111x0) it;
            if (!c7111x0.hasNext()) {
                return;
            }
            c7111x0.next();
            c7111x0.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f45436b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f45436b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f45436b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f45436b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f45436b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7111x0(this, this.f45436b.entrySet().iterator(), 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f45436b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f45436b.size();
    }
}
