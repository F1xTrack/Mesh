package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5990n0 implements Iterator, InterfaceC7451ue0 {
    public int a;
    public Object b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 0) {
            this.a = 3;
            a();
            if (this.a != 1) {
                return false;
            }
        } else if (i != 1) {
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 1) {
            this.a = 0;
            return this.b;
        }
        if (i != 2) {
            this.a = 3;
            a();
            if (this.a == 1) {
                this.a = 0;
                return this.b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
