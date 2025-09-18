package p000;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: lL1 */
/* loaded from: classes.dex */
public final class C10126lL1 extends AbstractMap {

    /* renamed from: g */
    public static final /* synthetic */ int f37016g = 0;

    /* renamed from: a */
    public Object[] f37017a;

    /* renamed from: b */
    public int f37018b;

    /* renamed from: d */
    public boolean f37020d;

    /* renamed from: e */
    public volatile C6724r8 f37021e;

    /* renamed from: c */
    public Map f37019c = Collections.emptyMap();

    /* renamed from: f */
    public Map f37022f = Collections.emptyMap();

    /* renamed from: a */
    public final int m22406a() {
        return this.f37018b;
    }

    /* renamed from: b */
    public final Set m22407b() {
        return this.f37019c.isEmpty() ? Collections.emptySet() : this.f37019c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        m22413i();
        int iM22410e = m22410e(comparable);
        if (iM22410e >= 0) {
            return ((C10894rL1) this.f37017a[iM22410e]).setValue(obj);
        }
        m22413i();
        if (this.f37017a == null) {
            this.f37017a = new Object[16];
        }
        int i = -(iM22410e + 1);
        if (i >= 16) {
            return m22412g().put(comparable, obj);
        }
        if (this.f37018b == 16) {
            C10894rL1 c10894rL1 = (C10894rL1) this.f37017a[15];
            this.f37018b = 15;
            m22412g().put(c10894rL1.f41606a, c10894rL1.f41607b);
        }
        Object[] objArr = this.f37017a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f37017a[i] = new C10894rL1(this, comparable, obj);
        this.f37018b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m22413i();
        if (this.f37018b != 0) {
            this.f37017a = null;
            this.f37018b = 0;
        }
        if (this.f37019c.isEmpty()) {
            return;
        }
        this.f37019c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m22410e(comparable) >= 0 || this.f37019c.containsKey(comparable);
    }

    /* renamed from: d */
    public final C10894rL1 m22409d(int i) {
        if (i < this.f37018b) {
            return (C10894rL1) this.f37017a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* renamed from: e */
    public final int m22410e(Comparable comparable) {
        int i = this.f37018b;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((C10894rL1) this.f37017a[i2]).f41606a);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((C10894rL1) this.f37017a[i4]).f41606a);
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
        if (this.f37021e == null) {
            this.f37021e = new C6724r8(4, this);
        }
        return this.f37021e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10126lL1)) {
            return super.equals(obj);
        }
        C10126lL1 c10126lL1 = (C10126lL1) obj;
        int size = size();
        if (size != c10126lL1.size()) {
            return false;
        }
        int i = this.f37018b;
        if (i != c10126lL1.f37018b) {
            return entrySet().equals(c10126lL1.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!m22409d(i2).equals(c10126lL1.m22409d(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.f37019c.equals(c10126lL1.f37019c);
        }
        return true;
    }

    /* renamed from: f */
    public final Object m22411f(int i) {
        m22413i();
        Object[] objArr = this.f37017a;
        Object obj = ((C10894rL1) objArr[i]).f41607b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f37018b - i) - 1);
        this.f37018b--;
        if (!this.f37019c.isEmpty()) {
            Iterator it = m22412g().entrySet().iterator();
            Object[] objArr2 = this.f37017a;
            int i2 = this.f37018b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C10894rL1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f37018b++;
            it.remove();
        }
        return obj;
    }

    /* renamed from: g */
    public final SortedMap m22412g() {
        m22413i();
        if (this.f37019c.isEmpty() && !(this.f37019c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37019c = treeMap;
            this.f37022f = treeMap.descendingMap();
        }
        return (SortedMap) this.f37019c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM22410e = m22410e(comparable);
        return iM22410e >= 0 ? ((C10894rL1) this.f37017a[iM22410e]).f41607b : this.f37019c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f37018b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f37017a[i2].hashCode();
        }
        return this.f37019c.size() > 0 ? this.f37019c.hashCode() + iHashCode : iHashCode;
    }

    /* renamed from: i */
    public final void m22413i() {
        if (this.f37020d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m22413i();
        Comparable comparable = (Comparable) obj;
        int iM22410e = m22410e(comparable);
        if (iM22410e >= 0) {
            return m22411f(iM22410e);
        }
        if (this.f37019c.isEmpty()) {
            return null;
        }
        return this.f37019c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f37019c.size() + this.f37018b;
    }
}
