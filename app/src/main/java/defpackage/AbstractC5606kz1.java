package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: kz1 */
/* loaded from: classes.dex */
public abstract class AbstractC5606kz1 implements Map, Serializable {
    public transient C1578Tz1 a;
    public transient C2046Zz1 b;
    public transient C3531eA1 c;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C3531eA1 c3531eA1 = this.c;
        if (c3531eA1 == null) {
            C5262jA1 c5262jA1 = (C5262jA1) this;
            C3531eA1 c3531eA12 = new C3531eA1(c5262jA1.e, 1, c5262jA1.f);
            this.c = c3531eA12;
            c3531eA1 = c3531eA12;
        }
        return c3531eA1.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1578Tz1 c1578Tz1 = this.a;
        if (c1578Tz1 != null) {
            return c1578Tz1;
        }
        C5262jA1 c5262jA1 = (C5262jA1) this;
        C1578Tz1 c1578Tz12 = new C1578Tz1(c5262jA1, c5262jA1.e, c5262jA1.f);
        this.a = c1578Tz12;
        return c1578Tz12;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1578Tz1 c1578Tz1 = this.a;
        if (c1578Tz1 == null) {
            C5262jA1 c5262jA1 = (C5262jA1) this;
            C1578Tz1 c1578Tz12 = new C1578Tz1(c5262jA1, c5262jA1.e, c5262jA1.f);
            this.a = c1578Tz12;
            c1578Tz1 = c1578Tz12;
        }
        Iterator it = c1578Tz1.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C5262jA1) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2046Zz1 c2046Zz1 = this.b;
        if (c2046Zz1 != null) {
            return c2046Zz1;
        }
        C5262jA1 c5262jA1 = (C5262jA1) this;
        C2046Zz1 c2046Zz12 = new C2046Zz1(c5262jA1, new C3531eA1(c5262jA1.e, 0, c5262jA1.f));
        this.b = c2046Zz12;
        return c2046Zz12;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((C5262jA1) this).f;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C1578Tz1) entrySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C3531eA1 c3531eA1 = this.c;
        if (c3531eA1 != null) {
            return c3531eA1;
        }
        C5262jA1 c5262jA1 = (C5262jA1) this;
        C3531eA1 c3531eA12 = new C3531eA1(c5262jA1.e, 1, c5262jA1.f);
        this.c = c3531eA12;
        return c3531eA12;
    }
}
