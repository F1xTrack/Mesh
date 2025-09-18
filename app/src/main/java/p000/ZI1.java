package p000;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ZI1 extends AbstractList implements RandomAccess, FF1 {

    /* renamed from: a */
    public final AF1 f14850a;

    public ZI1(AF1 af1) {
        this.f14850a = af1;
    }

    @Override // p000.FF1
    /* renamed from: U */
    public final void mo136U(C11769yC1 c11769yC1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f14850a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C10424ng1(this);
    }

    @Override // p000.FF1
    /* renamed from: l */
    public final Object mo139l(int i) {
        return this.f14850a.f143b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C10296mg1(this, i);
    }

    @Override // p000.FF1
    /* renamed from: m */
    public final List mo140m() {
        return Collections.unmodifiableList(this.f14850a.f143b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14850a.f143b.size();
    }

    @Override // p000.FF1
    public final FF1 zze() {
        return this;
    }
}
