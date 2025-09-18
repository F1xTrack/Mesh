package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: gT0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3969gT0 extends O0 {
    public final ArrayList a;

    public C3969gT0(ArrayList arrayList) {
        O90.f(arrayList, "delegate");
        this.a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(AbstractC8069xu.s(i, this), obj);
    }

    @Override // defpackage.O0
    public final int b() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.O0
    public final Object d(int i) {
        return this.a.remove(AbstractC8069xu.r(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get(AbstractC8069xu.r(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C3778fT0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C3778fT0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set(AbstractC8069xu.r(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3778fT0(this, i);
    }
}
