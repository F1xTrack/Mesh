package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: qg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6695qg1 extends AbstractList implements InterfaceC3823fi0, RandomAccess {
    public final C2566ci0 a;

    public C6695qg1(C2566ci0 c2566ci0) {
        this.a = c2566ci0;
    }

    @Override // defpackage.InterfaceC3823fi0
    public final void f(C0440Fk c0440Fk) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C6122ng1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C5931mg1(this, i);
    }

    @Override // defpackage.InterfaceC3823fi0
    public final List n() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // defpackage.InterfaceC3823fi0
    public final Object p(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.InterfaceC3823fi0
    public final InterfaceC3823fi0 o() {
        return this;
    }
}
