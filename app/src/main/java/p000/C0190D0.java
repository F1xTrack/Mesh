package p000;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: D0 */
/* loaded from: classes.dex */
public class C0190D0 extends C7174y0 implements SortedMap {

    /* renamed from: f */
    public SortedSet f1795f;

    /* renamed from: g */
    public final /* synthetic */ C11473vt0 f1796g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190D0(C11473vt0 c11473vt0, SortedMap sortedMap) {
        super(c11473vt0, sortedMap, 0);
        this.f1796g = c11473vt0;
    }

    /* renamed from: b */
    public SortedSet mo0b() {
        return new C0253E0(this.f1796g, mo2d());
    }

    @Override // p000.C7174y0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f1795f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo0b = mo0b();
        this.f1795f = sortedSetMo0b;
        return sortedSetMo0b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo2d().comparator();
    }

    /* renamed from: d */
    public SortedMap mo2d() {
        return (SortedMap) this.f46001d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo2d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0190D0(this.f1796g, mo2d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo2d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0190D0(this.f1796g, mo2d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0190D0(this.f1796g, mo2d().tailMap(obj));
    }
}
