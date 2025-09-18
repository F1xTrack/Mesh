package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: Xj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841Xj0 extends AbstractSequentialList implements Serializable {
    public final AbstractCollection a;
    public final InterfaceC6290oZ b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1841Xj0(List list, InterfaceC6290oZ interfaceC6290oZ) {
        list.getClass();
        this.a = (AbstractCollection) list;
        this.b = interfaceC6290oZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1685Vj0(this, this.a.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
