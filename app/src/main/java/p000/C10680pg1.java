package p000;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: pg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10680pg1 extends AbstractList implements RandomAccess, InterfaceC9275ei0 {

    /* renamed from: a */
    public final C8886bi0 f40276a;

    public C10680pg1(C8886bi0 c8886bi0) {
        this.f40276a = c8886bi0;
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: X */
    public final AbstractC0488Hk mo10485X(int i) {
        return this.f40276a.mo10485X(i);
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: b0 */
    public final void mo10486b0(C8580Yj0 c8580Yj0) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f40276a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C10424ng1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C10296mg1(this, i);
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: n */
    public final List mo10487n() {
        return Collections.unmodifiableList(this.f40276a.f17125a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40276a.size();
    }

    @Override // p000.InterfaceC9275ei0
    /* renamed from: o */
    public final C10680pg1 mo10488o() {
        return this;
    }
}
