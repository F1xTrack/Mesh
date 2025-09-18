package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: la0 */
/* loaded from: classes.dex */
public final class C5721la0 extends AbstractC5740lg1 {
    public int b;
    public Object c;
    public final /* synthetic */ int d;
    public final Iterator e;
    public final /* synthetic */ Object f;

    public C5721la0() {
        super(0);
        this.b = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iX = AbstractC8235ym.x(i);
        if (iX == 0) {
            return true;
        }
        if (iX == 2) {
            return false;
        }
        this.b = 4;
        switch (this.d) {
            case 0:
                do {
                    Iterator it = this.e;
                    if (!it.hasNext()) {
                        this.b = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((InterfaceC8318zC0) this.f).apply(next));
            default:
                do {
                    Iterator it2 = this.e;
                    if (!it2.hasNext()) {
                        this.b = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((C6863rZ0) this.f).b.contains(next));
        }
        this.c = next;
        if (this.b == 3) {
            return false;
        }
        this.b = 1;
        return true;
    }

    @Override // defpackage.AbstractC5740lg1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5721la0(Iterator it, InterfaceC8318zC0 interfaceC8318zC0) {
        this();
        this.d = 0;
        this.e = it;
        this.f = interfaceC8318zC0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5721la0(C6863rZ0 c6863rZ0) {
        this();
        this.d = 1;
        this.f = c6863rZ0;
        this.e = c6863rZ0.a.iterator();
    }
}
