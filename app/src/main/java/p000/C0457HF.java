package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: HF */
/* loaded from: classes.dex */
public final class C0457HF implements Map {

    /* renamed from: a */
    public final Map f4192a;

    public C0457HF(Map map) {
        this.f4192a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f4192a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f4192a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C10949rn0 c10949rn0 = new C10949rn0(entrySet().iterator());
        if (obj == null) {
            while (c10949rn0.hasNext()) {
                if (c10949rn0.next() == null) {
                    return true;
                }
            }
        } else {
            while (c10949rn0.hasNext()) {
                if (obj.equals(c10949rn0.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return QR1.m6705c(this.f4192a.entrySet(), new C0394GF(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && EU0.m2315b(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f4192a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return QR1.m6706d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f4192a;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return QR1.m6705c(this.f4192a.keySet(), new C0394GF(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f4192a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f4192a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f4192a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f4192a;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f4192a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f4192a.values();
    }
}
