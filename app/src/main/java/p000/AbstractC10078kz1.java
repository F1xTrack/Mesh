package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: kz1 */
/* loaded from: classes.dex */
public abstract class AbstractC10078kz1 implements Map, Serializable {

    /* renamed from: a */
    public transient C8353Tz1 f36792a;

    /* renamed from: b */
    public transient C8665Zz1 f36793b;

    /* renamed from: c */
    public transient C9208eA1 f36794c;

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
        C9208eA1 c9208eA1 = this.f36794c;
        if (c9208eA1 == null) {
            C9848jA1 c9848jA1 = (C9848jA1) this;
            C9208eA1 c9208eA12 = new C9208eA1(c9848jA1.f34957e, 1, c9848jA1.f34958f);
            this.f36794c = c9208eA12;
            c9208eA1 = c9208eA12;
        }
        return c9208eA1.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C8353Tz1 c8353Tz1 = this.f36792a;
        if (c8353Tz1 != null) {
            return c8353Tz1;
        }
        C9848jA1 c9848jA1 = (C9848jA1) this;
        C8353Tz1 c8353Tz12 = new C8353Tz1(c9848jA1, c9848jA1.f34957e, c9848jA1.f34958f);
        this.f36792a = c8353Tz12;
        return c8353Tz12;
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
        C8353Tz1 c8353Tz1 = this.f36792a;
        if (c8353Tz1 == null) {
            C9848jA1 c9848jA1 = (C9848jA1) this;
            C8353Tz1 c8353Tz12 = new C8353Tz1(c9848jA1, c9848jA1.f34957e, c9848jA1.f34958f);
            this.f36792a = c8353Tz12;
            c8353Tz1 = c8353Tz12;
        }
        Iterator it = c8353Tz1.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C9848jA1) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C8665Zz1 c8665Zz1 = this.f36793b;
        if (c8665Zz1 != null) {
            return c8665Zz1;
        }
        C9848jA1 c9848jA1 = (C9848jA1) this;
        C8665Zz1 c8665Zz12 = new C8665Zz1(c9848jA1, new C9208eA1(c9848jA1.f34957e, 0, c9848jA1.f34958f));
        this.f36793b = c8665Zz12;
        return c8665Zz12;
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
        int i = ((C9848jA1) this).f34958f;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C8353Tz1) entrySet()).iterator();
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
        C9208eA1 c9208eA1 = this.f36794c;
        if (c9208eA1 != null) {
            return c9208eA1;
        }
        C9848jA1 c9848jA1 = (C9848jA1) this;
        C9208eA1 c9208eA12 = new C9208eA1(c9848jA1.f34957e, 1, c9848jA1.f34958f);
        this.f36794c = c9208eA12;
        return c9208eA12;
    }
}
