package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: og1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6313og1 extends AbstractList implements InterfaceC3442di0, RandomAccess {
    public final C2185ai0 a;

    public C6313og1(C2185ai0 c2185ai0) {
        this.a = c2185ai0;
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

    @Override // defpackage.InterfaceC3442di0
    public final List n() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // defpackage.InterfaceC3442di0
    public final Object p(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // defpackage.InterfaceC3442di0
    public final void w(C0362Ek c0362Ek) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC3442di0
    public final InterfaceC3442di0 o() {
        return this;
    }
}
