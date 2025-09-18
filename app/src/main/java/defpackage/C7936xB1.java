package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: xB1 */
/* loaded from: classes.dex */
public final class C7936xB1 extends AbstractC7436uZ0 {
    public final C2223av b;
    public final /* synthetic */ C6223oC1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7936xB1(C6223oC1 c6223oC1, C2223av c2223av) {
        super(1);
        this.c = c6223oC1;
        this.b = c2223av;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C7898x0 c7898x0 = (C7898x0) it;
            if (!c7898x0.hasNext()) {
                return;
            }
            c7898x0.next();
            c7898x0.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7898x0(this, this.b.entrySet().iterator(), 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
