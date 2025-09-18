package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: pg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6504pg1 extends AbstractList implements RandomAccess, InterfaceC3632ei0 {
    public final C2376bi0 a;

    public C6504pg1(C2376bi0 c2376bi0) {
        this.a = c2376bi0;
    }

    @Override // defpackage.InterfaceC3632ei0
    public final AbstractC0596Hk X(int i) {
        return this.a.X(i);
    }

    @Override // defpackage.InterfaceC3632ei0
    public final void b0(C1919Yj0 c1919Yj0) {
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

    @Override // defpackage.InterfaceC3632ei0
    public final List n() {
        return Collections.unmodifiableList(this.a.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.InterfaceC3632ei0
    public final C6504pg1 o() {
        return this;
    }
}
