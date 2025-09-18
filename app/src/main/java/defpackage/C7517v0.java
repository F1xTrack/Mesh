package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7517v0 implements Iterator {
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator d = EnumC5912ma0.a;
    public final /* synthetic */ AbstractC7326u0 e;

    public C7517v0(AbstractC7326u0 abstractC7326u0) {
        this.e = abstractC7326u0;
        this.a = abstractC7326u0.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return this.d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        AbstractC7326u0 abstractC7326u0 = this.e;
        abstractC7326u0.e--;
    }
}
