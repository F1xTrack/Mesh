package p000;

import java.util.List;
import java.util.ListIterator;

/* renamed from: F0 */
/* loaded from: classes.dex */
public final class C0316F0 extends C7111x0 implements ListIterator {

    /* renamed from: e */
    public final /* synthetic */ C0379G0 f3004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316F0(C0379G0 c0379g0) {
        super(c0379g0);
        this.f3004e = c0379g0;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0379G0 c0379g0 = this.f3004e;
        boolean zIsEmpty = c0379g0.isEmpty();
        m2471c().add(obj);
        ((AbstractC6922u0) c0379g0.f3514g).f43442e++;
        if (zIsEmpty) {
            c0379g0.m2871b();
        }
    }

    /* renamed from: c */
    public final ListIterator m2471c() {
        m25730a();
        return (ListIterator) this.f45248b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m2471c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m2471c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m2471c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m2471c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m2471c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316F0(C0379G0 c0379g0, int i) {
        super(c0379g0, ((List) c0379g0.f3510c).listIterator(i));
        this.f3004e = c0379g0;
    }
}
