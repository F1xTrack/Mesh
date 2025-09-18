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

/* renamed from: o21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10470o21 extends AbstractMap {

    /* renamed from: g */
    public static final /* synthetic */ int f38725g = 0;

    /* renamed from: a */
    public final int f38726a;

    /* renamed from: d */
    public boolean f38729d;

    /* renamed from: e */
    public volatile C6724r8 f38730e;

    /* renamed from: b */
    public List f38727b = Collections.emptyList();

    /* renamed from: c */
    public Map f38728c = Collections.emptyMap();

    /* renamed from: f */
    public Map f38731f = Collections.emptyMap();

    public C10470o21(int i) {
        this.f38726a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m23314a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f38727b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f38727b
            java.lang.Object r2 = r2.get(r1)
            s21 r2 = (p000.C10982s21) r2
            java.lang.Comparable r2 = r2.f42220a
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
            java.util.List r3 = r4.f38727b
            java.lang.Object r3 = r3.get(r2)
            s21 r3 = (p000.C10982s21) r3
            java.lang.Comparable r3 = r3.f42220a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C10470o21.m23314a(java.lang.Comparable):int");
    }

    /* renamed from: b */
    public final void m23315b() {
        if (this.f38729d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry m23316c(int i) {
        return (Map.Entry) this.f38727b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m23315b();
        if (!this.f38727b.isEmpty()) {
            this.f38727b.clear();
        }
        if (this.f38728c.isEmpty()) {
            return;
        }
        this.f38728c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m23314a(comparable) >= 0 || this.f38728c.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable m23317d() {
        return this.f38728c.isEmpty() ? AbstractC9984kE1.f36369b : this.f38728c.entrySet();
    }

    /* renamed from: e */
    public final SortedMap m23318e() {
        m23315b();
        if (this.f38728c.isEmpty() && !(this.f38728c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f38728c = treeMap;
            this.f38731f = treeMap.descendingMap();
        }
        return (SortedMap) this.f38728c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f38730e == null) {
            this.f38730e = new C6724r8(3, this);
        }
        return this.f38730e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10470o21)) {
            return super.equals(obj);
        }
        C10470o21 c10470o21 = (C10470o21) obj;
        int size = size();
        if (size != c10470o21.size()) {
            return false;
        }
        int size2 = this.f38727b.size();
        if (size2 != c10470o21.f38727b.size()) {
            return ((AbstractSet) entrySet()).equals(c10470o21.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!m23316c(i).equals(c10470o21.m23316c(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f38728c.equals(c10470o21.f38728c);
        }
        return true;
    }

    /* renamed from: f */
    public final Object m23319f(Comparable comparable, Object obj) {
        m23315b();
        int iM23314a = m23314a(comparable);
        if (iM23314a >= 0) {
            return ((C10982s21) this.f38727b.get(iM23314a)).setValue(obj);
        }
        m23315b();
        boolean zIsEmpty = this.f38727b.isEmpty();
        int i = this.f38726a;
        if (zIsEmpty && !(this.f38727b instanceof ArrayList)) {
            this.f38727b = new ArrayList(i);
        }
        int i2 = -(iM23314a + 1);
        if (i2 >= i) {
            return m23318e().put(comparable, obj);
        }
        if (this.f38727b.size() == i) {
            C10982s21 c10982s21 = (C10982s21) this.f38727b.remove(i - 1);
            m23318e().put(c10982s21.f42220a, c10982s21.f42221b);
        }
        this.f38727b.add(i2, new C10982s21(this, comparable, obj));
        return null;
    }

    /* renamed from: g */
    public final Object m23320g(int i) {
        m23315b();
        Object obj = ((C10982s21) this.f38727b.remove(i)).f42221b;
        if (!this.f38728c.isEmpty()) {
            Iterator it = m23318e().entrySet().iterator();
            List list = this.f38727b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C10982s21(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM23314a = m23314a(comparable);
        return iM23314a >= 0 ? ((C10982s21) this.f38727b.get(iM23314a)).f42221b : this.f38728c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f38727b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C10982s21) this.f38727b.get(i)).hashCode();
        }
        return this.f38728c.size() > 0 ? iHashCode + this.f38728c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        AbstractC1374Vq.m8597p(obj);
        return m23319f(null, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m23315b();
        Comparable comparable = (Comparable) obj;
        int iM23314a = m23314a(comparable);
        if (iM23314a >= 0) {
            return m23320g(iM23314a);
        }
        if (this.f38728c.isEmpty()) {
            return null;
        }
        return this.f38728c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f38728c.size() + this.f38727b.size();
    }
}
