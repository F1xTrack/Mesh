package defpackage;

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
public class C8088y0 extends AbstractMap {
    public final /* synthetic */ int a;
    public transient AbstractSet b;
    public transient AbstractCollection c;
    public final transient Map d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ C8088y0(Serializable serializable, Map map, int i) {
        this.a = i;
        this.e = serializable;
        this.d = map;
    }

    public K70 a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.e;
        abstractC7326u0.getClass();
        List list = (List) collection;
        return new K70(key, list instanceof RandomAccess ? new C0(abstractC7326u0, key, list, null) : new G0(abstractC7326u0, key, list, (G0) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.e;
                if (this.d != abstractC7326u0.d) {
                    C7898x0 c7898x0 = new C7898x0(this);
                    while (c7898x0.hasNext()) {
                        c7898x0.next();
                        c7898x0.remove();
                    }
                    break;
                } else {
                    abstractC7326u0.e();
                    break;
                }
            default:
                C6223oC1 c6223oC1 = (C6223oC1) this.e;
                if (((C2223av) this.d) != c6223oC1.c) {
                    C7898x0 c7898x02 = new C7898x0(this, (byte) 0);
                    while (c7898x02.hasNext()) {
                        c7898x02.next();
                        c7898x02.remove();
                    }
                    break;
                } else {
                    C2223av c2223av = c6223oC1.c;
                    Iterator it = c2223av.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    c2223av.clear();
                    break;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map map = this.d;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                C2223av c2223av = (C2223av) this.d;
                c2223av.getClass();
                try {
                    return c2223av.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                C7708w0 c7708w0 = (C7708w0) this.b;
                if (c7708w0 != null) {
                    return c7708w0;
                }
                C7708w0 c7708w02 = new C7708w0(this);
                this.b = c7708w02;
                return c7708w02;
            default:
                C5456kB1 c5456kB1 = (C5456kB1) this.b;
                if (c5456kB1 != null) {
                    return c5456kB1;
                }
                C5456kB1 c5456kB12 = new C5456kB1(this);
                this.b = c5456kB12;
                return c5456kB12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this == obj || this.d.equals(obj)) {
                }
                break;
            default:
                if (this == obj || ((C2223av) this.d).equals(obj)) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.a) {
            case 0:
                Map map = this.d;
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
                AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.e;
                abstractC7326u0.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new C0(abstractC7326u0, obj, list, null) : new G0(abstractC7326u0, obj, list, (G0) null);
            default:
                C2223av c2223av = (C2223av) this.d;
                c2223av.getClass();
                try {
                    obj3 = c2223av.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                C6223oC1 c6223oC1 = (C6223oC1) this.e;
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new BB1(c6223oC1, obj, list2, null) : new G0(c6223oC1, obj, list2, (G0) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                return this.d.hashCode();
            default:
                return ((C2223av) this.d).hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        switch (this.a) {
            case 0:
                AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.e;
                Set set = abstractC7326u0.a;
                if (set != null) {
                    return set;
                }
                Set setH = abstractC7326u0.h();
                abstractC7326u0.a = setH;
                return setH;
            default:
                return ((C6223oC1) this.e).b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) this.d.remove(obj);
                if (collection == null) {
                    return null;
                }
                AbstractC7326u0 abstractC7326u0 = (AbstractC7326u0) this.e;
                Collection collectionG = abstractC7326u0.g();
                collectionG.addAll(collection);
                abstractC7326u0.e -= collection.size();
                collection.clear();
                return collectionG;
            default:
                Collection collection2 = (Collection) ((C2223av) this.d).remove(obj);
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
        switch (this.a) {
            case 0:
                return this.d.size();
            default:
                return ((C2223av) this.d).size();
        }
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
            case 0:
                return this.d.toString();
            default:
                return ((C2223av) this.d).toString();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                M0 m0 = (M0) this.c;
                if (m0 != null) {
                    return m0;
                }
                M0 m02 = new M0(this, 2);
                this.c = m02;
                return m02;
            default:
                M0 m03 = (M0) this.c;
                if (m03 != null) {
                    return m03;
                }
                M0 m04 = new M0(this, 4);
                this.c = m04;
                return m04;
        }
    }
}
