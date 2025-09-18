package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: y0 */
/* loaded from: classes.dex */
public class C7174y0 extends AbstractMap {

    /* renamed from: a */
    public final /* synthetic */ int f45998a;

    /* renamed from: b */
    public transient AbstractSet f45999b;

    /* renamed from: c */
    public transient AbstractCollection f46000c;

    /* renamed from: d */
    public final transient Map f46001d;

    /* renamed from: e */
    public final /* synthetic */ Serializable f46002e;

    public /* synthetic */ C7174y0(Serializable serializable, Map map, int i) {
        this.f45998a = i;
        this.f46002e = serializable;
        this.f46001d = map;
    }

    /* renamed from: a */
    public K70 m26029a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f46002e;
        abstractC6922u0.getClass();
        List list = (List) collection;
        return new K70(key, list instanceof RandomAccess ? new C0127C0(abstractC6922u0, key, list, null) : new C0379G0(abstractC6922u0, key, list, (C0379G0) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f45998a) {
            case 0:
                AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f46002e;
                if (this.f46001d != abstractC6922u0.f43441d) {
                    C7111x0 c7111x0 = new C7111x0(this);
                    while (c7111x0.hasNext()) {
                        c7111x0.next();
                        c7111x0.remove();
                    }
                    break;
                } else {
                    abstractC6922u0.m25065e();
                    break;
                }
            default:
                C10492oC1 c10492oC1 = (C10492oC1) this.f46002e;
                if (((C1752av) this.f46001d) != c10492oC1.f38885c) {
                    C7111x0 c7111x02 = new C7111x0(this, (byte) 0);
                    while (c7111x02.hasNext()) {
                        c7111x02.next();
                        c7111x02.remove();
                    }
                    break;
                } else {
                    C1752av c1752av = c10492oC1.f38885c;
                    Iterator it = c1752av.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    c1752av.clear();
                    break;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f45998a) {
            case 0:
                Map map = this.f46001d;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                C1752av c1752av = (C1752av) this.f46001d;
                c1752av.getClass();
                try {
                    return c1752av.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.f45998a) {
            case 0:
                C7048w0 c7048w0 = (C7048w0) this.f45999b;
                if (c7048w0 != null) {
                    return c7048w0;
                }
                C7048w0 c7048w02 = new C7048w0(this);
                this.f45999b = c7048w02;
                return c7048w02;
            default:
                C9978kB1 c9978kB1 = (C9978kB1) this.f45999b;
                if (c9978kB1 != null) {
                    return c9978kB1;
                }
                C9978kB1 c9978kB12 = new C9978kB1(this);
                this.f45999b = c9978kB12;
                return c9978kB12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f45998a) {
            case 0:
                if (this == obj || this.f46001d.equals(obj)) {
                }
                break;
            default:
                if (this == obj || ((C1752av) this.f46001d).equals(obj)) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f45998a) {
            case 0:
                Map map = this.f46001d;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f46002e;
                abstractC6922u0.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new C0127C0(abstractC6922u0, obj, list, null) : new C0379G0(abstractC6922u0, obj, list, (C0379G0) null);
            default:
                C1752av c1752av = (C1752av) this.f46001d;
                c1752av.getClass();
                try {
                    obj3 = c1752av.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                C10492oC1 c10492oC1 = (C10492oC1) this.f46002e;
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new BB1(c10492oC1, obj, list2, null) : new C0379G0(c10492oC1, obj, list2, (C0379G0) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.f45998a) {
            case 0:
                return this.f46001d.hashCode();
            default:
                return ((C1752av) this.f46001d).hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        switch (this.f45998a) {
            case 0:
                AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f46002e;
                Set set = abstractC6922u0.f7447a;
                if (set != null) {
                    return set;
                }
                Set setMo25067h = abstractC6922u0.mo25067h();
                abstractC6922u0.f7447a = setMo25067h;
                return setMo25067h;
            default:
                return ((C10492oC1) this.f46002e).m21987b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f45998a) {
            case 0:
                Collection collection = (Collection) this.f46001d.remove(obj);
                if (collection == null) {
                    return null;
                }
                AbstractC6922u0 abstractC6922u0 = (AbstractC6922u0) this.f46002e;
                Collection collectionMo23934g = abstractC6922u0.mo23934g();
                collectionMo23934g.addAll(collection);
                abstractC6922u0.f43442e -= collection.size();
                collection.clear();
                return collectionMo23934g;
            default:
                Collection collection2 = (Collection) ((C1752av) this.f46001d).remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f45998a) {
            case 0:
                return this.f46001d.size();
            default:
                return ((C1752av) this.f46001d).size();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.f45998a) {
            case 0:
                return this.f46001d.toString();
            default:
                return ((C1752av) this.f46001d).toString();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f45998a) {
            case 0:
                C0756M0 c0756m0 = (C0756M0) this.f46000c;
                if (c0756m0 != null) {
                    return c0756m0;
                }
                C0756M0 c0756m02 = new C0756M0(this, 2);
                this.f46000c = c0756m02;
                return c0756m02;
            default:
                C0756M0 c0756m03 = (C0756M0) this.f46000c;
                if (c0756m03 != null) {
                    return c0756m03;
                }
                C0756M0 c0756m04 = new C0756M0(this, 4);
                this.f46000c = c0756m04;
                return c0756m04;
        }
    }
}
