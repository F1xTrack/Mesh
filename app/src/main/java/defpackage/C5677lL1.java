package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: lL1 */
/* loaded from: classes.dex */
public final class C5677lL1 extends AbstractMap {
    public static final /* synthetic */ int g = 0;
    public Object[] a;
    public int b;
    public boolean d;
    public volatile C6781r8 e;
    public Map c = Collections.emptyMap();
    public Map f = Collections.emptyMap();

    public final int a() {
        return this.b;
    }

    public final Set b() {
        return this.c.isEmpty() ? Collections.emptySet() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((C6822rL1) this.a[iE]).setValue(obj);
        }
        i();
        if (this.a == null) {
            this.a = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.b == 16) {
            C6822rL1 c6822rL1 = (C6822rL1) this.a[15];
            this.b = 15;
            g().put(c6822rL1.a, c6822rL1.b);
        }
        Object[] objArr = this.a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.a[i] = new C6822rL1(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final C6822rL1 d(int i) {
        if (i < this.b) {
            return (C6822rL1) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final int e(Comparable comparable) {
        int i = this.b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((C6822rL1) this.a[i2]).a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((C6822rL1) this.a[i4]).a);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new C6781r8(4, this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5677lL1)) {
            return super.equals(obj);
        }
        C5677lL1 c5677lL1 = (C5677lL1) obj;
        int size = size();
        if (size != c5677lL1.size()) {
            return false;
        }
        int i = this.b;
        if (i != c5677lL1.b) {
            return entrySet().equals(c5677lL1.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!d(i2).equals(c5677lL1.d(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.c.equals(c5677lL1.c);
        }
        return true;
    }

    public final Object f(int i) {
        i();
        Object[] objArr = this.a;
        Object obj = ((C6822rL1) objArr[i]).b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.b - i) - 1);
        this.b--;
        if (!this.c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C6822rL1(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        i();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((C6822rL1) this.a[iE]).b : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.a[i2].hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + iHashCode : iHashCode;
    }

    public final void i() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return f(iE);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b;
    }
}
