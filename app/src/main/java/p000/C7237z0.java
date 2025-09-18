package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: z0 */
/* loaded from: classes.dex */
public class C7237z0 extends AbstractC11305uZ0 {

    /* renamed from: b */
    public final Map f46565b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6922u0 f46566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7237z0(AbstractC6922u0 abstractC6922u0, Map map) {
        super(0);
        this.f46566c = abstractC6922u0;
        map.getClass();
        this.f46565b = map;
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
        return this.f46565b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f46565b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f46565b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f46565b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f46565b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C7111x0(this, this.f46565b.entrySet().iterator(), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f46565b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f46566c.f43442e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46565b.size();
    }
}
