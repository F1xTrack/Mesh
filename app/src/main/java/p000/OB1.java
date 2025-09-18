package p000;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class OB1 extends C7111x0 implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ C0379G0 f8268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OB1(C0379G0 c0379g0) {
        super(c0379g0, (byte) 0);
        this.f8268e = c0379g0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0379G0 c0379g0 = this.f8268e;
        boolean zIsEmpty = c0379g0.isEmpty();
        m25731b();
        ((ListIterator) this.f45248b).add(obj);
        ((C10492oC1) c0379g0.f3514g).getClass();
        if (zIsEmpty) {
            c0379g0.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m25731b();
        return ((ListIterator) this.f45248b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m25731b();
        return ((ListIterator) this.f45248b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m25731b();
        return ((ListIterator) this.f45248b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m25731b();
        return ((ListIterator) this.f45248b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m25731b();
        ((ListIterator) this.f45248b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OB1(C0379G0 c0379g0, int i) {
        super(c0379g0, ((List) c0379g0.f3510c).listIterator(i), (byte) 0);
        this.f8268e = c0379g0;
    }
}
