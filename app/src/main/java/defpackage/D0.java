package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class D0 extends C8088y0 implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ C7687vt0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(C7687vt0 c7687vt0, SortedMap sortedMap) {
        super(c7687vt0, sortedMap, 0);
        this.g = c7687vt0;
    }

    public SortedSet b() {
        return new E0(this.g, d());
    }

    @Override // defpackage.C8088y0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new D0(this.g, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new D0(this.g, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new D0(this.g, d().tailMap(obj));
    }
}
