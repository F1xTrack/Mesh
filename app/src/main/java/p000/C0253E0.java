package p000;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: E0 */
/* loaded from: classes.dex */
public class C0253E0 extends C7237z0 implements SortedSet {

    /* renamed from: d */
    public final /* synthetic */ C11473vt0 f2334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253E0(C11473vt0 c11473vt0, SortedMap sortedMap) {
        super(c11473vt0, sortedMap);
        this.f2334d = c11473vt0;
    }

    /* renamed from: b */
    public SortedMap mo425b() {
        return (SortedMap) this.f46565b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo425b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo425b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0253E0(this.f2334d, mo425b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo425b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0253E0(this.f2334d, mo425b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0253E0(this.f2334d, mo425b().tailMap(obj));
    }
}
