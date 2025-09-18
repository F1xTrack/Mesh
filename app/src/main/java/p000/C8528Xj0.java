package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: Xj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8528Xj0 extends AbstractSequentialList implements Serializable {

    /* renamed from: a */
    public final AbstractCollection f13936a;

    /* renamed from: b */
    public final InterfaceC6560oZ f13937b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8528Xj0(List list, InterfaceC6560oZ interfaceC6560oZ) {
        list.getClass();
        this.f13936a = (AbstractCollection) list;
        this.f13937b = interfaceC6560oZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C8424Vj0(this, this.f13936a.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f13936a.subList(i, i2).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13936a.size();
    }
}
