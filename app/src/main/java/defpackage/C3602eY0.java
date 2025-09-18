package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: eY0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3602eY0 implements Iterator, InterfaceC1729Vy, InterfaceC7451ue0 {
    public int a;
    public Object b;
    public Iterator c;
    public InterfaceC1729Vy d;

    public final RuntimeException b() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // defpackage.InterfaceC1729Vy
    public final InterfaceC0173Bz getContext() {
        return JN.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.c;
                O90.c(it);
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            InterfaceC1729Vy interfaceC1729Vy = this.d;
            O90.c(interfaceC1729Vy);
            this.d = null;
            interfaceC1729Vy.resumeWith(C1518Tf1.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.a = 1;
            Iterator it = this.c;
            O90.c(it);
            return it.next();
        }
        if (i != 3) {
            throw b();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.InterfaceC1729Vy
    public final void resumeWith(Object obj) {
        RQ1.d(obj);
        this.a = 4;
    }
}
