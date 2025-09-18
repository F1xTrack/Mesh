package p000;

import java.util.List;
import java.util.ListIterator;

/* renamed from: fT0 */
/* loaded from: classes2.dex */
public final class C9373fT0 implements ListIterator, InterfaceC11315ue0 {

    /* renamed from: a */
    public final /* synthetic */ int f27210a = 1;

    /* renamed from: b */
    public final ListIterator f27211b;

    /* renamed from: c */
    public final /* synthetic */ Object f27212c;

    public C9373fT0(C8016Nn0 c8016Nn0, int i) {
        this.f27212c = c8016Nn0;
        this.f27211b = ((List) c8016Nn0.f7996b).listIterator(AbstractC7167xu.m25991s(i, c8016Nn0));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f27210a) {
            case 0:
                ListIterator listIterator = this.f27211b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27210a) {
        }
        return this.f27211b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f27210a) {
        }
        return this.f27211b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f27210a) {
        }
        return this.f27211b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f27210a) {
            case 0:
                return AbstractC7230yu.m26273d((C9501gT0) this.f27212c) - this.f27211b.previousIndex();
            default:
                return AbstractC7230yu.m26273d((C8016Nn0) this.f27212c) - this.f27211b.previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f27210a) {
        }
        return this.f27211b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f27210a) {
            case 0:
                return AbstractC7230yu.m26273d((C9501gT0) this.f27212c) - this.f27211b.nextIndex();
            default:
                return AbstractC7230yu.m26273d((C8016Nn0) this.f27212c) - this.f27211b.nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f27210a) {
            case 0:
                this.f27211b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f27210a) {
            case 0:
                this.f27211b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9373fT0(C9501gT0 c9501gT0, int i) {
        this.f27212c = c9501gT0;
        this.f27211b = c9501gT0.f27810a.listIterator(AbstractC7167xu.m25991s(i, c9501gT0));
    }
}
