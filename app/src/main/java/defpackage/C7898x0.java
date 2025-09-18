package defpackage;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: x0 */
/* loaded from: classes.dex */
public class C7898x0 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public C7898x0(G0 g0, ListIterator listIterator, byte b) {
        this.a = 5;
        this.d = g0;
        this.c = g0.c;
        this.b = listIterator;
    }

    public void a() {
        G0 g0 = (G0) this.d;
        g0.d();
        if (g0.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        G0 g0 = (G0) this.d;
        g0.i();
        if (g0.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                a();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                b();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = (Collection) entry.getValue();
                return ((C8088y0) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.b.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                this.c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                C6223oC1 c6223oC1 = (C6223oC1) ((C8088y0) this.d).e;
                List list = (List) collection;
                return new C7942xD1(key, list instanceof RandomAccess ? new BB1(c6223oC1, key, list, null) : new G0(c6223oC1, key, list, (G0) null));
            case 4:
                Map.Entry entry4 = (Map.Entry) this.b.next();
                this.c = entry4;
                return entry4.getKey();
            default:
                b();
                return this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                QL1.g(((Collection) this.c) != null, "no calls to next() since the last call to remove()");
                this.b.remove();
                ((AbstractC7326u0) ((C8088y0) this.d).e).e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                QL1.g(((Map.Entry) this.c) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                this.b.remove();
                ((C8278z0) this.d).c.e -= collection.size();
                collection.clear();
                this.c = null;
                break;
            case 2:
                this.b.remove();
                G0 g0 = (G0) this.d;
                AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) g0.f;
                abstractC7326u0.e--;
                g0.h();
                break;
            case 3:
                Q12.e("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                this.b.remove();
                Serializable serializable = ((C8088y0) this.d).e;
                ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 4:
                Q12.e("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection2 = (Collection) ((Map.Entry) this.c).getValue();
                this.b.remove();
                C6223oC1 c6223oC1 = ((C7936xB1) this.d).c;
                collection2.size();
                collection2.clear();
                this.c = null;
                break;
            default:
                this.b.remove();
                G0 g02 = (G0) this.d;
                ((C6223oC1) g02.f).getClass();
                g02.k();
                break;
        }
    }

    public /* synthetic */ C7898x0(AbstractSet abstractSet, Iterator it, int i) {
        this.a = i;
        this.d = abstractSet;
        this.b = it;
    }

    public C7898x0(C8088y0 c8088y0, byte b) {
        this.a = 3;
        this.d = c8088y0;
        this.b = ((C2223av) c8088y0.d).entrySet().iterator();
    }

    public C7898x0(G0 g0, byte b) {
        Iterator it;
        this.a = 5;
        this.d = g0;
        Collection collection = g0.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public C7898x0(G0 g0) {
        Iterator it;
        this.a = 2;
        this.d = g0;
        Collection collection = g0.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public C7898x0(G0 g0, ListIterator listIterator) {
        this.a = 2;
        this.d = g0;
        this.c = g0.c;
        this.b = listIterator;
    }

    public C7898x0(C8088y0 c8088y0) {
        this.a = 0;
        this.d = c8088y0;
        this.b = c8088y0.d.entrySet().iterator();
    }
}
