package p000;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: qg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10808qg1 extends AbstractList implements InterfaceC9403fi0, RandomAccess {

    /* renamed from: a */
    public final C9014ci0 f41103a;

    public C10808qg1(C9014ci0 c9014ci0) {
        this.f41103a = c9014ci0;
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: f */
    public final void mo10830f(C0362Fk c0362Fk) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f41103a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C10424ng1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C10296mg1(this, i);
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: n */
    public final List mo10831n() {
        return Collections.unmodifiableList(this.f41103a.f17694b);
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: p */
    public final Object mo10833p(int i) {
        return this.f41103a.f17694b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41103a.size();
    }

    @Override // p000.InterfaceC9403fi0
    /* renamed from: o */
    public final InterfaceC9403fi0 mo10832o() {
        return this;
    }
}
