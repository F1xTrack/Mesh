package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: v0 */
/* loaded from: classes.dex */
public final class C6985v0 implements Iterator {

    /* renamed from: a */
    public final Iterator f44065a;

    /* renamed from: b */
    public Object f44066b = null;

    /* renamed from: c */
    public Collection f44067c = null;

    /* renamed from: d */
    public Iterator f44068d = EnumC10283ma0.f37779a;

    /* renamed from: e */
    public final /* synthetic */ AbstractC6922u0 f44069e;

    public C6985v0(AbstractC6922u0 abstractC6922u0) {
        this.f44069e = abstractC6922u0;
        this.f44065a = abstractC6922u0.f43441d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44065a.hasNext() || this.f44068d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f44068d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f44065a.next();
            this.f44066b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f44067c = collection;
            this.f44068d = collection.iterator();
        }
        return this.f44068d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f44068d.remove();
        Collection collection = this.f44067c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f44065a.remove();
        }
        AbstractC6922u0 abstractC6922u0 = this.f44069e;
        abstractC6922u0.f43442e--;
    }
}
