package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: r0 */
/* loaded from: classes2.dex */
public final class C6716r0 extends C6653q0 implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ AbstractC6859t0 f41280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6716r0(AbstractC6859t0 abstractC6859t0, int i) {
        super(0, abstractC6859t0);
        this.f41280d = abstractC6859t0;
        int iMo4090b = abstractC6859t0.mo4090b();
        if (i < 0 || i > iMo4090b) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "index: ", iMo4090b, ", size: "));
        }
        this.f40480b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40480b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40480b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f40480b - 1;
        this.f40480b = i;
        return this.f41280d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40480b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
