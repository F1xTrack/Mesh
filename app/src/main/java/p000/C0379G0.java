package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: G0 */
/* loaded from: classes.dex */
public class C0379G0 extends AbstractCollection implements List {

    /* renamed from: a */
    public final /* synthetic */ int f3508a = 1;

    /* renamed from: b */
    public final Object f3509b;

    /* renamed from: c */
    public Collection f3510c;

    /* renamed from: d */
    public final Collection f3511d;

    /* renamed from: e */
    public final AbstractCollection f3512e;

    /* renamed from: f */
    public final /* synthetic */ Serializable f3513f;

    /* renamed from: g */
    public final /* synthetic */ Serializable f3514g;

    public C0379G0(C10492oC1 c10492oC1, Object obj, List list, C0379G0 c0379g0) {
        this.f3514g = c10492oC1;
        this.f3513f = c10492oC1;
        this.f3509b = obj;
        this.f3510c = list;
        this.f3512e = c0379g0;
        this.f3511d = c0379g0 == null ? null : c0379g0.f3510c;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                boolean zIsEmpty = this.f3510c.isEmpty();
                ((List) this.f3510c).add(i, obj);
                ((AbstractC6922u0) this.f3514g).f43442e++;
                if (zIsEmpty) {
                    m2871b();
                    break;
                }
                break;
            default:
                m2874i();
                boolean zIsEmpty2 = this.f3510c.isEmpty();
                ((List) this.f3510c).add(i, obj);
                ((C10492oC1) this.f3514g).getClass();
                if (zIsEmpty2) {
                    zza();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.f3508a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = ((List) this.f3510c).addAll(i, collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                ((AbstractC6922u0) this.f3514g).f43442e += this.f3510c.size() - size;
                if (size != 0) {
                    return zAddAll;
                }
                m2871b();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = ((List) this.f3510c).addAll(i, collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.f3510c.size();
                ((C10492oC1) this.f3514g).getClass();
                if (size2 != 0) {
                    return zAddAll2;
                }
                zza();
                return true;
        }
    }

    /* renamed from: b */
    public void m2871b() {
        C0379G0 c0379g0 = (C0379G0) this.f3512e;
        if (c0379g0 != null) {
            c0379g0.m2871b();
        } else {
            ((AbstractC6922u0) this.f3513f).f43441d.put(this.f3509b, this.f3510c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.f3508a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f3510c.clear();
                    ((AbstractC6922u0) this.f3513f).f43442e -= size;
                    m2873h();
                    break;
                }
                break;
            default:
                if (size() != 0) {
                    this.f3510c.clear();
                    ((C10492oC1) this.f3513f).getClass();
                    m2875k();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return this.f3510c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return this.f3510c.containsAll(collection);
    }

    /* renamed from: d */
    public void m2872d() {
        Collection collection;
        C0379G0 c0379g0 = (C0379G0) this.f3512e;
        if (c0379g0 != null) {
            c0379g0.m2872d();
            if (c0379g0.f3510c != this.f3511d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f3510c.isEmpty() || (collection = (Collection) ((AbstractC6922u0) this.f3513f).f43441d.get(this.f3509b)) == null) {
                return;
            }
            this.f3510c = collection;
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.f3508a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                m2872d();
                return this.f3510c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                m2874i();
                return this.f3510c.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return ((List) this.f3510c).get(i);
    }

    /* renamed from: h */
    public void m2873h() {
        C0379G0 c0379g0 = (C0379G0) this.f3512e;
        if (c0379g0 != null) {
            c0379g0.m2873h();
        } else if (this.f3510c.isEmpty()) {
            ((AbstractC6922u0) this.f3513f).f43441d.remove(this.f3509b);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.f3508a) {
            case 0:
                m2872d();
                return this.f3510c.hashCode();
            default:
                m2874i();
                return this.f3510c.hashCode();
        }
    }

    /* renamed from: i */
    public void m2874i() {
        Collection collection;
        C0379G0 c0379g0 = (C0379G0) this.f3512e;
        if (c0379g0 != null) {
            c0379g0.m2874i();
            if (c0379g0.f3510c != this.f3511d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f3510c.isEmpty() || (collection = (Collection) ((C10492oC1) this.f3513f).f38885c.get(this.f3509b)) == null) {
                return;
            }
            this.f3510c = collection;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return ((List) this.f3510c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f3508a) {
            case 0:
                m2872d();
                return new C7111x0(this);
            default:
                m2874i();
                return new C7111x0(this, (byte) 0);
        }
    }

    /* renamed from: k */
    public void m2875k() {
        C0379G0 c0379g0 = (C0379G0) this.f3512e;
        if (c0379g0 != null) {
            c0379g0.m2875k();
        } else if (this.f3510c.isEmpty()) {
            ((C10492oC1) this.f3513f).f38885c.remove(this.f3509b);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return ((List) this.f3510c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f3508a) {
            case 0:
                m2872d();
                return new C0316F0(this);
            default:
                m2874i();
                return new OB1(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                Object objRemove = ((List) this.f3510c).remove(i);
                AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f3514g;
                abstractC6922u0.f43442e--;
                m2873h();
                return objRemove;
            default:
                m2874i();
                Object objRemove2 = ((List) this.f3510c).remove(i);
                ((C10492oC1) this.f3514g).getClass();
                m2875k();
                return objRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.f3508a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zRemoveAll = this.f3510c.removeAll(collection);
                if (!zRemoveAll) {
                    return zRemoveAll;
                }
                ((AbstractC6922u0) this.f3513f).f43442e += this.f3510c.size() - size;
                m2873h();
                return zRemoveAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean zRemoveAll2 = this.f3510c.removeAll(collection);
                if (!zRemoveAll2) {
                    return zRemoveAll2;
                }
                this.f3510c.size();
                ((C10492oC1) this.f3513f).getClass();
                m2875k();
                return zRemoveAll2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.f3508a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean zRetainAll = this.f3510c.retainAll(collection);
                if (zRetainAll) {
                    ((AbstractC6922u0) this.f3513f).f43442e += this.f3510c.size() - size;
                    m2873h();
                }
                return zRetainAll;
            default:
                collection.getClass();
                size();
                boolean zRetainAll2 = this.f3510c.retainAll(collection);
                if (zRetainAll2) {
                    this.f3510c.size();
                    ((C10492oC1) this.f3513f).getClass();
                    m2875k();
                }
                return zRetainAll2;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return ((List) this.f3510c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return this.f3510c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                List listSubList = ((List) this.f3510c).subList(i, i2);
                C0379G0 c0379g0 = (C0379G0) this.f3512e;
                if (c0379g0 == null) {
                    c0379g0 = this;
                }
                AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f3514g;
                abstractC6922u0.getClass();
                boolean z = listSubList instanceof RandomAccess;
                Object obj = this.f3509b;
                return z ? new C0127C0(abstractC6922u0, obj, listSubList, c0379g0) : new C0379G0(abstractC6922u0, obj, listSubList, c0379g0);
            default:
                m2874i();
                List listSubList2 = ((List) this.f3510c).subList(i, i2);
                C0379G0 c0379g02 = (C0379G0) this.f3512e;
                if (c0379g02 == null) {
                    c0379g02 = this;
                }
                C10492oC1 c10492oC1 = (C10492oC1) this.f3514g;
                c10492oC1.getClass();
                boolean z2 = listSubList2 instanceof RandomAccess;
                Object obj2 = this.f3509b;
                return z2 ? new BB1(c10492oC1, obj2, listSubList2, c0379g02) : new C0379G0(c10492oC1, obj2, listSubList2, c0379g02);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.f3508a) {
            case 0:
                m2872d();
                break;
            default:
                m2874i();
                break;
        }
        return this.f3510c.toString();
    }

    public void zza() {
        C0379G0 c0379g0 = (C0379G0) this.f3512e;
        if (c0379g0 != null) {
            c0379g0.zza();
            return;
        }
        ((C10492oC1) this.f3513f).f38885c.put(this.f3509b, this.f3510c);
    }

    public C0379G0(AbstractC6922u0 abstractC6922u0, Object obj, List list, C0379G0 c0379g0) {
        this.f3514g = abstractC6922u0;
        this.f3513f = abstractC6922u0;
        this.f3509b = obj;
        this.f3510c = list;
        this.f3512e = c0379g0;
        this.f3511d = c0379g0 == null ? null : c0379g0.f3510c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                return new C0316F0(this, i);
            default:
                m2874i();
                return new OB1(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                boolean zRemove = this.f3510c.remove(obj);
                if (zRemove) {
                    AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f3513f;
                    abstractC6922u0.f43442e--;
                    m2873h();
                }
                return zRemove;
            default:
                m2874i();
                boolean zRemove2 = this.f3510c.remove(obj);
                if (zRemove2) {
                    ((C10492oC1) this.f3513f).getClass();
                    m2875k();
                }
                return zRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.f3508a) {
            case 0:
                m2872d();
                boolean zIsEmpty = this.f3510c.isEmpty();
                boolean zAdd = this.f3510c.add(obj);
                if (zAdd) {
                    ((AbstractC6922u0) this.f3513f).f43442e++;
                    if (zIsEmpty) {
                        m2871b();
                    }
                }
                return zAdd;
            default:
                m2874i();
                boolean zIsEmpty2 = this.f3510c.isEmpty();
                boolean zAdd2 = this.f3510c.add(obj);
                if (!zAdd2) {
                    return zAdd2;
                }
                ((C10492oC1) this.f3513f).getClass();
                if (!zIsEmpty2) {
                    return zAdd2;
                }
                zza();
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.f3508a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = this.f3510c.addAll(collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                ((AbstractC6922u0) this.f3513f).f43442e += this.f3510c.size() - size;
                if (size != 0) {
                    return zAddAll;
                }
                m2871b();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = this.f3510c.addAll(collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.f3510c.size();
                ((C10492oC1) this.f3513f).getClass();
                if (size2 != 0) {
                    return zAddAll2;
                }
                zza();
                return true;
        }
    }
}
