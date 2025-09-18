package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: n21 */
/* loaded from: classes2.dex */
public final class C10342n21 extends AbstractMap {

    /* renamed from: f */
    public static final /* synthetic */ int f38056f = 0;

    /* renamed from: a */
    public final int f38057a;

    /* renamed from: b */
    public List f38058b = Collections.emptyList();

    /* renamed from: c */
    public Map f38059c = Collections.emptyMap();

    /* renamed from: d */
    public boolean f38060d;

    /* renamed from: e */
    public volatile C6724r8 f38061e;

    public C10342n21(int i) {
        this.f38057a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0024  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m23061a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f38058b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f38058b
            java.lang.Object r2 = r2.get(r1)
            r21 r2 = (p000.C10854r21) r2
            java.lang.Comparable r2 = r2.f41305a
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
            java.util.List r3 = r4.f38058b
            java.lang.Object r3 = r3.get(r2)
            r21 r3 = (p000.C10854r21) r3
            java.lang.Comparable r3 = r3.f41305a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C10342n21.m23061a(java.lang.Comparable):int");
    }

    /* renamed from: b */
    public final void m23062b() {
        if (this.f38060d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Iterable m23063c() {
        return this.f38059c.isEmpty() ? AbstractC9088dE1.f25895b : this.f38059c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m23062b();
        if (!this.f38058b.isEmpty()) {
            this.f38058b.clear();
        }
        if (this.f38059c.isEmpty()) {
            return;
        }
        this.f38059c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m23061a(comparable) >= 0 || this.f38059c.containsKey(comparable);
    }

    /* renamed from: d */
    public final SortedMap m23064d() {
        m23062b();
        if (this.f38059c.isEmpty() && !(this.f38059c instanceof TreeMap)) {
            this.f38059c = new TreeMap();
        }
        return (SortedMap) this.f38059c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Object put(Comparable comparable, Object obj) {
        m23062b();
        int iM23061a = m23061a(comparable);
        if (iM23061a >= 0) {
            return ((C10854r21) this.f38058b.get(iM23061a)).setValue(obj);
        }
        m23062b();
        boolean zIsEmpty = this.f38058b.isEmpty();
        int i = this.f38057a;
        if (zIsEmpty && !(this.f38058b instanceof ArrayList)) {
            this.f38058b = new ArrayList(i);
        }
        int i2 = -(iM23061a + 1);
        if (i2 >= i) {
            return m23064d().put(comparable, obj);
        }
        if (this.f38058b.size() == i) {
            C10854r21 c10854r21 = (C10854r21) this.f38058b.remove(i - 1);
            m23064d().put(c10854r21.f41305a, c10854r21.f41306b);
        }
        this.f38058b.add(i2, new C10854r21(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f38061e == null) {
            this.f38061e = new C6724r8(2, this);
        }
        return this.f38061e;
    }

    /* renamed from: f */
    public final Object m23066f(int i) {
        m23062b();
        Object obj = ((C10854r21) this.f38058b.remove(i)).f41306b;
        if (!this.f38059c.isEmpty()) {
            Iterator it = m23064d().entrySet().iterator();
            List list = this.f38058b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C10854r21(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM23061a = m23061a(comparable);
        return iM23061a >= 0 ? ((C10854r21) this.f38058b.get(iM23061a)).f41306b : this.f38059c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m23062b();
        Comparable comparable = (Comparable) obj;
        int iM23061a = m23061a(comparable);
        if (iM23061a >= 0) {
            return m23066f(iM23061a);
        }
        if (this.f38059c.isEmpty()) {
            return null;
        }
        return this.f38059c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f38059c.size() + this.f38058b.size();
    }
}
