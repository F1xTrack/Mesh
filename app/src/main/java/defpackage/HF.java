package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class HF implements Map {
    public final Map a;

    public HF(Map map) {
        this.a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C6905rn0 c6905rn0 = new C6905rn0(entrySet().iterator());
        if (obj == null) {
            while (c6905rn0.hasNext()) {
                if (c6905rn0.next() == null) {
                    return true;
                }
            }
        } else {
            while (c6905rn0.hasNext()) {
                if (obj.equals(c6905rn0.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return QR1.c(this.a.entrySet(), new GF(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && EU0.b(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return QR1.d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.a;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return QR1.c(this.a.keySet(), new GF(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.a;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.a.values();
    }
}
