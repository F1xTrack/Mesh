package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class M0 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ M0(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((AbstractC7326u0) this.b).e();
                break;
            case 1:
                ((C2223av) this.b).clear();
                break;
            case 2:
                ((C8088y0) this.b).clear();
                break;
            case 3:
                ((C2223av) this.b).clear();
                break;
            default:
                ((C8088y0) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((AbstractC7326u0) this.b).b(obj);
            case 1:
            case 3:
            default:
                return super.contains(obj);
            case 2:
                return ((C8088y0) this.b).containsValue(obj);
            case 4:
                return ((C8088y0) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 2:
                return ((C8088y0) this.b).isEmpty();
            case 3:
            default:
                return super.isEmpty();
            case 4:
                return ((C8088y0) this.b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new C7517v0((AbstractC7326u0) this.b);
            case 1:
                C2223av c2223av = (C2223av) this.b;
                Map mapC = c2223av.c();
                return mapC != null ? mapC.values().iterator() : new C1795Wu(c2223av, 2);
            case 2:
                return new C6905rn0(((C8088y0) this.b).entrySet().iterator());
            case 3:
                C2223av c2223av2 = (C2223av) this.b;
                Map mapQ = c2223av2.q();
                return mapQ != null ? mapQ.values().iterator() : new C7749wC1(c2223av2, 2);
            default:
                return new C6122ng1(((C8088y0) this.b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C8088y0 c8088y0 = (C8088y0) this.b;
                    for (Map.Entry entry : c8088y0.entrySet()) {
                        if (AbstractC5465kE1.a(obj, entry.getValue())) {
                            c8088y0.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
            default:
                return super.remove(obj);
            case 4:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    C8088y0 c8088y02 = (C8088y0) this.b;
                    for (Map.Entry entry2 : c8088y02.entrySet()) {
                        if (O12.b(obj, entry2.getValue())) {
                            c8088y02.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C8088y0 c8088y0 = (C8088y0) this.b;
                    for (Map.Entry entry : c8088y0.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c8088y0.keySet().removeAll(hashSet);
                }
            case 3:
            default:
                return super.removeAll(collection);
            case 4:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    C8088y0 c8088y02 = (C8088y0) this.b;
                    for (Map.Entry entry2 : c8088y02.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C6223oC1) c8088y02.e).b().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C8088y0 c8088y0 = (C8088y0) this.b;
                    for (Map.Entry entry : c8088y0.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c8088y0.keySet().retainAll(hashSet);
                }
            case 3:
            default:
                return super.retainAll(collection);
            case 4:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    C8088y0 c8088y02 = (C8088y0) this.b;
                    for (Map.Entry entry2 : c8088y02.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C6223oC1) c8088y02.e).b().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((AbstractC7326u0) this.b).e;
            case 1:
                return ((C2223av) this.b).size();
            case 2:
                return ((C8088y0) this.b).d.size();
            case 3:
                return ((C2223av) this.b).size();
            default:
                return ((C8088y0) this.b).size();
        }
    }

    public /* synthetic */ M0(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }
}
