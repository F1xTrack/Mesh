package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class E0 extends C8278z0 implements SortedSet {
    public final /* synthetic */ C7687vt0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(C7687vt0 c7687vt0, SortedMap sortedMap) {
        super(c7687vt0, sortedMap);
        this.d = c7687vt0;
    }

    public SortedMap b() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new E0(this.d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new E0(this.d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new E0(this.d, b().tailMap(obj));
    }
}
