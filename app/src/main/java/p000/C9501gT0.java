package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: gT0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9501gT0 extends AbstractC0882O0 {

    /* renamed from: a */
    public final ArrayList f27810a;

    public C9501gT0(ArrayList arrayList) {
        O90.m5968f(arrayList, "delegate");
        this.f27810a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f27810a.add(AbstractC7167xu.m25991s(i, this), obj);
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: b */
    public final int mo5922b() {
        return this.f27810a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f27810a.clear();
    }

    @Override // p000.AbstractC0882O0
    /* renamed from: d */
    public final Object mo5923d(int i) {
        return this.f27810a.remove(AbstractC7167xu.m25990r(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f27810a.get(AbstractC7167xu.m25990r(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C9373fT0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C9373fT0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f27810a.set(AbstractC7167xu.m25990r(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C9373fT0(this, i);
    }
}
