package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ZI1 extends AbstractList implements RandomAccess, FF1 {
    public final AF1 a;

    public ZI1(AF1 af1) {
        this.a = af1;
    }

    @Override // defpackage.FF1
    public final void U(C8129yC1 c8129yC1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C6122ng1(this);
    }

    @Override // defpackage.FF1
    public final Object l(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C5931mg1(this, i);
    }

    @Override // defpackage.FF1
    public final List m() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // defpackage.FF1
    public final FF1 zze() {
        return this;
    }
}
