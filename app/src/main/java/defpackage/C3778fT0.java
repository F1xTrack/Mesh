package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: fT0 */
/* loaded from: classes2.dex */
public final class C3778fT0 implements ListIterator, InterfaceC7451ue0 {
    public final /* synthetic */ int a = 1;
    public final ListIterator b;
    public final /* synthetic */ Object c;

    public C3778fT0(C1073Nn0 c1073Nn0, int i) {
        this.c = c1073Nn0;
        this.b = ((List) c1073Nn0.b).listIterator(AbstractC8069xu.s(i, c1073Nn0));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
        }
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return AbstractC8259yu.d((C3969gT0) this.c) - this.b.previousIndex();
            default:
                return AbstractC8259yu.d((C1073Nn0) this.c) - this.b.previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
        }
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return AbstractC8259yu.d((C3969gT0) this.c) - this.b.nextIndex();
            default:
                return AbstractC8259yu.d((C1073Nn0) this.c) - this.b.nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                this.b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3778fT0(C3969gT0 c3969gT0, int i) {
        this.c = c3969gT0;
        this.b = c3969gT0.a.listIterator(AbstractC8069xu.s(i, c3969gT0));
    }
}
