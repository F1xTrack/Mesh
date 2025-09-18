package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: M0 */
/* loaded from: classes.dex */
public final class C0756M0 extends AbstractCollection {

    /* renamed from: a */
    public final /* synthetic */ int f6960a;

    /* renamed from: b */
    public final Object f6961b;

    public /* synthetic */ C0756M0(int i, Serializable serializable) {
        this.f6960a = i;
        this.f6961b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f6960a) {
            case 0:
                ((AbstractC6922u0) this.f6961b).m25065e();
                break;
            case 1:
                ((C1752av) this.f6961b).clear();
                break;
            case 2:
                ((C7174y0) this.f6961b).clear();
                break;
            case 3:
                ((C1752av) this.f6961b).clear();
                break;
            default:
                ((C7174y0) this.f6961b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f6960a) {
            case 0:
                return ((AbstractC6922u0) this.f6961b).mo5489b(obj);
            case 1:
            case 3:
            default:
                return super.contains(obj);
            case 2:
                return ((C7174y0) this.f6961b).containsValue(obj);
            case 4:
                return ((C7174y0) this.f6961b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f6960a) {
            case 2:
                return ((C7174y0) this.f6961b).isEmpty();
            case 3:
            default:
                return super.isEmpty();
            case 4:
                return ((C7174y0) this.f6961b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6960a) {
            case 0:
                return new C6985v0((AbstractC6922u0) this.f6961b);
            case 1:
                C1752av c1752av = (C1752av) this.f6961b;
                Map mapM10359c = c1752av.m10359c();
                return mapM10359c != null ? mapM10359c.values().iterator() : new C1441Wu(c1752av, 2);
            case 2:
                return new C10949rn0(((C7174y0) this.f6961b).entrySet().iterator());
            case 3:
                C1752av c1752av2 = (C1752av) this.f6961b;
                Map mapM10372q = c1752av2.m10372q();
                return mapM10372q != null ? mapM10372q.values().iterator() : new C11515wC1(c1752av2, 2);
            default:
                return new C10424ng1(((C7174y0) this.f6961b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f6960a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C7174y0 c7174y0 = (C7174y0) this.f6961b;
                    for (Map.Entry entry : c7174y0.entrySet()) {
                        if (AbstractC9984kE1.m22173a(obj, entry.getValue())) {
                            c7174y0.remove(entry.getKey());
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
                    C7174y0 c7174y02 = (C7174y0) this.f6961b;
                    for (Map.Entry entry2 : c7174y02.entrySet()) {
                        if (O12.m5941b(obj, entry2.getValue())) {
                            c7174y02.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f6960a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C7174y0 c7174y0 = (C7174y0) this.f6961b;
                    for (Map.Entry entry : c7174y0.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c7174y0.keySet().removeAll(hashSet);
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
                    C7174y0 c7174y02 = (C7174y0) this.f6961b;
                    for (Map.Entry entry2 : c7174y02.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C10492oC1) c7174y02.f46002e).m21987b().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f6960a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C7174y0 c7174y0 = (C7174y0) this.f6961b;
                    for (Map.Entry entry : c7174y0.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c7174y0.keySet().retainAll(hashSet);
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
                    C7174y0 c7174y02 = (C7174y0) this.f6961b;
                    for (Map.Entry entry2 : c7174y02.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((C10492oC1) c7174y02.f46002e).m21987b().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f6960a) {
            case 0:
                return ((AbstractC6922u0) this.f6961b).f43442e;
            case 1:
                return ((C1752av) this.f6961b).size();
            case 2:
                return ((C7174y0) this.f6961b).f46001d.size();
            case 3:
                return ((C1752av) this.f6961b).size();
            default:
                return ((C7174y0) this.f6961b).size();
        }
    }

    public /* synthetic */ C0756M0(AbstractMap abstractMap, int i) {
        this.f6960a = i;
        this.f6961b = abstractMap;
    }
}
