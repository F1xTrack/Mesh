package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8278z0 extends AbstractC7436uZ0 {
    public final Map b;
    public final /* synthetic */ AbstractC7326u0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8278z0(AbstractC7326u0 abstractC7326u0, Map map) {
        super(0);
        this.c = abstractC7326u0;
        map.getClass();
        this.b = map;
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
        return new C7898x0(this, this.b.entrySet().iterator(), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.c.e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
