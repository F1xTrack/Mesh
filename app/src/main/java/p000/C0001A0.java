package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: A0 */
/* loaded from: classes.dex */
public final class C0001A0 extends C0190D0 implements NavigableMap {

    /* renamed from: h */
    public final /* synthetic */ C11473vt0 f4h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0001A0(C11473vt0 c11473vt0, NavigableMap navigableMap) {
        super(c11473vt0, navigableMap);
        this.f4h = c11473vt0;
    }

    @Override // p000.C0190D0
    /* renamed from: b */
    public final SortedSet mo0b() {
        return new C0064B0(this.f4h, mo2d());
    }

    @Override // p000.C0190D0
    /* renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo2d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m26029a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo2d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C0001A0(this.f4h, mo2d().descendingMap());
    }

    /* renamed from: e */
    public final K70 m3e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionMo23934g = this.f4h.mo23934g();
        collectionMo23934g.addAll((Collection) entry.getValue());
        it.remove();
        return new K70(entry.getKey(), Collections.unmodifiableList((List) collectionMo23934g));
    }

    @Override // p000.C0190D0
    /* renamed from: f */
    public final NavigableMap mo2d() {
        return (NavigableMap) ((SortedMap) this.f46001d);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo2d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m26029a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo2d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m26029a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo2d().floorKey(obj);
    }

    @Override // p000.C0190D0, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo2d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m26029a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo2d().higherKey(obj);
    }

    @Override // p000.C0190D0, p000.C7174y0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo2d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m26029a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo2d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m26029a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo2d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m3e(((C7048w0) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m3e(((C7048w0) ((C7174y0) descendingMap()).entrySet()).iterator());
    }

    @Override // p000.C0190D0, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p000.C0190D0, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C0001A0(this.f4h, mo2d().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C0001A0(this.f4h, mo2d().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C0001A0(this.f4h, mo2d().tailMap(obj, z));
    }
}
