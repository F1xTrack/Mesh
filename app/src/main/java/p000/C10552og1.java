package p000;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: og1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10552og1 extends AbstractList implements InterfaceC9147di0, RandomAccess {

    /* renamed from: a */
    public final C8758ai0 f39174a;

    public C10552og1(C8758ai0 c8758ai0) {
        this.f39174a = c8758ai0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f39174a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C10424ng1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C10296mg1(this, i);
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: n */
    public final List mo9785n() {
        return Collections.unmodifiableList(this.f39174a.f15633b);
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: p */
    public final Object mo9787p(int i) {
        return this.f39174a.f15633b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39174a.f15633b.size();
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: w */
    public final void mo9788w(C0299Ek c0299Ek) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC9147di0
    /* renamed from: o */
    public final InterfaceC9147di0 mo9786o() {
        return this;
    }
}
