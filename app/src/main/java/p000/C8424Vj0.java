package p000;

import java.util.AbstractList;
import java.util.ListIterator;

/* renamed from: Vj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8424Vj0 extends AbstractC11694xc1 implements ListIterator {

    /* renamed from: b */
    public final /* synthetic */ int f12700b;

    /* renamed from: c */
    public final /* synthetic */ AbstractList f12701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8424Vj0(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f12700b = i;
        this.f12701c = abstractList;
    }

    @Override // p000.AbstractC11694xc1
    /* renamed from: a */
    public final Object mo8541a(Object obj) {
        switch (this.f12700b) {
            case 0:
                return ((C8476Wj0) this.f12701c).f13348b.apply(obj);
            default:
                return ((C8528Xj0) this.f12701c).f13937b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f45711a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f45711a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo8541a(((ListIterator) this.f45711a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f45711a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
