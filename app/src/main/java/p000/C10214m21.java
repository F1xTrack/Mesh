package p000;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: m21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10214m21 extends AbstractMap {

    /* renamed from: g */
    public static final /* synthetic */ int f37425g = 0;

    /* renamed from: a */
    public final int f37426a;

    /* renamed from: d */
    public boolean f37429d;

    /* renamed from: e */
    public volatile C6724r8 f37430e;

    /* renamed from: b */
    public List f37427b = Collections.emptyList();

    /* renamed from: c */
    public Map f37428c = Collections.emptyMap();

    /* renamed from: f */
    public Map f37431f = Collections.emptyMap();

    public C10214m21(int i) {
        this.f37426a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m22636a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f37427b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f37427b
            java.lang.Object r2 = r2.get(r1)
            q21 r2 = (p000.C10726q21) r2
            java.lang.Comparable r2 = r2.f40526a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f37427b
            java.lang.Object r3 = r3.get(r2)
            q21 r3 = (p000.C10726q21) r3
            java.lang.Comparable r3 = r3.f40526a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10214m21.m22636a(java.lang.Comparable):int");
    }

    /* renamed from: b */
    public final void m22637b() {
        if (this.f37429d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry m22638c(int i) {
        return (Map.Entry) this.f37427b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m22637b();
        if (!this.f37427b.isEmpty()) {
            this.f37427b.clear();
        }
        if (this.f37428c.isEmpty()) {
            return;
        }
        this.f37428c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m22636a(comparable) >= 0 || this.f37428c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable m22639d() {
        return this.f37428c.isEmpty() ? AbstractC8695aC1.f15393b : this.f37428c.entrySet();
    }

    /* renamed from: e */
    public final SortedMap m22640e() {
        m22637b();
        if (this.f37428c.isEmpty() && !(this.f37428c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f37428c = treeMap;
            this.f37431f = treeMap.descendingMap();
        }
        return (SortedMap) this.f37428c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f37430e == null) {
            this.f37430e = new C6724r8(1, this);
        }
        return this.f37430e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10214m21)) {
            return super.equals(obj);
        }
        C10214m21 c10214m21 = (C10214m21) obj;
        int size = size();
        if (size != c10214m21.size()) {
            return false;
        }
        int size2 = this.f37427b.size();
        if (size2 != c10214m21.f37427b.size()) {
            return ((AbstractSet) entrySet()).equals(c10214m21.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!m22638c(i).equals(c10214m21.m22638c(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f37428c.equals(c10214m21.f37428c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m22637b();
        int iM22636a = m22636a(comparable);
        if (iM22636a >= 0) {
            return ((C10726q21) this.f37427b.get(iM22636a)).setValue(obj);
        }
        m22637b();
        boolean zIsEmpty = this.f37427b.isEmpty();
        int i = this.f37426a;
        if (zIsEmpty && !(this.f37427b instanceof ArrayList)) {
            this.f37427b = new ArrayList(i);
        }
        int i2 = -(iM22636a + 1);
        if (i2 >= i) {
            return m22640e().put(comparable, obj);
        }
        if (this.f37427b.size() == i) {
            C10726q21 c10726q21 = (C10726q21) this.f37427b.remove(i - 1);
            m22640e().put(c10726q21.f40526a, c10726q21.f40527b);
        }
        this.f37427b.add(i2, new C10726q21(this, comparable, obj));
        return null;
    }

    /* renamed from: g */
    public final Object m22642g(int i) {
        m22637b();
        Object obj = ((C10726q21) this.f37427b.remove(i)).f40527b;
        if (!this.f37428c.isEmpty()) {
            Iterator it = m22640e().entrySet().iterator();
            List list = this.f37427b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C10726q21(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM22636a = m22636a(comparable);
        return iM22636a >= 0 ? ((C10726q21) this.f37427b.get(iM22636a)).f40527b : this.f37428c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f37427b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C10726q21) this.f37427b.get(i)).hashCode();
        }
        return this.f37428c.size() > 0 ? iHashCode + this.f37428c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m22637b();
        Comparable comparable = (Comparable) obj;
        int iM22636a = m22636a(comparable);
        if (iM22636a >= 0) {
            return m22642g(iM22636a);
        }
        if (this.f37428c.isEmpty()) {
            return null;
        }
        return this.f37428c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f37428c.size() + this.f37427b.size();
    }
}
