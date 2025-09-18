package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class G0 extends AbstractCollection implements List {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable g;

    public G0(C6223oC1 c6223oC1, Object obj, List list, G0 g0) {
        this.g = c6223oC1;
        this.f = c6223oC1;
        this.b = obj;
        this.c = list;
        this.e = g0;
        this.d = g0 == null ? null : g0.c;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.a) {
            case 0:
                d();
                boolean zIsEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((AbstractC7326u0) this.g).e++;
                if (zIsEmpty) {
                    b();
                    break;
                }
                break;
            default:
                i();
                boolean zIsEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((C6223oC1) this.g).getClass();
                if (zIsEmpty2) {
                    zza();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = ((List) this.c).addAll(i, collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                ((AbstractC7326u0) this.g).e += this.c.size() - size;
                if (size != 0) {
                    return zAddAll;
                }
                b();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = ((List) this.c).addAll(i, collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.c.size();
                ((C6223oC1) this.g).getClass();
                if (size2 != 0) {
                    return zAddAll2;
                }
                zza();
                return true;
        }
    }

    public void b() {
        G0 g0 = (G0) this.e;
        if (g0 != null) {
            g0.b();
        } else {
            ((AbstractC7326u0) this.f).d.put(this.b, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((AbstractC7326u0) this.f).e -= size;
                    h();
                    break;
                }
                break;
            default:
                if (size() != 0) {
                    this.c.clear();
                    ((C6223oC1) this.f).getClass();
                    k();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return this.c.containsAll(collection);
    }

    public void d() {
        Collection collection;
        G0 g0 = (G0) this.e;
        if (g0 != null) {
            g0.d();
            if (g0.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((AbstractC7326u0) this.f).d.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                d();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                i();
                return this.c.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).get(i);
    }

    public void h() {
        G0 g0 = (G0) this.e;
        if (g0 != null) {
            g0.h();
        } else if (this.c.isEmpty()) {
            ((AbstractC7326u0) this.f).d.remove(this.b);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                d();
                return this.c.hashCode();
            default:
                i();
                return this.c.hashCode();
        }
    }

    public void i() {
        Collection collection;
        G0 g0 = (G0) this.e;
        if (g0 != null) {
            g0.i();
            if (g0.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((C6223oC1) this.f).c.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                d();
                return new C7898x0(this);
            default:
                i();
                return new C7898x0(this, (byte) 0);
        }
    }

    public void k() {
        G0 g0 = (G0) this.e;
        if (g0 != null) {
            g0.k();
        } else if (this.c.isEmpty()) {
            ((C6223oC1) this.f).c.remove(this.b);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                d();
                return new F0(this);
            default:
                i();
                return new OB1(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                d();
                Object objRemove = ((List) this.c).remove(i);
                AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.g;
                abstractC7326u0.e--;
                h();
                return objRemove;
            default:
                i();
                Object objRemove2 = ((List) this.c).remove(i);
                ((C6223oC1) this.g).getClass();
                k();
                return objRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zRemoveAll = this.c.removeAll(collection);
                if (!zRemoveAll) {
                    return zRemoveAll;
                }
                ((AbstractC7326u0) this.f).e += this.c.size() - size;
                h();
                return zRemoveAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean zRemoveAll2 = this.c.removeAll(collection);
                if (!zRemoveAll2) {
                    return zRemoveAll2;
                }
                this.c.size();
                ((C6223oC1) this.f).getClass();
                k();
                return zRemoveAll2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean zRetainAll = this.c.retainAll(collection);
                if (zRetainAll) {
                    ((AbstractC7326u0) this.f).e += this.c.size() - size;
                    h();
                }
                return zRetainAll;
            default:
                collection.getClass();
                size();
                boolean zRetainAll2 = this.c.retainAll(collection);
                if (zRetainAll2) {
                    this.c.size();
                    ((C6223oC1) this.f).getClass();
                    k();
                }
                return zRetainAll2;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                d();
                List listSubList = ((List) this.c).subList(i, i2);
                G0 g0 = (G0) this.e;
                if (g0 == null) {
                    g0 = this;
                }
                AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.g;
                abstractC7326u0.getClass();
                boolean z = listSubList instanceof RandomAccess;
                Object obj = this.b;
                return z ? new C0(abstractC7326u0, obj, listSubList, g0) : new G0(abstractC7326u0, obj, listSubList, g0);
            default:
                i();
                List listSubList2 = ((List) this.c).subList(i, i2);
                G0 g02 = (G0) this.e;
                if (g02 == null) {
                    g02 = this;
                }
                C6223oC1 c6223oC1 = (C6223oC1) this.g;
                c6223oC1.getClass();
                boolean z2 = listSubList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z2 ? new BB1(c6223oC1, obj2, listSubList2, g02) : new G0(c6223oC1, obj2, listSubList2, g02);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                i();
                break;
        }
        return this.c.toString();
    }

    public void zza() {
        G0 g0 = (G0) this.e;
        if (g0 != null) {
            g0.zza();
            return;
        }
        ((C6223oC1) this.f).c.put(this.b, this.c);
    }

    public G0(AbstractC7326u0 abstractC7326u0, Object obj, List list, G0 g0) {
        this.g = abstractC7326u0;
        this.f = abstractC7326u0;
        this.b = obj;
        this.c = list;
        this.e = g0;
        this.d = g0 == null ? null : g0.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                d();
                return new F0(this, i);
            default:
                i();
                return new OB1(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                d();
                boolean zRemove = this.c.remove(obj);
                if (zRemove) {
                    AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.f;
                    abstractC7326u0.e--;
                    h();
                }
                return zRemove;
            default:
                i();
                boolean zRemove2 = this.c.remove(obj);
                if (zRemove2) {
                    ((C6223oC1) this.f).getClass();
                    k();
                }
                return zRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                d();
                boolean zIsEmpty = this.c.isEmpty();
                boolean zAdd = this.c.add(obj);
                if (zAdd) {
                    ((AbstractC7326u0) this.f).e++;
                    if (zIsEmpty) {
                        b();
                    }
                }
                return zAdd;
            default:
                i();
                boolean zIsEmpty2 = this.c.isEmpty();
                boolean zAdd2 = this.c.add(obj);
                if (!zAdd2) {
                    return zAdd2;
                }
                ((C6223oC1) this.f).getClass();
                if (!zIsEmpty2) {
                    return zAdd2;
                }
                zza();
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = this.c.addAll(collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                ((AbstractC7326u0) this.f).e += this.c.size() - size;
                if (size != 0) {
                    return zAddAll;
                }
                b();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = this.c.addAll(collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.c.size();
                ((C6223oC1) this.f).getClass();
                if (size2 != 0) {
                    return zAddAll2;
                }
                zza();
                return true;
        }
    }
}
